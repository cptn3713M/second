package com.thinkConstructive.rest.demo.controller;
 import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkConstructive.rest.demo.model.CloudVendor;
import com.thinkConstructive.rest.demo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvender")
public class CloudVendorController {
		
	CloudVendorService cloudVendorService;
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}
	@GetMapping("{vendorid}")
	///pathvariable is create for the target vendor id specialy
		public CloudVendor getCloudVendorDetatils(@PathVariable("vendorid") String vendorid)
		{
			return	cloudVendorService.getCloudVendor(vendorid);
//					new CloudVendor("C1","Vendor 1","address","xxxx");
		}
	//get all cloudvendor
	public List<CloudVendor> getAllCloudVendorDetatils()
	{
		return	cloudVendorService.getAllCloudVendors();
//				new CloudVendor("C1","Vendor 1","address","xxxx");
	}	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.createCloudVendor(cloudVendor);
 	return "Cloud Vendor Created Successfully";
	}
	 @PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		 cloudVendorService.updateCloudVendor(cloudVendor);
		 return "Cloud Vendor update Successfully";

} 
	 @DeleteMapping("{vendorid}")
		public String deleteCloudVendorDetails(@PathVariable("vendorid") String vendorid)
		{
		 cloudVendorService.delete(vendorid);
 		return "Cloud Vendor delted Successfully";

	} 
}