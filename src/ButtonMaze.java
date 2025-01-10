/**This program is meant to be a maze using different buttons using action listeners
 *
 * @author jwhitenect
 *
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class ButtonMaze {

    private JFrame frmAMazingButton;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ButtonMaze window = new ButtonMaze();
                    window.frmAMazingButton.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ButtonMaze() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmAMazingButton = new JFrame();
        frmAMazingButton.setTitle("A Mazing Button");
        frmAMazingButton.setBounds(100, 100, 655, 568);
        frmAMazingButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmAMazingButton.getContentPane().setLayout(null);

        JButton startButton = new JButton("Start");
        startButton.setBounds(153, 11, 334, 23);
        frmAMazingButton.getContentPane().add(startButton);

        JButton step1A = new JButton("Or this?");
        step1A.setBounds(497, 11, 133, 23);
        frmAMazingButton.getContentPane().add(step1A);
        step1A.setVisible(false);

        JButton step1B = new JButton("Is this right way?");
        step1B.setBounds(10, 11, 133, 23);
        frmAMazingButton.getContentPane().add(step1B);
        step1B.setVisible(false);

        JButton step2A = new JButton("The button to left is lying");
        step2A.setBounds(0, 88, 325, 23);
        frmAMazingButton.getContentPane().add(step2A);
        step2A.setVisible(false);

        JButton step2B = new JButton("The button to the right is telling the truth");
        step2B.setBounds(323, 88, 316, 23);
        frmAMazingButton.getContentPane().add(step2B);
        step2B.setVisible(false);

        JTextArea prefer = new JTextArea();
        prefer.setFont(new Font("Tahoma", Font.PLAIN, 11));
        prefer.setText("Which do you prefer?");
        prefer.setBounds(271, 496, 113, 22);
        frmAMazingButton.getContentPane().add(prefer);
        prefer.setVisible(false);

        JButton step2C = new JButton("Radios");
        step2C.setBounds(271, 462, 102, 23);
        frmAMazingButton.getContentPane().add(step2C);
        step2C.setVisible(false);

        JButton step2D = new JButton("Checks");
        step2D.setBounds(271, 428, 102, 23);
        frmAMazingButton.getContentPane().add(step2D);
        step2D.setVisible(false);

        JRadioButton rd1 = new JRadioButton("So you...");
        rd1.setBounds(163, 428, 102, 23);
        frmAMazingButton.getContentPane().add(rd1);
        rd1.setVisible(false);

        JRadioButton rd2 = new JRadioButton("Like radios?");
        rd2.setBounds(163, 462, 102, 23);
        frmAMazingButton.getContentPane().add(rd2);
        rd2.setVisible(false);

        JButton step3A = new JButton("Good non-evil button");
        step3A.setBounds(0, 428, 157, 23);
        frmAMazingButton.getContentPane().add(step3A);
        step3A.setVisible(false);

        JButton step3B = new JButton("Evil non-good button");
        step3B.setBounds(0, 462, 157, 23);
        frmAMazingButton.getContentPane().add(step3B);
        step3B.setVisible(false);

        JCheckBox ch1 = new JCheckBox("Do you...");
        ch1.setBounds(390, 428, 97, 23);
        frmAMazingButton.getContentPane().add(ch1);
        ch1.setVisible(false);

        JCheckBox ch2 = new JCheckBox("Enjoy checks?");
        ch2.setBounds(390, 462, 113, 23);
        frmAMazingButton.getContentPane().add(ch2);
        ch2.setVisible(false);

        JButton step3C = new JButton("I was lying");
        step3C.setBounds(506, 428, 133, 23);
        frmAMazingButton.getContentPane().add(step3C);
        step3C.setVisible(false);

        JButton step3D = new JButton("Radios are better");
        step3D.setBounds(506, 462, 133, 23);
        frmAMazingButton.getContentPane().add(step3D);
        step3D.setVisible(false);

        JButton checkSelect = new JButton("Click to pick");
        checkSelect.setBounds(251, 394, 133, 23);
        frmAMazingButton.getContentPane().add(checkSelect);
        checkSelect.setVisible(false);

        passwordField = new JPasswordField();
        passwordField.setBounds(390, 146, 172, 20);
        frmAMazingButton.getContentPane().add(passwordField);
        passwordField.setVisible(false);

        JTextArea password = new JTextArea();
        password.setFont(new Font("Tahoma", Font.PLAIN, 10));
        password.setText("Hey, could you put in my password? It's \"1234567\"");
        password.setLineWrap(true);
        password.setBounds(390, 177, 172, 45);
        frmAMazingButton.getContentPane().add(password);
        password.setVisible(false);

        JButton passwordButton = new JButton("Click after entering password");
        passwordButton.setBounds(323, 112, 307, 23);
        frmAMazingButton.getContentPane().add(passwordButton);
        passwordButton.setVisible(false);

        JButton end = new JButton("Click to claim victory!!!");
        end.setBounds(10, 161, 172, 23);
        frmAMazingButton.getContentPane().add(end);
        end.setVisible(false);

        JButton trueEnd = new JButton("Don't be greedy!!!");
        trueEnd.setBounds(10, 236, 172, 23);
        frmAMazingButton.getContentPane().add(trueEnd);
        trueEnd.setVisible(false);

        JTextArea txtrOr = new JTextArea();
        txtrOr.setText("OR");
        txtrOr.setBounds(84, 195, 35, 22);
        frmAMazingButton.getContentPane().add(txtrOr);
        txtrOr.setVisible(false);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startButton.setVisible(false);
                step1B.setVisible(true);
                step1A.setVisible(true);
            }
        });

        step1B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                step2A.setVisible(true);
                step2B.setVisible(true);
                step1A.setVisible(false);
                step1B.setVisible(false);
            }
        });

        step1A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                prefer.setVisible(true);
                step2C.setVisible(true);
                step2D.setVisible(true);
                step1B.setVisible(false);
                step1A.setVisible(false);
            }
        });

        step2C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                step2C.setVisible(false);
                step2D.setVisible(false);
                prefer.setVisible(false);
                rd1.setVisible(true);
                rd2.setVisible(true);
            }
        });

        rd1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                step3A.setVisible(true);
                rd1.setVisible(false);
                rd2.setVisible(false);
            }
        });

        rd2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                step3B.setVisible(true);
                rd1.setVisible(false);
                rd2.setVisible(false);
            }
        });

        step3A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frmAMazingButton, "YOU ARE A WINNER!");
                step3A.setVisible(false);
                startButton.setVisible(true);

            }
        });

        step3B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frmAMazingButton, "WINNERS AREN'T EVIL, TRY AGAIN");
                step3B.setVisible(false);
                startButton.setVisible(true);
            }
        });

        step2D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                step2C.setVisible(false);
                step2D.setVisible(false);
                prefer.setVisible(false);
                ch1.setVisible(true);
                ch2.setVisible(true);
                checkSelect.setVisible(true);
            }
        });

        checkSelect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (ch1.isSelected() && ch2.isSelected()) {
                    checkSelect.setVisible(false);
                    ch1.setVisible(false);
                    ch2.setVisible(false);
                    step3C.setVisible(true);
                    step3D.setVisible(true);
                } else if (ch1.isSelected()) {
                    checkSelect.setVisible(false);
                    ch1.setVisible(false);
                    ch2.setVisible(false);
                    step3C.setVisible(true);
                } else if (ch2.isSelected()) {
                    checkSelect.setVisible(false);
                    ch1.setVisible(false);
                    ch2.setVisible(false);
                    step3D.setVisible(true);
                }
            }
        });

        step3C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                step3D.setVisible(false);
                step3C.setVisible(false);
                rd1.setVisible(true);
                rd2.setVisible(true);
            }
        });

        step3D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                step3D.setVisible(false);
                step3C.setVisible(false);
                rd1.setVisible(true);
                rd2.setVisible(true);
            }
        });

        step2A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frmAMazingButton, "GET LIED TO NERD, TRY AGAIN!");
                step2A.setVisible(false);
                step2B.setVisible(false);
                startButton.setVisible(true);
            }
        });

        step2B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                step2A.setVisible(false);
                step2B.setVisible(false);
                passwordButton.setVisible(true);
                passwordField.setVisible(true);
                password.setVisible(true);
            }
        });

        passwordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (passwordField.getText().equalsIgnoreCase("1234567")) {
                    passwordField.setVisible(false);
                    passwordButton.setVisible(false);
                    password.setVisible(false);
                    end.setVisible(true);
                    txtrOr.setVisible(true);
                    trueEnd.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frmAMazingButton, "YOU PUT IN THE WRONG PASSWORD, TRY AGAIN!");
                    passwordField.setVisible(false);
                    passwordButton.setVisible(false);
                    password.setVisible(false);
                    startButton.setVisible(true);
                }
            }
        });

        end.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frmAMazingButton, "YOU SHOULDN'T BE GREEDY, TRY AGAIN!");
                end.setVisible(false);
                trueEnd.setVisible(false);
                startButton.setVisible(true);
                txtrOr.setVisible(false);
            }
        });

        trueEnd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frmAMazingButton, "YOU ARE A WINNER!");
                end.setVisible(false);
                trueEnd.setVisible(false);
                startButton.setVisible(true);
                txtrOr.setVisible(false);
            }
        });

    }
}
