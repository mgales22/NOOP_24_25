package pckg_mvc_1;

import pckg_mvc_1.view.MainFrame;

import javax.swing.*;

public class TestApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });
    }
}
