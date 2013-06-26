package com.flamebrowse;

import java.util.Date;

public class UserValidationRequest {

	public UserValidationRequest()
	{
		this.requestTime = new Date();
	}
	
	private String deviceId;
	
	private String applicationId;
	
	@SuppressWarnings("unused")
	private Date requestTime;
	
	private String location;
	
	private String pin;
	
	private String requestId;
	
	private String deviceOS;
	
	private String deviceOSVer;

	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the deviceOSVer
	 */
	public String getDeviceOSVer() {
		return deviceOSVer;
	}

	/**
	 * @param deviceOSVer the deviceOSVer to set
	 */
	public void setDeviceOSVer(String deviceOSVer) {
		this.deviceOSVer = deviceOSVer;
	}

	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}

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
	 * @return the deviceOS
	 */
	public String getDeviceOS() {
		return deviceOS;
	}

	/**
	 * @param deviceOS the deviceOS to set
	 */
	public void setDeviceOS(String deviceOS) {
		this.deviceOS = deviceOS;
	}
	
}
