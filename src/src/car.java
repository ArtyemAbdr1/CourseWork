package src;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class car extends JFrame {

	// �������� ������� ����
		public JLabel lb = new JLabel("�������� ��������������, ���� (BA): ");
		// �������� ���������� ���� ��� ����� ����
		public JTextField text = new JTextField();

		// �������� ������� ����������
		public JLabel lb2 = new JLabel("���������� �������� ���������� 12�");

		// �������� ��������� �������
		public JLabel lboutput = new JLabel();
		
		// �������� ��������� ������� ����� ��������������
				public JLabel lboutcolor = new JLabel();
				
        // �������� ���� ��� ��������
		public JLabel labelimg = new JLabel();
		// �������� ������
		public JButton button1 = new JButton("����������");
		
		public car() {
			// ���������� �������� ������
					super("�������������� ��� ����");
					setDefaultLookAndFeelDecorated(true);
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					// ������ �� ��������� ������� ����
					setResizable(false);
					// �������� ������
					JPanel mainPanel = new JPanel(null);

					// ���������� ������ �����
					Color myColor = new Color(230, 230, 250);

					// ��������� ����� ������
					mainPanel.setBackground(myColor);
					
	                // �������� ������ � �������� �����������
					lb2.setBounds(10, 10, 300, 40);
					text.setBounds(250,70, 200, 20);
					lb.setBounds(10, 65, 300, 30);
					lboutput.setBounds(10, 150, 500, 30);
					lboutcolor.setBounds(10, 180, 500, 20);
					button1.setBounds(10, 120, 100, 20);
                    labelimg.setBounds(300,100,150,150);
					// ���������� ���������� ��� ������
					button1.addActionListener(new carcalc());

						
					// ���������� ��������� �� ������
					mainPanel.add(lb2);
					mainPanel.add(lb);mainPanel.add(text);
					mainPanel.add(button1);
					mainPanel.add(lboutput);mainPanel.add(lboutcolor);
					mainPanel.add(labelimg);
					setContentPane(mainPanel);
					
					// ��������� ������� ����
					setSize(500, 270);
					setVisible(true);}
		
		//  ����� ����������� ������
		class carcalc implements ActionListener{	
			public void actionPerformed(ActionEvent e) {
				// �������� �������
				if (Integer.parseInt(text.getText())<=50) {
					double value = 5;
					String color = "���������";
					lboutput.setText("��������� �������������� "+value+"�");
					// ������� ����� ��������������
					lboutcolor.setForeground(new java.awt.Color(255, 165, 0));
					lboutcolor.setText(color);
					// ���������� �������������� ������
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/orange.jpg"));
					labelimg.setIcon(icon1);
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>50 && Integer.parseInt(text.getText())<=75) {
					double value = 7.5;
					String color = "����������";
					lboutput.setText("��������� �������������� "+value+"�");
					// ������� ����� ��������������
					lboutcolor.setForeground(new java.awt.Color(139, 69, 19));
					lboutcolor.setText(color);
					// ���������� �������������� ������
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/brown.jpg"));
					labelimg.setIcon(icon1);
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>75 && Integer.parseInt(text.getText())<=100) {
					double value = 10;
					String color = "�������";
					lboutput.setText("��������� �������������� "+value+"�");
					// ������� ����� ��������������
					lboutcolor.setForeground(new java.awt.Color(255, 0, 0));
					lboutcolor.setText(color);
					// ���������� �������������� ������
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/red.jpg"));
					labelimg.setIcon(icon1);
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>100 && Integer.parseInt(text.getText())<=150) {
					double value = 15;
					String color = "�������";
					lboutput.setText("��������� �������������� "+value+"�");
					// ������� ����� ��������������
					lboutcolor.setForeground(new java.awt.Color(30, 144, 255));
					lboutcolor.setText(color);
					// ���������� �������������� ������
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/whiteblue.jpg"));
					labelimg.setIcon(icon1);
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>150 && Integer.parseInt(text.getText())<=200) {
					double value = 20;
					String color = "������";
					lboutput.setText("��������� �������������� "+value+"�");
					// ������� ����� ��������������
					lboutcolor.setForeground(new java.awt.Color(255, 255, 0));
					lboutcolor.setText(color);
					// ���������� �������������� ������
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/yellow.jpg"));
					labelimg.setIcon(icon1);
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>200 && Integer.parseInt(text.getText())<=250) {
					double value = 25;
					String color = "����������";
					lboutput.setText("��������� �������������� "+value+"�");
					// ������� ����� ��������������
					lboutcolor.setForeground(new java.awt.Color(176, 196, 222));
					lboutcolor.setText(color);
					// ���������� �������������� ������
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/blink.jpg"));
					labelimg.setIcon(icon1);
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>250 && Integer.parseInt(text.getText())<=300) {
					double value = 30;
					String color = "�������";
					lboutput.setText("��������� �������������� "+value+"�");
					// ������� ����� ��������������
					lboutcolor.setForeground(new java.awt.Color(0, 128, 0));
					lboutcolor.setText(color);
					// ���������� �������������� ������
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/green.jpg"));
					labelimg.setIcon(icon1);
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>300 && Integer.parseInt(text.getText())<=400) {
					double value = 40;
					String color = "����������";
					lboutput.setText("��������� �������������� "+value+"�");
					// ������� ����� ��������������
					lboutcolor.setForeground(new java.awt.Color(128, 0, 128));
					lboutcolor.setText(color);
					// ���������� �������������� ������
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/purple.jpg"));
					labelimg.setIcon(icon1);
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>400 && Integer.parseInt(text.getText())<=600) {
					double value = 60;
					String color = "�����";
					lboutput.setText("��������� �������������� "+value+"�");
					// ������� ����� ��������������
					lboutcolor.setForeground(new java.awt.Color(0, 0, 255));
					lboutcolor.setText(color);
					// ���������� �������������� ������
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/blue.jpg"));
					labelimg.setIcon(icon1);
				}
				else if (Integer.parseInt(text.getText())>600 && Integer.parseInt(text.getText())<=700) {
					double value = 70;
					String color = "������";
					lboutput.setText("��������� �������������� "+value+"�");
					// ������� ����� ��������������
					lboutcolor.setForeground(new java.awt.Color(0, 0, 0));
					lboutcolor.setText(color);
					// ���������� �������������� ������
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/black.jpg"));
					labelimg.setIcon(icon1);
				}
			}}

}
