package Notes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class GraphicsDemo {

    private JFrame frmThisIsA;
    private JTextField lengthBox;
    private JTextField heightBox;
    private JTextField widthBox;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GraphicsDemo window = new GraphicsDemo();
                    window.frmThisIsA.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GraphicsDemo() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmThisIsA = new JFrame();
        frmThisIsA.setTitle("Shape Calculator");
        frmThisIsA.setBounds(100, 100, 450, 300);
        frmThisIsA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmThisIsA.getContentPane().setLayout(null);

        JLabel length = new JLabel("Length");
        length.setBounds(128, 27, 89, 14);
        frmThisIsA.getContentPane().add(length);

        lengthBox = new JTextField();
        lengthBox.setBounds(106, 52, 86, 20);
        frmThisIsA.getContentPane().add(lengthBox);
        lengthBox.setColumns(10);

        JLabel Height = new JLabel("Height");
        Height.setBounds(128, 83, 120, 14);
        frmThisIsA.getContentPane().add(Height);

        heightBox = new JTextField();
        heightBox.setBounds(106, 108, 86, 20);
        frmThisIsA.getContentPane().add(heightBox);
        heightBox.setColumns(10);

        JLabel outputLabel = new JLabel("");
        outputLabel.setBounds(106, 207, 161, 14);
        frmThisIsA.getContentPane().add(outputLabel);

        widthBox = new JTextField();
        widthBox.setBounds(229, 52, 86, 20);
        frmThisIsA.getContentPane().add(widthBox);
        widthBox.setColumns(10);

        JLabel width = new JLabel("Width");
        width.setBounds(255, 27, 71, 14);
        frmThisIsA.getContentPane().add(width);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 152, 296, 69);
        frmThisIsA.getContentPane().add(textArea);

        JButton btnNewButton = new JButton("Calculate");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double length = Double.parseDouble(lengthBox.getText());
                double width = Double.parseDouble(widthBox.getText());
                double height = Double.parseDouble(heightBox.getText());

                textArea.setText("The volume is: ");
            }
        });
        btnNewButton.setBounds(226, 107, 89, 23);
        frmThisIsA.getContentPane().add(btnNewButton);

    }
}
