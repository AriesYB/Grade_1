package com.bg.medinssy.gui;

import java.awt.EventQueue;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.bg.medinssy.data.Database;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane1;
	private JTextField textField1;
	private JPasswordField passwordField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\\u7BA1\u7406\u5458\\Desktop\\icon.png"));
		setTitle("\u767B\u5F55");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 450, 300);
		contentPane1 = new JPanel();
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		JLabel label = new JLabel("\u533B\u7597\u4FDD\u9669\u62A5\u9500\u7CFB\u7EDF");
		label.setFont(new Font("楷体", Font.PLAIN, 14));
		label.setBounds(161, 236, 130, 25);
		contentPane1.add(label);
		
		JLabel label_1 = new JLabel("\u8D26\u53F7");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("等线", Font.PLAIN, 18));
		label_1.setBounds(67, 55, 70, 15);
		contentPane1.add(label_1);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("等线", Font.PLAIN, 18));
		label_2.setBounds(67, 113, 70, 15);
		contentPane1.add(label_2);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("新宋体", Font.PLAIN, 18));
		textField1.setBounds(147, 50, 178, 25);
		contentPane1.add(textField1);
		textField1.setColumns(10);
		
		passwordField1 = new JPasswordField();
		passwordField1.setFont(new Font("新宋体", Font.PLAIN, 18));
		passwordField1.setBounds(147, 108, 178, 25);
		contentPane1.add(passwordField1);
		
		JButton button = new JButton("\u767B\u5F55");
		button.setFont(new Font("黑体", Font.PLAIN, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					try {
						
						/*获取账号密码*/
						String a=textField1.getText();
						String b=new String(passwordField1.getPassword());

						/*与本地账号密码验证*/
						int i;
						boolean flag=false;
						for (i = 0; i < Database.pwd.length; i++) 
						{
							if(a.equals(Database.pwd[i][0]) && b.equals(Database.pwd[i][1]))
							{
								flag=true;
								break;
							}
						}
						if(i==Database.pwd.length&&flag==false)
						{
							//密码错误
							JOptionPane.showMessageDialog(null, "账号或者密码输入错误", "警告", JOptionPane.ERROR_MESSAGE);
						}
						if(flag)
						{
							Frame.getFrames()[0].dispose();//销毁当前窗口
							
							Frame.getFrames()[1].setVisible(true);

						}
					} catch (NullPointerException e) {
						JOptionPane.showMessageDialog(null, "请输入账号或者密码", "错误", JOptionPane.ERROR_MESSAGE);
					}
			}
		});
		button.setBounds(171, 188, 106, 23);
		contentPane1.add(button);
		
		JLabel label_3 = new JLabel("\u5FD8\u8BB0\u5BC6\u7801");

		label_3.setFont(new Font("宋体", Font.PLAIN, 13));
		label_3.setBounds(335, 55, 58, 15);
		contentPane1.add(label_3);
	}
}
