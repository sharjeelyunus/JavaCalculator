import javax.swing.*;

public class JavaCalculator {
    private JPanel JavaCalculator;
    private JTextField textField1;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnThree;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnPlus;
    private JButton btnDivide;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnEquals;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
