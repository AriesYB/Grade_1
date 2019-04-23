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
	
	
	public static final String  INSURED_HEAD="#该文档是数据储存文档 以#开头的为注释\r\n" + 
			"#姓名 个人id 证件类型 证件编码 性别 民族 出生日期 其他信息";
	public static final String  INSUNIT_HEAD="#该文档是数据储存文档 以#开头的为注释\r\n" + 
			"#单位名称,单位编号,单位类型,单位地址,邮编,联系电话";
	public static final String  DRUG_HEAD="#该文档是数据储存文档 以#开头的为注释\r\n" + 
			"#药品名称,药品编号,最高限价,药品剂量单位,药品种类,医院等级,医保类别,其他信息";
	public static final String  DETAIL_HEAD="#该文档是数据储存文档 以#开头的为注释\r\n" + 
			"#姓名 住院号  项目名称 项目编码 单价 数量 金额";
	public static final String SETTLMENT_HEAD="#该文档是数据储存文档 以#开头的为注释\r\n" + 
			"#姓名  住院号  起付标准 三比例   未报销时总金额  未执行标准报销额 报销总金额";
	//写入文件
	public static void writeFile(String url,ArrayList<?> arr,boolean flag)
	{
		FileWriter fw=null;
		BufferedWriter bufw =null;
			try {
				fw = new FileWriter(url,flag);
				bufw= new BufferedWriter(fw);
				for (int i=0;i<arr.size();i++) 
				{
					bufw.write(arr.get(i).toString());//写文件toString()
					bufw.newLine();
				}
				bufw.flush();
				bufw.close();
				fw.close();
			} catch (IOException e) {	
				e.printStackTrace();
			
		}
	}
	public static void writeFile(String url,String str,boolean flag)/*续写*/
	{
		FileWriter fw=null;
		BufferedWriter bufw =null;
			try {
				fw = new FileWriter(url,flag);
				bufw= new BufferedWriter(fw);

				bufw.write(str);//写入文件
				bufw.newLine();
			
				bufw.flush();
				bufw.close();
				fw.close();
			} catch (IOException e) {	
				e.printStackTrace();
			
		}
	}
	
//读文件	
	private static void readFile(String url)//读取到一个String集合
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
	
	
//构造对象的方法	
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

//载入账号密码
	private static void loadPassword()
	{
		readFile("C://Users/管理员/Desktop/MedInsSystem/AccountPassword.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			StringTokenizer Str = new StringTokenizer(stringArray.get(i), ",");
			pwd[i][0]=Str.nextToken();
			pwd[i][1]=Str.nextToken();
		}
		stringArray.clear();
	}
//载入投保人员信息	
	private static void loadInsured()
	{
		readFile("C://Users/管理员/Desktop/MedInsSystem/InsuredInfo.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			insuredArray.add(addInsured(stringArray.get(i)));
		}
		stringArray.clear();
	}
//载入投保单位信息	
	private static void loadInsUnit()
	{
		readFile("C://Users/管理员/Desktop/MedInsSystem/InsUnitInfo.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			insUnitArray.add(addInsUnit(stringArray.get(i))); 
		}
		stringArray.clear();
	}
//载入药品信息
	private static void loadDrug()
	{
		readFile("C://Users/管理员/Desktop/MedInsSystem/DrugInfo.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			drugArray.add(addDrug(stringArray.get(i)));
		}
		stringArray.clear();
	}
//载入住院病人信息
	private static void loadInpatient()
	{
		readFile("C://Users/管理员/Desktop/MedInsSystem/InpatientInfo.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			inpatientArray.add(addInpatient(stringArray.get(i)));
		}
		stringArray.clear();
	}
	
//载入处方明细
	private static void loadDetail()
	{
		readFile("C://Users/管理员/Desktop/MedInsSystem/Detail.txt");
		for (int i = 0; i < stringArray.size(); i++)
		{
			detailItemArray.add(addDetailItem(stringArray.get(i)));
		}
		stringArray.clear();
	}
		
//将数据转化成形式数组

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
			detailItemArray.get(i).toArray(arr);	//往新的以数组为元素的集合加入 数组
			detailArray.add(arr);//往detailArray里面加入上面含有数组的集合
		}
	}
	
/*****包装载入数据的函数*****/
	public static void load()
	{
		/*****从文件载入数据*****/
		
		loadPassword();
		loadInsured();
		toInsuredArray();//列表需要的数组
		loadInsUnit();
		toInsUnitArray();
		loadDrug();
		toDrugArray();
		loadInpatient();
		toInpatientArray();
		loadDetail();
		toDetailArray();
	}
	
/*****刷新table的函数*****/
	public static void refreshTable(ArrayList<String[]> arr,javax.swing.JTable table,String[] a)
	{
		String[][] s= new String[arr.size()][];//获取列表需要的数组
		for (int i = 0; i < s.length; i++) 
		{
			s[i]=arr.get(i);
		}
		
		table.setModel(new DefaultTableModel(
				
				s,//显示的列表需要的数组
				a
				));
	}
	
/*****获取table值并存入文件*****/
	public static String  tableValue="";
	public static void getTable(javax.swing.JTable table,String url,String str)
	{
		
		writeFile(url, str, false);//先写注释
		for (int i = 0; i < table.getRowCount(); i++) 
		{
			for (int j = 0; j < table.getColumnCount(); j++) 
			{
				tableValue+=table.getValueAt(i, j)+",";
			}
			tableValue=tableValue.substring(0, tableValue.length()-1);//删除多余的逗号
			writeFile(url, tableValue,true);
			tableValue="";//清空
		}
		tableValue="";//清空
	}
}
