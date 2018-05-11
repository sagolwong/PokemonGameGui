public class Snivy extends Pokemon  {
    private static final int maxGroupHealth = 200;
    public Snivy(){
        super("Snivy",
                (Math.random()*1000) % (maxGroupHealth+1));

    }

}
