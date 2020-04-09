package pervaya;

import java.awt.EventQueue;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import ne_to.PerezapisNT_p4;
import osobya.Path_T;
import osobya.Path_V;
import podumat.Podumat;
import skasat.Skasat;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.awt.Color;

import javax.swing.DropMode;
import javax.swing.text.MaskFormatter;

public class Qwerty_2_class {

	public static String s = "Перехожу в новую комнату"; //
	private JFrame frame;
	public static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Path_T nachalo = new Path_T();
		try {
			Path_T.path_T();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Qwerty_2_class window = new Qwerty_2_class();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Qwerty_2_class() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);

		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setLineWrap(true);
		textArea.setText(Path_T.TOk);
		// Ниже расположен код с помощью которого стандартное Поле Ввода замещается
		// Полем форматирования с маской, через которую пропускаются только определённые
		// символы.
		// В случае необходимости просто закоменти эти строки и раскоменти строку
		// //textField = new JTextField();
		MaskFormatter formatter = null;
		try {
			formatter = new MaskFormatter(
					"**************************************************************************************************************");
			formatter.setValidCharacters(",йцукенгшщзхъфывапролджэячсмитьбю.ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ. ");
		} catch (java.text.ParseException exc) {
			System.err.println("formatter is bad: " + exc.getMessage());
		}
		JFormattedTextField textField_m = new JFormattedTextField(formatter);
		textField_m.setFocusLostBehavior(JFormattedTextField.COMMIT);

		textField = textField_m;

		// Ниже программа перехватчик с клавиатуры для Поля Ввода, в том виде, что
		// сейчас есть программа позволяет вводить ТОЛЬКО цифры.
		/*
		 * textField.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent e)
		 * { char c = e.getKeyChar(); if ( ((c < '0') || (c > '9')) && (c !=
		 * KeyEvent.VK_Z)) { e.consume(); // ignore event } } });
		 */
		textField.setText(
				"\u041F\u0440\u043E\u0432\u0435\u0440\u044F\u044E \u0440\u0430\u0431\u043E\u0442\u043E\u0441\u043F\u043E\u0441\u043E\u0431\u043D\u043E\u0441\u0442\u044C \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u044B!");
		textField.setToolTipText(
				"\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0441\u044E\u0434\u0430 \u0442\u043E, \u0447\u0442\u043E \u0434\u043E\u043B\u0436\u0435\u043D \u0441\u0434\u0435\u043B\u0430\u0442\u044C \u0438\u043B\u0438 \u0441\u043A\u0430\u0437\u0430\u0442\u044C \u0412\u0430\u0448 \u043F\u0435\u0440\u0441\u043E\u043D\u0430\u0436.");
		textField.setColumns(10);

		JButton button = new JButton("\u041F\u043E\u0434\u0443\u043C\u0430\u0442\u044C");
		button.addActionListener(new ActionListener() { // КНОПКА "ПОДУМАТЬ"
			public void actionPerformed(ActionEvent arg0) {
				// В принципе работает, но не заполоню ли я память кучей объектов этого
				// класса???
				Podumat pd = new Podumat();
				pd.podumat();
				textArea_1.setText(Path_V.TOv);

			}
		});

		JButton button_1 = new JButton("\u0421\u0434\u0435\u043B\u0430\u0442\u044C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // КНОПКА "СКАЗАТЬ"
				// Skasat sk = new Skasat ();
				Skasat.skasat();
				System.out.println(Qwerty_2_class.s);
				textArea.setText(Path_T.TOk);
				textArea_1.setText("");
			}
		});

		JButton button_2 = new JButton("\u042D\u0442\u043E \u043D\u0435 \u0442\u043E!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PerezapisNT_p4.perezapis_N();
				textArea_1.setText("");
			}
		});

		JButton button_3 = new JButton("\u041F\u043E\u043C\u043E\u0449\u044C");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap(81, Short.MAX_VALUE)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(button_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false).addComponent(textField)
						.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE))
				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(button_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(19))
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(18)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(19)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(button))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(button_1)
								.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_2))
						.addContainerGap(108, Short.MAX_VALUE)));
		frame.getContentPane().setLayout(groupLayout);
	}
	
}
