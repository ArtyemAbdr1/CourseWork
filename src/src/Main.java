package src;

//импорт необходимых библиотек
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Main extends JFrame {
	
	// Создание надписи Ватт
	public JLabel lb = new JLabel("Максимальная мощность нагрузки, Вт:  ");
	// создание текстового поля для ввода ватт
	public JTextField text = new JTextField();

	// Создание надписи Вольт
	public JLabel lb2 = new JLabel("Напряжение питающей сети, В:");

	// создание текстового поля для ввода вольт
	public JTextField text2 = new JTextField();

	// Создание выводящей надписи
	public JLabel lboutput = new JLabel();

	// Создание кнопки
	public JButton button1 = new JButton("Рассчитать");
	// Создание кнопки для подбора предохранителя для авто
	public JButton button2 = new JButton("Подобрать предохранитель для авто");
	
	public Main() {
		// Добавление названия панели
				super("Калькулятор для расчета тока предохранителя");
				setDefaultLookAndFeelDecorated(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				// Запрет на изменение размера окна
				setResizable(false);
				// Создание панели
				JPanel mainPanel = new JPanel(null);

				// Добавление нового цвета
				Color myColor = new Color(238,232,170);

				// Изменение цвета панели
				mainPanel.setBackground(myColor);
				
                // Создание границ и размеров содержимого
				lb2.setBounds(10, 70, 300, 30);
				text2.setBounds(250, 70, 200, 30);
				text.setBounds(250,10, 200, 30);
				lb.setBounds(10, 10, 300, 40);
				lboutput.setBounds(200, 115, 200, 30);
				button1.setBounds(10, 120, 100, 20);
				button2.setBounds(10,150, 300, 20);
				
				// Добавление слушателей для кнопок
				button1.addActionListener(new calc());
				button2.addActionListener(new carlink());
					
				// Добавление элементов на панель
				mainPanel.add(lb);mainPanel.add(text);
				mainPanel.add(lb2);mainPanel.add(text2);
				mainPanel.add(button1);mainPanel.add(lboutput);
				mainPanel.add(button2);


				setContentPane(mainPanel);
				
				// установка размера окна
				setSize(500, 250);
				setVisible(true);}
	
	//  Класс выполняющий расчет
	class calc implements ActionListener{	
		public void actionPerformed(ActionEvent e) {
			double value = (Integer.parseInt(text.getText())/Integer.parseInt(text2.getText()));
			lboutput.setText("Сила тока I = "+value+"А");	
		}}
	class carlink implements ActionListener{	
		public void actionPerformed(ActionEvent e) {
			new car();
		}}

	// запуск программы с авторизации
	public static void main(String[] args) {
		new entering();
	}
}

