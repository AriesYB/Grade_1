package com.bg.medinssy.reimb;


public class Inpatient {
	private String name;
	private int admissionNumber;
	private String ID;
    private int hospitalNumber;
    private String medicalCategory;
	private String hospitalName;
    private int admissionDate;
    private int dischargeDate;
    private String hospitalGrade;
    private String dischargeReason;
    private String extraInformation;
    
    
    public Inpatient(String name,String ID,int admissionNumber,String medicalCategory,int hospitalNumber,String hospitalName, int admissionDate,int dischargeDate,String hospitalGrade,String dischargeReason,String extraInformation)
    {
    	this.name=name;
    	this.admissionDate=admissionDate;
    	this.ID=ID;
    	this.hospitalNumber=hospitalNumber;
    	this.medicalCategory=medicalCategory;
    	this.hospitalName=hospitalName;
    	this.admissionNumber=admissionNumber;
    	this.dischargeDate=dischargeDate;
    	this.dischargeReason=dischargeReason;
    	this.extraInformation=extraInformation;
    	this.hospitalGrade=hospitalGrade;
    }
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
	public int getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(int admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

    public String getHospitalName() {
    	return hospitalName;
    }

    public String getID(){
        return this.ID;
    }

    public String getExtraInformation(){
        return this.extraInformation;
    }

    public void setExtraInformation(String extraInformation){
    	this.extraInformation=extraInformation;
    }

    public String getMedicalCategory() {
 		return medicalCategory;
 	}

 	public void setMedicalCategory(String hospitalCategory) {
 		this.medicalCategory = hospitalCategory;
 	}
 	
    public void setID(String iD){
    	this.ID=iD;
    }

    public int getHospitalNumber(){
        return this.hospitalNumber;
    }

    public void setHospitalNumber(int hospitalNumber){
    	this.hospitalNumber=hospitalNumber;
    }


    public void setHospitalName(String hospitalName){
    	this.hospitalName=hospitalName;
    }

    public int getAdmissionDate(){
        return this.admissionDate;
    }

    public void setAdmissionDate(int admissionDate){
    	this.admissionDate=admissionDate;
    }

    public int getDischargeDate(){
        return this.dischargeDate;
    }

    public void setDischargeDate(int dischargeDate){
    	this.dischargeDate=dischargeDate;
    }

    public String getHospitalGrade(){
        return this.hospitalGrade;
    }

    public void setHospitalGrade(String hospitalGrade){
    	this.hospitalGrade=hospitalGrade;
    }

    public String getDischargeReason(){
        return this.dischargeReason;
    }

    public void setDischargeReason(String dischargeReason){
    	this.dischargeReason=dischargeReason;
    }

    public String[] toArray()
    {
    	String[] a = {this.name,this.ID,String.valueOf(this.admissionNumber),this.medicalCategory,String.valueOf(this.hospitalNumber),this.hospitalName,String.valueOf(this.admissionDate),String.valueOf(this.dischargeDate),this.hospitalGrade,this.dischargeReason,this.extraInformation};
    	return a;
    }
    public String toString()
    {
    	return this.name+","+this.ID+","+this.admissionNumber+","+this.medicalCategory+","+this.hospitalNumber+","+this.hospitalName+","+this.admissionDate+","+this.dischargeDate+","+this.hospitalGrade+","+this.dischargeReason+","+this.extraInformation;
    }
}
