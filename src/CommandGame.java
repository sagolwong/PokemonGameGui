import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CommandGame extends JFrame {
    Container c = getContentPane();
    JPanel bg = new JPanel();
    public CommandGame(){
        super("POKEMON(demo)");

        //c.setLayout(new BorderLayout());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,700);
        setVisible(true);
    }
    public void startGame(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
       // p2.setLayout( new BoxLayout(p2, BoxLayout.Y_AXIS) );
        JButton startButton = new JButton("START");
        JButton quitButton = new JButton("QUIT");
        Icon logo = new ImageIcon(getClass().getResource("logo.png"));
        JLabel logoIcon = new JLabel("");
        logoIcon.setIcon(logo);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.remove(logoIcon);
                p2.remove(startButton);
                c.remove(p1);
                c.remove(p2);
                selectGender();
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });

        p1.add(logoIcon);
        p2.add(startButton);
        p2.add(quitButton);
        c.add(p1,BorderLayout.NORTH);
        c.add(p2,BorderLayout.CENTER);


        setVisible(true);
    }
    public void selectGender(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        bg.setLayout(new BorderLayout());
        JPanel bg2 = new JPanel();
        bg2.setLayout(new FlowLayout());
        JLabel text = new JLabel("Select Gender");
        Icon man = new ImageIcon(getClass().getResource("man.png"));
        Icon girl = new ImageIcon(getClass().getResource("girl.png"));
        JButton manButton = new JButton(man);
        JButton girlButton = new JButton(girl);
        manButton.setIcon(man);
        girlButton.setIcon(girl);

        manButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        girlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        text.setHorizontalAlignment ( SwingConstants.CENTER );
        p1.add(manButton);
        p2.add(girlButton);
        bg2.add(p1);
        bg2.add(p2);
        bg.add(text,BorderLayout.NORTH);
        bg.add(bg2,BorderLayout.CENTER);
        c.add(bg);

        setVisible(true);
    }
}
