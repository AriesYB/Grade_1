package com.bg.medinssy.pubser;
public class InsUnit {
    private String name;
    private int ID;
    private String type;
    private String address;
    private int postcode;
    private long phoneCode;
    
    public InsUnit(String name,int ID,String type,String address,int postcode,long phoneCode)
    {
    	this.name = name;
    	this.ID=ID;
    	this.type=type;
    	this.address=address;
    	this.postcode=postcode;
    	this.phoneCode=phoneCode;
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public long getPhoneCode() {
		return phoneCode;
	}
	public void setPhoneCode(long phoneCode) {
		this.phoneCode = phoneCode;
	}

	public String[] toArray()
	{
		String[] a = {this.name,String.valueOf(this.ID),this.type,this.address,String.valueOf(this.postcode),String.valueOf(this.phoneCode)};
		return a;	
	}

	public String toString()
	{
		return this.name+","+this.ID+","+this.type+","+this.address+","+this.postcode+","+this.phoneCode;
	}

}
