/**This program is meant to show the use of multiple JFrames
 *
 * @author jwhitenect
 *
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class ComboLock {

    private ButtonGroup choice;
    private JFrame frmFindThePasscode, num1, num2, num3, num4;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ComboLock window = new ComboLock();
                    window.frmFindThePasscode.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ComboLock() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        choice = new ButtonGroup();

        frmFindThePasscode = new JFrame();
        frmFindThePasscode.setTitle("FIND THE PASSCODE");
        frmFindThePasscode.setBounds(100, 100, 613, 370);
        frmFindThePasscode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmFindThePasscode.getContentPane().setLayout(null);

        num1 = new JFrame();
        num1.setTitle("PUZZLE ONE");
        num1.setBounds(100, 100, 543, 385);
        num1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        num1.getContentPane().setLayout(null);

        num2 = new JFrame();
        num2.setTitle("PUZZLE 2");
        num2.setBounds(100, 100, 525, 332);
        num2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        num2.getContentPane().setLayout(null);

        num3 = new JFrame();
        num3.setTitle("PUZZLE 3");
        num3.setBounds(100, 100, 541, 577);
        num3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        num3.getContentPane().setLayout(null);

        JTextArea txtrForTheFirst = new JTextArea();
        txtrForTheFirst.setFont(new Font("MS Gothic", Font.PLAIN, 13));
        txtrForTheFirst.setText(
                "For the first puzzle you must answer is question: Who is the lead actor of the movie \"The Truman Show\"?");
        txtrForTheFirst.setEditable(false);
        txtrForTheFirst.setLineWrap(true);
        txtrForTheFirst.setBounds(85, 11, 382, 55);
        num1.getContentPane().add(txtrForTheFirst);

        JRadioButton radio2 = new JRadioButton("Chris Pratt");
        radio2.setBounds(218, 147, 109, 23);
        num1.getContentPane().add(radio2);

        JRadioButton radio3 = new JRadioButton("Jim Carrey");
        radio3.setBounds(218, 195, 109, 23);
        num1.getContentPane().add(radio3);

        JRadioButton radio4 = new JRadioButton("Chris Hemsworth");
        radio4.setBounds(218, 241, 143, 23);
        num1.getContentPane().add(radio4);

        JRadioButton radio1 = new JRadioButton("Bill Murray");
        radio1.setBounds(218, 97, 109, 23);
        num1.getContentPane().add(radio1);

        JTextArea txtrWelcomeToThe = new JTextArea();
        txtrWelcomeToThe.setFont(new Font("MS Gothic", Font.PLAIN, 13));
        txtrWelcomeToThe.setText(
                "Welcome to the second puzzle. Please check all that apply to the following question: What is Super Mario?");
        txtrWelcomeToThe.setEditable(false);
        txtrWelcomeToThe.setLineWrap(true);
        txtrWelcomeToThe.setBounds(106, 11, 300, 65);
        num2.getContentPane().add(txtrWelcomeToThe);

        JCheckBox checkGame = new JCheckBox("A game");
        checkGame.setBounds(6, 124, 97, 23);
        num2.getContentPane().add(checkGame);

        JCheckBox checkMovie = new JCheckBox("A movie");
        checkMovie.setBounds(406, 124, 97, 23);
        num2.getContentPane().add(checkMovie);

        JCheckBox checkRPG = new JCheckBox("An RPG");
        checkRPG.setBounds(194, 124, 97, 23);
        num2.getContentPane().add(checkRPG);

        JCheckBox checkFPS = new JCheckBox("An FPS");
        checkFPS.setBounds(6, 189, 97, 23);
        num2.getContentPane().add(checkFPS);

        JCheckBox checkYoutube = new JCheckBox("A Youtuber");
        checkYoutube.setBounds(6, 263, 97, 23);
        num2.getContentPane().add(checkYoutube);

        JCheckBox checkWatch = new JCheckBox("A watch");
        checkWatch.setBounds(194, 263, 97, 23);
        num2.getContentPane().add(checkWatch);

        JCheckBox checkComputer = new JCheckBox("A computer");
        checkComputer.setBounds(194, 189, 97, 23);
        num2.getContentPane().add(checkComputer);

        JCheckBox checkRock = new JCheckBox("A rock");
        checkRock.setBounds(406, 189, 97, 23);
        num2.getContentPane().add(checkRock);

        JCheckBox checkTheRock = new JCheckBox("The Rock");
        checkTheRock.setBounds(406, 263, 97, 23);
        num2.getContentPane().add(checkTheRock);

        JButton checkAnswer = new JButton("Answer");
        checkAnswer.setBounds(144, 94, 175, 23);
        num2.getContentPane().add(checkAnswer);

        JTextArea puzzle3 = new JTextArea();
        puzzle3.setFont(new Font("MS Gothic", Font.PLAIN, 13));
        puzzle3.setLineWrap(true);
        puzzle3.setEditable(false);
        puzzle3.setText("This is the third puzzle. Please remember this pattern: Left, Middle, Middle, Right, Middle");
        puzzle3.setBounds(100, 11, 337, 46);
        num3.getContentPane().add(puzzle3);

        JButton start = new JButton("Start");
        start.setBounds(219, 68, 89, 23);
        num3.getContentPane().add(start);

        JButton a1 = new JButton("");
        a1.setBounds(10, 118, 89, 23);
        num3.getContentPane().add(a1);
        a1.setVisible(false);

        JButton b1 = new JButton("");
        b1.setBounds(219, 118, 89, 23);
        num3.getContentPane().add(b1);
        b1.setVisible(false);

        JButton c1 = new JButton("");
        c1.setBounds(426, 118, 89, 23);
        num3.getContentPane().add(c1);
        c1.setVisible(false);

        JButton a2 = new JButton("");
        a2.setBounds(10, 203, 89, 23);
        num3.getContentPane().add(a2);
        a2.setVisible(false);

        JButton b2 = new JButton("");
        b2.setBounds(219, 203, 89, 23);
        num3.getContentPane().add(b2);
        b2.setVisible(false);

        JButton c2 = new JButton("");
        c2.setBounds(426, 203, 89, 23);
        num3.getContentPane().add(c2);
        c2.setVisible(false);

        JButton a3 = new JButton("");
        a3.setBounds(10, 292, 89, 23);
        num3.getContentPane().add(a3);
        a3.setVisible(false);

        JButton b3 = new JButton("");
        b3.setBounds(219, 292, 89, 23);
        num3.getContentPane().add(b3);
        b3.setVisible(false);

        JButton c3 = new JButton("");
        c3.setBounds(426, 292, 89, 23);
        num3.getContentPane().add(c3);
        c3.setVisible(false);

        JButton a4 = new JButton("");
        a4.setBounds(10, 386, 85, 21);
        num3.getContentPane().add(a4);
        a4.setVisible(false);

        JButton b4 = new JButton("");
        b4.setBounds(223, 386, 85, 21);
        num3.getContentPane().add(b4);
        b4.setVisible(false);

        JButton c4 = new JButton("");
        c4.setBounds(430, 386, 85, 21);
        num3.getContentPane().add(c4);
        c4.setVisible(false);

        JButton a5 = new JButton("");
        a5.setBounds(14, 479, 85, 21);
        num3.getContentPane().add(a5);
        a5.setVisible(false);

        JButton b5 = new JButton("");
        b5.setBounds(219, 479, 85, 21);
        num3.getContentPane().add(b5);
        b5.setVisible(false);

        JButton c5 = new JButton("");
        c5.setBounds(430, 479, 85, 21);
        num3.getContentPane().add(c5);
        c5.setVisible(false);

        num4 = new JFrame();
        num4.setTitle("PUZZLE 4");
        num4.setBounds(100, 100, 660, 560);
        num4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        num4.getContentPane().setLayout(null);

        JTextArea textPuzzle4 = new JTextArea();
        textPuzzle4.setLineWrap(true);
        textPuzzle4.setEditable(false);
        textPuzzle4.setFont(new Font("MS Gothic", Font.PLAIN, 13));
        textPuzzle4.setText(
                "Welcome to the final puzzle. Here are the codes: Hard North, Hard East, Neutral South, Light West.");
        textPuzzle4.setBounds(142, 9, 369, 47);
        num4.getContentPane().add(textPuzzle4);

        JSlider north = new JSlider();
        north.setOrientation(SwingConstants.VERTICAL);
        north.setBounds(301, 67, 56, 183);
        num4.getContentPane().add(north);

        JButton puzzle4a = new JButton("Answer");
        puzzle4a.setBounds(290, 257, 85, 21);
        num4.getContentPane().add(puzzle4a);

        JSlider east = new JSlider();
        east.setBounds(393, 256, 200, 22);
        num4.getContentPane().add(east);

        JSlider south = new JSlider();
        south.setOrientation(SwingConstants.VERTICAL);
        south.setBounds(301, 288, 56, 170);
        num4.getContentPane().add(south);

        JSlider west = new JSlider();
        west.setBounds(80, 257, 200, 22);
        num4.getContentPane().add(west);

        passwordField = new JPasswordField();
        passwordField.setBounds(149, 134, 276, 20);
        frmFindThePasscode.getContentPane().add(passwordField);

        JButton passButton = new JButton("CLICK WHEN PASSWORD IS SECURED");
        passButton.setBounds(149, 82, 276, 23);
        frmFindThePasscode.getContentPane().add(passButton);

        JTextArea txtrYouMustFind = new JTextArea();
        txtrYouMustFind.setEditable(false);
        txtrYouMustFind.setFont(new Font("MS Gothic", Font.PLAIN, 13));
        txtrYouMustFind.setLineWrap(true);
        txtrYouMustFind.setText("You must find the 4 digit code through the four window puzzles");
        txtrYouMustFind.setBounds(176, 11, 222, 60);
        frmFindThePasscode.getContentPane().add(txtrYouMustFind);

        JButton button4 = new JButton("Puzzle 4");
        button4.setFont(new Font("MS Gothic", Font.PLAIN, 11));
        button4.setBounds(498, 264, 89, 23);
        frmFindThePasscode.getContentPane().add(button4);

        JButton button3 = new JButton("Puzzle 3");
        button3.setFont(new Font("MS Gothic", Font.PLAIN, 11));
        button3.setBounds(309, 264, 89, 23);
        frmFindThePasscode.getContentPane().add(button3);

        JButton button2 = new JButton("Puzzle 2");
        button2.setFont(new Font("MS Gothic", Font.PLAIN, 11));
        button2.setBounds(176, 264, 89, 23);
        frmFindThePasscode.getContentPane().add(button2);

        JButton button1 = new JButton("Puzzle 1");
        button1.setFont(new Font("MS Gothic", Font.PLAIN, 11));
        button1.setBounds(10, 264, 89, 23);
        frmFindThePasscode.getContentPane().add(button1);

        JButton answer = new JButton("Click after choice");
        answer.setBounds(194, 312, 143, 23);
        num1.getContentPane().add(answer);

        passButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (passwordField.getText().equalsIgnoreCase("1964")) {
                    JOptionPane.showMessageDialog(frmFindThePasscode, "CONGRATZ, YOU GOT THE PASSWORD CORRECT!");
                } else if (passwordField.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(frmFindThePasscode, "YOU HAVE NOT PUT IN ANYTHING.");
                } else {
                    JOptionPane.showMessageDialog(frmFindThePasscode, "PLEASE TRY AGAIN, THAT WAS THE WRONG PASSWORD.");
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1.setVisible(true);
            }
        });

        answer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radio1.isSelected() || radio2.isSelected() || radio4.isSelected()) {
                    JOptionPane.showMessageDialog(num1, "THAT IS THE WRONG ANSWER.");
                    num1.dispose();
                } else if (radio3.isSelected()) {
                    JOptionPane.showMessageDialog(num1, "HERE IS YOUR FIRST NUMBER: 1");
                    num1.dispose();
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2.setVisible(true);
            }
        });

        checkAnswer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkGame.isSelected() && checkRPG.isSelected() && checkMovie.isSelected() && checkRock.isSelected()
                        && checkWatch.isSelected()) {
                    JOptionPane.showMessageDialog(num2, "HERE IS YOUR SECOND NUMBER: 9");
                    num2.dispose();
                } else {
                    JOptionPane.showMessageDialog(num2, "THAT IS THE WRONG ANSWER.");
                    num2.dispose();
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num3.setVisible(true);
            }
        });

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a1.setVisible(true);
                b1.setVisible(true);
                c1.setVisible(true);
                start.setVisible(false);
                puzzle3.setVisible(false);
            }
        });

        a1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a1.setVisible(false);
                b1.setVisible(false);
                c1.setVisible(false);
                a2.setVisible(true);
                b2.setVisible(true);
                c2.setVisible(true);
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                puzzle3.setVisible(true);
                a1.setVisible(false);
                b1.setVisible(false);
                c1.setVisible(false);
                JOptionPane.showMessageDialog(num3, "THAT IS THE WRONG ANSWER.");
                num3.dispose();
            }
        });

        c1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                puzzle3.setVisible(true);
                a1.setVisible(false);
                b1.setVisible(false);
                c1.setVisible(false);
                JOptionPane.showMessageDialog(num3, "THAT IS THE WRONG ANSWER.");
                num3.dispose();
            }
        });

        a2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                puzzle3.setVisible(true);
                a2.setVisible(false);
                b2.setVisible(false);
                c2.setVisible(false);
                JOptionPane.showMessageDialog(num3, "THAT IS THE WRONG ANSWER.");
                num3.dispose();
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a2.setVisible(false);
                b2.setVisible(false);
                c2.setVisible(false);
                a3.setVisible(true);
                b3.setVisible(true);
                c3.setVisible(true);
            }
        });

        c2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                puzzle3.setVisible(true);
                a2.setVisible(false);
                b2.setVisible(false);
                c2.setVisible(false);
                JOptionPane.showMessageDialog(num3, "THAT IS THE WRONG ANSWER.");
                num3.dispose();
            }
        });

        a3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                puzzle3.setVisible(true);
                a3.setVisible(false);
                b3.setVisible(false);
                c3.setVisible(false);
                JOptionPane.showMessageDialog(num3, "THAT IS THE WRONG ANSWER.");
                num3.dispose();
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a3.setVisible(false);
                b3.setVisible(false);
                c3.setVisible(false);
                a4.setVisible(true);
                b4.setVisible(true);
                c4.setVisible(true);
            }
        });

        c3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                puzzle3.setVisible(true);
                a3.setVisible(false);
                b3.setVisible(false);
                c3.setVisible(false);
                JOptionPane.showMessageDialog(num3, "THAT IS THE WRONG ANSWER.");
                num3.dispose();
            }
        });

        a4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                puzzle3.setVisible(true);
                a4.setVisible(false);
                b4.setVisible(false);
                c4.setVisible(false);
                JOptionPane.showMessageDialog(num3, "THAT IS THE WRONG ANSWER.");
                num3.dispose();
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                puzzle3.setVisible(true);
                a4.setVisible(false);
                b4.setVisible(false);
                c4.setVisible(false);
                JOptionPane.showMessageDialog(num3, "THAT IS THE WRONG ANSWER.");
                num3.dispose();
            }
        });

        c4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a4.setVisible(false);
                b4.setVisible(false);
                c4.setVisible(false);
                a5.setVisible(true);
                b5.setVisible(true);
                c5.setVisible(true);
            }
        });

        a5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                puzzle3.setVisible(true);
                a5.setVisible(false);
                b5.setVisible(false);
                c5.setVisible(false);
                JOptionPane.showMessageDialog(num3, "THAT IS THE WRONG ANSWER.");
                num3.dispose();
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                puzzle3.setVisible(true);
                a5.setVisible(false);
                b5.setVisible(false);
                c5.setVisible(false);
                JOptionPane.showMessageDialog(num3, "HERE IS YOUR THIRD NUMBER: 6");
                num3.dispose();
            }
        });

        c5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.setVisible(true);
                puzzle3.setVisible(true);
                a5.setVisible(false);
                b5.setVisible(false);
                c5.setVisible(false);
                JOptionPane.showMessageDialog(num3, "THAT IS THE WRONG ANSWER.");
                num3.dispose();
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num4.setVisible(true);
            }
        });

        puzzle4a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (north.getValue() >= 90 && north.getValue() <= 100) {
                    if (east.getValue() >= 90 && east.getValue() <= 100) {
                        if (south.getValue() >= 40 && south.getValue() <= 60) {
                            if (west.getValue() >= 20 && west.getValue() <= 40) {
                                JOptionPane.showMessageDialog(num4, "HERE IS YOUR FOURTH NUMBER: 4");
                                num4.dispose();
                            } else {
                                JOptionPane.showMessageDialog(num4, "THAT IS THE WRONG ANSWER.");
                                num4.dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(num4, "THAT IS THE WRONG ANSWER.");
                            num4.dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(num4, "THAT IS THE WRONG ANSWER.");
                        num4.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(num4, "THAT IS THE WRONG ANSWER.");
                    num4.dispose();
                }
            }
        });

        choice.add(radio1);
        choice.add(radio2);
        choice.add(radio3);
        choice.add(radio4);
    }
}