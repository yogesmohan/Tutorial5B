import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJRadioButton extends JFrame implements ActionListener {

    JRadioButton my_button1 = new JRadioButton("Blue");
    JRadioButton my_button2 = new JRadioButton("Green");
    JRadioButton my_button3 = new JRadioButton("Red");
    JRadioButton my_button4 = new JRadioButton("Yellow");

    JLabel selection = new JLabel("You have selected: ");

    public MyJRadioButton() {
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());

        // Top panel
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel title = new JLabel(
            "Select your MOST favourite color:"
        );

        // Radio button panel
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        radioPanel.add(my_button1);
        radioPanel.add(my_button2);
        radioPanel.add(my_button3);
        radioPanel.add(my_button4);

        // Group radio buttons
        ButtonGroup btn_group = new ButtonGroup();
        btn_group.add(my_button1);
        btn_group.add(my_button2);
        btn_group.add(my_button3);
        btn_group.add(my_button4);

        // Register ActionListeners
        my_button1.addActionListener(this);
        my_button2.addActionListener(this);
        my_button3.addActionListener(this);
        my_button4.addActionListener(this);

        // Arrange top components
        JPanel headerPanel = new JPanel(
            new GridLayout(2, 1)
        );

        topPanel.add(title);
        headerPanel.add(topPanel);
        headerPanel.add(radioPanel);

        pane.add(headerPanel, BorderLayout.NORTH);

        // Bottom result panel
        JPanel bottomPanel = new JPanel(
            new FlowLayout(FlowLayout.CENTER)
        );

        bottomPanel.add(selection);
        pane.add(bottomPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        String input = "";

        if (my_button1.isSelected()) {
            input = my_button1.getText();
        } else if (my_button2.isSelected()) {
            input = my_button2.getText();
        } else if (my_button3.isSelected()) {
            input = my_button3.getText();
        } else if (my_button4.isSelected()) {
            input = my_button4.getText();
        }

        selection.setText("You have selected: " + input);
    }

    public static void main(String[] args) {
        MyJRadioButton frame = new MyJRadioButton();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Frame");
        frame.setSize(450, 220);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}