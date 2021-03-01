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

	// Создание надписи Ватт
		public JLabel lb = new JLabel("Мощность электроприбора, ватт (BA): ");
		// создание текстового поля для ввода ватт
		public JTextField text = new JTextField();

		// Создание надписи напряжения
		public JLabel lb2 = new JLabel("Напряжение питающей автомобиля 12В");

		// Создание выводящей надписи
		public JLabel lboutput = new JLabel();
		
		// Создание выводящей надписи цвета предохранителя
				public JLabel lboutcolor = new JLabel();
				
        // Создание поля для картинки
		public JLabel labelimg = new JLabel();
		// Создание кнопки
		public JButton button1 = new JButton("Рассчитать");
		
		public car() {
			// Добавление названия панели
					super("Предохранитель для авто");
					setDefaultLookAndFeelDecorated(true);
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					// Запрет на изменение размера окна
					setResizable(false);
					// Создание панели
					JPanel mainPanel = new JPanel(null);

					// Добавление нового цвета
					Color myColor = new Color(230, 230, 250);

					// Изменение цвета панели
					mainPanel.setBackground(myColor);
					
	                // Создание границ и размеров содержимого
					lb2.setBounds(10, 10, 300, 40);
					text.setBounds(250,70, 200, 20);
					lb.setBounds(10, 65, 300, 30);
					lboutput.setBounds(10, 150, 500, 30);
					lboutcolor.setBounds(10, 180, 500, 20);
					button1.setBounds(10, 120, 100, 20);
                    labelimg.setBounds(300,100,150,150);
					// Добавление слушателей для кнопок
					button1.addActionListener(new carcalc());

						
					// Добавление элементов на панель
					mainPanel.add(lb2);
					mainPanel.add(lb);mainPanel.add(text);
					mainPanel.add(button1);
					mainPanel.add(lboutput);mainPanel.add(lboutcolor);
					mainPanel.add(labelimg);
					setContentPane(mainPanel);
					
					// установка размера окна
					setSize(500, 270);
					setVisible(true);}
		
		//  Класс выполняющий расчет
		public class carcalc implements ActionListener{	
			public void actionPerformed(ActionEvent e) {
				// Проверка условия

				if (Integer.parseInt(text.getText())<=50) {
					orange orange = new orange();
					lboutput.setText("Необходим предохранитель "+orange.znach()+"А");
					lboutcolor.setText(orange.colorname());
					lboutcolor.setForeground((Color) orange.color());
					labelimg.setIcon((Icon) orange.imageicon());
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>50 && Integer.parseInt(text.getText())<=75) {
					brown brown = new brown();
					lboutput.setText("Необходим предохранитель "+brown.znach()+"А");
					lboutcolor.setText(brown.colorname());
					lboutcolor.setForeground((Color) brown.color());
					labelimg.setIcon((Icon) brown.imageicon());
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>75 && Integer.parseInt(text.getText())<=100) {
					red red = new red();
					lboutput.setText("Необходим предохранитель "+red.znach()+"А");
					lboutcolor.setText(red.colorname());
					lboutcolor.setForeground((Color) red.color());
					labelimg.setIcon((Icon) red.imageicon());
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>100 && Integer.parseInt(text.getText())<=150) {
						whiteblue whiteblue = new whiteblue();
						lboutput.setText("Необходим предохранитель "+whiteblue.znach()+"А");
						lboutcolor.setText(whiteblue.colorname());
						lboutcolor.setForeground((Color) whiteblue.color());
						labelimg.setIcon((Icon) whiteblue.imageicon());
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>150 && Integer.parseInt(text.getText())<=200) {
					yellow yellow = new yellow();
					lboutput.setText("Необходим предохранитель "+yellow.znach()+"А");
					lboutcolor.setText(yellow.colorname());
					lboutcolor.setForeground((Color) yellow.color());
					labelimg.setIcon((Icon) yellow.imageicon());
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>200 && Integer.parseInt(text.getText())<=250) {
					blink blink = new blink();
					lboutput.setText("Необходим предохранитель "+blink.znach()+"А");
					lboutcolor.setText(blink.colorname());
					lboutcolor.setForeground((Color) blink.color());
					labelimg.setIcon((Icon) blink.imageicon());
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>250 && Integer.parseInt(text.getText())<=300) {
					green green = new green();
					lboutput.setText("Необходим предохранитель "+green.znach()+"А");
					lboutcolor.setText(green.colorname());
					lboutcolor.setForeground((Color) green.color());
					labelimg.setIcon((Icon) green.imageicon());
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>300 && Integer.parseInt(text.getText())<=400) {
					purple purple = new purple();
					lboutput.setText("Необходим предохранитель "+purple.znach()+"А");
					lboutcolor.setText(purple.colorname());
					lboutcolor.setForeground((Color) purple.color());
					labelimg.setIcon((Icon) purple.imageicon());
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>400 && Integer.parseInt(text.getText())<=600) {
					blue blue = new blue();
					lboutput.setText("Необходим предохранитель "+blue.znach()+"А");
					lboutcolor.setText(blue.colorname());
					lboutcolor.setForeground((Color) blue.color());
					labelimg.setIcon((Icon) blue.imageicon());
				}
				else if (Integer.parseInt(text.getText())>600 && Integer.parseInt(text.getText())<=700) {
					black black = new black();
					lboutput.setText("Необходим предохранитель "+black.znach()+"А");
					lboutcolor.setText(black.colorname());
					lboutcolor.setForeground((Color) black.color());
					labelimg.setIcon((Icon) black.imageicon());
				}
				else {
					lboutput.setText("Такого предохранителя не существует.");
				}
			}}

}
