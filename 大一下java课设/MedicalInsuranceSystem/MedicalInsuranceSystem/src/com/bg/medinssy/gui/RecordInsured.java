package com.bg.medinssy.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.bg.medinssy.data.Database;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecordInsured extends JPanel {
	private JTextField textField_0;
	private JComboBox textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox textField_4;
	private JTextField textField_5;
	private JLabel label_5;
	private JTextField textField_6;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JTextField textField_7;
	private JLabel label_15;
	private JTextField textField_9;
	private JLabel label_18;
	private JTextField textField_12;
	private JLabel label_19;
	private JComboBox textField_13;
	private JLabel label_20;
	private JTextField textField_14;
	private JLabel label_21;
	private JTextField textField_15;
	private JLabel label_22;
	private JTextField textField_16;
	private JLabel label_16;
	private JTextField textField_10;
	private JLabel label_17;
	private JTextField textField_11;
	private JLabel label_23;
	private JTextField textField_17;
	private JLabel label_14;
	private JTextField textField_8;
	private JButton button;
	private JLabel label_24;
	private JTextField textField_18;

	/**
	 * Create the panel.
	 */
	public RecordInsured() {
		setLayout(null);
		
		JLabel label = new JLabel("\u59D3\u540D");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(47, 55, 44, 21);
		add(label);
		
		textField_0 = new JTextField();
		textField_0.setBounds(101, 55, 66, 21);
		add(textField_0);
		textField_0.setColumns(10);
		
		JLabel label_1 = new JLabel("\u8BC1\u4EF6\u7C7B\u578B");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(33, 95, 58, 15);
		add(label_1);
		
		textField_1 = new JComboBox();
		textField_1.setForeground(Color.BLACK);
		textField_1.setToolTipText("\u8BF7\u9009\u62E9");
		textField_1.setModel(new DefaultComboBoxModel(new String[] {"\u8EAB\u4EFD\u8BC1", "\u62A4\u7167", "\u519B\u5B98\u8BC1"}));
		textField_1.setBounds(101, 92, 66, 21);
		add(textField_1);
		
		JLabel lblid = new JLabel("\u4E2A\u4EBAID");
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		lblid.setBounds(224, 58, 58, 15);
		add(lblid);
		
		textField_2 = new JTextField();
		textField_2.setBounds(284, 55, 88, 21);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8BC1\u4EF6\u7F16\u7801");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(224, 95, 58, 15);
		add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(285, 92, 148, 21);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_3 = new JLabel("\u6027\u522B");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(33, 129, 58, 15);
		add(label_3);
		
		textField_4 = new JComboBox();
		textField_4.setModel(new DefaultComboBoxModel(new String[] {"\u7537", "\u5973"}));
		textField_4.setToolTipText("");
		textField_4.setBounds(101, 129, 66, 21);
		add(textField_4);
		
		JLabel label_4 = new JLabel("\u6C11\u65CF");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(224, 129, 58, 15);
		add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(284, 126, 66, 21);
		add(textField_5);
		textField_5.setColumns(10);
		
		label_5 = new JLabel("\u51FA\u751F\u65E5\u671F");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(33, 167, 58, 15);
		add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(101, 164, 81, 21);
		add(textField_6);
		textField_6.setColumns(10);
		
		label_6 = new JLabel("*");
		label_6.setForeground(Color.RED);
		label_6.setBounds(177, 58, 58, 15);
		add(label_6);
		
		label_7 = new JLabel("*");
		label_7.setForeground(Color.RED);
		label_7.setBounds(177, 95, 58, 15);
		add(label_7);
		
		label_8 = new JLabel("*");
		label_8.setForeground(Color.RED);
		label_8.setBounds(177, 129, 58, 15);
		add(label_8);
		
		label_9 = new JLabel("*");
		label_9.setForeground(Color.RED);
		label_9.setBounds(192, 167, 58, 15);
		add(label_9);
		
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
		
		label_13 = new JLabel("\u7C4D\u8D2F");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setBounds(224, 167, 58, 15);
		add(label_13);
		
		textField_7 = new JTextField();
		textField_7.setBounds(285, 164, 87, 21);
		add(textField_7);
		textField_7.setColumns(10);
		
		label_15 = new JLabel("\u6587\u5316\u7A0B\u5EA6");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setBounds(224, 205, 58, 15);
		add(label_15);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(285, 202, 66, 21);
		add(textField_9);
		
		label_18 = new JLabel("\u4E2A\u4EBA\u8EAB\u4EFD");
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		label_18.setBounds(40, 279, 58, 15);
		add(label_18);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(101, 276, 66, 21);
		add(textField_12);
		
		label_19 = new JLabel("\u5A5A\u59FB\u72B6\u51B5");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setBounds(223, 276, 58, 15);
		add(label_19);
		
		textField_13 = new JComboBox();
		textField_13.setModel(new DefaultComboBoxModel(new String[] {"\u672A\u77E5", "\u672A\u5A5A", "\u5DF2\u5A5A"}));
		textField_13.setBounds(284, 273, 49, 21);
		add(textField_13);
		
		label_20 = new JLabel("\u884C\u653F\u804C\u52A1");
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setBounds(40, 317, 58, 15);
		add(label_20);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(101, 314, 66, 21);
		add(textField_14);
		
		label_21 = new JLabel("\u5355\u4F4D\u7F16\u7801");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setBounds(223, 314, 58, 15);
		add(label_21);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(284, 311, 111, 21);
		add(textField_15);
		
		label_22 = new JLabel("\u5C45\u6C11\u7C7B\u522B");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setBounds(40, 357, 58, 15);
		add(label_22);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(101, 354, 66, 21);
		add(textField_16);
		
		label_16 = new JLabel("\u53C2\u52A0\u5DE5\u4F5C\u65E5\u671F");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setBounds(17, 391, 81, 15);
		add(label_16);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(101, 388, 66, 21);
		add(textField_10);
		
		label_17 = new JLabel("\u9000\u4F11\u65E5\u671F");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setBounds(193, 391, 89, 15);
		add(label_17);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(284, 388, 66, 21);
		add(textField_11);
		
		label_23 = new JLabel("\u793E\u4FDD\u5361\u53F7");
		label_23.setHorizontalAlignment(SwingConstants.RIGHT);
		label_23.setBounds(40, 248, 58, 15);
		add(label_23);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(101, 245, 149, 21);
		add(textField_17);
		
		label_14 = new JLabel("\u653F\u6CBB\u9762\u8C8C");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setBounds(40, 208, 58, 15);
		add(label_14);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(101, 205, 66, 21);
		add(textField_8);
		
		button = new JButton("\u4FDD\u5B58");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					/**
					 * 获取输入的数据并保存
					 * */
					String info=textField_0.getText()+","+textField_2.getText()+","+textField_1.getSelectedItem()+","+textField_3.getText()+","+textField_4.getSelectedItem()+","+textField_5.getText()+","+textField_6.getText()+","+textField_7.getText()+"-"+textField_8.getText()+"-"+textField_9.getText()+"-"+textField_17.getText()+"-"+textField_12.getText()+"-"+textField_13.getToolkit()+"-"+textField_14.getText()+"-"+textField_15.getText()+"-"+textField_16.getText()+"-"+textField_18.getText()+"-"+textField_10.getText()+"-"+textField_11.getText();
					
					Database.insuredList.add(Database.addInsured(info).toArray());//添加新的项

					Frame.getFrames()[Frame.getFrames().length-1].dispose();//销毁当前窗口
					
					/*写入文件*/
					Database.writeFile("C://Users/管理员/Desktop/MedInsSystem/InsuredInfo.txt",info,true);
					/*刷新表格*/
					Database.refreshTable(Database.insuredList, JFrame.table, JFrame.s0);
					Database.insuredList.clear();

				} catch (Exception e) {
					
					//弹窗提示输入不规范
					JOptionPane.showMessageDialog(null, "输入不规范,请重新输入", "错误", JOptionPane.ERROR_MESSAGE);
				
				}
				
				
				
			}
		});
		button.setBounds(101, 474, 74, 23);
		add(button);
		
		label_24 = new JLabel("\u5065\u5EB7\u72B6\u51B5");
		label_24.setBounds(224, 357, 58, 15);
		add(label_24);
		
		textField_18 = new JTextField();
		textField_18.setBounds(284, 354, 66, 21);
		add(textField_18);
		textField_18.setColumns(10);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.getFrames()[Frame.getFrames().length-1].dispose();//销毁当前窗口
			}
		});
		button_1.setBounds(259, 474, 74, 23);
		add(button_1);

	}
}
