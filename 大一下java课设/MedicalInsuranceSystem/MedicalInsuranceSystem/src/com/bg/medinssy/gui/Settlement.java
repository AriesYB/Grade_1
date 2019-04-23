package com.bg.medinssy.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Color;

public class Settlement extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Settlement() {
		setLayout(null);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(new TitledBorder(null, "\u5904\u65B9\u660E\u7EC6", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"12", "123", "0", null},
				{"213", "123", "000", "0"},
				{"213", "1230", "0", "0"},
				{"12123", "0", "0", "0"},
			},
			new String[] {
				"\u836F\u54C1", "New column", "New column", "New column"
			}
		));
		table.setBounds(86, 362, 325, -189);
		add(table);
		
		JButton btnNewButton = new JButton("\u4E0B\u4E00\u6B65");
		btnNewButton.setFont(new Font("ºÚÌå", Font.PLAIN, 15));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(201, 527, 97, 23);
		add(btnNewButton);

	}
}
