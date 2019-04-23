package com.bg.medinssy.data;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import javax.swing.table.DefaultTableModel;

import com.bg.medinssy.medinfo.Drug;
import com.bg.medinssy.pubser.InsUnit;
import com.bg.medinssy.pubser.Insured;
import com.bg.medinssy.reimb.DetailItem;
import com.bg.medinssy.reimb.Inpatient;
import com.bg.medinssy.reimb.Settlment;

public class Database {

	public static ArrayList <Insured> insuredArray = new ArrayList<Insured> ();
	public static ArrayList <InsUnit> insUnitArray = new ArrayList<InsUnit> ();
	public static ArrayList <Drug> drugArray = new ArrayList<Drug> ();
	public static ArrayList <Inpatient> inpatientArray = new ArrayList<Inpatient> ();
	public static ArrayList <Settlment> settlementArray = new ArrayList <Settlment> ();
	public static ArrayList <DetailItem> detailItemArray = new ArrayList<DetailItem> ();
	
	public static ArrayList <ArrayList<String[]>> detailArray = new ArrayList<ArrayList<String[]>> ();
	
	public static ArrayList <String> stringArray = new ArrayList <String> ();
	
	public static String[][] pwd = new String[10][2];
	
	public static ArrayList <String[]>insuredList = new ArrayList<String[]> ();
	public static ArrayList <String[]>insUnitList = new ArrayList<String[]> ();
	public static ArrayList <String[]>inpatientList = new ArrayList<String[]> ();
	public static ArrayList <String[]>drugList = new ArrayList<String[]> ();
	public static ArrayList <String[]>detailList = new ArrayList<String[]> ();
	
	
	public static final String  INSURED_HEAD="#���ĵ������ݴ����ĵ� ��#��ͷ��Ϊע��\r\n" + 
			"#���� ����id ֤������ ֤������ �Ա� ���� �������� ������Ϣ";
	public static final String  INSUNIT_HEAD="#���ĵ������ݴ����ĵ� ��#��ͷ��Ϊע��\r\n" + 
			"#��λ����,��λ���,��λ����,��λ��ַ,�ʱ�,��ϵ�绰";
	public static final String  DRUG_HEAD="#���ĵ������ݴ����ĵ� ��#��ͷ��Ϊע��\r\n" + 
			"#ҩƷ����,ҩƷ���,����޼�,ҩƷ������λ,ҩƷ����,ҽԺ�ȼ�,ҽ�����,������Ϣ";
	public static final String  DETAIL_HEAD="#���ĵ������ݴ����ĵ� ��#��ͷ��Ϊע��\r\n" + 
			"#���� סԺ��  ��Ŀ���� ��Ŀ���� ���� ���� ���";
	public static final String SETTLMENT_HEAD="#���ĵ������ݴ����ĵ� ��#��ͷ��Ϊע��\r\n" + 
			"#����  סԺ��  �𸶱�׼ ������   δ����ʱ�ܽ��  δִ�б�׼������ �����ܽ��";
	//д���ļ�
	public static void writeFile(String url,ArrayList<?> arr,boolean flag)
	{
		FileWriter fw=null;
		BufferedWriter bufw =null;
			try {
				fw = new FileWriter(url,flag);
				bufw= new BufferedWriter(fw);
				for (int i=0;i<arr.size();i++) 
				{
					bufw.write(arr.get(i).toString());//д�ļ�toString()
					bufw.newLine();
				}
				bufw.flush();
				bufw.close();
				fw.close();
			} catch (IOException e) {	
				e.printStackTrace();
			
		}
	}
	public static void writeFile(String url,String str,boolean flag)/*��д*/
	{
		FileWriter fw=null;
		BufferedWriter bufw =null;
			try {
				fw = new FileWriter(url,flag);
				bufw= new BufferedWriter(fw);

				bufw.write(str);//д���ļ�
				bufw.newLine();
			
				bufw.flush();
				bufw.close();
				fw.close();
			} catch (IOException e) {	
				e.printStackTrace();
			
		}
	}
	
//���ļ�	
	private static void readFile(String url)//��ȡ��һ��String����
	{
		FileReader fr=null;
		BufferedReader bufr=null;
		try {
			fr= new FileReader(url);
			bufr= new BufferedReader (fr);
			String st= null;
			while ((st=bufr.readLine())!=null)
			{
				if(st.startsWith("#")||st.equals("")) 
				{
					continue;
				}
				stringArray.add(st);
			}
			bufr.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	
//�������ķ���	
	public static Insured addInsured(String str)
	{
		try {
			
			StringTokenizer Str = new StringTokenizer(str, ",");
			return new Insured(Str.nextToken(),Str.nextToken(),Str.nextToken(),Long.parseLong(Str.nextToken()),Str.nextToken(),Str.nextToken(),Integer.parseInt(Str.nextToken()),Str.nextToken());
		} catch (Exception e) {
			StringTokenizer Str = new StringTokenizer(str, ",");
			return new Insured(Str.nextToken(),Str.nextToken(),Str.nextToken(),Long.parseLong(Str.nextToken()),Str.nextToken(),Str.nextToken(),Integer.parseInt(Str.nextToken()),null);

		}
	}
	
	public static InsUnit addInsUnit(String str)
	{
		StringTokenizer Str = new StringTokenizer(str, ",");
		return new InsUnit(Str.nextToken(),Integer.parseInt(Str.nextToken()),Str.nextToken(),Str.nextToken(),Integer.parseInt(Str.nextToken()),Long.parseLong(Str.nextToken()));
	}
	
	public static Drug addDrug(String str)
	{
		try {
			StringTokenizer Str = new StringTokenizer(str, ",");
			return new Drug(Str.nextToken(),Integer.parseInt(Str.nextToken()),Double.parseDouble(Str.nextToken()),Str.nextToken(),Str.nextToken(),Str.nextToken(),Str.nextToken(),Str.nextToken());
			
		} catch (NoSuchElementException e) {
			StringTokenizer Str = new StringTokenizer(str, ",");
			return new Drug(Str.nextToken(),Integer.parseInt(Str.nextToken()),Double.parseDouble(Str.nextToken()),Str.nextToken(),Str.nextToken(),Str.nextToken(),Str.nextToken(),null);

		}
	}
	
	public static Inpatient addInpatient(String str)
	{
		try {
			StringTokenizer Str = new StringTokenizer(str, ",");
			return new Inpatient(Str.nextToken(),Str.nextToken(),Integer.parseInt(Str.nextToken()),Str.nextToken(),Integer.parseInt(Str.nextToken()),Str.nextToken(),Integer.parseInt(Str.nextToken()),Integer.parseInt(Str.nextToken()),Str.nextToken(),Str.nextToken(),Str.nextToken());
			
		} catch (NoSuchElementException e) {
			StringTokenizer Str = new StringTokenizer(str, ",");
			return new Inpatient(Str.nextToken(),Str.nextToken(),Integer.parseInt(Str.nextToken()),Str.nextToken(),Integer.parseInt(Str.nextToken()),Str.nextToken(),Integer.parseInt(Str.nextToken()),Integer.parseInt(Str.nextToken()),Str.nextToken(),Str.nextToken(),null);

		}
	}
	
	public static DetailItem addDetailItem(String str)
	{
		StringTokenizer Str = new StringTokenizer(str, ",");
		return new DetailItem(Str.nextToken(),Integer.parseInt(Str.nextToken()),Str.nextToken(),Str.nextToken(),Str.nextToken(),Str.nextToken(),Str.nextToken());
	}

//�����˺�����
	private static void loadPassword()
	{
		readFile("C://Users/����Ա/Desktop/MedInsSystem/AccountPassword.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			StringTokenizer Str = new StringTokenizer(stringArray.get(i), ",");
			pwd[i][0]=Str.nextToken();
			pwd[i][1]=Str.nextToken();
		}
		stringArray.clear();
	}
//����Ͷ����Ա��Ϣ	
	private static void loadInsured()
	{
		readFile("C://Users/����Ա/Desktop/MedInsSystem/InsuredInfo.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			insuredArray.add(addInsured(stringArray.get(i)));
		}
		stringArray.clear();
	}
//����Ͷ����λ��Ϣ	
	private static void loadInsUnit()
	{
		readFile("C://Users/����Ա/Desktop/MedInsSystem/InsUnitInfo.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			insUnitArray.add(addInsUnit(stringArray.get(i))); 
		}
		stringArray.clear();
	}
//����ҩƷ��Ϣ
	private static void loadDrug()
	{
		readFile("C://Users/����Ա/Desktop/MedInsSystem/DrugInfo.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			drugArray.add(addDrug(stringArray.get(i)));
		}
		stringArray.clear();
	}
//����סԺ������Ϣ
	private static void loadInpatient()
	{
		readFile("C://Users/����Ա/Desktop/MedInsSystem/InpatientInfo.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			inpatientArray.add(addInpatient(stringArray.get(i)));
		}
		stringArray.clear();
	}
	
//���봦����ϸ
	private static void loadDetail()
	{
		readFile("C://Users/����Ա/Desktop/MedInsSystem/Detail.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			detailItemArray.add(addDetailItem(stringArray.get(i)));
		}
		stringArray.clear();
	}
		
//������ת������ʽ����

	private static void toInsuredArray()
	{
		for (int i = 0; i < insuredArray.size(); i++) 
		{
			insuredList.add(insuredArray.get(i).toArray());
			
		}
	}
	
	private static void toInsUnitArray()
	{
		for (int i = 0; i < insUnitArray.size(); i++) 
		{
			insUnitList.add(insUnitArray.get(i).toArray());
			
		}
	}
	
	private static void toDrugArray()
	{
		for (int i = 0; i < drugArray.size(); i++)
		{
			drugList.add(drugArray.get(i).toArray());
		}
	}
	
	private static void toInpatientArray()
	{
		for (int i = 0; i < inpatientArray.size(); i++)
		{
			inpatientList.add(inpatientArray.get(i).toArray());
		}
	}
	
	private static void toDetailArray()
	{
		for (int i = 0; i < detailItemArray.size(); i++)
		{
			ArrayList<String[]> arr=new ArrayList<String[]>();
			detailItemArray.get(i).toArray(arr);	//���µ�������ΪԪ�صļ��ϼ��� ����
			detailArray.add(arr);//��detailArray����������溬������ļ���
		}
	}
	
/*****��װ�������ݵĺ���*****/
	public static void load()
	{
		/*****���ļ���������*****/
		
		loadPassword();
		loadInsured();
		toInsuredArray();//�б���Ҫ������
		loadInsUnit();
		toInsUnitArray();
		loadDrug();
		toDrugArray();
		loadInpatient();
		toInpatientArray();
		loadDetail();
		toDetailArray();
	}
	
/*****ˢ��table�ĺ���*****/
	public static void refreshTable(ArrayList<String[]> arr,javax.swing.JTable table,String[] a)
	{
		String[][] s= new String[arr.size()][];//��ȡ�б���Ҫ������
		for (int i = 0; i < s.length; i++) 
		{
			s[i]=arr.get(i);
		}
		
		table.setModel(new DefaultTableModel(
				
				s,//��ʾ���б���Ҫ������
				a
				));
	}
	
/*****��ȡtableֵ�������ļ�*****/
	public static String  tableValue="";
	public static void getTable(javax.swing.JTable table,String url,String str)
	{
		
		writeFile(url, str, false);//��дע��
		for (int i = 0; i < table.getRowCount(); i++) 
		{
			for (int j = 0; j < table.getColumnCount(); j++) 
			{
				tableValue+=table.getValueAt(i, j)+",";
			}
			tableValue=tableValue.substring(0, tableValue.length()-1);//ɾ������Ķ���
			writeFile(url, tableValue,true);
			tableValue="";//���
		}
		tableValue="";//���
	}
}
