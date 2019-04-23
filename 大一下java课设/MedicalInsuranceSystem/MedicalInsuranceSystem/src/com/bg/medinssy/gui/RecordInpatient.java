package com.bg.medinssy.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.bg.medinssy.data.Database;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
 class RecordInpatient extends JPanel {

	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JButton button;
	private JButton button_1;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel label_14;
	private JTextField textField_9;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JTextField textField_10;
	private JLabel label_18;
	private JTextField textField_11;
	private JLabel label_19;

	/**
	 * Create the panel.
	 */
	public RecordInpatient() {
		setLayout(null);
		
		JLabel label = new JLabel("\u59D3\u540D");
		label.setFont(new Font("宋体", Font.PLAIN, 13));
		label.setBounds(33, 55, 58, 21);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 13));
		textField.setBounds(101, 55, 66, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblid = new JLabel("\u4EBA\u5458ID");
		lblid.setFont(new Font("宋体", Font.PLAIN, 13));
		lblid.setBounds(224, 58, 58, 15);
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblid);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_2.setBounds(292, 54, 88, 21);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("\u533B\u7597\u673A\u6784\u7C7B\u522B");
		label_2.setFont(new Font("宋体", Font.PLAIN, 13));
		label_2.setBounds(188, 95, 94, 15);
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_3.setBounds(292, 91, 75, 21);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("\u533B\u9662\u540D\u79F0");
		label_4.setFont(new Font("宋体", Font.PLAIN, 13));
		label_4.setBounds(224, 129, 58, 15);
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
		label_8.setBounds(177, 129, 58, 15);
		label_8.setForeground(Color.RED);
		add(label_8);
		
		label_10 = new JLabel("*");
		label_10.setBounds(394, 126, 30, 15);
		label_10.setForeground(Color.RED);
		add(label_10);
		
		label_11 = new JLabel("*");
		label_11.setBounds(377, 95, 35, 15);
		label_11.setForeground(Color.RED);
		add(label_11);
		
		label_12 = new JLabel("*");
		label_12.setBounds(394, 58, 30, 15);
		label_12.setForeground(Color.RED);
		add(label_12);
		
		button = new JButton("\u4FDD\u5B58");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					
					/**
					 * 获取输入的数据并保存
					 * */
					String info=textField.getText()+","+textField_2.getText()+","+textField_1.getText()+","+textField_3.getText()+","+textField_7.getText()+","+textField_8.getText()+","+textField_4.getText()+","+textField_9.getText()+","+textField_5.getText()+","+textField_10.getText()+","+textField_6.getText()+"-"+textField_11.getText();
					
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
		button.setBounds(101, 308, 74, 23);
		add(button);
		
		button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame.getFrames()[Frame.getFrames().length-1].dispose();//销毁当前窗口
			}
		});
		button_1.setBounds(250, 308, 81, 23);
		add(button_1);
		
		JLabel label_1 = new JLabel("\u533B\u7597\u673A\u6784\u7F16\u53F7");
		label_1.setFont(new Font("宋体", Font.PLAIN, 13));
		label_1.setBounds(10, 129, 81, 15);
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_1.setBounds(101, 89, 66, 21);
		textField_1.setColumns(10);
		add(textField_1);
		
		JLabel label_3 = new JLabel("\u4F4F\u9662\u53F7");
		label_3.setFont(new Font("宋体", Font.PLAIN, 13));
		label_3.setBounds(33, 92, 58, 15);
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		add(label_3);
		
		JLabel label_5 = new JLabel("\u5165\u9662\u65E5\u671F");
		label_5.setFont(new Font("宋体", Font.PLAIN, 13));
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(33, 163, 58, 15);
		add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_4.setBounds(101, 160, 66, 21);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_9 = new JLabel("\u51FA\u9662\u65E5\u671F");
		label_9.setFont(new Font("宋体", Font.PLAIN, 13));
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setBounds(208, 163, 74, 15);
		add(label_9);
		
		JLabel lblNewLabel = new JLabel("\u533B\u9662\u7B49\u7EA7");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(33, 197, 58, 15);
		add(lblNewLabel);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_5.setBounds(101, 194, 66, 21);
		add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_13 = new JLabel("\u75BE\u75C5\u540D\u79F0");
		label_13.setFont(new Font("宋体", Font.PLAIN, 13));
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setBounds(33, 228, 58, 15);
		add(label_13);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_6.setBounds(101, 225, 66, 21);
		add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_7.setColumns(10);
		textField_7.setBounds(101, 126, 66, 21);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_8.setColumns(10);
		textField_8.setBounds(292, 122, 88, 21);
		add(textField_8);
		
		label_14 = new JLabel("*");
		label_14.setForeground(Color.RED);
		label_14.setBounds(177, 163, 58, 15);
		add(label_14);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_9.setColumns(10);
		textField_9.setBounds(292, 159, 66, 21);
		add(textField_9);
		
		label_15 = new JLabel("*");
		label_15.setForeground(Color.RED);
		label_15.setBounds(370, 163, 58, 15);
		add(label_15);
		
		label_16 = new JLabel("*");
		label_16.setForeground(Color.RED);
		label_16.setBounds(177, 197, 58, 15);
		add(label_16);
		
		label_17 = new JLabel("\u51FA\u9662\u539F\u56E0");
		label_17.setFont(new Font("宋体", Font.PLAIN, 13));
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setBounds(208, 194, 74, 15);
		add(label_17);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_10.setColumns(10);
		textField_10.setBounds(292, 193, 120, 21);
		add(textField_10);
		
		label_18 = new JLabel("*");
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		label_18.setForeground(Color.RED);
		label_18.setBounds(370, 197, 58, 15);
		add(label_18);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("宋体", Font.PLAIN, 13));
		textField_11.setColumns(10);
		textField_11.setBounds(292, 224, 66, 21);
		add(textField_11);
		
		label_19 = new JLabel("\u75BE\u75C5\u7F16\u7801");
		label_19.setFont(new Font("宋体", Font.PLAIN, 13));
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setBounds(224, 228, 58, 15);
		add(label_19);

	}
}

