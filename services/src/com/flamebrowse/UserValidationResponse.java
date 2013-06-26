package com.flamebrowse;

public class UserValidationResponse {
	
	private String requestId;
	
	private boolean userValid;
	
	private String applicationId;

	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * @return the userValid
	 */
	public boolean isUserValid() {
		return userValid;
	}

	/**
	 * @param userValid the userValid to set
	 */
	public void setUserValid(boolean userValid) {
		this.userValid = userValid;
	}

	/**
	 * @return the applicationId
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

}
