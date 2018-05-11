public class Oshawott extends Pokemon {
    private static final int maxGroupHealth = 200;
    public Oshawott(){
        super("Snivy",
                (Math.random()*1000) % (maxGroupHealth+1));

    }
}
