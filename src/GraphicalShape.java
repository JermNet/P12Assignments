/**This program is meant to show the use of radio buttons, check boxes and button groups
 *
 * @author jwhitenect
 *
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class GraphicalShape {

    private JFrame frmShapinItUp;
    private ButtonGroup shapeOption;
    private JTextField radiusField;
    private JTextField lengthField;
    private JTextField widthField;
    private JTextField heightField;
    private JTextField radiusField2;
    private JTextField heightField2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GraphicalShape window = new GraphicalShape();
                    window.frmShapinItUp.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GraphicalShape() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frmShapinItUp = new JFrame();
        frmShapinItUp.setTitle("Shapin' it up");
        frmShapinItUp.setBounds(100, 100, 559, 390);
        frmShapinItUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea output = new JTextArea();
        output.setBounds(66, 254, 412, 86);
        output.setEditable(false);
        output.setLineWrap(true);
        frmShapinItUp.getContentPane().add(output);

        JLabel radius = new JLabel("Radius");
        radius.setBounds(472, 11, 46, 14);
        frmShapinItUp.getContentPane().add(radius);
        radius.setVisible(false);

        radiusField = new JTextField();
        radiusField.setBounds(447, 36, 86, 20);
        frmShapinItUp.getContentPane().add(radiusField);
        radiusField.setColumns(10);
        radiusField.setVisible(false);

        JLabel length = new JLabel("Length");
        length.setBounds(371, 11, 46, 14);
        frmShapinItUp.getContentPane().add(length);
        length.setVisible(false);

        lengthField = new JTextField();
        lengthField.setBounds(344, 36, 86, 20);
        frmShapinItUp.getContentPane().add(lengthField);
        lengthField.setColumns(10);
        lengthField.setVisible(false);

        JLabel width = new JLabel("Width");
        width.setBounds(371, 69, 46, 14);
        frmShapinItUp.getContentPane().add(width);
        width.setVisible(false);

        widthField = new JTextField();
        widthField.setBounds(344, 94, 86, 20);
        frmShapinItUp.getContentPane().add(widthField);
        widthField.setColumns(10);
        widthField.setVisible(false);

        JLabel height = new JLabel("Height");
        height.setBounds(371, 132, 46, 14);
        frmShapinItUp.getContentPane().add(height);
        height.setVisible(false);

        heightField = new JTextField();
        heightField.setBounds(344, 157, 86, 20);
        frmShapinItUp.getContentPane().add(heightField);
        heightField.setColumns(10);
        heightField.setVisible(false);

        JLabel radius2 = new JLabel("Radius");
        radius2.setBounds(248, 11, 46, 14);
        frmShapinItUp.getContentPane().add(radius2);
        radius2.setVisible(false);

        radiusField2 = new JTextField();
        radiusField2.setBounds(225, 36, 86, 20);
        frmShapinItUp.getContentPane().add(radiusField2);
        radiusField2.setColumns(10);
        radiusField2.setVisible(false);

        JLabel height2 = new JLabel("Height");
        height2.setBounds(248, 69, 46, 14);
        frmShapinItUp.getContentPane().add(height2);
        height2.setVisible(false);

        heightField2 = new JTextField();
        heightField2.setBounds(225, 94, 86, 20);
        frmShapinItUp.getContentPane().add(heightField2);
        heightField2.setColumns(10);
        heightField2.setVisible(false);

        JRadioButton radioSphere = new JRadioButton("Sphere");
        radioSphere.setBounds(6, 7, 109, 23);
        radioSphere.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                radius.setVisible(true);
                radiusField.setVisible(true);
                length.setVisible(false);
                lengthField.setVisible(false);
                width.setVisible(false);
                widthField.setVisible(false);
                height.setVisible(false);
                heightField.setVisible(false);
                radius2.setVisible(false);
                radiusField2.setVisible(false);
                height2.setVisible(false);
                heightField2.setVisible(false);

            }
        });

        JRadioButton radioPyramid = new JRadioButton("Rectangular pyramid");
        radioPyramid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                radius.setVisible(false);
                radiusField.setVisible(false);
                length.setVisible(true);
                lengthField.setVisible(true);
                width.setVisible(true);
                widthField.setVisible(true);
                height.setVisible(true);
                heightField.setVisible(true);
                radius2.setVisible(false);
                radiusField2.setVisible(false);
                height2.setVisible(false);
                heightField2.setVisible(false);
            }
        });
        radioPyramid.setBounds(6, 65, 156, 23);
        frmShapinItUp.getContentPane().add(radioPyramid);

        frmShapinItUp.getContentPane().setLayout(null);
        frmShapinItUp.getContentPane().add(radioSphere);

        shapeOption = new ButtonGroup();

        JRadioButton radioC = new JRadioButton("Cylinder");
        radioC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                radius.setVisible(false);
                radiusField.setVisible(false);
                length.setVisible(false);
                lengthField.setVisible(false);
                width.setVisible(false);
                widthField.setVisible(false);
                height.setVisible(false);
                heightField.setVisible(false);
                radius2.setVisible(true);
                radiusField2.setVisible(true);
                height2.setVisible(true);
                heightField2.setVisible(true);
            }
        });
        radioC.setBounds(6, 128, 109, 23);
        frmShapinItUp.getContentPane().add(radioC);

        shapeOption.add(radioC);
        shapeOption.add(radioPyramid);
        shapeOption.add(radioSphere);

        JCheckBox area = new JCheckBox("Area");
        area.setBounds(6, 175, 97, 23);
        frmShapinItUp.getContentPane().add(area);

        JCheckBox volume = new JCheckBox("Volume");
        volume.setBounds(6, 220, 97, 23);
        frmShapinItUp.getContentPane().add(volume);

        JButton btnNewButton = new JButton("Calculate!");
        btnNewButton.setBounds(205, 220, 106, 23);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioSphere.isSelected()) {
                    if (area.isSelected() && volume.isSelected()) {
                        output.setText(
                                "The radius you chose was " + radiusField.getText() + ". So your surface area is "
                                        + Double.parseDouble(radiusField.getText())
                                        * Double.parseDouble(radiusField.getText()) * 4 * Math.PI
                                        + "."
                                        + " And your volume is "
                                        + 1.33333333333 * Double.parseDouble(radiusField.getText())
                                        * Double.parseDouble(radiusField.getText())
                                        * Double.parseDouble(radiusField.getText()) * Math.PI);
                    } else if (area.isSelected()) {
                        output.setText("The radius you chose was " + radiusField.getText() + ". So your"
                                + " surface area is " + Double.parseDouble(radiusField.getText())
                                * Double.parseDouble(radiusField.getText()) * 4 * Math.PI);
                    } else if (volume.isSelected()) {
                        output.setText("The radius you chose was " + radiusField.getText() + ". So your volume is "
                                + ""
                                + 1.33333333333 * Double.parseDouble(radiusField.getText())
                                * Double.parseDouble(radiusField.getText())
                                * Double.parseDouble(radiusField.getText()) * Math.PI);
                    } else {
                        output.setText("You didn't select area or volume.");
                    }
                } else if (radioPyramid.isSelected()) {
                    if (area.isSelected() && volume.isSelected()) {
                        output.setText("Your length, width and height are " + lengthField.getText() + ", "
                                + widthField.getText() + " and " + heightField.getText() + "."
                                + " So your surface area is "
                                + (Double.parseDouble(lengthField.getText()) * Double.parseDouble(widthField.getText())
                                + (1 * Math.pow(Double.parseDouble(widthField.getText()),
                                2 * Double.parseDouble(widthField.getText()) * 0.5))
                                + (Double.parseDouble(heightField.getText())
                                * Double.parseDouble(heightField.getText()) * 0.5) * 0.5)
                                + (Double.parseDouble(widthField.getText())
                                * (Double.parseDouble(lengthField.getText())
                                * Double.parseDouble(lengthField.getText()) * 0.5)
                                + Double.parseDouble(heightField.getText())
                                * Double.parseDouble(heightField.getText()) * 0.5)
                                + "."
                                + " And your volume is "
                                + (Double.parseDouble(lengthField.getText()) * Double.parseDouble(widthField.getText())
                                * Double.parseDouble(heightField.getText()) / 3));
                    } else if (area.isSelected()) {
                        output.setText("Your length, width and height are " + lengthField.getText() + ", "
                                + widthField.getText() + " and " + heightField.getText() + "."
                                + " So your surface area is "
                                + (Double.parseDouble(lengthField.getText()) * Double.parseDouble(widthField.getText())
                                + (1 * Math.pow(Double.parseDouble(widthField.getText()),
                                2 * Double.parseDouble(widthField.getText()) * 0.5))
                                + (Double.parseDouble(heightField.getText())
                                * Double.parseDouble(heightField.getText()) * 0.5) * 0.5)
                                + (Double.parseDouble(widthField.getText())
                                * (Double.parseDouble(lengthField.getText())
                                * Double.parseDouble(lengthField.getText()) * 0.5)
                                + Double.parseDouble(heightField.getText())
                                * Double.parseDouble(heightField.getText()) * 0.5));
                    } else if (volume.isSelected()) {
                        output.setText("Your length, width and height are " + lengthField.getText() + ", "
                                + widthField.getText() + " and " + heightField.getText() + "."
                                + " So your volume is "
                                + (Double.parseDouble(lengthField.getText()) * Double.parseDouble(widthField.getText())
                                * Double.parseDouble(heightField.getText()) / 3));
                    } else {
                        output.setText("You didn't select area or volume.");
                    }
                } else if (radioC.isSelected()) {
                    if (area.isSelected() && volume.isSelected()) {
                        output.setText("Your radius and height are " + radiusField2.getText() + " and "
                                + heightField2.getText() + ". "
                                + "So your surface is area is "
                                + (2 * Math.PI * Double.parseDouble(radiusField2.getText())
                                * Double.parseDouble(heightField2.getText())
                                + (2 * Math.PI * Double.parseDouble(radiusField2.getText())
                                * Double.parseDouble(radiusField.getText()))
                                + "."
                                + " And your volume is "
                                + Math.PI * Double.parseDouble(radiusField2.getText())
                                * Double.parseDouble(radiusField2.getText())
                                * Double.parseDouble(heightField2.getText())));
                    } else if (area.isSelected()) {
                        output.setText("Your radius and height are " + radiusField2.getText() + " and "
                                + heightField2.getText() + ". "
                                + "So your surface is area is "
                                + (2 * Math.PI * Double.parseDouble(radiusField2.getText())
                                * Double.parseDouble(heightField2.getText())
                                + (2 * Math.PI * Double.parseDouble(radiusField2.getText())
                                * Double.parseDouble(radiusField.getText()))
                                + "."));
                    } else if (volume.isSelected()) {
                        output.setText("Your radius and height are " + radiusField2.getText() + " and "
                                + heightField2.getText() + ". "
                                + "So your volume is "
                                + Math.PI * Double.parseDouble(radiusField2.getText())
                                * Double.parseDouble(radiusField2.getText())
                                * Double.parseDouble(heightField2.getText()));
                    } else {
                        output.setText("You didn't select area or volume.");
                    }
                } else {
                    output.setText("You didn't select a shape.");
                }
            }
        });
        frmShapinItUp.getContentPane().add(btnNewButton);

    }
}