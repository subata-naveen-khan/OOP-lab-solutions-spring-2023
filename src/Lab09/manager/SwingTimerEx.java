package Lab09.manager;

import java.awt.EventQueue;
import javax.swing.JFrame;

import Lab09.components.*;

public class SwingTimerEx extends JFrame {

    public SwingTimerEx() {
        initUI();
    }

    private void initUI() {
        add(new Board());
        setResizable(false);
        pack();
        setTitle("Java Painter");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SwingTimerEx ex = new SwingTimerEx();
            ex.setVisible(true);
        });
    }
}