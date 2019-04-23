package com.bg.medinssy.pubser;
public class Insured {
    private String ID;
    private String name;
    private String sex;
    private String nationality;
    private int birthDate;
    private String documentType;
    private long documentNumber;
    private String extraInformation;

    public Insured(String name,String ID,String documentType,long documentNumber,String sex,String nationality,int birthDate,String extraInformation)
    {
    	this.ID=ID;
    	this.name=name;
    	this.sex=sex;
    	this.nationality=nationality;
    	this.birthDate=birthDate;
    	this.documentType=documentType;
    	this.documentNumber=documentNumber;
    	this.extraInformation=extraInformation;
    }
    public String getID(){
        return this.ID;
    }

    public void setID(String iD){
    	this.ID=iD;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
    	this.name=name;
    }

    public String getSex(){
        return this.sex;
    }

    public void setSex(String sex){
    	this.sex=sex;
    }

    public String getNationality(){
        return this.nationality;
    }

    public void setNationality(String nationality){
    	this.nationality=nationality;
    }

    public int getBirthDate(){
        return this.birthDate;
    }

    public void setBirthDate(int birthDate){
    	this.birthDate=birthDate;
    }

    public String getDocumentType(){
        return this.documentType;
    }

    public void setDocumentType(String documentType){
    	this.documentType= documentType;
    }

    public long getDocumentNumber(){
        return this.documentNumber;
    }

    public void setDocumentNumber(int documentNumber){
    	this.documentNumber=documentNumber;
    }

    public String getExtraInformation(){
        return this.extraInformation;
    }

    public void setExtraInformation(String extraInformation){
    	this.extraInformation=extraInformation;
    }
    
    public String[] toArray()
    {
    	String[] a= {this.name,this.ID,this.documentType,String.valueOf(this.documentNumber),this.sex,this.nationality,String.valueOf(this.birthDate),this.extraInformation};
    	return a;
    }
    
    public String toString()
    {
    	return this.name+","+this.ID+","+this.documentType+","+this.documentNumber+","+this.sex+","+this.nationality+","+this.birthDate+","+this.extraInformation;
    }
    

}
