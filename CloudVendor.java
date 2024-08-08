package com.thinkConstructive.rest.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class CloudVendor {
	@Id
	private String vendorname;
	private String vendorid;
	private String vendoraddress;
	private String vendorphoneno;
	
	
	public CloudVendor() {
		super();
		}
	public CloudVendor(String vendorname, String vendorid, String vendoraddress, String vendorphoneno) {
		super();
		this.vendorname = vendorname;
		this.vendorid = vendorid;
		this.vendoraddress = vendoraddress;
		this.vendorphoneno = vendorphoneno;
	}

 
	
	 
	
	public String getVendorname() {
		return vendorname;
	}



	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}



	public String getVendorid() {
		return vendorid;
	}



	public void setVendorid(String vendorid) {
		this.vendorid = vendorid;
	}



	public String getVendoraddress() {
		return vendoraddress;
	}



	public void setVendoraddress(String vendoraddress) {
		this.vendoraddress = vendoraddress;
	}



	public String getVendorphoneno() {
		return vendorphoneno;
	}



	public void setVendorphoneno(String vendorphoneno) {
		this.vendorphoneno = vendorphoneno;
	}

	 
}
 