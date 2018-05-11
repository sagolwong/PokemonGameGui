public class Oshawott extends Pokemon {
    private static final int maxGroupHealth = 200;
    private static final int maxGroupHappy = 100;
    private static final int maxGroupWeight = 100;
    public Oshawott(){
        super("Snivy",
                (Math.random()*1000) % (maxGroupHealth+1),
                (Math.random()*1000) % (maxGroupHappy+1),
                (Math.random()*1000) % (maxGroupWeight+1));

    }
}
