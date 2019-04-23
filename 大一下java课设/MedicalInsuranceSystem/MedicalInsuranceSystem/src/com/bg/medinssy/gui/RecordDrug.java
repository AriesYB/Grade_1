package com.bg.medinssy.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.bg.medinssy.data.Database;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Frame;
 class RecordDrug extends JPanel {

	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the panel.
	 */
	public RecordDrug() {
		setLayout(null);
		
		JLabel label = new JLabel("\u836F\u54C1\u540D\u79F0");
		label.setFont(new Font("宋体", Font.PLAIN, 13));
		label.setBounds(33, 55, 58, 21);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label);
		
		textField = new JTextField();
		textField.setBounds(101, 55, 66, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblid = new JLabel("\u836F\u54C1\u7F16\u53F7");
		lblid.setFont(new Font("宋体", Font.PLAIN, 13));
		lblid.setBounds(224, 58, 58, 15);
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblid);
		
		textField_2 = new JTextField();
		textField_2.setBounds(284, 55, 88, 21);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("\u836F\u54C1\u5242\u91CF\u5355\u4F4D");
		label_2.setFont(new Font("宋体", Font.PLAIN, 13));
		label_2.setBounds(188, 95, 94, 15);
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(285, 92, 65, 21);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("\u533B\u4FDD\u7C7B\u522B");
		label_4.setFont(new Font("宋体", Font.PLAIN, 13));
		label_4.setBounds(224, 160, 58, 15);
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label_4);
		
		label_6 = new JLabel("*");
		label_6.setBounds(177, 58, 58, 15);
		label_6.setForeground(Color.RED);
		add(label_6);
		
		label_7 = new JLabel("*");
		label_7.setBounds(177, 95, 30, 15);
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setForeground(Color.RED);
		add(label_7);
		
		label_8 = new JLabel("*");
		label_8.setBounds(273, 132, 58, 15);
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setForeground(Color.RED);
		add(label_8);
		
		label_10 = new JLabel("*");
		label_10.setBounds(360, 160, 58, 15);
		label_10.setForeground(Color.RED);
		add(label_10);
		
		label_11 = new JLabel("*");
		label_11.setBounds(360, 95, 58, 15);
		label_11.setForeground(Color.RED);
		add(label_11);
		
		label_12 = new JLabel("*");
		label_12.setBounds(382, 58, 58, 15);
		label_12.setForeground(Color.RED);
		add(label_12);
		
		JLabel label_1 = new JLabel("\u836F\u54C1\u79CD\u7C7B");
		label_1.setFont(new Font("宋体", Font.PLAIN, 13));
		label_1.setBounds(25, 132, 66, 15);
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 92, 66, 21);
		textField_1.setColumns(10);
		add(textField_1);
		
		JLabel label_3 = new JLabel("\u6700\u9AD8\u9650\u4EF7");
		label_3.setFont(new Font("宋体", Font.PLAIN, 13));
		label_3.setBounds(33, 92, 58, 15);
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(284, 157, 66, 21);
		comboBox_1.setToolTipText("\u8BF7\u9009\u62E9");
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u7532\u7C7B", "\u4E59\u7C7B", "\u4E19\u7C7B"}));
		comboBox_1.setSelectedIndex(0);
		add(comboBox_1);
		
		JLabel label_5 = new JLabel("\u82F1\u6587\u540D\u79F0");
		label_5.setFont(new Font("宋体", Font.PLAIN, 13));
		label_5.setBounds(33, 197, 58, 15);
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(101, 194, 66, 21);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_9 = new JLabel("\u5904\u65B9\u836F\u6807\u5FD7");
		label_9.setFont(new Font("宋体", Font.PLAIN, 13));
		label_9.setBounds(208, 197, 74, 15);
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label_9);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(284, 193, 66, 21);
		comboBox_2.setToolTipText("\u8BF7\u9009\u62E9");
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u8BF7\u9009\u62E9", "\u5904\u65B9\u836F", "\u975E\u5904\u65B9\u836F"}));
		comboBox_2.setSelectedIndex(0);
		add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("\u56FD\u836F\u51C6\u5B57");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 13));
		lblNewLabel.setBounds(33, 231, 58, 15);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel);
		
		textField_5 = new JTextField();
		textField_5.setBounds(101, 228, 134, 21);
		add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_13 = new JLabel("\u5907\u6CE8");
		label_13.setFont(new Font("宋体", Font.PLAIN, 13));
		label_13.setBounds(33, 262, 58, 15);
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label_13);
		
		textField_6 = new JTextField();
		textField_6.setBounds(101, 259, 134, 21);
		add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(101, 126, 212, 21);
		add(textField_7);
		textField_7.setColumns(10);
		
		JLabel label_14 = new JLabel("\u533B\u9662\u7B49\u7EA7");
		label_14.setFont(new Font("宋体", Font.PLAIN, 13));
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setBounds(33, 160, 58, 15);
		add(label_14);
		
		textField_8 = new JTextField();
		textField_8.setBounds(101, 157, 66, 21);
		add(textField_8);
		textField_8.setColumns(10);
		
		JLabel label_15 = new JLabel("*");
		label_15.setHorizontalAlignment(SwingConstants.LEFT);
		label_15.setForeground(Color.RED);
		label_15.setBounds(177, 160, 30, 15);
		add(label_15);
		
		JButton button = new JButton("\u4FDD\u5B58");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
try {
					
					/**
					 * 获取输入的数据并保存
					 * */
					String info=textField.getText()+","+textField_2.getText()+","+textField_1.getText()+","+textField_3.getText()+","+textField_7.getText()+","+textField_8.getText()+","+comboBox_1.getSelectedItem()+","+textField_4.getText()+"-"+comboBox_2.getSelectedItem()+"-"+textField_5.getText()+"-"+textField_6.getText();
					
					Database.drugList.add(Database.addDrug(info).toArray());//添加新的项

					Frame.getFrames()[Frame.getFrames().length-1].dispose();//销毁当前窗口
					
					/*写入文件*/
					Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/DrugInfo.txt",info,true);
					/*刷新表格*/
					Database.refreshTable(Database.drugList, JFrame.table_2, JFrame.s2);
					Database.drugList.clear();

				} catch (Exception e) {
					
					//弹窗提示输入不规范
					JOptionPane.showMessageDialog(null, "输入不规范,请重新输入", "错误", JOptionPane.ERROR_MESSAGE);
				
				}
			}
		});
		button.setBounds(101, 370, 74, 23);
		add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.getFrames()[Frame.getFrames().length-1].dispose();//销毁当前窗口
			}
		});
		button_1.setBounds(250, 370, 81, 23);
		add(button_1);

	}
}
