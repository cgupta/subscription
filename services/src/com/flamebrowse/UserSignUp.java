package com.flamebrowse;

public class UserSignUp {
	
	private String userName;
	
	private Name name;
	
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	private Address mailingAddress;
	
	private Address billingAddress;
	
	private SubscriptionType subType;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the mailingAddress
	 */
	public Address getMailingAddress() {
		return mailingAddress;
	}

	/**
	 * @param mailingAddress the mailingAddress to set
	 */
	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	/**
	 * @return the billingAddress
	 */
	public Address getBillingAddress() {
		return billingAddress;
	}

	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * @return the subType
	 */
	public SubscriptionType getSubType() {
		return subType;
	}

	/**
	 * @param subType the subType to set
	 */
	public void setSubType(SubscriptionType subType) {
		this.subType = subType;
	}
	

}
