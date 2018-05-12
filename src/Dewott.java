public class Dewott extends Pokemon {
    private static final int maxGroupHealth = 400;
    private static final int maxHappy = 200;
    private static final int maxWeight = 200;
    public Dewott(){
        super("Dewott",
                (Math.random()*1000) % (maxGroupHealth+1),
                (Math.random()*1000) % (maxHappy+1),
                (Math.random()*1000) % (maxWeight+1),
                maxHappy,maxWeight);

    }
}
