package com.bg.medinssy.reimb;

public class Settlment {

	private String name;
	private int admissionNumber;
	private double ratio1;
	private double ratio2;
	private double ratio3;
	private double amount1;
	private double amount2;
	private double amount3;
	
	
	
	public double getAmount1() {
		return amount1;
	}
	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}
	public double getAmount2() {
		return amount2;
	}
	public void setAmount2(double amount2) {
		this.amount2 = amount2;
	}
	public double getAmount3() {
		return amount3;
	}
	public void setAmount3(double amount3) {
		this.amount3 = amount3;
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
	public double getRatio1() {
		return ratio1;
	}
	public void setRatio1(double ratio1) {
		this.ratio1 = ratio1;
	}
	public double getRatio2() {
		return ratio2;
	}
	public void setRatio2(double ratio2) {
		this.ratio2 = ratio2;
	}
	public double getRatio3() {
		return ratio3;
	}
	public void setRatio3(double ratio3) {
		this.ratio3 = ratio3;
	}
	
	public String toString()
	{
		return this.name+","+this.admissionNumber+","+this.ratio1+","+this.ratio2+","+this.ratio3+","+this.amount1+","+this.amount2+","+this.amount3;
	}
	
	
}
