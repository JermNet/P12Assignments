package Notes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultiFrameDemo {

    private JFrame frame, frame2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MultiFrameDemo window = new MultiFrameDemo();
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
    public MultiFrameDemo() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame2 = new JFrame();
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Click Me!");
        btnNewButton.setBounds(159, 92, 89, 23);
        frame.getContentPane().add(btnNewButton);

        JButton button2 = new JButton("New button");
        button2.setBounds(10, 200, 89, 23);
        frame2.getContentPane().add(button2);

        frame2.setBounds(400, 400, 600, 200);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(true);
            }
        });
    }
}
