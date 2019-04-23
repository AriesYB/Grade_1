package com.bg.medinssy.medinfo;
public class Drug {
    private int ID;
    private String name;
    private double restrictedPrice;
    private String dose;
    private String extraInformation;
    private String category;
    private String hospitalGrade;
    private String MedInsCategory;
    
    public Drug(String name,int ID,double restrictedPrice,String dose,String category,String hospitalGrade,String MedInsCategory,String extraInformation)
    {
    	this.ID=ID;
    	this.name=name;
    	this.restrictedPrice=restrictedPrice;
    	this.dose=dose;
    	this.extraInformation=extraInformation;
    	this.category=category;
    	this.hospitalGrade=hospitalGrade;
    	this.MedInsCategory=MedInsCategory;
    }
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getHospitalGrade() {
		return hospitalGrade;
	}
	public void setHospitalGrade(String hospitalGrade) {
		this.hospitalGrade = hospitalGrade;
	}
	public String getMedInsCategory() {
		return MedInsCategory;
	}
	public void setMedInsCategory(String medInsCategory) {
		MedInsCategory = medInsCategory;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRestrictedPrice() {
		return restrictedPrice;
	}
	public void setRestrictedPrice(double restrictedPrice) {
		this.restrictedPrice = restrictedPrice;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getExtraInformation() {
		return extraInformation;
	}
	public void setExtraInformation(String extraInformation) {
		this.extraInformation = extraInformation;
	}

	public String[] toArray()
	{
		String[] a = {this.name,String.valueOf(this.ID),String.valueOf(this.restrictedPrice),this.dose,this.category,this.hospitalGrade,this.MedInsCategory,this.extraInformation};
		return a;
	}
   
	public String toString()
	{
		return this.name+","+this.ID+","+this.restrictedPrice+","+this.dose+","+this.category+","+this.hospitalGrade+","+this.MedInsCategory+","+this.extraInformation;
	}
}
