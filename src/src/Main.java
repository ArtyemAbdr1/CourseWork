package src;

//������ ����������� ���������
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Main extends JFrame {
	
	// �������� ������� ����
	public JLabel lb = new JLabel("������������ �������� ��������, ��:  ");
	// �������� ���������� ���� ��� ����� ����
	public JTextField text = new JTextField();

	// �������� ������� �����
	public JLabel lb2 = new JLabel("���������� �������� ����, �:");

	// �������� ���������� ���� ��� ����� �����
	public JTextField text2 = new JTextField();

	// �������� ��������� �������
	public JLabel lboutput = new JLabel();

	// �������� ������
	public JButton button1 = new JButton("����������");
	// �������� ������ ��� ������� �������������� ��� ����
	public JButton button2 = new JButton("��������� �������������� ��� ����");
	
	public Main() {
		// ���������� �������� ������
				super("����������� ��� ������� ���� ��������������");
				setDefaultLookAndFeelDecorated(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				// ������ �� ��������� ������� ����
				setResizable(false);
				// �������� ������
				JPanel mainPanel = new JPanel(null);

				// ���������� ������ �����
				Color myColor = new Color(238,232,170);

				// ��������� ����� ������
				mainPanel.setBackground(myColor);
				
                // �������� ������ � �������� �����������
				lb2.setBounds(10, 70, 300, 30);
				text2.setBounds(250, 70, 200, 30);
				text.setBounds(250,10, 200, 30);
				lb.setBounds(10, 10, 300, 40);
				lboutput.setBounds(200, 115, 200, 30);
				button1.setBounds(10, 120, 100, 20);
				button2.setBounds(10,150, 300, 20);
				
				// ���������� ���������� ��� ������
				button1.addActionListener(new calc());
				button2.addActionListener(new carlink());
					
				// ���������� ��������� �� ������
				mainPanel.add(lb);mainPanel.add(text);
				mainPanel.add(lb2);mainPanel.add(text2);
				mainPanel.add(button1);mainPanel.add(lboutput);
				mainPanel.add(button2);


				setContentPane(mainPanel);
				
				// ��������� ������� ����
				setSize(500, 250);
				setVisible(true);}
	
	//  ����� ����������� ������
	class calc implements ActionListener{	
		public void actionPerformed(ActionEvent e) {
			double value = (Integer.parseInt(text.getText())/Integer.parseInt(text2.getText()));
			lboutput.setText("���� ���� I = "+value+"�");	
		}}
	class carlink implements ActionListener{	
		public void actionPerformed(ActionEvent e) {
			new car();
		}}

	// ������ ��������� � �����������
	public static void main(String[] args) {
		new entering();
	}
}

