package Notes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buttons {

    private JFrame frame;
    private ButtonGroup optionRadio;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Buttons window = new Buttons();
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
    public Buttons() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JRadioButton rdOne = new JRadioButton("Yes");
        rdOne.setSelected(true);
        rdOne.setBounds(6, 7, 109, 23);
        frame.getContentPane().add(rdOne);

        JRadioButton rdTwo = new JRadioButton("No");
        rdTwo.setBounds(6, 62, 109, 23);
        frame.getContentPane().add(rdTwo);

        JRadioButton rdThree = new JRadioButton("Maybe");
        rdThree.setBounds(6, 118, 109, 23);
        frame.getContentPane().add(rdThree);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(108, 11, 183, 149);
        frame.getContentPane().add(textArea);

        JCheckBox boxOne = new JCheckBox("New check box");
        boxOne.setBounds(6, 176, 97, 23);
        frame.getContentPane().add(boxOne);

        JCheckBox boxTwo = new JCheckBox("New check box");
        boxTwo.setBounds(6, 231, 97, 23);
        frame.getContentPane().add(boxTwo);

        JButton btnNewButton = new JButton("New button");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdOne.isSelected()) {
                    textArea.setText("Yes.");
                } else if (rdTwo.isSelected()) {
                    textArea.setText("No.");
                } else if (rdThree.isSelected()) {
                    textArea.setText("Maybe.");
                }
                if (boxOne.isSelected()) {
                    textArea.setText("Hey");
                }

            }
        });
        btnNewButton.setBounds(317, 118, 89, 23);
        frame.getContentPane().add(btnNewButton);

        optionRadio = new ButtonGroup();

        optionRadio.add(rdOne);
        optionRadio.add(rdTwo);
        optionRadio.add(rdThree);

    }
}
