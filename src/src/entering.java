package src;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class entering extends JFrame {
	public entering() {
		// Добавление названия панели
		setTitle("Вход");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Запрет на изменение размера окна
		setResizable(false);
		setBounds(400, 220, 100, 40);
		// Создание панели
		JPanel autoPanel = new JPanel(null);

		//Добавление строки "Логин"
		JLabel log = new JLabel("Логин");
		log.setBounds(25, 10, 50, 20);

		//Добавление строки "Пароль"
		JLabel pas = new JLabel("Пароль");
		pas.setBounds(25, 50, 50, 20);

		//Добавление поля для ввода логина
				JTextField login = new JTextField();
				login.setBounds(100, 5, 200, 30);

		//Добавление поля для ввода пароля
				JPasswordField pass = new JPasswordField();
				pass.setBounds(100, 45, 200, 30);

		//Добавление кнопки запуска программы
				JButton start = new JButton("Войти");
				start.setBounds(150, 90, 100, 40);

		//Добавление слушателя для кнопки, реализующего процесс авторизации и запуск программы
				start.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int count1 = 0;
						String password = new String(pass.getPassword());
						try {
		//Добавление файла из которого считываются логины
							BufferedReader reader = new BufferedReader(new InputStreamReader(
								    entering.class.getResourceAsStream("login.txt")));
		// считаем сначала первую строку
							String line = reader.readLine();
							int id = 0;
							String l = "";
							for (int i = 0; i < 10; i++) {
								if (line.startsWith("Login:")) {
									String[] logi = line.split(":");
									l = logi[1];
								} 
									
								// Поиск введенного логина среди существующих
								if (l.equalsIgnoreCase(login.getText())) {
									id = i;
									break;
								}
								else {
									line = reader.readLine();
								}
							}
							reader.close();

							//Добавление файла из которого считываются логины
							BufferedReader reader1 = new BufferedReader(new InputStreamReader(
								    entering.class.getResourceAsStream("login.txt")));
		// считаем сначала первую строку
							String line1 = reader1.readLine();

							String p = "";
							int svyaz = 0;
							for (int j = 0; j < 10; j++) {
								if (line1.startsWith("Password:")) {
									String[] parol = line1.split(":");
									p = parol[1];
									svyaz = j;
								}
								if ((p.equalsIgnoreCase(password)) && (svyaz == (id + 1))) {
									count1 = 1;
								} else {
		// считываем остальные строки в цикле
									line1 = reader1.readLine();
								}
		// Поиск введенного логина среди существующих

							}

							if (count1 == 1) {
								new Main();
								dispose();
							} else {
								JOptionPane.showMessageDialog(null, "Введены неверные данные");

							}
						} catch (FileNotFoundException e1) {
							e1.printStackTrace();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				});
		//Добавление элементов на панель
				autoPanel.add(pas);
				autoPanel.add(log);
				autoPanel.add(login);
				autoPanel.add(pass);
				autoPanel.add(start);
				setContentPane(autoPanel);
				setDefaultLookAndFeelDecorated(true);
		//Установка размера окна
				setSize(400, 200);
				setVisible(true);
			}
		}