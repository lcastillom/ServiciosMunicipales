package com.thincrs.open311;

import java.util.ArrayList;
import java.util.Map.Entry;

public class SolicitudServicio {
	private String jurisdiction_id;
	private int service_code;
	private ArrayList<Entry<String,String>> attribute;
	private Double lat;
	private Double _long;
	private String address_string;
	private Integer address_id;
	private String email;
	private String device_id;
	private Integer account_id;
	private String first_name;
	private String last_name;
	private String phone;
	private String description;
	private String media_url;


	public String getJurisdictionId() {
		return jurisdiction_id;
	}
	public void setJurisdictionId(String jurisdictionId) {
		this.jurisdiction_id = jurisdictionId;
	}
	public int getServiceCode() {
		return service_code;
	}
	public void setServiceCode(int serviceCode) {
		this.service_code = serviceCode;
	}
	public ArrayList<Entry<String, String>> getAttribute() {
		return attribute;
	}
	public void setAttribute(ArrayList<Entry<String, String>> attribute) {
		this.attribute = attribute;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLong() {
		return _long;
	}
	public void setLong(Double _long) {
		this._long = _long;
	}
	public String getAddressString() {
		return address_string;
	}
	public void setAddressString(String addressString) {
		this.address_string = addressString;
	}
	public Integer getAddressId() {
		return address_id;
	}
	public void setAddressId(Integer addressId) {
		this.address_id = addressId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDeviceId() {
		return device_id;
	}
	public void setDeviceId(String deviceId) {
		this.device_id = deviceId;
	}
	public Integer getAccountId() {
		return account_id;
	}
	public void setAccountId(Integer accountId) {
		this.account_id = accountId;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String lastName) {
		this.last_name = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMediaUrl() {
		return media_url;
	}
	public void setMediaUrl(String mediaUrl) {
		this.media_url = mediaUrl;
	}
}
