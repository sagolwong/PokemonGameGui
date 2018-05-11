import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CommandGame extends JFrame {
    Container c = getContentPane();
    JPanel bg = new JPanel();
    Icon player;
    public CommandGame(){
        super("POKEMON(demo)");

        //c.setLayout(new BorderLayout());
        bg.setLayout(new BorderLayout());

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
                p2.remove(quitButton);
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
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
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
                bg.remove(text);
                bg.remove(p3);
                wantScene(man);
            }
        });
        girlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bg.remove(text);
                bg.remove(p3);
                wantScene(girl);
            }
        });

        text.setHorizontalAlignment ( SwingConstants.CENTER );
        p3.setBackground(Color.GRAY);
        p1.add(manButton);
        p2.add(girlButton);
        p3.add(p1);
        p3.add(p2);
        bg.add(text,BorderLayout.NORTH);
        bg.add(p3,BorderLayout.CENTER);
        c.add(bg);

        setVisible(true);
    }
    public void wantScene(Icon player){
        this.player = player;
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JLabel img = new JLabel(player);
        p2.setLayout(new FlowLayout());
        p3.setLayout(new BoxLayout(p3,BoxLayout.Y_AXIS));
        Icon dialogtext = new ImageIcon(getClass().getResource(""));
        JButton shopButton = new JButton("SHOP");
        JButton wildButton = new JButton("WILD");
        JButton farmButton = new JButton("FARM");
        JLabel dialog = new JLabel(dialogtext);
        dialog.setIcon(dialogtext);
        img.setIcon(player);

        p1.add(img);
        p3.add(shopButton);
        p3.add(wildButton);
        p3.add(farmButton);
        p2.add(p1);
        p2.add(p3);
        bg.add(p2, BorderLayout.CENTER);
        bg.add(dialog,BorderLayout.SOUTH);
        c.add(bg);

        setVisible(true);
    }
}
