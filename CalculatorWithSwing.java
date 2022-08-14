import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator implements ActionListener {
    int n, c;
    String s1, s2, s3, s4, s5;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17;
    GridLayout g;
    JTextField tf;
    JFrame f;
    JPanel p;

    public Calculator() {
        f = new JFrame("My Calculator");
        p = new JPanel();
        f.setLayout(new FlowLayout());
        b1 = new JButton("0");
        b1.addActionListener(this);
        b2 = new JButton("1");
        b2.addActionListener(this);
        b3 = new JButton("2");
        b3.addActionListener(this);
        b4 = new JButton("3");
        b4.addActionListener(this);
        b5 = new JButton("4");
        b5.addActionListener(this);
        b6 = new JButton("5");
        b6.addActionListener(this);
        b7 = new JButton("6");
        b7.addActionListener(this);
        b8 = new JButton("7");
        b8.addActionListener(this);
        b9 = new JButton("8");
        b9.addActionListener(this);
        b10 = new JButton("9");
        b10.addActionListener(this);
        b11 = new JButton("+");
        b11.addActionListener(this);
        b12 = new JButton("-");
        b12.addActionListener(this);
        b13 = new JButton("*");
        b13.addActionListener(this);
        b14 = new JButton("/");
        b14.addActionListener(this);
        b15 = new JButton("%");
        b15.addActionListener(this);
        b16 = new JButton("=");
        b16.addActionListener(this);
        b17 = new JButton("C");
        b17.addActionListener(this);

        tf = new JTextField(20);
        f.add(tf);
        g = new GridLayout(4, 4, 10, 20);
        p.setLayout(g);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);
        p.setBackground(Color.cyan);
        f.add(p);
        f.setSize(450, 300);
        f.setVisible(true);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.CYAN);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            s3 = tf.getText();
            s4 = "0";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b2) {
            s3 = tf.getText();
            s4 = "1";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b3) {
            s3 = tf.getText();
            s4 = "2";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b4) {
            s3 = tf.getText();
            s4 = "3";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b5) {
            s3 = tf.getText();
            s4 = "4";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b6) {
            s3 = tf.getText();
            s4 = "5";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b7) {
            s3 = tf.getText();
            s4 = "6";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b8) {
            s3 = tf.getText();
            s4 = "7";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b9) {
            s3 = tf.getText();
            s4 = "8";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b10) {
            s3 = tf.getText();
            s4 = "9";
            s5 = s3 + s4;
            tf.setText(s5);
        }
        if (e.getSource() == b11) {
            s1 = tf.getText();
            tf.setText("");
            c = 1;

        }
        if (e.getSource() == b12) {
            s1 = tf.getText();
            tf.setText("");
            c = 2;

        }
        if (e.getSource() == b13) {
            s1 = tf.getText();
            tf.setText("");
            c = 3;

        }
        if (e.getSource() == b14) {
            s1 = tf.getText();
            tf.setText("");
            c = 4;

        }
        if (e.getSource() == b15) {
            s1 = tf.getText();
            tf.setText("");
            c = 5;

        }
        if (e.getSource() == b16) {
            s2 = tf.getText();
            if (c == 1) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            } else if (c == 2) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            } else if (c == 3) {
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            if (c == 4) {
                try {
                    int p = Integer.parseInt(s2);
                    if (p != 0) {
                        n = Integer.parseInt(s1) / Integer.parseInt(s2);
                        tf.setText(String.valueOf(n));
                    } else
                        tf.setText("infinite");
                } catch (Exception ob) {
                }
            }
            if (c == 5) {
                n = Integer.parseInt(s1) % Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
        }
        if (e.getSource() == b17) {
            tf.setText("");
        }
    }


}
public class CalculatorWithSwing{

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}