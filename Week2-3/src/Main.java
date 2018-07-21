//**************************************************************************************************
// CLASS: Main
//**************************************************************************************************
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import javax.swing.border.Border;

import static java.awt.BorderLayout.*;

public class Main {

    public static void main(String[] pArgs) {
        new Main().run();
    }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        View theView = new View();
    }

}
