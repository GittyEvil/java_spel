
//importerar allt från swing me *
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;


public class Grafik extends JFrame {

    private JButton Button;
    private JLabel text;

    //constructor
    public Grafik() {
        this.setLayout(new GridLayout(2,3));
        text = new JLabel("hej på dig");
        Button = new JButton("Ta på mig");
        this.add(Button);
        this.add(text);
        this.setSize(1920, 1080);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }






}
