public class Tepig extends Pokemon {
    private static final int maxGroupHealth = 200;
    private static final int maxHappy = 100;
    private static final int maxWeight = 100;
    public Tepig(){
        super("Tepig",
                (Math.random()*1000) % (maxGroupHealth+1),
                (Math.random()*1000) % (maxHappy+1),
                (Math.random()*1000) % (maxWeight+1),
                maxHappy,maxWeight);

    }
}
