/**This program is meant to be scientific calculator with trig functions, addition, subtraction etc.
 *
 * @author jwhitenect
 *
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowCalculator {

    private JFrame frame;
    double temp = 0;
    boolean a, d, s, m, p, r = false;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WindowCalculator window = new WindowCalculator();
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
    public WindowCalculator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 431, 413);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);

        JTextArea display = new JTextArea();
        display.setLineWrap(true);
        display.setEditable(false);
        display.setBounds(16, 27, 387, 22);
        frame.getContentPane().add(display);

        JButton seven = new JButton("7");
        seven.setBounds(16, 100, 80, 20);
        frame.getContentPane().add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(106, 150, 80, 20);
        frame.getContentPane().add(eight);

        JButton nine = new JButton("9");
        nine.setBounds(196, 100, 80, 20);
        frame.getContentPane().add(nine);

        JButton four = new JButton("4");
        four.setBounds(16, 150, 80, 20);
        frame.getContentPane().add(four);

        JButton five = new JButton("5");
        five.setBounds(106, 100, 80, 20);
        frame.getContentPane().add(five);

        JButton six = new JButton("6");
        six.setBounds(196, 150, 80, 20);
        frame.getContentPane().add(six);

        JButton one = new JButton("1");
        one.setBounds(16, 200, 80, 20);
        frame.getContentPane().add(one);

        JButton two = new JButton("2");
        two.setBounds(106, 200, 80, 20);
        frame.getContentPane().add(two);

        JButton three = new JButton("3");
        three.setBounds(196, 200, 80, 20);
        frame.getContentPane().add(three);

        JButton zero = new JButton("0");
        zero.setBounds(16, 250, 80, 20);
        frame.getContentPane().add(zero);

        JButton decimal = new JButton(".");
        decimal.setBounds(106, 250, 80, 20);
        frame.getContentPane().add(decimal);

        JButton equals = new JButton("=");
        equals.setBounds(196, 250, 80, 20);
        frame.getContentPane().add(equals);

        JButton divide = new JButton("\u00F7");
        divide.setBounds(323, 100, 80, 20);
        frame.getContentPane().add(divide);

        JButton multiply = new JButton("x");
        multiply.setBounds(323, 150, 80, 20);
        frame.getContentPane().add(multiply);

        JButton subtract = new JButton("-");
        subtract.setBounds(323, 200, 80, 20);
        frame.getContentPane().add(subtract);

        JButton add = new JButton("+");
        add.setBounds(323, 250, 80, 20);
        frame.getContentPane().add(add);

        JButton clear = new JButton("C");
        clear.setBounds(323, 50, 80, 20);
        frame.getContentPane().add(clear);

        JButton power = new JButton("x^y");
        power.setBounds(106, 50, 80, 20);
        frame.getContentPane().add(power);

        JButton pi = new JButton("\u03C0");
        pi.setBounds(323, 350, 80, 20);
        frame.getContentPane().add(pi);

        JButton percent = new JButton("%");
        percent.setBounds(196, 350, 80, 20);
        frame.getContentPane().add(percent);

        JButton root = new JButton("x^\u221A");
        root.setBounds(16, 50, 80, 20);
        frame.getContentPane().add(root);

        JButton plusminus = new JButton("+/-");
        plusminus.setBounds(323, 300, 80, 20);
        frame.getContentPane().add(plusminus);

        JButton sin = new JButton("Sin");
        sin.setBounds(16, 300, 80, 20);
        frame.getContentPane().add(sin);

        JButton cos = new JButton("Cos");
        cos.setBounds(106, 300, 80, 20);
        frame.getContentPane().add(cos);

        JButton tan = new JButton("Tan");
        tan.setBounds(196, 300, 80, 20);
        frame.getContentPane().add(tan);

        JButton absolute = new JButton("abs");
        absolute.setBounds(106, 350, 80, 20);
        frame.getContentPane().add(absolute);

        JButton x1 = new JButton("1/x");
        x1.setBounds(196, 50, 80, 20);
        frame.getContentPane().add(x1);

        JButton log = new JButton("Log");
        log.setBounds(16, 350, 80, 20);
        frame.getContentPane().add(log);

        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (a == true || d == true || s == true || m == true || p == true || r == true) {
                    display.setText("");
                    display.append("7");
                } else {
                    display.append("7");
                }
            }
        });

        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (a == true || d == true || s == true || m == true || p == true || r == true) {
                    display.setText("");
                    display.append("8");
                } else {
                    display.append("8");
                }
            }
        });

        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (a == true || d == true || s == true || m == true || p == true || r == true) {
                    display.setText("");
                    display.append("9");
                } else {
                    display.append("9");
                }
            }
        });

        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (a == true || d == true || s == true || m == true || p == true || r == true) {
                    display.setText("");
                    display.append("4");
                } else {
                    display.append("4");
                }
            }
        });

        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (a == true || d == true || s == true || m == true || p == true || r == true) {
                    display.setText("");
                    display.append("5");
                } else {
                    display.append("5");
                }
            }
        });

        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (a == true || d == true || s == true || m == true || p == true || r == true) {
                    display.setText("");
                    display.append("6");
                } else {
                    display.append("6");
                }
            }
        });

        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (a == true || d == true || s == true || m == true || p == true || r == true) {
                    display.setText("");
                    display.append("1");
                } else {
                    display.append("1");
                }
            }
        });

        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (a == true || d == true || s == true || m == true || p == true || r == true) {
                    display.setText("");
                    display.append("2");
                } else {
                    display.append("2");
                }
            }
        });

        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (a == true || d == true || s == true || m == true || p == true || r == true) {
                    display.setText("");
                    display.append("3");
                } else {
                    display.append("3");
                }
            }
        });

        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equalsIgnoreCase("")) {

                } else {

                    if (a == true || d == true || s == true || m == true || p == true || r == true) {
                        display.setText("");
                        display.append("0");
                    } else {
                        display.append("0");
                    }
                }
            }
        });

        decimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (display.getText().contains(".")) {

                } else {
                    if (a == true || d == true || s == true || m == true || p == true || r == true) {
                        display.setText("");
                        display.append(".");
                    } else {
                        display.append(".");
                    }
                }
            }
        });

        pi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (display.getText().contains(".")) {
                    if (a == true || d == true || s == true || m == true || p == true || r == true) {
                        display.setText("");
                        display.append("3141592653589793");
                    } else {
                        display.append("3141592653589793");
                    }
                } else {
                    if (a == true || d == true || s == true || m == true || p == true || r == true) {
                        display.setText("");
                        display.append("" + Math.PI);
                    } else {
                        display.append("" + Math.PI);
                    }
                }
            }
        });

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else if (temp != 0) {
                    if (a == true) {
                        display.setText("" + (temp + Double.parseDouble(display.getText())));
                    } else if (d == true) {
                        display.setText("" + (temp / Double.parseDouble(display.getText())));
                    } else if (m == true) {
                        display.setText("" + (temp * Double.parseDouble(display.getText())));
                    } else if (s == true) {
                        display.setText("" + (temp - Double.parseDouble(display.getText())));
                    } else if (p == true) {
                        display.setText("" + Math.pow(temp, Double.parseDouble(display.getText())));
                    } else if (r == true) {
                        display.setText("" + Math.pow(Double.parseDouble(display.getText()), 1 / temp));
                    }
                    d = true;
                    a = false;
                    m = false;
                    s = false;
                    p = false;
                    r = false;
                } else {
                    temp = Double.parseDouble(display.getText());
                    d = true;
                    a = false;
                    m = false;
                    s = false;
                    p = false;
                    r = false;
                }
            }
        });

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else if (temp != 0) {
                    if (a == true) {
                        display.setText("" + (temp + Double.parseDouble(display.getText())));
                    } else if (d == true) {
                        display.setText("" + (temp / Double.parseDouble(display.getText())));
                    } else if (m == true) {
                        display.setText("" + (temp * Double.parseDouble(display.getText())));
                    } else if (s == true) {
                        display.setText("" + (temp - Double.parseDouble(display.getText())));
                    } else if (p == true) {
                        display.setText("" + Math.pow(temp, Double.parseDouble(display.getText())));
                    } else if (r == true) {
                        display.setText("" + Math.pow(Double.parseDouble(display.getText()), 1 / temp));
                    }
                    a = true;
                    d = false;
                    m = false;
                    s = false;
                    p = false;
                    r = false;
                } else {
                    temp = Double.parseDouble(display.getText());
                    a = true;
                    d = false;
                    m = false;
                    s = false;
                    p = false;
                    r = false;
                }
            }
        });

        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else if (temp != 0) {
                    if (a == true) {
                        display.setText("" + (temp + Double.parseDouble(display.getText())));
                    } else if (d == true) {
                        display.setText("" + (temp / Double.parseDouble(display.getText())));
                    } else if (m == true) {
                        display.setText("" + (temp * Double.parseDouble(display.getText())));
                    } else if (s == true) {
                        display.setText("" + (temp - Double.parseDouble(display.getText())));
                    } else if (p == true) {
                        display.setText("" + Math.pow(temp, Double.parseDouble(display.getText())));
                    } else if (r == true) {
                        display.setText("" + Math.pow(Double.parseDouble(display.getText()), 1 / temp));
                    }
                    m = true;
                    a = false;
                    s = false;
                    d = false;
                    p = false;
                    r = false;
                } else {
                    temp = Double.parseDouble(display.getText());
                    m = true;
                    a = false;
                    s = false;
                    d = false;
                    p = false;
                    r = false;
                }
            }
        });

        subtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else if (temp != 0) {
                    if (a == true) {
                        display.setText("" + (temp + Double.parseDouble(display.getText())));
                    } else if (d == true) {
                        display.setText("" + (temp / Double.parseDouble(display.getText())));
                    } else if (m == true) {
                        display.setText("" + (temp * Double.parseDouble(display.getText())));
                    } else if (s == true) {
                        display.setText("" + (temp - Double.parseDouble(display.getText())));
                    } else if (p == true) {
                        display.setText("" + Math.pow(temp, Double.parseDouble(display.getText())));
                    } else if (r == true) {
                        display.setText("" + Math.pow(Double.parseDouble(display.getText()), 1 / temp));
                    }
                    s = true;
                    a = false;
                    m = false;
                    d = false;
                    r = false;
                    p = false;
                } else {
                    temp = Double.parseDouble(display.getText());
                    s = true;
                    a = false;
                    m = false;
                    d = false;
                    r = false;
                    p = false;
                }
            }
        });

        power.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else if (temp != 0) {
                    if (a == true) {
                        display.setText("" + (temp + Double.parseDouble(display.getText())));
                    } else if (d == true) {
                        display.setText("" + (temp / Double.parseDouble(display.getText())));
                    } else if (m == true) {
                        display.setText("" + (temp * Double.parseDouble(display.getText())));
                    } else if (s == true) {
                        display.setText("" + (temp - Double.parseDouble(display.getText())));
                    } else if (p == true) {
                        display.setText("" + Math.pow(temp, Double.parseDouble(display.getText())));
                    } else if (r == true) {
                        display.setText("" + Math.pow(Double.parseDouble(display.getText()), 1 / temp));
                    }
                    p = true;
                    a = false;
                    m = false;
                    s = false;
                    d = false;
                    r = false;
                } else {
                    temp = Double.parseDouble(display.getText());
                    p = true;
                    a = false;
                    m = false;
                    s = false;
                    d = false;
                    r = false;
                }
            }
        });

        root.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else if (temp != 0) {
                    if (a == true) {
                        display.setText("" + (temp + Double.parseDouble(display.getText())));
                    } else if (d == true) {
                        display.setText("" + (temp / Double.parseDouble(display.getText())));
                    } else if (m == true) {
                        display.setText("" + (temp * Double.parseDouble(display.getText())));
                    } else if (s == true) {
                        display.setText("" + (temp - Double.parseDouble(display.getText())));
                    } else if (p == true) {
                        display.setText("" + Math.pow(temp, Double.parseDouble(display.getText())));
                    } else if (r == true) {
                        display.setText("" + Math.pow(Double.parseDouble(display.getText()), 1 / temp));
                    }
                    r = true;
                    a = false;
                    m = false;
                    s = false;
                    d = false;
                    p = false;
                } else {
                    temp = Double.parseDouble(display.getText());
                    r = true;
                    a = false;
                    m = false;
                    s = false;
                    d = false;
                    p = false;
                }
            }
        });

        percent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else {
                    display.setText("" + Double.parseDouble(display.getText()) / 100);
                }
            }
        });

        plusminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else {
                    display.setText("" + Double.parseDouble(display.getText()) * -1);
                }
            }
        });

        sin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else {
                    display.setText("" + Math.sin(Double.parseDouble(display.getText())));
                }
            }
        });

        cos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else {
                    display.setText("" + Math.cos(Double.parseDouble(display.getText())));
                }
            }
        });

        tan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else {
                    display.setText("" + Math.tan(Double.parseDouble(display.getText())));
                }
            }
        });

        absolute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else {
                    display.setText("" + Math.abs(Double.parseDouble(display.getText())));
                }
            }
        });

        x1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else {
                    display.setText("" + (1 / Double.parseDouble(display.getText())));
                }
            }
        });

        log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (display.getText().equalsIgnoreCase("") || display.getText().equalsIgnoreCase(".")) {

                } else {
                    display.setText("" + Math.log(Double.parseDouble(display.getText())));
                }

            }
        });

        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (a == true) {
                    display.setText("" + (temp + Double.parseDouble(display.getText())));
                } else if (d == true) {
                    display.setText("" + (temp / Double.parseDouble(display.getText())));
                } else if (m == true) {
                    display.setText("" + (temp * Double.parseDouble(display.getText())));
                } else if (s == true) {
                    display.setText("" + (temp - Double.parseDouble(display.getText())));
                } else if (p == true) {
                    display.setText("" + Math.pow(temp, Double.parseDouble(display.getText())));
                } else if (r == true) {
                    display.setText("" + Math.pow(Double.parseDouble(display.getText()), 1 / temp));
                }

                a = false;
                d = false;
                m = false;
                s = false;
                p = false;
                r = false;
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                temp = 0;
                a = false;
                d = false;
                m = false;
                s = false;
                p = false;
            }
        });

    }
}
