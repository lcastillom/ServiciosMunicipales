package com.thincrs.open311;

public class Servicio {
	private int service_code;
	private String service_name;
	private String description;
	private boolean metadata;
	private String type;
	private String keywords;
	private String group;

	public int getServiceCode() {
		return service_code;
	}
	public void setServiceCode(int serviceCode) {
		this.service_code = serviceCode;
	}
	public String getServiceName() {
		return service_name;
	}
	public void setServiceName(String serviceName) {
		this.service_name = serviceName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isMetadata() {
		return metadata;
	}
	public void setMetadata(boolean metadata) {
		this.metadata = metadata;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

}
