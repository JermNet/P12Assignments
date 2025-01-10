/**This program is meant to show the use of text fields, labels and buttons in a graphical interface
 *
 * @jwhitenect
 *
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class MadLibsDX {

    private JFrame frmMadlibDx;
    private JTextField year;
    private JTextField name;
    private JTextField town;
    private JTextField videoGame;
    private JTextField celeb;
    private JTextField character;
    private JTextField verb;
    private JTextField company;
    private JTextField weapon;
    private JTextField location;
    private JButton btnNewButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MadLibsDX window = new MadLibsDX();
                    window.frmMadlibDx.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MadLibsDX() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmMadlibDx = new JFrame();
        frmMadlibDx.getContentPane().setBackground(Color.WHITE);
        frmMadlibDx.setTitle("Mad-lib DX");
        frmMadlibDx.setBounds(100, 100, 536, 437);
        frmMadlibDx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMadlibDx.getContentPane().setLayout(null);

        JLabel text = new JLabel("Favorite year");
        text.setBounds(10, 0, 140, 14);
        frmMadlibDx.getContentPane().add(text);

        year = new JTextField();
        year.setBounds(10, 25, 86, 20);
        frmMadlibDx.getContentPane().add(year);
        year.setColumns(10);

        JLabel lblNewLabel = new JLabel("Your name");
        lblNewLabel.setBounds(149, 0, 86, 14);
        frmMadlibDx.getContentPane().add(lblNewLabel);

        name = new JTextField();
        name.setBounds(149, 25, 86, 20);
        frmMadlibDx.getContentPane().add(name);
        name.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("A town name");
        lblNewLabel_1.setBounds(260, 0, 95, 14);
        frmMadlibDx.getContentPane().add(lblNewLabel_1);

        town = new JTextField();
        town.setBounds(260, 25, 86, 20);
        frmMadlibDx.getContentPane().add(town);
        town.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Video game character");
        lblNewLabel_2.setBounds(378, 0, 132, 14);
        frmMadlibDx.getContentPane().add(lblNewLabel_2);

        videoGame = new JTextField();
        videoGame.setBounds(388, 25, 86, 20);
        frmMadlibDx.getContentPane().add(videoGame);
        videoGame.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Celebrity");
        lblNewLabel_3.setBounds(20, 56, 55, 14);
        frmMadlibDx.getContentPane().add(lblNewLabel_3);

        celeb = new JTextField();
        celeb.setBounds(10, 81, 86, 20);
        frmMadlibDx.getContentPane().add(celeb);
        celeb.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("Any character");
        lblNewLabel_4.setBounds(149, 56, 100, 14);
        frmMadlibDx.getContentPane().add(lblNewLabel_4);

        character = new JTextField();
        character.setBounds(150, 81, 86, 20);
        frmMadlibDx.getContentPane().add(character);
        character.setColumns(10);

        JLabel lblNewLabel_5 = new JLabel("\"ing\" verb");
        lblNewLabel_5.setBounds(273, 56, 63, 14);
        frmMadlibDx.getContentPane().add(lblNewLabel_5);

        verb = new JTextField();
        verb.setBounds(260, 81, 86, 20);
        frmMadlibDx.getContentPane().add(verb);
        verb.setColumns(10);

        JLabel lblNewLabel_6 = new JLabel("A company");
        lblNewLabel_6.setBounds(406, 56, 76, 14);
        frmMadlibDx.getContentPane().add(lblNewLabel_6);

        company = new JTextField();
        company.setBounds(388, 81, 86, 20);
        frmMadlibDx.getContentPane().add(company);
        company.setColumns(10);

        JLabel lblNewLabel_7 = new JLabel("Fictional weapon");
        lblNewLabel_7.setBounds(10, 118, 111, 14);
        frmMadlibDx.getContentPane().add(lblNewLabel_7);

        weapon = new JTextField();
        weapon.setBounds(10, 151, 86, 20);
        frmMadlibDx.getContentPane().add(weapon);
        weapon.setColumns(10);

        JLabel lblNewLabel_8 = new JLabel("A location");
        lblNewLabel_8.setBounds(406, 118, 68, 14);
        frmMadlibDx.getContentPane().add(lblNewLabel_8);

        location = new JTextField();
        location.setBounds(388, 151, 86, 20);
        frmMadlibDx.getContentPane().add(location);
        location.setColumns(10);

        JTextArea output = new JTextArea();
        output.setLineWrap(true);
        output.setBounds(10, 199, 500, 188);
        frmMadlibDx.getContentPane().add(output);

        btnNewButton = new JButton("Click here for mad-lib!");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                output.setText("The year is " + year.getText() + " it seems that in " + location.getText()
                        + ", all hope is lost."
                        + " But one brave hero decides to make people smile once again, " + name.getText()
                        + "! It's up to you!"
                        + " After " + name.getText() + " travels through the town of " + town.getText()
                        + " they meet up with two more "
                        + "heros, " + videoGame.getText() + " and " + celeb.getText() + ". Together the three "
                        + "heroes " + name.getText() + ", " + videoGame.getText() + " and, of course," + celeb.getText()
                        + " encounter"
                        + " the most fearsome foe " + character.getText() + "! After " + verb.getText()
                        + " them to the ground, they "
                        + "where defeated. After the defeat of " + character.getText() + " the three heroes take their"
                        + "weapon, " + weapon.getText() + "! With this they aproach the final boss, "
                        + company.getText() + ". Because "
                        + "of their newly obtained weapon our heroes defeat " + company.getText()
                        + " in one blow, \nsaving the "
                        + "land of " + location.getText() + " for good! The end.");
            }
        });
        btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        btnNewButton.setBounds(150, 150, 201, 23);
        frmMadlibDx.getContentPane().add(btnNewButton);

    }
}
