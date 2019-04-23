package com.bg.medinssy.gui;

import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class demo extends JPanel {

	/**
	 * Create the panel.
	 */
	public demo() {

		JPanel panel_00 = new JPanel();
		panel_00.setBounds(0, 36, 131, 512);
		panel_00.setBackground(SystemColor.text);

		panel_00.setLayout(null);

		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(UIManager.getColor("Button.background"));
		panel_11.setBounds(0, 0, 130, 44);
		panel_00.add(panel_11);
		panel_11.setLayout(null);
		
		JButton btnNewButton = new JButton("\u516C\u5171\u4E1A\u52A1");
		btnNewButton.setBounds(0, 0, 130, 44);
		panel_11.add(btnNewButton);
		btnNewButton.setBackground(UIManager.getColor("Button.background"));

		
		Panel panel_12 = new Panel();
		panel_12.setBounds(0, 44, 130, 44);
		panel_00.add(panel_12);
		panel_12.setLayout(null);
		
		JButton button = new JButton("\u4E2A\u4EBA\u57FA\u672C\u4FE1\u606F\u7EF4\u62A4");
		button.setBounds(0, 0, 129, 22);
		panel_12.add(button);
		
		JButton button_1 = new JButton("\u5355\u4F4D\u57FA\u672C\u4FE1\u606F\u7EF4\u62A4");
		button_1.setBounds(0, 22, 129, 22);
		panel_12.add(button_1);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(0, 88, 130, 44);
		panel_00.add(panel_13);
		panel_13.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("\u533B\u7597\u4FE1\u606F\u7EF4\u62A4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(0, 0, 130, 44);
		panel_13.add(btnNewButton_2);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(0, 132, 129, 110);
		panel_00.add(panel_14);
		panel_14.setLayout(null);
		
		JButton button_141 = new JButton("\u836F\u54C1\u4FE1\u606F\u7EF4\u62A4");
		button_141.setBounds(0, 0, 129, 22);
		panel_14.add(button_141);
		
		JButton button_142 = new JButton("\u8BCA\u7597\u9879\u76EE\u4FE1\u606F\u7EF4\u62A4");
		button_142.setBounds(0, 22, 129, 22);
		panel_14.add(button_142);
		
		JButton button_143 = new JButton("\u670D\u52A1\u8BBE\u65BD\u9879\u76EE\u7EF4\u62A4");
		button_143.setBounds(0, 44, 129, 22);
		panel_14.add(button_143);
		
		JButton button_144 = new JButton("\u5B9A\u70B9\u533B\u7597\u673A\u6784\u4FE1\u606F");
		button_144.setBounds(0, 66, 129, 22);
		panel_14.add(button_144);
		
		JButton button_145 = new JButton("\u533B\u7597\u5F85\u9047\u8BA1\u7B97\u53C2\u6570");
		button_145.setBounds(0, 88, 129, 22);
		panel_14.add(button_145);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(0, 242, 130, 44);
		panel_00.add(panel_15);
		panel_15.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u533B\u7597\u5F85\u9047\u5BA1\u6279");
		btnNewButton_1.setBounds(0, 0, 130, 44);
		panel_15.add(btnNewButton_1);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(0, 286, 130, 44);
		panel_00.add(panel_16);
		panel_16.setLayout(null);
		
		JButton button_2 = new JButton("\u4EBA\u5458\u5C31\u8BCA\u673A\u6784\u5BA1\u6279");
		button_2.setBounds(0, 0, 129, 22);
		panel_16.add(button_2);
		
		JButton button_3 = new JButton("\u7279\u68C0\u7279\u6CBB\u5BA1\u6279");
		button_3.setBounds(0, 22, 129, 22);
		panel_16.add(button_3);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(0, 330, 130, 44);
		panel_00.add(panel_17);
		panel_17.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("\u533B\u4FDD\u62A5\u9500");
		btnNewButton_3.setBounds(0, 0, 130, 44);
		panel_17.add(btnNewButton_3);
	}

}
