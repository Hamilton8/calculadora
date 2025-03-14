package vision.application;

import javax.swing.*;

public class Calculator extends JFrame {
    public Calculator(){
        organizeLayout();
        setSize(232,322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizeLayout() {
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
