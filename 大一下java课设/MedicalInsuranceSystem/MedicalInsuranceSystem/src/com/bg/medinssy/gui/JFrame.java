package com.bg.medinssy.gui;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import com.bg.medinssy.data.Database;
import javafx.scene.input.MouseEvent;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import javax.swing.JTextPane;

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;
	
	private boolean flag_0 = false;
	private boolean flag_1 = false;
	private boolean flag_2 = false;
	private boolean flag_3 = false;
	private boolean flag00= false;
	private boolean flag0=false;
	private boolean flag1=false;
	private boolean flag2=false;
	private boolean flag3=false;
	public static JTable table;
	public static JTable table_1;
	public static JTable table_2;
	public static JTable table_3;
	public static JTable table_4;
	
	private static JPanel panel_4;
	private static JPanel panel_6;
	private static JPanel panel_7;
	private static JTextPane textPane;
	private static JTextPane textPane_1;
	
	public static String[] s0;
	public static String[] s1;
	public static String[] s2;
	public static String[] s3;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private static JTextField textField_15;
	private JTextField textField_1;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	
	private double amount = 0.0;
	private double coefficient_1=-1;//在一二三级医院报销时用到的系数
	private double coefficient_2;
	private double coefficient_3;
	
	private double coefficient=-1;//甲乙丙药品报销时的系数 乘算
	
	private double coefficient_=-1;//药品指定的医院等级对应的报销时所需要的系数

	private JTextField textField;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Login frame = new Login();
		frame.setVisible(true);
		frame.setResizable(false);
		

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Database.load(); /*****载入数据*****/
					
					JFrame frame = new JFrame();//新建窗口
					frame.setVisible(false);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\\u7BA1\u7406\u5458\\Desktop\\MedInsSystem\\icon.png"));
		setTitle("\u533B\u7597\u4FDD\u9669\u4E2D\u5FC3\u62A5\u9500\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 885, 619);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u6211\u7684\u8D26\u6237");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u4E2A\u4EBA\u8D44\u6599");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u9000\u51FA\u8D26\u6237");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem menuItem = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		mnNewMenu.add(menuItem);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		menuBar.add(mnNewMenu_2);
		
		JMenu menu = new JMenu("\u5E2E\u52A9");
		menuBar.add(menu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u5173\u4E8E\u6211\u4EEC");
		menu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("");
		menu.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(141, 36, 721, 512);
		panel.setBackground(UIManager.getColor("Button.background"));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_0 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_0.setBounds(0, 0, 721, 512);
		panel.add(tabbedPane_0);
		tabbedPane_0.setVisible(false);
		
		JLayeredPane layeredPane_0 = new JLayeredPane();
		tabbedPane_0.addTab("\u4EBA\u5458\u57FA\u672C\u4FE1\u606F\u7EF4\u62A4", null, layeredPane_0, null);
		layeredPane_0.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 716, 483);
		layeredPane_0.add(panel_1);
		
		Button button = new Button("\u67E5\u8BE2");
		button.setBounds(25, 12, 77, 29);
		button.setForeground(Color.WHITE);
		button.setBackground(SystemColor.activeCaption);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*弹窗搜索*/
				Object[] possibleValues = { "姓名", "个人ID", "证件编码" }; 
				Object selectedValue =  JOptionPane.showInputDialog(null, "请选择一种搜索方式", "选择输入", 
						JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
				if (selectedValue==possibleValues[0]) 
				{
					int i ;
					String inputValue = JOptionPane.showInputDialog("请输入姓名"); 
					for (i= 0; i < table.getRowCount(); i++) 
					{
						if (table.getValueAt(i, 0).equals(inputValue))
						{
							int row = i;//这里获取行
							table.setRowSelectionInterval(row, row);
							table.scrollRectToVisible(table.getCellRect(row, 0, true));
							table.setSelectionBackground(Color.LIGHT_GRAY);//选中行设置背景色
							i=10000000;
					
						}
					}
					if(i==table.getRowCount())
					{
						JOptionPane.showMessageDialog(null, "未找到", "错误", JOptionPane.ERROR_MESSAGE);
					}
				}
				if (selectedValue==possibleValues[1]) 
				{
					int i ;
					String inputValue = JOptionPane.showInputDialog("请输入个人ID"); 
					for (i = 0; i < table.getRowCount(); i++) 
					{
						if (table.getValueAt(i, 1).equals(inputValue))
						{
							int row = i;//这里获取行
							table.setRowSelectionInterval(row, row);
							table.scrollRectToVisible(table.getCellRect(row, 0, true));
							table.setSelectionBackground(Color.LIGHT_GRAY);//选中行设置背景色
							i=10000000;
						}

					}
					if(i==table.getRowCount())
					{
						JOptionPane.showMessageDialog(null, "未找到", "错误", JOptionPane.ERROR_MESSAGE);
					}
				}
				if (selectedValue==possibleValues[2]) 
				{
					int i;
					String inputValue = JOptionPane.showInputDialog("请输入证件编码"); 
					for (i = 0; i < table.getRowCount(); i++) 
					{
						if (table.getValueAt(i, 3).equals(inputValue))
						{
							int row = i;//这里获取行
							table.setRowSelectionInterval(row, row);
							table.scrollRectToVisible(table.getCellRect(row, 0, true));
							table.setSelectionBackground(Color.LIGHT_GRAY);//选中行设置背景色
							i=10000000;
						}

					}
					if(i==table.getRowCount())
					{
						JOptionPane.showMessageDialog(null, "未找到", "错误", JOptionPane.ERROR_MESSAGE);
					}
				}
				 
			}
			
		});
		panel_1.setLayout(null);
		button.setActionCommand("");
		button.setFont(new Font("Dialog", Font.PLAIN, 14));
		panel_1.add(button);
		
		Button button_1 = new Button("\u6DFB\u52A0");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*添加人员*/
				javax.swing.JFrame jf = new javax.swing.JFrame("添加人员");///////////////////////////////////////////弹窗 添加信息
				jf.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\\u7BA1\u7406\u5458\\Desktop\\icon.png"));
				RecordInsured re= new RecordInsured();
				jf.getContentPane().add(re);
				jf.setBounds(600, 150, 480, 600);
				jf.setVisible(true);
				jf.setResizable(false);
				
			}
		});
		button_1.setBounds(144, 12, 77, 29);
		button_1.setBackground(SystemColor.activeCaption);
		button_1.setForeground(SystemColor.window);
		button_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_1.setActionCommand("");
		panel_1.add(button_1);
		
		Button button_3 = new Button("\u5220\u9664");
		button_3.setBounds(393, 12, 77, 29);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*删除所选项*/
			try {
				int selectRows = table.getSelectedRow();
				int res=JOptionPane.showConfirmDialog(null, "确定要删除"+Database.insuredArray.get(selectRows).getName()+"的信息吗?", "是否继续", JOptionPane.YES_NO_OPTION);
				if(res==JOptionPane.YES_OPTION)
				{ 
					Database.insuredList.remove(selectRows);//删除该项数据
					Database.insuredArray.remove(selectRows);
					/*刷新table*/
					Database.refreshTable(Database.insuredList, table, s0);

					/*更新文件*/
					Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/insuredInfo.txt", Database.INSURED_HEAD, false);
					Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/insuredInfo.txt", Database.insuredArray,true);
					
				}else{
					 
					return;
				} 
				} catch (Exception e) {
					//弹窗提示
					JOptionPane.showMessageDialog(null, "未选择具体项", "错误", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(new Color(255, 69, 0));
		button_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_3.setActionCommand("");
		panel_1.add(button_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u7F16\u8F91\u6A21\u5F0F");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//使得表格可以被修改
				flag_0=!flag_0;
				if (flag_0==false)//保存修改的数据 
				{
					Database.getTable(table, "C://Users/管理员/Desktop/MedInsSystem/InsuredInfo.txt",Database.INSURED_HEAD);
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("等线", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(600, 30, 109, 23);
		panel_1.add(chckbxNewCheckBox);
		
	
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 60, 600, 400);
		panel_1.add(scrollPane);
		
		/**创建table时 让它不可被编辑*/
		DefaultTableModel tableModel = new DefaultTableModel();
		table = new JTable(tableModel){
            public boolean isCellEditable(int row, int column)
            {
                       return flag_0;}//表格不允许被编辑
            };
		table.addMouseListener((MouseListener) new MouseAdapter()
        		 {
        	 		public void mouseClicked(MouseEvent e)
        	 		{
        	 			if(e.getClickCount()==2)//双击列表查看详情
        	 			{
        	 				
        	 				//TODO 双击效果
        	 			}
        	 		}
        		 });
		s0=new String[]{"\u59D3\u540D", "\u4E2A\u4EBAID", "\u8BC1\u4EF6\u7C7B\u578B", "\u8BC1\u4EF6\u7F16\u7801", "\u6027\u522B", "\u6C11\u65CF", "\u51FA\u751F\u65E5\u671F","备注"};
		Database.refreshTable(Database.insuredList, table, s0);//table载入数据
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//table可以有水平滚动条
		scrollPane.setViewportView(table);//table放入scrollpane
		
	    
	    
		Button button_20 = new Button("\u5237\u65B0");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*刷新操作重新读文件*/
				Database.insuredArray.clear();
				Database.insuredList.clear();
				Database.load();
				Database.refreshTable(Database.insuredList, table, s0);
				
			}
		});
		button_20.setBounds(631, 60, 38, 22);
		panel_1.add(button_20);
		
			JLayeredPane layeredPane_1 = new JLayeredPane();
			tabbedPane_0.addTab("\u5355\u4F4D\u57FA\u672C\u4FE1\u606F\u7EF4\u62A4", null, layeredPane_1, null);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBounds(0, 0, 716, 483);
			layeredPane_1.add(panel_2);
			panel_2.setLayout(null);
			
			Button button_4 = new Button("\u67E5\u8BE2");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					/*弹窗搜索*/
					Object[] possibleValues = { "单位名称", "单位编号"}; 
					Object selectedValue =  JOptionPane.showInputDialog(null, "请选择一种搜索方式", "选择输入", 
							JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
					if (selectedValue==possibleValues[0]) 
					{
						int i ;
						String inputValue = JOptionPane.showInputDialog("请输入单位名称"); 
						for (i= 0; i < table_1.getRowCount(); i++) 
						{
							if (table_1.getValueAt(i, 0).equals(inputValue))
							{
								int row = i;//这里获取行
								table_1.setRowSelectionInterval(row, row);
								table_1.scrollRectToVisible(table_1.getCellRect(row, 0, true));
								table_1.setSelectionBackground(Color.LIGHT_GRAY);//选中行设置背景色
								i=10000000;
						
							}
						}
						if(i==table_1.getRowCount())
						{
							JOptionPane.showMessageDialog(null, "未找到", "错误", JOptionPane.ERROR_MESSAGE);
						}
					}
					if (selectedValue==possibleValues[1]) 
					{
						int i ;
						String inputValue = JOptionPane.showInputDialog("请输入单位编号"); 
						for (i = 0; i < table_1.getRowCount(); i++) 
						{
							if (table_1.getValueAt(i, 1).equals(inputValue))
							{
								int row = i;//这里获取行
								table_1.setRowSelectionInterval(row, row);
								table_1.scrollRectToVisible(table_1.getCellRect(row, 0, true));
								table_1.setSelectionBackground(Color.LIGHT_GRAY);//选中行设置背景色
								i=10000000;
							}

						}
						if(i==table_1.getRowCount())
						{
							JOptionPane.showMessageDialog(null, "未找到", "错误", JOptionPane.ERROR_MESSAGE);
						}
					}
					 
				}
			});
			
			
			button_4.setBounds(25, 12, 77, 29);
			button_4.setForeground(Color.WHITE);
			button_4.setFont(new Font("Dialog", Font.PLAIN, 14));
			button_4.setBackground(SystemColor.activeCaption);
			button_4.setActionCommand("");
			panel_2.add(button_4);
			
			Button button_5 = new Button("\u6DFB\u52A0");
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					/*添加单位*/
					javax.swing.JFrame jf = new javax.swing.JFrame("添加单位");///////////////////////////////////////////弹窗 添加单位信息
					jf.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\\u7BA1\u7406\u5458\\Desktop\\icon.png"));
					RecordUnit re= new RecordUnit();
					jf.getContentPane().add(re);
					jf.setBounds(600, 150, 500, 300);
					jf.setVisible(true);
					jf.setResizable(false);
				}
			});
			button_5.setBounds(145, 12, 77, 29);
			button_5.setForeground(Color.WHITE);
			button_5.setFont(new Font("Dialog", Font.PLAIN, 14));
			button_5.setBackground(SystemColor.activeCaption);
			button_5.setActionCommand("");
			panel_2.add(button_5);
			
			Button button_7 = new Button("\u5220\u9664");
			button_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					/*删除所选项*/
					try {
						int selectRows = table_1.getSelectedRow();
						int res=JOptionPane.showConfirmDialog(null, "确定要删除"+Database.insUnitArray.get(selectRows).getName()+"的信息吗?", "是否继续", JOptionPane.YES_NO_OPTION);
						if(res==JOptionPane.YES_OPTION)
						{ 
							Database.insUnitList.remove(selectRows);//删除该项数据
							Database.insUnitArray.remove(selectRows);
							/*刷新table*/
							Database.refreshTable(Database.insUnitList, table_1, s1);

							/*更新文件*/
							Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/InsUnitInfo.txt", Database.INSUNIT_HEAD, false);
							Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/InsUnitInfo.txt", Database.insUnitArray,true);
							
						}else{
							 
							return;
						} 
						} catch (Exception e) {
							//弹窗提示
							JOptionPane.showMessageDialog(null, "未选择具体项", "错误", JOptionPane.ERROR_MESSAGE);
						}
				}
			});
			button_7.setBounds(393, 12, 77, 29);
			button_7.setForeground(Color.WHITE);
			button_7.setFont(new Font("Dialog", Font.PLAIN, 14));
			button_7.setBackground(new Color(255, 69, 0));
			button_7.setActionCommand("");
			panel_2.add(button_7);
			
			JCheckBox checkBox = new JCheckBox("\u7F16\u8F91\u6A21\u5F0F");
			checkBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//使得表格可以被修改
					flag_1=!flag_1;
					if (flag_1==false)//保存修改的数据 
					{
						Database.getTable(table_1, "C://Users/管理员/Desktop/MedInsSystem/InsUnitInfo.txt",Database.INSUNIT_HEAD);
					}
				}
			});
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(25, 60, 600, 400);
			panel_2.add(scrollPane_1);
			
			/**创建table时 让它不可被编辑*/
			DefaultTableModel tableModel_1 = new DefaultTableModel();
			table_1 = new JTable(tableModel_1){
	            public boolean isCellEditable(int row, int column)
	            {
	                       return flag_1;}//表格不允许被编辑
	            };
			table_1.addMouseListener((MouseListener) new MouseAdapter()
	        		 {
	        	 		public void mouseClicked(MouseEvent e)
	        	 		{
	        	 			if(e.getClickCount()==2)//双击列表查看详情
	        	 			{
	        	 				
	        	 				//TODO 双击效果
	        	 			}
	        	 		}
	        		 });
			s1=new String[]{"单位名称", "单位编号", "单位类型", "单位地址", "邮编", "联系电话"};
			Database.refreshTable(Database.insUnitList, table_1, s1);//table载入数据				
			scrollPane_1.setViewportView(table_1);
