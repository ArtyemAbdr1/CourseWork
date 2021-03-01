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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import abstractclasses.black;
import abstractclasses.blink;
import abstractclasses.blue;
import abstractclasses.brown;
import abstractclasses.green;
import abstractclasses.orange;
import abstractclasses.purple;
import abstractclasses.red;
import abstractclasses.whiteblue;
import abstractclasses.yellow;



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
		public class carcalc implements ActionListener{	
			public void actionPerformed(ActionEvent e) {
				// �������� �������

				if (Integer.parseInt(text.getText())<=50) {
					orange orange = new orange();
					lboutput.setText("��������� �������������� "+orange.znach()+"�");
					lboutcolor.setText(orange.colorname());
					lboutcolor.setForeground((Color) orange.color());
					labelimg.setIcon((Icon) orange.imageicon());
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>50 && Integer.parseInt(text.getText())<=75) {
					brown brown = new brown();
					lboutput.setText("��������� �������������� "+brown.znach()+"�");
					lboutcolor.setText(brown.colorname());
					lboutcolor.setForeground((Color) brown.color());
					labelimg.setIcon((Icon) brown.imageicon());
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>75 && Integer.parseInt(text.getText())<=100) {
					red red = new red();
					lboutput.setText("��������� �������������� "+red.znach()+"�");
					lboutcolor.setText(red.colorname());
					lboutcolor.setForeground((Color) red.color());
					labelimg.setIcon((Icon) red.imageicon());
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>100 && Integer.parseInt(text.getText())<=150) {
						whiteblue whiteblue = new whiteblue();
						lboutput.setText("��������� �������������� "+whiteblue.znach()+"�");
						lboutcolor.setText(whiteblue.colorname());
						lboutcolor.setForeground((Color) whiteblue.color());
						labelimg.setIcon((Icon) whiteblue.imageicon());
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>150 && Integer.parseInt(text.getText())<=200) {
					yellow yellow = new yellow();
					lboutput.setText("��������� �������������� "+yellow.znach()+"�");
					lboutcolor.setText(yellow.colorname());
					lboutcolor.setForeground((Color) yellow.color());
					labelimg.setIcon((Icon) yellow.imageicon());
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>200 && Integer.parseInt(text.getText())<=250) {
					blink blink = new blink();
					lboutput.setText("��������� �������������� "+blink.znach()+"�");
					lboutcolor.setText(blink.colorname());
					lboutcolor.setForeground((Color) blink.color());
					labelimg.setIcon((Icon) blink.imageicon());
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>250 && Integer.parseInt(text.getText())<=300) {
					green green = new green();
					lboutput.setText("��������� �������������� "+green.znach()+"�");
					lboutcolor.setText(green.colorname());
					lboutcolor.setForeground((Color) green.color());
					labelimg.setIcon((Icon) green.imageicon());
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>300 && Integer.parseInt(text.getText())<=400) {
					purple purple = new purple();
					lboutput.setText("��������� �������������� "+purple.znach()+"�");
					lboutcolor.setText(purple.colorname());
					lboutcolor.setForeground((Color) purple.color());
					labelimg.setIcon((Icon) purple.imageicon());
				}
				// �������� �������
				else if (Integer.parseInt(text.getText())>400 && Integer.parseInt(text.getText())<=600) {
					blue blue = new blue();
					lboutput.setText("��������� �������������� "+blue.znach()+"�");
					lboutcolor.setText(blue.colorname());
					lboutcolor.setForeground((Color) blue.color());
					labelimg.setIcon((Icon) blue.imageicon());
				}
				else if (Integer.parseInt(text.getText())>600 && Integer.parseInt(text.getText())<=700) {
					black black = new black();
					lboutput.setText("��������� �������������� "+black.znach()+"�");
					lboutcolor.setText(black.colorname());
					lboutcolor.setForeground((Color) black.color());
					labelimg.setIcon((Icon) black.imageicon());
				}
				else {
					lboutput.setText("������ �������������� �� ����������.");
				}
			}}

}
