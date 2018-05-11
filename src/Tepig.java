public class Tepig extends Pokemon {
    private static final int maxGroupHealth = 200;
    public Tepig(){
        super("Snivy",
                (Math.random()*1000) % (maxGroupHealth+1));

    }
}
