package com.thinkConstructive.rest.demo.service;

import java.util.List;

import com.thinkConstructive.rest.demo.model.CloudVendor;

public interface CloudVendorService {
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String delete(String cloudVendorId);
	public CloudVendor getCloudVendor( String cloudVendorId);
	public List<CloudVendor>getAllCloudVendors();
	
//31.45
}
 