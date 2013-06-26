package com.flamebrowse;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.http.*;

import com.google.gson.Gson;

public class UserServlet extends HttpServlet {
	
	public static final long serialVersionUID = 1L;
	
	private static final String contentType = "application/json";
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
		resp.getWriter().write(req.getContentType());
		if(req.getContentType().compareToIgnoreCase(contentType) == 0)
		{
			StringBuffer jb = new StringBuffer();
			  String line = null;
			  try {
			    BufferedReader reader = req.getReader();
			    while ((line = reader.readLine()) != null)
			      jb.append(line);
			  } catch (Exception e) { /*report an error*/ }
			
			Gson gson = new Gson();
			UserValidationRequest user=null;
			try
			{
				user = gson.fromJson(jb.toString(), UserValidationRequest.class);
			}
			catch(Exception e)
			{
				resp.sendError(405);
			
			}
			
			ValidateUser vUser = new ValidateUser();
			
			UserValidationResponse response = new UserValidationResponse();
        	
        	response.setApplicationId(user.getApplicationId());
        	response.setRequestId(user.getRequestId());
            if(vUser.isUserValid(user))
            {
            	response.setUserValid(true);
            }
            else
            {
            	response.setUserValid(true);
            }
			
			resp.getWriter().write(gson.toJson(response));		
		}
		else
		{
			resp.sendError(405, "Invalid Content Type");
		}
		return;
    }

}
