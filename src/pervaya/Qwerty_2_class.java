package pervaya;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.MaskFormatter;

import ne_to.PerezapisNT_p4;
import osobya.Path_V;
import osobya.Rooms;
import osobya.RoomsReader;
import podumat.Podumat;
import skasat.Skasat;

public class Qwerty_2_class {

    private final Rooms rooms;
    private int roomNumber = 0;

    // @todo избавиться от глобальной переменной
    public static JTextField textField;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        // Сначала создаём объект, наполняем его данными,
        // и только потом заставляем его что-то делать, например рисовать окошко.
        Rooms rooms = new RoomsReader("/fails/Komnaty").readRooms();
        Qwerty_2_class window = new Qwerty_2_class(rooms);
        // Смотрим на пример из
        // https://docs.oracle.com/javase/tutorial/uiswing/start/compile.html
        // т.е. вот сюда:
        // https://docs.oracle.com/javase/tutorial/uiswing/examples/start/HelloWorldSwingProject/src/start/HelloWorldSwing.java
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                window.createAndShow();
            }
        });
    }

    /**
     * Create the application.
     */
    public Qwerty_2_class(Rooms rooms) {
        this.rooms = rooms;
    }

    public void createAndShow() {
        JFrame frame = initialize();
        frame.setVisible(true);
    }

    /**
     * Initialize the contents of the frame.
     */
    private JFrame initialize() {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 1100, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setLineWrap(true);

        JTextArea textArea = new JTextArea();
        textArea.setWrapStyleWord(true);
        textArea.setForeground(new Color(0, 0, 0));
        textArea.setLineWrap(true);
        textArea.setText(rooms.getRoom(this.roomNumber));
        // Ниже расположен код с помощью которого стандартное Поле Ввода замещается
        // Полем форматирования с маской, через которую пропускаются только определённые
        // символы.
        // В случае необходимости просто закоменти эти строки и раскоменти строку
        // //textField = new JTextField();
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter("*******************************************************"
                    + "*******************************************************");
            formatter.setValidCharacters(
                    ",йцукенгшщзхъфывапролджэячсмитьбю.ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ. ");
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
        textField.setText("Проверяю работоспособность программы!");
        textField.setToolTipText("Введите сюда то, что должен сделать или сказать Ваш персонаж.");
        textField.setColumns(10);

        JButton button = new JButton("Подумать");
        button.addActionListener(new ActionListener() { // КНОПКА "ПОДУМАТЬ"
            public void actionPerformed(ActionEvent arg0) {
                // В принципе работает, но не заполоню ли я память кучей объектов этого
                // класса???
                Podumat pd = new Podumat();
                pd.podumat(roomNumber);
                textArea_1.setText(Path_V.TOv);

            }
        });

        JButton button_1 = new JButton("Сделать");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // КНОПКА "СКАЗАТЬ"
                roomNumber = Skasat.skasat(rooms);
                System.out.println("Перехожу в новую комнату");
                // @todo теперь я понял, зачем тут использовалась глобальная переменная,
                // а в Perehod лишний раз звался Path_T.path_T().
                // Здесь надо получить из skasat() новый номер комнаты и достать его
                textArea.setText(rooms.getRoom(roomNumber));
                textArea_1.setText("");
            }
        });

        JButton button_2 = new JButton("Это не то!");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                PerezapisNT_p4.perezapis_N();
                textArea_1.setText("");
            }
        });

        JButton button_3 = new JButton("Помощь");
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup().addContainerGap(81, Short.MAX_VALUE)
                        .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                                .addComponent(button_3, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_2, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                                .addComponent(textField).addComponent(textArea_1,
                                        GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE))
                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                        .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                                .addComponent(button_1, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19))
                .addGroup(groupLayout.createSequentialGroup().addContainerGap()
                        .addComponent(textArea, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup().addGap(19)
                        .addComponent(textArea, GroupLayout.PREFERRED_SIZE, 220,
                                GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(textField, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button_3, GroupLayout.PREFERRED_SIZE, 23,
                                        GroupLayout.PREFERRED_SIZE)
                                .addComponent(button))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addComponent(button_1)
                                .addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 48,
                                        GroupLayout.PREFERRED_SIZE)
                                .addComponent(button_2))
                        .addContainerGap(108, Short.MAX_VALUE)));
        frame.getContentPane().setLayout(groupLayout);
        return frame;
    }

}
