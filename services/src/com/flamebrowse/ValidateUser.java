package com.flamebrowse;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterPredicate;



public class ValidateUser {
	
	public boolean isUserValid(UserValidationRequest user)
	{
		Key userKey = KeyFactory.createKey("deviceId", user.getDeviceId());
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		List<Entity> users;
		try
		{
			Query q = new Query("user");
	
			FilterPredicate filter = new FilterPredicate("deviceId", Query.FilterOperator.EQUAL, user.getDeviceId());
			q.setFilter(filter);
			users = datastore.prepare(q).asList(FetchOptions.Builder.withLimit(1));
		
			if(!users.isEmpty())
			{
				return true;
			}
			else
			{
				Entity newUser = new Entity("user", userKey);
				newUser.setProperty("deviceId", user.getDeviceId());
				newUser.setProperty("applicationId", user.getApplicationId());
				newUser.setProperty("requestId", user.getRequestId());
				newUser.setProperty("deviceOS", user.getDeviceOS());
				newUser.setProperty("location", user.getLocation());
				newUser.setProperty("pin", user.getPin());
				datastore.put(newUser);
				return false;
			}
		}
		catch(Exception ex)
		{
			return false;
		}
		
		
		
	}

}
