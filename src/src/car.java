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
		class carcalc implements ActionListener{	
			public void actionPerformed(ActionEvent e) {
				// Проверка условия
				if (Integer.parseInt(text.getText())<=50) {
					double value = 5;
					String color = "оранжевый";
					lboutput.setText("Необходим предохранитель "+value+"А");
					// Задание цвета предохранителя
					lboutcolor.setForeground(new java.awt.Color(255, 165, 0));
					lboutcolor.setText(color);
					// Добавление соответсвующей иконки
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/orange.jpg"));
					labelimg.setIcon(icon1);
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>50 && Integer.parseInt(text.getText())<=75) {
					double value = 7.5;
					String color = "коричневый";
					lboutput.setText("Необходим предохранитель "+value+"А");
					// Задание цвета предохранителя
					lboutcolor.setForeground(new java.awt.Color(139, 69, 19));
					lboutcolor.setText(color);
					// Добавление соответсвующей иконки
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/brown.jpg"));
					labelimg.setIcon(icon1);
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>75 && Integer.parseInt(text.getText())<=100) {
					double value = 10;
					String color = "красный";
					lboutput.setText("Необходим предохранитель "+value+"А");
					// Задание цвета предохранителя
					lboutcolor.setForeground(new java.awt.Color(255, 0, 0));
					lboutcolor.setText(color);
					// Добавление соответсвующей иконки
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/red.jpg"));
					labelimg.setIcon(icon1);
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>100 && Integer.parseInt(text.getText())<=150) {
					double value = 15;
					String color = "голубой";
					lboutput.setText("Необходим предохранитель "+value+"А");
					// Задание цвета предохранителя
					lboutcolor.setForeground(new java.awt.Color(30, 144, 255));
					lboutcolor.setText(color);
					// Добавление соответсвущюей иконки
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/whiteblue.jpg"));
					labelimg.setIcon(icon1);
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>150 && Integer.parseInt(text.getText())<=200) {
					double value = 20;
					String color = "желтый";
					lboutput.setText("Необходим предохранитель "+value+"А");
					// Задание цвета предохранителя
					lboutcolor.setForeground(new java.awt.Color(255, 255, 0));
					lboutcolor.setText(color);
					// Добавление соответсвующей иконки
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/yellow.jpg"));
					labelimg.setIcon(icon1);
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>200 && Integer.parseInt(text.getText())<=250) {
					double value = 25;
					String color = "прозрачный";
					lboutput.setText("Необходим предохранитель "+value+"А");
					// Задание цвета предохранителя
					lboutcolor.setForeground(new java.awt.Color(176, 196, 222));
					lboutcolor.setText(color);
					// Добавление соответсвующей иконки
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/blink.jpg"));
					labelimg.setIcon(icon1);
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>250 && Integer.parseInt(text.getText())<=300) {
					double value = 30;
					String color = "Зеленый";
					lboutput.setText("Необходим предохранитель "+value+"А");
					// Задание цвета предохранителя
					lboutcolor.setForeground(new java.awt.Color(0, 128, 0));
					lboutcolor.setText(color);
					// Добавление соответсвующей иконки
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/green.jpg"));
					labelimg.setIcon(icon1);
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>300 && Integer.parseInt(text.getText())<=400) {
					double value = 40;
					String color = "Фиолетовый";
					lboutput.setText("Необходим предохранитель "+value+"А");
					// Задание цвета предохранителя
					lboutcolor.setForeground(new java.awt.Color(128, 0, 128));
					lboutcolor.setText(color);
					// Добавление соответсвующей иконки
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/purple.jpg"));
					labelimg.setIcon(icon1);
				}
				// Проверка условия
				else if (Integer.parseInt(text.getText())>400 && Integer.parseInt(text.getText())<=600) {
					double value = 60;
					String color = "Синий";
					lboutput.setText("Необходим предохранитель "+value+"А");
					// Задание цвета предохранителя
					lboutcolor.setForeground(new java.awt.Color(0, 0, 255));
					lboutcolor.setText(color);
					// Добавление соответсвующей иконки
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/blue.jpg"));
					labelimg.setIcon(icon1);
				}
				else if (Integer.parseInt(text.getText())>600 && Integer.parseInt(text.getText())<=700) {
					double value = 70;
					String color = "Черный";
					lboutput.setText("Необходим предохранитель "+value+"А");
					// Задание цвета предохранителя
					lboutcolor.setForeground(new java.awt.Color(0, 0, 0));
					lboutcolor.setText(color);
					// Добавление соответсвующей иконки
					ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/black.jpg"));
					labelimg.setIcon(icon1);
				}
			}}

}
