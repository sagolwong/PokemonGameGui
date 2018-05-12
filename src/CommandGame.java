import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CommandGame extends JFrame {
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    Container c = getContentPane();
    JPanel bg = new JPanel();
    JTextArea profile;
    Icon pokemonIcon;
    Random rand = new Random();
    public CommandGame(){
        super("POKEMON LABORATORY");

        //c.setLayout(new BorderLayout());
        bg.setLayout(new BorderLayout());

        pokemons.add(new Snivy());
        pokemons.add(new Tepig());
        pokemons.add(new Oshawott());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,500);
        setVisible(true);
    }
    public void startGame(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
       // p2.setLayout( new BoxLayout(p2, BoxLayout.Y_AXIS) );
        JButton startButton = new JButton("START");
        JButton quitButton = new JButton("QUIT");
        Icon logo = new ImageIcon(getClass().getResource("logostart.png"));
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
        JPanel p5 = new JPanel();
        p4.setLayout(new FlowLayout());
        Icon head = new ImageIcon(getClass().getResource("header1.png"));
        Icon snivy = new ImageIcon(getClass().getResource("Snivy.png"));
        Icon tepig = new ImageIcon(getClass().getResource("Tepig.png"));
        Icon oshawott = new ImageIcon(getClass().getResource("Oshawott.png"));
        JLabel header = new JLabel(head,JLabel.CENTER);
        JButton grassButton = new JButton(snivy);
        JButton fireButton = new JButton(tepig);
        JButton waterButton = new JButton(oshawott);
        JButton quitButton = new JButton("QUIT");
        grassButton.setIcon(snivy);
        fireButton.setIcon(tepig);
        waterButton.setIcon(oshawott);

        grassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bg.remove(p5);
                bg.remove(p4);
                bg.remove(quitButton);
                lab(snivy,"snivy");
            }
        });
        fireButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bg.remove(p5);
                bg.remove(p4);
                bg.remove(quitButton);
                lab(tepig,"tepig");
            }
        });
        waterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bg.remove(p5);
                bg.remove(p4);
                bg.remove(quitButton);
                lab(oshawott,"oshawott");
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });


        p1.add(grassButton);
        p2.add(fireButton);
        p3.add(waterButton);
        p4.add(p1);
        p4.add(p2);
        p4.add(p3);
        p5.add(header);
        bg.add(p5,BorderLayout.NORTH);
        bg.add(p4,BorderLayout.CENTER);
        bg.add(quitButton,BorderLayout.SOUTH);
        c.add(bg);

        pack();
        setVisible(true);
    }

    public void lab(Icon pokemonIcon,String namePokemon){
        this.pokemonIcon = pokemonIcon;
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();
        JPanel p9 = new JPanel();
        p5.setLayout(new FlowLayout());
        p6.setLayout(new BoxLayout(p6,BoxLayout.Y_AXIS));
        p7.setLayout(new FlowLayout());
        p8.setLayout(new FlowLayout());
        Icon head = new ImageIcon(getClass().getResource("header2.png"));
        JLabel header = new JLabel(head);
        JLabel iconPokemon = new JLabel(pokemonIcon);
        profile = new JTextArea("",10,6);
        JButton eatButton = new JButton("EAT");
        JButton giveToyButton = new JButton("GIVE TOY");
        JButton evolutionButton = new JButton("EVOLUTION");
        JButton backButton = new JButton("BACK");
        iconPokemon.setIcon(pokemonIcon);
        if(namePokemon.equals("snivy"))
            profile.setText(printProfile(pokemons,0));
        else if(namePokemon.equals("tepig"))
            profile.setText(printProfile(pokemons,1));
        else if(namePokemon.equals("oshawott"))
            profile.setText(printProfile(pokemons,2));

        eatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(namePokemon.equals("snivy"))
                    eat(0);
                else if(namePokemon.equals("tepig"))
                    eat(1);
                else if(namePokemon.equals("oshawott"))
                    eat(2);
            }
        });
        giveToyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(namePokemon.equals("snivy"))
                    giveToy(0);
                else if(namePokemon.equals("tepig"))
                    giveToy(1);
                else if(namePokemon.equals("oshawott"))
                    giveToy(2);
            }
        });
        evolutionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int check = 4;
                if(namePokemon.equals("snivy"))
                   check = evolution(0);
                else if(namePokemon.equals("tepig"))
                    check = evolution(1);
                else if(namePokemon.equals("oshawott"))
                    check = evolution(2);
                if((check>=0)&&(check<3)){
                    bg.remove(p9);
                    bg.remove(p7);
                    bg.remove(p8);
                    evolutionScene(check);
                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bg.remove(p9);
                bg.remove(p7);
                bg.remove(p8);
                selectPokemon();
            }
        });

        p1.add(eatButton); p2.add(giveToyButton); p3.add(evolutionButton); p4.add(backButton);
        p5.add(p1); p5.add(p2);
        p6.add(profile); p6.add(p5);
        p7.add(iconPokemon); p7.add(p6);
        p8.add(evolutionButton); p8.add(backButton);
        p9.add(header);
        bg.add(p9,BorderLayout.NORTH);
        bg.add(p7,BorderLayout.CENTER);
        bg.add(p8,BorderLayout.SOUTH);
        c.add(bg);
        pack();

        setVisible(true);
    }
    public String printProfile(ArrayList<Pokemon> pokemons,int num){
        String hp = " ======== Pokemon " + pokemons.get(num).getName()+ "======== \n"+"  Health: "+pokemons.get(num).getHealth()+
                "/"+pokemons.get(num).maxHealth;
        String weight = "\n  Weight: "+pokemons.get(num).getWeight()+"/100.0";
        String happy = "\n  Happy Value: "+pokemons.get(num).getHappy()+"/100.0 \n"+
                " ============================";
        return hp+weight+happy;
    }
    public void eat(int num){
        Berry berry = new Berry(rand.nextInt(3));
        pokemons.get(num).eat(berry);
        profile.setText(printProfile(pokemons,num));
    }
    public void giveToy(int num){
        ToyPokemon toyPokemon = new ToyPokemon(rand.nextInt(3));
        pokemons.get(num).happy(toyPokemon,num);
        profile.setText(printProfile(pokemons,num));
    }
    public int evolution(int num){
        if((pokemons.get(num).getHappy()==100)&&(pokemons.get(num).getWeight()==100))
            return num;
        return 4;
    }
    public void evolutionScene(int num){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        Icon head = new ImageIcon(getClass().getResource("header3.png"));
        Icon servine = new ImageIcon(getClass().getResource("Servine.png"));
        Icon pignite = new ImageIcon(getClass().getResource("Pignite.png"));
        Icon dewott = new ImageIcon(getClass().getResource("Dewott.png"));
        JLabel header = new JLabel(head,JLabel.CENTER);
        JButton keepButton = new JButton("KEEP");
        JLabel icon = new JLabel("",JLabel.CENTER);

        if(num == 0)
            icon.setIcon(servine);
        else if(num == 1)
            icon.setIcon(pignite);
        else if(num == 2)
            icon.setIcon(dewott);

        keepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bg.remove(p2);
                bg.remove(icon);
                bg.remove(p1);
                selectPokemon();
            }
        });


        p1.add(keepButton);
        p2.add(header);
        bg.add(p2,BorderLayout.NORTH);
        bg.add(icon,BorderLayout.CENTER);
        bg.add(p1,BorderLayout.SOUTH);
        c.add(bg);

        setVisible(true);
    }
}
