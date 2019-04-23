package com.bg.medinssy.reimb;

import java.util.ArrayList;

public class DetailItem {
	
	private String inpatientName;
	private int admissionNumber;
    private String projectName;
    private String projectCode;
    private String price;
    private String quantity;
    private String amount;
    
    public DetailItem(String inpatientName,int admissionNumber,String projectName,String projectCode,String price,String quantity,String amount)
    {
    	this.inpatientName=inpatientName;
    	this.admissionNumber=admissionNumber;
    	this.projectName=projectName;
    	this.projectCode=projectCode;
    	this.price=price;
    	this.quantity=quantity;
    	this.amount=amount;
    }
    
    
    public String getInpatientName() {
    	return inpatientName;
    }
    public void setInpatientName(String inpatientName) {
    	this.inpatientName = inpatientName;
    }
	public int getAdmissionNumber() {
		return admissionNumber;
	}
	public void setAdmissionNumber(int admissionNumber) {
		this.admissionNumber = admissionNumber;
	}
	public String getDrugName() {
		return projectName;
	}
	public void setDrugName(String drugName) {
		this.projectName = drugName;
	}
	public String getDrugNumber() {
		return projectCode;
	}
	public void setDrugNumber(String drugNumber) {
		this.projectCode = drugNumber;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
    
	public void toArray(ArrayList <String[]> arr)
	{
		String[] s0=this.projectName.split("/");
		String[] s1=this.projectCode.split("/");
		String[] s2=this.price.split("/");
		String[] s3=this.quantity.split("/");
		String[] s4=this.amount.split("/");
		for (int i = 0; i <s0.length ; i++)
		{
			arr.add(new String[] {s0[i],s1[i],s2[i],s3[i],s4[i]});
		}

	}

	public String toString()
	{
		return this.inpatientName+","+this.admissionNumber+","+this.projectName+","+this.projectCode+","+this.price+","+this.quantity+","+this.amount;
	}

}
