import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reader extends JFrame {
    int k, i;
    Object boxA, boxB, boxC, textM;
    File file = new File("base.txt");
    static JLabel l1, l2, l3, l4;
    JComboBox box_1, box_2, box_3, text1;
    JRadioButton flag1, flag2;
    JRadioButton flag11, flag22;
    ButtonGroup bg;
    ButtonGroup ge;
    JButton b, del;
    String[] text = {"Выберите тип игрушки", "Мягкие", "Развивающие", "Пазлы", "Роботы", "Деградирующие"};
    JTextArea area;
    String[] box1 = {"...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    String[] box2 = {"...", "январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
    String[] box3 = {"...", "2019", "2020", "2021", "2022"};

    public Reader(String str, Color color) {
        super(str);
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(color);

        b = new JButton("Зарегистрировать");
        del = new JButton("Очистить");
        text1 = new JComboBox(text);
        area = new JTextArea(9, 9);
        l1 = new JLabel("Тип игрушки");
        l2 = new JLabel("Название игрушки");
        l3 = new JLabel("Дата оформления заявки");
        l4 = new JLabel("Стоимость услуги");
        box_1 = new JComboBox(box1);
        box_2 = new JComboBox(box2);
        box_3 = new JComboBox(box3);
        flag1 = new JRadioButton("Платная");
        flag2 = new JRadioButton("Бесплатная");

        flag11 = new JRadioButton("Первое поступление");
        flag22 = new JRadioButton("Вторичное");
        bg = new ButtonGroup();

        ge = new ButtonGroup();
        ge.add(flag11);
        ge.add(flag22);

        bg.add(flag1);
        bg.add(flag2);

        setLayout(null);
        b.setSize(200, 30);
        b.setLocation(150, 370);
        del.setSize(100, 30);
        del.setLocation(10, 370);
        text1.setSize(220, 25);
        text1.setLocation(250, 20);
        area.setSize(220, 150);
        area.setLocation(250, 60);
        l1.setSize(200, 25);
        l1.setLocation(30, 20);
        l2.setSize(220, 25);
        l2.setLocation(30, 60);
        l3.setSize(200, 25);
        l3.setLocation(30, 250);
        l4.setSize(200, 25);
        l4.setLocation(30, 310);
        box_1.setSize(60, 25);
        box_1.setLocation(250, 250);
        box_2.setSize(100, 25);
        box_2.setLocation(300, 250);
        box_3.setSize(90, 25);
        box_3.setLocation(390, 250);
        flag1.setSize(110, 25);
        flag1.setLocation(250, 310);
        flag2.setSize(110, 25);
        flag2.setLocation(360, 310);

        flag11.setSize(110, 25);
        flag11.setLocation(30, 150);
        flag22.setSize(110, 25);
        flag22.setLocation(140, 150);

        add(b);
        add(del);
        add(text1);
        add(area);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(box_1);
        add(box_2);
        add(box_3);
        add(flag1);
        add(flag2);

        add(flag11);
        add(flag22);

        text1.addActionListener(new BoxActionListener());
        b.addActionListener(new ButtonActionListener());
        flag1.addActionListener(new FlagActionListener());
        flag2.addActionListener(new FlagActionListener());

        flag11.addActionListener(new FlagActionListener());
        flag22.addActionListener(new FlagActionListener());

        del.addActionListener(new DelActionListener());
        box_1.addActionListener(new BoxActionListener());
        box_2.addActionListener(new BoxActionListener());
        box_3.addActionListener(new BoxActionListener());
    }

    public class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter out = new FileWriter(file, true);
                try {
                    out.write("Тип игрушки: " + textM + "\n");
                    String area2 = area.getText();
                    out.write("Игрушка: " + area2 + "\n");
                    if (k == 1)
                        out.write("Платная " + "\n");
                    else if (k == -1)
                        out.write("Бесплатная " + "\n");
                    out.write(" (Дата регистрации игрушки:" + boxA + " " + boxB + " " + boxC + ")");
                } finally {
                    out.close();
                }
            } catch (IOException e1) {
                throw new RuntimeException(e1);
            }
        }
    }

    public class FlagActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            k = 0;
            if (e.getSource() == flag1) {
                k++;
            } else if (e.getSource() == flag2) {
                k--;
            }
        }
    }

    public class FlagActionListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            i = 0;
            if (e.getSource() == flag11) {
                i++;
            } else if (e.getSource() == flag22) {
                i--;
            }
        }
    }

    public class DelActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            area.setText(null);
            text1.setSelectedItem(text[0]);
            box_1.setSelectedItem(box1[0]);
            box_2.setSelectedItem(box2[0]);
            box_3.setSelectedItem(box3[0]);

            bg.clearSelection();


        }
    }

    public class BoxActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == text1) {
                textM = text1.getSelectedItem();
            }
            if (e.getSource() == box_1) {
                boxA = box_1.getSelectedItem();
            }
            if (e.getSource() == box_2) {
                boxB = box_2.getSelectedItem();
            }
            if (e.getSource() == box_3) {
                boxC = box_3.getSelectedItem();
            }

        }
    }
}
