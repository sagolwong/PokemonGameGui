import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CommandGame extends JFrame {
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    Container c = getContentPane();
    JPanel bg = new JPanel();
    Icon pokemonIcon;
    JComboBox select;
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
                selectPokemon();
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
    public void selectPokemon(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        JLabel text = new JLabel("Select Pokemon",JLabel.CENTER);
        Icon snivy = new ImageIcon(getClass().getResource("Snivy.png"));
        Icon tepig = new ImageIcon(getClass().getResource("Tepig.png"));
        Icon oshawott = new ImageIcon(getClass().getResource("Oshawott.png"));
        JButton grassButton = new JButton(snivy);
        JButton fireButton = new JButton(tepig);
        JButton waterButton = new JButton(oshawott);
        grassButton.setIcon(snivy);
        fireButton.setIcon(tepig);
        waterButton.setIcon(oshawott);

        grassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bg.remove(text);
                bg.remove(p3);
                lab(snivy);
            }
        });
        fireButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bg.remove(text);
                bg.remove(p3);
                lab(tepig);
            }
        });
        waterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bg.remove(text);
                bg.remove(p3);
                lab(oshawott);
            }
        });

        p4.setBackground(Color.GRAY);
        p1.add(grassButton);
        p2.add(fireButton);
        p3.add(waterButton);
        p4.add(p1);
        p4.add(p2);
        p4.add(p3);
        bg.add(text,BorderLayout.NORTH);
        bg.add(p4,BorderLayout.CENTER);
        c.add(bg);

        setVisible(true);
    }
    /*public void wantScene(Icon player){
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
        JLabel dialog = new JLabel("");
        dialog.setIcon(dialogtext);
        img.setIcon(player);

        shopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        wildButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        farmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

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
    }*/
    public void lab(Icon pokemonIcon){
        this.pokemonIcon = pokemonIcon;
        JLabel text = new JLabel("LABORATORY",JLabel.CENTER);
        JLabel iconPokemon = new JLabel(pokemonIcon);



    }
}
