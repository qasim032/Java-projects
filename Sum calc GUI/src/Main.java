import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sum Calculator");
        JTextField num1 = new JTextField(), num2 = new JTextField();
        JButton addButton = new JButton("Calculate");
        JLabel result = new JLabel("Result: ");
        addButton.addActionListener(e -> result.setText("Result: " + (Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText()))));
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        for (JComponent c : new JComponent[]{num1, num2, addButton, result}) frame.add(c);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
