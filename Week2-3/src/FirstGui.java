
import javax.swing.*;


public class FirstGui {

    public static void main(String[] args){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me!!");
        JLabel label = new JLabel("This Label");

        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("An Empty Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        frame.add(panel);
        panel.add(button);
        panel.add(label);



    }

}