//			table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//table可以有水平滚动条
			
			checkBox.setFont(new Font("等线", Font.PLAIN, 14));
			checkBox.setBounds(600, 30, 109, 23);
			panel_2.add(checkBox);
			
			Button button_6 = new Button("\u5237\u65B0");
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					/*刷新操作重新读文件*/
					Database.insUnitArray.clear();
					Database.insUnitList.clear();
					Database.load();
					Database.refreshTable(Database.insUnitList, table_1, s1);
				}
			});
			button_6.setBounds(631, 60, 38, 22);
			panel_2.add(button_6);

		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 721, 512);
		panel.add(tabbedPane_1);
		tabbedPane_1.setVisible(false);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane_1.addTab("\u836F\u54C1\u4FE1\u606F\u7EF4\u62A4", null, layeredPane, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 716, 483);
		layeredPane.add(panel_3);
		
		Button button_8 = new Button("\u67E5\u8BE2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*弹窗搜索*/
				Object[] possibleValues = { "药物名称", "药物编号"}; 
				Object selectedValue =  JOptionPane.showInputDialog(null, "请选择一种搜索方式", "选择输入", 
						JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
				if (selectedValue==possibleValues[0]) 
				{
					int i ;
					String inputValue = JOptionPane.showInputDialog("请输入药物名称"); 
					for (i= 0; i < table_2.getRowCount(); i++) 
					{
						if (table_2.getValueAt(i, 0).equals(inputValue))
						{
							int row = i;//这里获取行
							table_2.setRowSelectionInterval(row, row);
							table_2.scrollRectToVisible(table_2.getCellRect(row, 0, true));
							table_2.setSelectionBackground(Color.LIGHT_GRAY);//选中行设置背景色
							i=10000000;
					
						}
					}
					if(i==table_2.getRowCount())
					{
						JOptionPane.showMessageDialog(null, "未找到", "错误", JOptionPane.ERROR_MESSAGE);
					}
				}
				if (selectedValue==possibleValues[1]) 
				{
					int i ;
					String inputValue = JOptionPane.showInputDialog("请输入药物编号"); 
					for (i = 0; i < table_2.getRowCount(); i++) 
					{
						if (table_2.getValueAt(i, 1).equals(inputValue))
						{
							int row = i;//这里获取行
							table_2.setRowSelectionInterval(row, row);
							table_2.scrollRectToVisible(table_2.getCellRect(row, 0, true));
							table_2.setSelectionBackground(Color.LIGHT_GRAY);//选中行设置背景色
							i=10000000;
						}

					}
					if(i==table_2.getRowCount())
					{
						JOptionPane.showMessageDialog(null, "未找到", "错误", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_8.setBackground(SystemColor.activeCaption);
		button_8.setActionCommand("");
		button_8.setBounds(25, 12, 77, 29);
		panel_3.add(button_8);
		
		Button button_12 = new Button("\u6DFB\u52A0");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*添加药物*/
				javax.swing.JFrame jf = new javax.swing.JFrame("添加药物");///////////////////////////////////////////弹窗 添加药物信息************************************************************
				jf.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\\u7BA1\u7406\u5458\\Desktop\\icon.png"));
				RecordDrug rd= new RecordDrug();
				jf.getContentPane().add(rd);
				jf.setBounds(500, 150, 450, 450);
				jf.setVisible(true);
				jf.setResizable(false);
			}
		});
		button_12.setForeground(Color.WHITE);
		button_12.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_12.setBackground(SystemColor.activeCaption);
		button_12.setActionCommand("");
		button_12.setBounds(144, 12, 77, 29);
		panel_3.add(button_12);
		
		Button button_14 = new Button("\u5220\u9664");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*删除所选项*/
				try {
					int selectRows = table_2.getSelectedRow();
					int res=JOptionPane.showConfirmDialog(null, "确定要删除"+Database.drugArray.get(selectRows).getName()+"的信息吗?", "是否继续", JOptionPane.YES_NO_OPTION);
					if(res==JOptionPane.YES_OPTION)
					{ 
						Database.drugList.remove(selectRows);//删除该项数据
						Database.drugArray.remove(selectRows);
						/*刷新table*/
						Database.refreshTable(Database.drugList, table_2, s2);

						/*更新文件*/
						Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/DrugInfo.txt", Database.DRUG_HEAD, false);
						Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/DrugInfo.txt", Database.drugArray,true);
						
					}else{
						 
						return;
					} 
					} catch (Exception e) {
						//弹窗提示
						JOptionPane.showMessageDialog(null, "未选择具体项", "错误", JOptionPane.ERROR_MESSAGE);
					}
			}
		});
		button_14.setForeground(Color.WHITE);
		button_14.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_14.setBackground(new Color(255, 69, 0));
		button_14.setActionCommand("");
		button_14.setBounds(393, 12, 77, 29);
		panel_3.add(button_14);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(25, 60, 600, 400);
		panel_3.add(scrollPane_2);
		
		table_2 = new JTable();
		s2=new String[] {"\u836F\u54C1\u540D\u79F0", "\u836F\u54C1\u7F16\u53F7", "\u6700\u9AD8\u9650\u4EF7", "\u836F\u54C1\u5242\u91CF\u5355\u4F4D", "\u836F\u54C1\u79CD\u7C7B", "\u533B\u9662\u7B49\u7EA7", "\u533B\u4FDD\u7C7B\u522B"};
		/**创建table时 让它不可被编辑*/
		DefaultTableModel tableModel_2 = new DefaultTableModel();
		table_2 = new JTable(tableModel_2){
            public boolean isCellEditable(int row, int column)
            {
                       return flag_2;}//表格不允许被编辑
            };
         table_2.addMouseListener((MouseListener) new MouseAdapter()
        		 {
        	 		public void mouseClicked(MouseEvent e)
        	 		{
        	 			if(e.getClickCount()==2)//双击列表某项
        	 			{
        	 				
        	 				//TODO 双击效果
        	 			}
        	 		}
        		 });
      
		Database.refreshTable(Database.drugList, table_2, s2);//table载入数据
		table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//table可以有水平滚动条
		scrollPane_2.setViewportView(table_2);
		
		JCheckBox checkBox_1 = new JCheckBox("\u7F16\u8F91\u6A21\u5F0F");
		checkBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//使得表格可以被修改
				flag_2=!flag_2;
				if (flag_2==false)//保存修改的数据 
				{
					Database.getTable(table_2, "C://Users/管理员/Desktop/MedInsSystem/DrugInfo.txt",Database.DRUG_HEAD);
				}
			}
		});
		
		checkBox_1.setFont(new Font("等线", Font.PLAIN, 14));
		checkBox_1.setBounds(600, 30, 109, 23);
		panel_3.add(checkBox_1);
		
		Button button_13 = new Button("\u5237\u65B0");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*刷新操作重新读文件*/
				Database.drugArray.clear();
				Database.drugList.clear();
				Database.load();
				Database.refreshTable(Database.drugList, table_2, s2);
			}
		});
		button_13.setBounds(631, 60, 38, 22);
		panel_3.add(button_13);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		tabbedPane_1.addTab("\u8BCA\u7597\u9879\u76EE\u4FE1\u606F\u7EF4\u62A4", null, layeredPane_2, null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 716, 483);
		layeredPane_2.add(panel_5);
		
		Button button_16 = new Button("\u67E5\u8BE2");
		button_16.setForeground(Color.WHITE);
		button_16.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_16.setBackground(SystemColor.activeCaption);
		button_16.setActionCommand("");
		button_16.setBounds(25, 12, 77, 29);
		panel_5.add(button_16);
		
		Button button_17 = new Button("\u6DFB\u52A0");
		button_17.setForeground(Color.WHITE);
		button_17.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_17.setBackground(SystemColor.activeCaption);
		button_17.setActionCommand("");
		button_17.setBounds(144, 12, 77, 29);
		panel_5.add(button_17);
		
		Button button_18 = new Button("\u4FEE\u6539");
		button_18.setForeground(Color.WHITE);
		button_18.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_18.setBackground(SystemColor.activeCaption);
		button_18.setActionCommand("");
		button_18.setBounds(265, 12, 77, 29);
		panel_5.add(button_18);
		
		Button button_19 = new Button("\u5220\u9664");
		button_19.setForeground(Color.WHITE);
		button_19.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_19.setBackground(new Color(255, 69, 0));
		button_19.setActionCommand("");
		button_19.setBounds(393, 12, 77, 29);
		panel_5.add(button_19);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(25, 60, 600, 400);
		panel_5.add(scrollPane_3);
		
		table_3 = new JTable();
		s3=new String[] {"\u59D3\u540D", "\u4E2A\u4EBAID", "\u4F4F\u9662\u53F7", "\u533B\u9662\u7C7B\u522B", "\u533B\u9662\u7F16\u53F7", "\u533B\u9662\u540D\u79F0", "\u5165\u9662\u65E5\u671F", "\u51FA\u9662\u65E5\u671F", "\u533B\u9662\u7B49\u7EA7", "\u51FA\u9662\u539F\u56E0"};
		scrollPane_3.setViewportView(table_3);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		tabbedPane_1.addTab("\u670D\u52A1\u8BBE\u65BD\u9879\u76EE\u4FE1\u606F\u7EF4\u62A4", null, layeredPane_3, null);
		
		JLayeredPane layeredPane_4 = new JLayeredPane();
		tabbedPane_1.addTab("\u5B9A\u70B9\u533B\u7597\u673A\u6784\u4FE1\u606F", null, layeredPane_4, null);
		
		JLayeredPane layeredPane_5 = new JLayeredPane();
		tabbedPane_1.addTab("\u533B\u7597\u5F85\u9047\u8BA1\u7B97\u53C2\u6570", null, layeredPane_5, null);
		
		
			String[][] b = new String[Database.insUnitList.size()][];//获取列表需要的数组
			for (int i = 0; i < b.length; i++) 
			{
				b[i]=Database.insUnitList.get(i);
			}
		String[][] c = new String[Database.drugList.size()][];//获取列表需要的数组
		for (int i = 0; i < c.length; i++) 
		{
			c[i]=Database.drugList.get(i);
		}
		String[][] d = new String[Database.inpatientList.size()][];//获取列表需要的数组
		for (int i = 0; i < d.length; i++) 
		{
			d[i]=Database.inpatientList.get(i);
		}
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 721, 512);
		panel.add(tabbedPane_2);
		tabbedPane_2.setVisible(false);
		
		JLayeredPane layeredPane_6 = new JLayeredPane();
		tabbedPane_2.addTab("\u4EBA\u5458\u5C31\u8BCA\u673A\u6784\u5BA1\u6279", null, layeredPane_6, null);
		
		JLayeredPane layeredPane_7 = new JLayeredPane();
		tabbedPane_2.addTab("\u7279\u68C0\u7279\u6CBB\u5BA1\u6279", null, layeredPane_7, null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 716, 512);
		panel.add(tabbedPane_3);
		tabbedPane_3.setVisible(false);
		
		JLayeredPane layeredPane_8 = new JLayeredPane();
		tabbedPane_3.addTab("\u533B\u4FDD\u62A5\u9500", null, layeredPane_8, null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(0, 0, 716, 512);
		layeredPane_8.add(panel_8);
		panel_8.setLayout(null);
		
		JButton button_27 = new JButton("\u7ED3\u7B97");
		button_27.setBackground(Color.RED);
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int res=JOptionPane.showConfirmDialog(null, "确定要结算"+textField_24.getText()+"的报销吗?", "是否继续", JOptionPane.YES_NO_OPTION);
				if(res==JOptionPane.YES_OPTION)
				{
					
				String str= textField_24.getText()+","+textField_25.getText()+","+textField.getText()+","+textField_26.getText()+","+textField_27.getText()+","+textField_28.getText()+","+textField_30.getText()+","+textField_29.getText();
				
				Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/Settlment.txt", str, true);
				
				JOptionPane.showMessageDialog(null, "结算成功!", "提示", JOptionPane.WARNING_MESSAGE);
				
				initReim();
				panel_8.setVisible(false);
				panel_6.setVisible(true);
				}else
				{
					JOptionPane.showMessageDialog(null, "结算失败!", "提示", JOptionPane.WARNING_MESSAGE);
					
				}
			}
		});
		button_27.setBounds(362, 450, 97, 23);
		button_27.setFont(new Font("等线", Font.PLAIN, 18));
		panel_8.add(button_27);
		
		JLabel label_25 = new JLabel("\u59D3\u540D");
		label_25.setFont(new Font("楷体", Font.PLAIN, 18));
		label_25.setBounds(20, 30, 58, 15);
		panel_8.add(label_25);
		
		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("等线", Font.PLAIN, 18));
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBackground(Color.WHITE);
		textField_24.setBounds(77, 28, 66, 21);
		panel_8.add(textField_24);
		
		JLabel label_26 = new JLabel("\u4F4F\u9662\u53F7");
		label_26.setFont(new Font("楷体", Font.PLAIN, 18));
		label_26.setBounds(182, 30, 58, 15);
		panel_8.add(label_26);
		
		textField_25 = new JTextField();
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("等线", Font.PLAIN, 18));
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBackground(Color.WHITE);
		textField_25.setBounds(250, 28, 80, 21);
		panel_8.add(textField_25);
		
		JButton button_28 = new JButton("\u4E0A\u4E00\u6B65");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_8.setVisible(false);
				panel_4.setVisible(true);
			}
		});
		button_28.setFont(new Font("等线", Font.PLAIN, 18));
		button_28.setBounds(222, 450, 97, 23);
		panel_8.add(button_28);
		
		JLabel label_27 = new JLabel("\u8D77\u4ED8\u6807\u51C6\uFF08100\uFF09\uFF5E10000");
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setFont(new Font("楷体", Font.PLAIN, 18));
		label_27.setBounds(30, 100, 250, 15);
		panel_8.add(label_27);
		
		textField = new JTextField();
		textField.setText("20%");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("等线", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(290, 98, 80, 21);
		panel_8.add(textField);
		
		JLabel label_28 = new JLabel("\u5206\u6BB5\u6BD4\u4F8B10001\uFF5E20000");
		label_28.setHorizontalAlignment(SwingConstants.RIGHT);
		label_28.setFont(new Font("楷体", Font.PLAIN, 18));
		label_28.setBounds(30, 150, 250, 15);
		panel_8.add(label_28);
		
		textField_26 = new JTextField();
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setText("10%");
		textField_26.setFont(new Font("等线", Font.PLAIN, 18));
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBackground(Color.WHITE);
		textField_26.setBounds(290, 148, 80, 21);
		panel_8.add(textField_26);
		
		JLabel label_29 = new JLabel("\u5206\u6BB5\u6BD4\u4F8B20000\uFF5E");
		label_29.setHorizontalAlignment(SwingConstants.RIGHT);
		label_29.setFont(new Font("楷体", Font.PLAIN, 18));
		label_29.setBounds(30, 200, 250, 15);
		panel_8.add(label_29);
		
		textField_27 = new JTextField();
		textField_27.setText("5%");
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("等线", Font.PLAIN, 18));
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBackground(Color.WHITE);
		textField_27.setBounds(290, 198, 80, 21);
		panel_8.add(textField_27);
		
		JLabel label_30 = new JLabel("\u672A\u62A5\u9500\u65F6\u603B\u91D1\u989D");
		label_30.setHorizontalAlignment(SwingConstants.LEFT);
		label_30.setFont(new Font("楷体", Font.PLAIN, 18));
		label_30.setBounds(130, 250, 150, 15);
		panel_8.add(label_30);
		
		textField_28 = new JTextField();
		textField_28.setHorizontalAlignment(SwingConstants.LEFT);
		textField_28.setFont(new Font("等线", Font.PLAIN, 18));
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBackground(Color.WHITE);
		textField_28.setBounds(270, 248, 150, 21);
		panel_8.add(textField_28);
		
		JLabel label_32 = new JLabel("\u5143");
		label_32.setFont(new Font("楷体", Font.PLAIN, 18));
		label_32.setBounds(430, 250, 58, 15);
		panel_8.add(label_32);
		
		JLabel label_31 = new JLabel("\u62A5\u9500\u7684\u603B\u91D1\u989D");
		label_31.setHorizontalAlignment(SwingConstants.LEFT);
		label_31.setFont(new Font("楷体", Font.PLAIN, 18));
		label_31.setBounds(130, 350, 150, 15);
		panel_8.add(label_31);
		
		textField_29 = new JTextField();
		textField_29.setHorizontalAlignment(SwingConstants.LEFT);
		textField_29.setFont(new Font("等线", Font.PLAIN, 18));
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBackground(Color.WHITE);
		textField_29.setBounds(270, 348, 150, 21);
		panel_8.add(textField_29);
		
		JLabel label_33 = new JLabel("\u5143");
		label_33.setFont(new Font("楷体", Font.PLAIN, 18));
		label_33.setBounds(430, 300, 58, 15);
		panel_8.add(label_33);
		
		JButton button_30 = new JButton("\u53D6\u6D88");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//清空 并回到第一页；
				initReim();
				panel_8.setVisible(false);
				panel_6.setVisible(true);
			}
		});
		button_30.setFont(new Font("等线", Font.PLAIN, 18));
		button_30.setBounds(600, 30, 97, 23);
		panel_8.add(button_30);
		
		JLabel label_34 = new JLabel("\u672A\u6267\u884C\u8D77\u4ED8\u6807\u51C6\u62A5\u9500\u989D");
		label_34.setHorizontalAlignment(SwingConstants.LEFT);
		label_34.setFont(new Font("楷体", Font.PLAIN, 18));
		label_34.setBounds(80, 300, 200, 15);
		panel_8.add(label_34);
		
		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.LEFT);
		textField_30.setFont(new Font("等线", Font.PLAIN, 18));
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBackground(Color.WHITE);
		textField_30.setBounds(270, 298, 150, 21);
		panel_8.add(textField_30);
		
		JLabel label_35 = new JLabel("\u5143");
		label_35.setFont(new Font("楷体", Font.PLAIN, 18));
		label_35.setBounds(430, 350, 58, 15);
		panel_8.add(label_35);
		panel_8.setVisible(false);
		
		panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 716, 512);
		layeredPane_8.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setVisible(false);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(25, 60, 600, 370);
		panel_4.add(scrollPane_4);
		
		
		table_4 = new JTable(tableModel){
			public boolean isCellEditable(int row, int column)
			{
				return flag_3;}//表格不允许被编辑
		};
		scrollPane_4.setViewportView(table_4);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D");
		lblNewLabel.setBounds(20, 30, 58, 15);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_4.add(lblNewLabel);
		
		JLabel label_24 = new JLabel("\u4F4F\u9662\u53F7");
		label_24.setFont(new Font("楷体", Font.PLAIN, 18));
		label_24.setBounds(182, 30, 58, 15);
		panel_4.add(label_24);
		
		textField_22 = new JTextField();
		textField_22.setBackground(Color.WHITE);
		textField_22.setEditable(false);
		textField_22.setFont(new Font("等线", Font.PLAIN, 18));
		textField_22.setBounds(77, 28, 66, 21);
		panel_4.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBackground(Color.WHITE);
		textField_23.setFont(new Font("等线", Font.PLAIN, 18));
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(250, 28, 80, 21);
		panel_4.add(textField_23);
		
		Button button_25 = new Button("\u4E0A\u4E00\u9875");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO 开启列表分页功能
			}
		});
		button_25.setFont(new Font("等线", Font.PLAIN, 18));
		button_25.setBounds(422, 30, 73, 22);
		panel_4.add(button_25);
		
		Button button_26 = new Button("\u4E0B\u4E00\u9875");
		button_26.setFont(new Font("等线", Font.PLAIN, 18));
		button_26.setBounds(586, 30, 73, 22);
		panel_4.add(button_26);
		
		JLabel lblNewLabel_1 = new JLabel("1/1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("等线", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(508, 30, 52, 17);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u9875");
		lblNewLabel_2.setFont(new Font("等线", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(552, 30, 28, 17);
		panel_4.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\u9884\u7ED3\u7B97");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (!( table_4.getValueAt(0, 5).equals(""))){}/////////////////////////
				if (flag00) //手动录入后
				{
//				Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/Detail.txt", Database.DETAIL_HEAD, false);
					String str = textField_22.getText() + "," + textField_23.getText() + ",";
					String tableValue0 = "";
					for (int i = 0; i < table_4.getColumnCount(); i++) 
					{
						for (int j = 0; j < table_4.getRowCount(); j++) 
						{
							try {
								if (table_4.getValueAt(j, i).equals("")) 
								{
									continue;
								}
							} catch (NullPointerException e) {
								
								e.printStackTrace();
								continue;
							}
							tableValue0 += table_4.getValueAt(j, i) + "/";
						}
						tableValue0 = tableValue0.substring(0, tableValue0.length() - 1);
						str += tableValue0 + ",";
					}
					str = str.substring(0, str.length() - 1);
					Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/Detail.txt", str, true);
				}
				
				Double valueAmount = 0.0;
				for (int i = 0; i < table_4.getRowCount(); i++)
				{
					try {
						
						valueAmount+=Double.parseDouble((String) table_4.getValueAt(i, 4));//未报销时的费用总额
					} catch (NullPointerException e) {
						
					}

				}

						/*最终报销的金额*/
						Double amountLast=0.0;
						Double amount1=0.0;
						Double amount2=0.0;
						Double amount3=0.0;
						if (amount<100) 
						{
							JOptionPane.showMessageDialog(null, "报销起付标准为100元,故无法报销", "提示", JOptionPane.WARNING_MESSAGE);
						}
						if (amount>100&&amount<=10000) 
						{
							amount1+=(amount-100)*0.8;
						}
						if (amount>10000&&amount<=20000) 
						{
							amount2+=9900*0.8+(amount-10000)*0.9;
						}
						if (amount>20000) 
						{
							amount3+=9900*0.8+100000*0.9+(amount-20000)*0.95;
						}
						amountLast=amount1+amount2+amount3;//最终报销到的金额
						

					panel_4.setVisible(false);
					panel_8.setVisible(true);
					textField_24.setText(textField_14.getText());//获取姓名
					textField_25.setText(textField_21.getText());//住院号
					textField_28.setText(String.valueOf(valueAmount));
					textField_29.setText(String.valueOf(amountLast));
					textField_30.setText(String.valueOf(amount));
//				valueAmount;
				
					} catch (NullPointerException e) {///////////////////////
						
						JOptionPane.showMessageDialog(null, "请先计算支付比例再预结算", "提示", JOptionPane.ERROR_MESSAGE);	
					}
			}
			
			
		});
		btnNewButton.setFont(new Font("等线", Font.PLAIN, 18));
		btnNewButton.setBounds(362, 450, 97, 23);
		panel_4.add(btnNewButton);
		
		JButton button_29 = new JButton("\u4E0A\u4E00\u6B65");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_4.setVisible(false);
				panel_7.setVisible(true);
			}
		});
		button_29.setFont(new Font("黑体", Font.PLAIN, 18));
		button_29.setBounds(222, 450, 97, 23);
		panel_4.add(button_29);
		
		Button button_31 = new Button("\u8BA1\u7B97\u6BD4\u4F8B");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = 0;
				for ( i = 0; i < Database.inpatientArray.size(); i++) 
				{

						if(textField_17.getText().equals(String.valueOf(Database.inpatientArray.get(i).getHospitalNumber())))//医院分级
						{
							if (Database.inpatientArray.get(i).getHospitalGrade().equals("一级"))
							{
								coefficient_1=1;
								coefficient_2=1;
								coefficient_3=1;
								break;
							}
							if (Database.inpatientArray.get(i).getHospitalGrade().equals("二级"))
							{
								coefficient_1=0;
								coefficient_2=1;
								coefficient_3=1;
								break;
							}
							if (Database.inpatientArray.get(i).getHospitalGrade().equals("三级"))
							{
								coefficient_1=0;
								coefficient_2=0;
								coefficient_3=1;
								break;
							}
						}
				}
				if (i==Database.inpatientArray.size()&&coefficient_1==-1) 
				{
					JOptionPane.showMessageDialog(null, "未找到"+textField_25.getText()+"，默认为三级", "提示", JOptionPane.ERROR_MESSAGE);
					coefficient_1=0;
					coefficient_2=0;
					coefficient_3=1;
				}
					
					
					int j = 0;
					for (j = 0; j < table_4.getRowCount();j++)
					{
						try 
						{
							int k=0;
							for (k = 0; k <Database.drugArray.size(); k++)
							{
								if (table_4.getValueAt(j, 1).equals(String.valueOf(Database.drugArray.get(k).getID()))) //table中药品与本地药品比对
								{
									
									if (Database.drugArray.get(k).getMedInsCategory().equals("甲类")) 
									{
										coefficient=1;
									}
									if (Database.drugArray.get(k).getMedInsCategory().equals("乙类")) 
									{
										coefficient=0.5;
									}
									if (Database.drugArray.get(k).getMedInsCategory().equals("丙类")) 
									{
										coefficient=0;
									}
								}
								
								if (table_4.getValueAt(j, 1).equals(String.valueOf(Database.drugArray.get(k).getID()))) //table中药品与本地药品比对
								{
									if (Database.drugArray.get(k).getHospitalGrade().equals("一级"))
									{
										coefficient_=coefficient_1;//直接可以填1
									}
									if (Database.drugArray.get(k).getHospitalGrade().equals("二级"))
									{
										coefficient_=coefficient_2;//一二三级医院对应上的coefficient_2是1 1 0
									}
									if (Database.drugArray.get(k).getHospitalGrade().equals("三级"))
									{
										coefficient_=coefficient_3;//一二三级医院对应上的coefficient_3是1 1 1 三级药品在一二三级医院均能报销
									}
								} 
							}
							if (coefficient==-1) 
							{
								JOptionPane.showMessageDialog(null, table_4.getValueAt(j, 0)+"的类别未知,无法报销", "提示", JOptionPane.WARNING_MESSAGE);
								coefficient=0;
							}
							if (coefficient_==-1) 
							{
								JOptionPane.showMessageDialog(null, table_4.getValueAt(j, 0)+"的使用医院等级未知,无法报销", "提示", JOptionPane.WARNING_MESSAGE);
								coefficient_=0;
							}
							amount+=Double.parseDouble((String) table_4.getValueAt(j, 4))*coefficient*coefficient_;//原价乘以甲乙丙类报销 再乘以等级报销 金额
						} catch (NullPointerException e) {
							continue;
						}						
				
						table_4.setValueAt((1-coefficient*coefficient_), j, 5);
					}

			}
		});
		button_31.setActionCommand("");
		button_31.setBounds(631, 60, 60, 22);
		panel_4.add(button_31);
		
		panel_7 = new JPanel();
		panel_7.setBounds(0, 0, 716, 512);
		layeredPane_8.add(panel_7);
		panel_7.setLayout(null);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);

		
		JButton button_2 = new JButton("\u4E0B\u4E00\u6B65");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (int i = 0; i < Database.detailItemArray.size(); i++)
				{
					if (textField_21.getText().equals("")) 
					{
						JOptionPane.showMessageDialog(null, "请在录入住院信息后再操作", "警告", JOptionPane.WARNING_MESSAGE);
//						break;
					}else
					{
						if (String.valueOf(Database.detailItemArray.get(i).getAdmissionNumber()).equals(textField_21.getText()))//住院号对应 
						{
							panel_7.setVisible(false);
							panel_4.setVisible(true);
							//显示table  下一个页面
							textField_22.setText(textField_14.getText());//获取姓名
							textField_23.setText(textField_21.getText());//住院号
						
							String[] s=new String[] {"\u836F\u54C1\u7F16\u7801", "\u836F\u54C1", "\u5355\u4EF7", "数量", "\u91D1\u989D", "\u81EA\u4ED8\u6BD4\u4F8B"};
							
							Database.refreshTable(Database.detailArray.get(i), table_4, s);
							i=10000;
						}	
//						}else 
//						{
//							JOptionPane.showMessageDialog(null, "未查询到该病人信息", "警告", JOptionPane.ERROR_MESSAGE);
//							
//							break;
//						}
						if (i==Database.inpatientArray.size()) 
						{
							
								JOptionPane.showMessageDialog(null, "未查询到处方明细，请手动录入", "提示", JOptionPane.WARNING_MESSAGE);
								flag00=true;
								panel_7.setVisible(false);
								panel_4.setVisible(true);
								textField_22.setText(textField_14.getText());//获取姓名
								textField_23.setText(textField_21.getText());//住院号
								
								String[] s=new String[] {"\u836F\u54C1\u7F16\u7801", "\u836F\u54C1", "\u5355\u4EF7", "数量", "\u91D1\u989D", "\u81EA\u4ED8\u6BD4\u4F8B"};
								//使得表格可以被修改
								flag_3=!flag_3;
								table_4.setModel(new DefaultTableModel(
										
										new String[][]					
										{
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null},
											{null,null,null,null,null,null}
										},//显示的列表需要的数组
										s
										));
						}
		
					}
				}
				//记录数据
								
			}
		});
		button_2.setBounds(362, 421, 97, 23);
		button_2.setFont(new Font("黑体", Font.PLAIN, 18));
		panel_7.add(button_2);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("等线", Font.PLAIN, 18));
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(108, 50, 67, 21);
		panel_7.add(textField_14);
		
		JLabel label_16 = new JLabel("\u59D3\u540D");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setFont(new Font("楷体", Font.PLAIN, 18));
		label_16.setBounds(40, 52, 58, 15);
		panel_7.add(label_16);
		
		JButton button_22 = new JButton("\u4E0A\u4E00\u6B65");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_7.setVisible(false);
				panel_6.setVisible(true);
				
			}
		});
		button_22.setFont(new Font("黑体", Font.PLAIN, 18));
		button_22.setBounds(222, 421, 97, 23);
		panel_7.add(button_22);
		
		JButton button_23 = new JButton("\u5C31\u8BCA\u4FE1\u606F");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = textField_14.getText();
				int i;
				for (i = 0; i < Database.inpatientArray.size(); i++) 
				{
					if (str.equals(Database.inpatientArray.get(i).getName())) 
					{
						textField_16.setText(Database.inpatientArray.get(i).getHospitalName());
						textField_17.setText(String.valueOf(Database.inpatientArray.get(i).getHospitalNumber()));
						textField_18.setText(Database.inpatientArray.get(i).getMedicalCategory());
						textField_19.setText(String.valueOf(Database.inpatientArray.get(i).getAdmissionDate()));
						textField_20.setText(String.valueOf(Database.inpatientArray.get(i).getDischargeDate()));
						textPane_1.setText(Database.inpatientArray.get(i).getDischargeReason());
						textField_21.setText(String.valueOf(Database.inpatientArray.get(i).getAdmissionNumber()));
						i=10000;
					}
				}
				if (i==Database.inpatientArray.size()&&textField_16.getText().equals("")) 
				{
					//弹窗提示
					JOptionPane.showMessageDialog(null, "未找到诊疗信息请手动录入", "警告", JOptionPane.WARNING_MESSAGE);
					
					textField_16.setText(null);
					textField_17.setText(null);
					textField_18.setText(null);
					textField_19.setText(null);
					textField_20.setText(null);
					textPane_1.setText(null);
					textField_21.setText(null);
					
					textField_16.setEditable(true);
					textField_17.setEditable(true);
					textField_18.setEditable(true);
					textField_19.setEditable(true);
					textField_20.setEditable(true);
					textPane_1.setEditable(true);
					textField_21.setEditable(true);
					
					
				}
				
			
			}
		});
		button_23.setFont(new Font("黑体", Font.PLAIN, 18));
		button_23.setBounds(570, 48, 120, 23);
		panel_7.add(button_23);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("等线", Font.PLAIN, 18));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(370, 50, 189, 21);
		panel_7.add(textField_1);
		
		JLabel label = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\u7801");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("楷体", Font.PLAIN, 18));
		label.setBounds(220, 52, 140, 15);
		panel_7.add(label);
		
		JLabel label_17 = new JLabel("\u533B\u9662\u540D\u79F0");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setFont(new Font("楷体", Font.PLAIN, 18));
		label_17.setBounds(18, 92, 80, 15);
		panel_7.add(label_17);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("等线", Font.PLAIN, 18));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(108, 90, 300, 21);
		panel_7.add(textField_16);
		
		JLabel label_18 = new JLabel("\u533B\u9662\u7F16\u7801");
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		label_18.setFont(new Font("楷体", Font.PLAIN, 18));
		label_18.setBounds(430, 90, 80, 15);
		panel_7.add(label_18);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("等线", Font.PLAIN, 18));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(520, 89, 67, 21);
		panel_7.add(textField_17);
		
		JLabel label_19 = new JLabel("\u533B\u7597\u7C7B\u522B");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setFont(new Font("楷体", Font.PLAIN, 18));
		label_19.setBounds(18, 132, 80, 15);
		panel_7.add(label_19);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("等线", Font.PLAIN, 18));
		textField_18.setEditable(false);
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(108, 130, 67, 24);
		panel_7.add(textField_18);
		
		JLabel label_20 = new JLabel("\u5165\u9662\u65E5\u671F");
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setFont(new Font("楷体", Font.PLAIN, 18));
		label_20.setBounds(185, 132, 80, 15);
		panel_7.add(label_20);
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("等线", Font.PLAIN, 18));
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(280, 130, 85, 21);
		panel_7.add(textField_19);
		
		JLabel label_21 = new JLabel("\u51FA\u9662\u65E5\u671F");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setFont(new Font("楷体", Font.PLAIN, 18));
		label_21.setBounds(370, 132, 80, 15);
		panel_7.add(label_21);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("等线", Font.PLAIN, 18));
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBackground(Color.WHITE);
		textField_20.setBounds(460, 130, 85, 21);
		panel_7.add(textField_20);
		
		JLabel label_22 = new JLabel("\u51FA\u9662\u539F\u56E0");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setFont(new Font("楷体", Font.PLAIN, 18));
		label_22.setBounds(18, 172, 80, 15);
		panel_7.add(label_22);
		
		textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setFont(new Font("等线", Font.PLAIN, 15));
		textPane_1.setBounds(108, 170, 375, 200);
		panel_7.add(textPane_1);
		
		JLabel label_23 = new JLabel("\u4F4F\u9662\u53F7");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setFont(new Font("楷体", Font.PLAIN, 18));
		label_23.setBounds(460, 172, 80, 15);
		panel_7.add(label_23);
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("等线", Font.PLAIN, 18));
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBackground(Color.WHITE);
		textField_21.setBounds(560, 170, 85, 21);
		panel_7.add(textField_21);
		panel_7.setVisible(false);
		
		panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 716, 512);
		layeredPane_8.add(panel_6);
		panel_6.setVisible(true);
		panel_6.setLayout(null);
		
		JLabel label_1 = new JLabel("\u59D3\u540D");
		label_1.setBounds(46, 71, 58, 15);
		label_1.setFont(new Font("楷体", Font.PLAIN, 18));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_6.add(label_1);
		
		JLabel lblid = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\u7801");
		lblid.setBounds(219, 71, 119, 15);
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblid.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(lblid);
		
		JLabel label_2 = new JLabel("\u6027\u522B");
		label_2.setBounds(46, 110, 58, 15);
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 108, 37, 21);
		textField_2.setBackground(Color.WHITE);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("等线", Font.PLAIN, 18));
		textField_2.setEditable(false);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(114, 69, 67, 21);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("等线", Font.PLAIN, 18));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		panel_6.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(349, 70, 189, 20);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBackground(Color.WHITE);
		textField_4.setFont(new Font("等线", Font.PLAIN, 18));
		textField_4.setEditable(false);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(306, 108, 94, 21);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("等线", Font.PLAIN, 18));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		panel_6.add(textField_5);
		
		JLabel label_3 = new JLabel("\u51FA\u751F\u65E5\u671F");
		label_3.setBounds(209, 110, 85, 15);
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_3);
		
		textField_6 = new JTextField();
		textField_6.setBounds(561, 108, 111, 21);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("等线", Font.PLAIN, 18));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		panel_6.add(textField_6);
		
		JLabel label_4 = new JLabel("\u533B\u7597\u4EBA\u5458\u7C7B\u522B");
		label_4.setBounds(431, 110, 119, 15);
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_4);
		
		JLabel label_5 = new JLabel("\u5355\u4F4D\u7F16\u53F7");
		label_5.setBounds(20, 149, 85, 15);
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_5);
		
		textField_7 = new JTextField();
		textField_7.setBounds(115, 147, 94, 21);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("等线", Font.PLAIN, 18));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		panel_6.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(349, 139, 189, 29);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("等线", Font.PLAIN, 18));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		panel_6.add(textField_8);
		
		JLabel label_6 = new JLabel("\u5355\u4F4D\u540D\u79F0");
		label_6.setBounds(253, 149, 85, 15);
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_6);
		
		JLabel label_7 = new JLabel("\u4F4F\u9662\u6B21\u6570");
		label_7.setBounds(20, 192, 85, 15);
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_7);
		
		textField_9 = new JTextField();
		textField_9.setBounds(115, 190, 46, 21);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("等线", Font.PLAIN, 18));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		panel_6.add(textField_9);
		
		JLabel label_8 = new JLabel("\u4E0A\u6B21\u51FA\u9662\u65F6\u95F4");
		label_8.setBounds(219, 192, 119, 15);
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_8);
		
		textField_10 = new JTextField();
		textField_10.setBounds(349, 190, 94, 21);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("等线", Font.PLAIN, 18));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		panel_6.add(textField_10);
		
		JLabel label_9 = new JLabel("\u4E0A\u6B21\u51FA\u9662\u8BCA\u65AD");
		label_9.setBounds(42, 254, 119, 15);
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_9);
		
		JButton btnNewButton_1 = new JButton("\u4E0B\u4E00\u6B65");
		btnNewButton_1.setBounds(306, 421, 97, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField_3.getText().equals("")) 
				{
					JOptionPane.showMessageDialog(null, "请先搜索在进行下一步", "错误", JOptionPane.ERROR_MESSAGE);
				}else 
				{
				panel_6.setVisible(false);
				panel_7.setVisible(true);
				try {											
					
					textField_14.setText(textField_3.getText());
					textField_1.setText(textField_4.getText());
				} catch (NullPointerException e) {
					textField_14.setText("null");
				}
				}
			}
		});
		btnNewButton_1.setFont(new Font("黑体", Font.PLAIN, 18));
		panel_6.add(btnNewButton_1);
		
		JLabel label_10 = new JLabel("\u672C\u5E74\u4E2D\u5FC3\u62A5\u9500\u7D2F\u8BA1");
		label_10.setBounds(20, 322, 156, 15);
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(186, 321, 67, 21);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("等线", Font.PLAIN, 18));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		panel_6.add(textField_11);
		
		JLabel label_12 = new JLabel("\u5143");
		label_12.setBounds(613, 319, 58, 15);
		label_12.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_12);
		
		JLabel label_11 = new JLabel("\u5143");
		label_11.setBounds(263, 324, 58, 15);
		label_11.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_11);
		
		JLabel label_13 = new JLabel("\u672C\u5E74\u4E2A\u4EBA\u81EA\u8D39\u7D2F\u8BA1");
		label_13.setBounds(370, 317, 156, 15);
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_13);
		
		textField_12 = new JTextField();
		textField_12.setBounds(536, 316, 67, 21);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("等线", Font.PLAIN, 18));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		panel_6.add(textField_12);
		
		JLabel label_14 = new JLabel("\u5143");
		label_14.setBounds(263, 368, 58, 15);
		label_14.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_14);
		
		JLabel label_15 = new JLabel("\u672C\u5E74\u533B\u7597\u8D39\u7528\u7D2F\u8BA1");
		label_15.setBounds(20, 366, 156, 15);
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setFont(new Font("楷体", Font.PLAIN, 18));
		panel_6.add(label_15);
		
		textField_13 = new JTextField();
		textField_13.setBounds(186, 365, 67, 21);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("等线", Font.PLAIN, 18));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		panel_6.add(textField_13);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("等线", Font.PLAIN, 15));
		textPane.setBounds(186, 248, 353, 63);
		panel_6.add(textPane);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("等线", Font.PLAIN, 15));
		textField_15.setColumns(10);
		textField_15.setBounds(138, 26, 84, 22);
		panel_6.add(textField_15);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u59D3\u540D", "\u4E2A\u4EBAID"}));
		comboBox_1.setFont(new Font("等线", Font.PLAIN, 15));
		comboBox_1.setBounds(35, 26, 93, 23);
		panel_6.add(comboBox_1);
		
		JButton button_21 = new JButton("\u641C\u7D22");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (comboBox_1.getSelectedItem().equals("姓名"))
				{
					String str = textField_15.getText();//获得输入框内容 
					int i;
					for (i = 0; i < Database.insuredArray.size(); i++) 
					{
						if(str.equals(Database.insuredArray.get(i).getName()))
						{
							textField_3.setText(Database.insuredArray.get(i).getName());//TODO 还没有这些数据
							textField_4.setText(String.valueOf(Database.insuredArray.get(i).getDocumentNumber()));
							textField_2.setText(Database.insuredArray.get(i).getSex());
							textField_5.setText(String.valueOf(Database.insuredArray.get(i).getBirthDate()));
							textField_6.setText("null");//医疗人员类别
							textField_7.setText("null");//单位编号
							textField_8.setText("null");//单位名称
							textField_9.setText("null");//住院次数
							textField_10.setText("null");//上次出院时间
							textPane.setText("null");//上次出院诊断
							textField_11.setText("null");//报销累计
							textField_12.setText("null");//自费累计
							textField_13.setText("null");//费用累计
							i=10000;
							
						}
					}
					if(i==Database.insuredArray.size())
					{
						JOptionPane.showMessageDialog(null, "未找到", "错误", JOptionPane.ERROR_MESSAGE);
					}
				}
				if(comboBox_1.getSelectedItem().equals("个人ID"))
				{
					String str = textField_15.getText();
					int j;
					for (j = 0; j < Database.insUnitArray.size(); j++) 
					{
						if (str.equals(Database.insuredArray.get(j).getID())) 
						{
							textField_3.setText(Database.insuredArray.get(j).getName());
							textField_4.setText(String.valueOf(Database.insuredArray.get(j).getDocumentNumber()));
							textField_2.setText(Database.insuredArray.get(j).getSex());
							textField_5.setText(String.valueOf(Database.insuredArray.get(j).getBirthDate()));
							textField_6.setText("null");//真不知道
							textField_7.setText("null");
							textField_8.setText("null");
							textField_9.setText("null");
							textField_10.setText("null");
							textPane.setText("null");
							textField_11.setText("null");
							textField_12.setText("null");
							textField_13.setText("null");
							j=10000;
							
						}
					}
					if(j==Database.insuredArray.size())
					{
						JOptionPane.showMessageDialog(null, "未找到", "错误", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		button_21.setFont(new Font("宋体", Font.PLAIN, 15));
		button_21.setBounds(250, 25, 71, 23);
		panel_6.add(button_21);

		Button button_24 = new Button("\u6E05\u7A7A");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				initReim();//清空数据并载入第一页
				
			}
		});
		button_24.setBounds(580, 25, 38, 22);
		panel_6.add(button_24);
		
		JPanel panel_04 = new JPanel();
		panel_04.setLayout(null);
		panel_04.setBackground(Color.WHITE);
		panel_04.setBounds(0, 36, 131, 512);
		contentPane.add(panel_04);
		
		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBackground(SystemColor.menu);
		panel_19.setBounds(0, 0, 130, 44);
		panel_04.add(panel_19);
		
		JButton button_9 = new JButton("\u516C\u5171\u4E1A\u52A1");
		button_9.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					tabbedPane_0.setVisible(!flag0);
					tabbedPane_1.setVisible(false);
					tabbedPane_2.setVisible(false);
					tabbedPane_3.setVisible(false);

			}
		});
		button_9.setBackground(UIManager.getColor("Button.background"));
		button_9.setBounds(0, 0, 130, 44);
		panel_19.add(button_9);
		
		JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBounds(0, 44, 130, 44);
		panel_04.add(panel_23);
		
		JButton button_10 = new JButton("\u533B\u7597\u4FE1\u606F\u7EF4\u62A4");
		button_10.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				
				tabbedPane_0.setVisible(false);
				tabbedPane_1.setVisible(!flag1);
				tabbedPane_2.setVisible(false);
				tabbedPane_3.setVisible(false);
				
			}
		});
		button_10.setBounds(0, 0, 130, 44);
		panel_23.add(button_10);
		
		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBounds(0, 88, 130, 44);
		panel_04.add(panel_27);
		
		JButton button_11 = new JButton("\u533B\u7597\u5F85\u9047\u5BA1\u6279");
		button_11.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
					tabbedPane_0.setVisible(false);
					tabbedPane_1.setVisible(false);
					tabbedPane_2.setVisible(!flag2);
					tabbedPane_3.setVisible(false);
			}
		});
		button_11.setBounds(0, 0, 130, 44);
		panel_27.add(button_11);
		
		JPanel panel_33 = new JPanel();
		panel_33.setLayout(null);
		panel_33.setBounds(0, 132, 130, 44);
		panel_04.add(panel_33);
		
		JButton button_15 = new JButton("\u533B\u4FDD\u62A5\u9500");
		button_15.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//TODO 点击刷新清空子页面的数据
					tabbedPane_0.setVisible(false);
					tabbedPane_1.setVisible(false);
					tabbedPane_2.setVisible(false);
					tabbedPane_3.setVisible(!flag3);

			}
		});
		button_15.setBounds(0, 0, 130, 44);
		panel_33.add(button_15);
	
	}
	public  void initReim()//初始化中心报销
	{
		textField_3.setText(null);
		textField_4.setText(null);
		textField_2.setText(null);
		textField_5.setText(null);
		textField_6.setText(null);
		textField_7.setText(null);
		textField_8.setText(null);
		textField_9.setText(null);
		textField_10.setText(null);
		textPane.setText(null);
		textField_11.setText(null);
		textField_12.setText(null);
		textField_13.setText(null);
		textField_15.setText(null);
		
		textField_14.setText(null);
		textField_1.setText(null);
		textField_16.setText(null);
		textField_17.setText(null);
		textField_18.setText(null);
		textField_19.setText(null);
		textField_20.setText(null);
		textPane_1.setText(null);
		textField_21.setText(null);
		
		amount = 0.0;
		coefficient_1=-1;
		coefficient_2=-1;
		coefficient_3=-1;
		
		coefficient=-1;
		
		coefficient_=-1;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
