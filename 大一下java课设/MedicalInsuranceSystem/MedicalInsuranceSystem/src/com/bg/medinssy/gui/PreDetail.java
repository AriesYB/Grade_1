package com.bg.medinssy.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.bg.medinssy.data.Database;

import javafx.scene.input.MouseEvent;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JButton;

public class PreDetail extends JPanel {
	private JTable table0;
	private JTextField textField0;
	private JTextField textField1;

	/**
	 * Create the panel.
	 */
	public PreDetail() {
		setLayout(null);
		
		JLabel label = new JLabel("\u59D3\u540D");
		label.setFont(new Font("楷体", Font.PLAIN, 18));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(10, 52, 58, 15);
		add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 600, 350);
		add(scrollPane);
		
		table0.setFont(new Font("等线", Font.PLAIN, 15));
		scrollPane.setViewportView(table0);
		String[] s=new String[] {"\u836F\u54C1\u7F16\u7801", "\u836F\u54C1", "\u5355\u4EF7", "\u5242\u91CF", "\u91D1\u989D", "\u81EA\u4ED8\u6BD4\u4F8B"};
		DefaultTableModel tableModel = new DefaultTableModel();
		table0 = new JTable(tableModel){
            public boolean isCellEditable(int row, int column)
            {
                       return false;}//表格不允许被编辑
            };

		Database.refreshTable(Database.detailArray.get(0), table0, s);//载入数据
		
		JLabel label_2 = new JLabel("\u4F4F\u9662\u53F7");
		label_2.setFont(new Font("楷体", Font.PLAIN, 18));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(182, 52, 58, 15);
		add(label_2);
		
		textField0 = new JTextField();
		textField0.setHorizontalAlignment(SwingConstants.CENTER);
		textField0.setBackground(Color.WHITE);
		textField0.setFont(new Font("等线", Font.PLAIN, 18));
		textField0.setEditable(false);
		textField0.setBounds(77, 50, 66, 21);
		add(textField0);
		textField0.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setBackground(Color.WHITE);
		textField1.setEditable(false);
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setFont(new Font("等线", Font.PLAIN, 18));
		textField1.setBounds(254, 50, 80, 21);
		add(textField1);
		textField1.setColumns(10);
		
		JLabel label_1 = new JLabel("\u9875");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("等线", Font.PLAIN, 18));
		label_1.setBounds(552, 52, 28, 17);
		add(label_1);
		
		JLabel label_3 = new JLabel("1/3");
		label_3.setEnabled(false);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("等线", Font.PLAIN, 18));
		label_3.setBounds(508, 53, 52, 17);
		add(label_3);
		
		Button button = new Button("\u4E0A\u4E00\u9875");
		button.setBounds(422, 50, 73, 22);
		add(button);
		
		Button button_1 = new Button("\u4E0B\u4E00\u9875");
		button_1.setBounds(586, 52, 73, 22);
		add(button_1);
		
		JButton btnNewButton = new JButton("\u4E0B\u4E00\u6B65");
		btnNewButton.setBounds(306, 450, 97, 23);
		add(btnNewButton);
	}
}
