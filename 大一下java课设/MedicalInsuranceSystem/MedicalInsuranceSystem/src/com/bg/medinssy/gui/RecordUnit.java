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
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecordUnit extends JPanel {
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JButton button;
	private JButton button_1;
	private JComboBox textField_1;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public RecordUnit() {
		setLayout(null);
		
		JLabel label = new JLabel("\u5355\u4F4D\u540D\u79F0");
		label.setFont(new Font("宋体", Font.PLAIN, 13));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(33, 55, 58, 21);
		add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 13));
		textField.setBounds(101, 55, 66, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5355\u4F4D\u7C7B\u578B");
		label_1.setFont(new Font("宋体", Font.PLAIN, 13));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(33, 95, 58, 15);
		add(label_1);
		
		JLabel lblid = new JLabel("\u5355\u4F4D\u7F16\u53F7");
		lblid.setFont(new Font("宋体", Font.PLAIN, 13));
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblid.setBounds(224, 58, 58, 15);
		add(lblid);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_2.setBounds(284, 55, 88, 21);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5355\u4F4D\u5730\u5740");
		label_2.setFont(new Font("宋体", Font.PLAIN, 13));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(224, 95, 58, 15);
		add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_3.setBounds(285, 92, 148, 21);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_3 = new JLabel("\u90AE\u7F16");
		label_3.setFont(new Font("宋体", Font.PLAIN, 13));
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(33, 129, 58, 15);
		add(label_3);
		
		JLabel label_4 = new JLabel("\u8054\u7CFB\u7535\u8BDD");
		label_4.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(224, 129, 58, 15);
		add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_5.setBounds(284, 126, 66, 21);
		add(textField_5);
		textField_5.setColumns(10);
		
		label_6 = new JLabel("*");
		label_6.setForeground(Color.RED);
		label_6.setBounds(177, 58, 58, 15);
		add(label_6);
		
		label_7 = new JLabel("*");
		label_7.setForeground(Color.RED);
		label_7.setBounds(205, 95, 30, 15);
		add(label_7);
		
		label_8 = new JLabel("*");
		label_8.setForeground(Color.RED);
		label_8.setBounds(177, 129, 58, 15);
		add(label_8);
		
		label_10 = new JLabel("*");
		label_10.setForeground(Color.RED);
		label_10.setBounds(360, 129, 58, 15);
		add(label_10);
		
		label_11 = new JLabel("*");
		label_11.setForeground(Color.RED);
		label_11.setBounds(440, 95, 58, 15);
		add(label_11);
		
		label_12 = new JLabel("*");
		label_12.setForeground(Color.RED);
		label_12.setBounds(382, 58, 58, 15);
		add(label_12);
		
		button = new JButton("\u4FDD\u5B58");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					
					/**
					 * 获取输入的数据并保存
					 * */
					String info=textField.getText()+","+textField_2.getText()+","+textField_1.getSelectedItem()+","+textField_3.getText()+","+textField_4.getText()+","+textField_5.getText();
					
					Database.insUnitList.add(Database.addInsUnit(info).toArray());//添加新的项

					Frame.getFrames()[Frame.getFrames().length-1].dispose();//销毁当前窗口
					
					/*写入文件*/
					Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/InsUnitInfo.txt",info,true);
					/*刷新表格*/
					Database.refreshTable(Database.insUnitList, JFrame.table_1, JFrame.s1);
					Database.insUnitList.clear();

				} catch (Exception e) {
					
					//弹窗提示输入不规范
					JOptionPane.showMessageDialog(null, "输入不规范,请重新输入", "错误", JOptionPane.ERROR_MESSAGE);
				
				}
				
			}
		});
		button.setBounds(112, 216, 74, 23);
		add(button);
		
		button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.getFrames()[Frame.getFrames().length-1].dispose();//销毁当前窗口
			}
		});
		button_1.setBounds(261, 216, 81, 23);
		add(button_1);
		
		textField_1 = new JComboBox();
		textField_1.setToolTipText("\u8BF7\u9009\u62E9");
		textField_1.setModel(new DefaultComboBoxModel(new String[] {"\u56FD\u6709\u4F01\u4E1A", "\u56FD\u6709\u63A7\u80A1\u4F01\u4E1A", "\u5916\u8D44\u4F01\u4E1A", "\u5408\u8D44\u4F01\u4E1A", "\u79C1\u8425\u4F01\u4E1A", "\u4E8B\u4E1A\u5355\u4F4D", "\u56FD\u5BB6\u884C\u653F\u673A\u5173", "\u653F\u5E9C"}));
		textField_1.setSelectedIndex(0);
		textField_1.setBounds(101, 92, 94, 21);
		add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(101, 126, 66, 21);
		add(textField_4);

	}
}
