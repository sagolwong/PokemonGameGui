 class Pokemon{
    public final double maxHealth;
    public final double maxHappy;
    public final double maxWeight;
    protected int health;
    protected int happyValue;
    protected int weight;
    protected String name;

    public Pokemon(String name, double maxHealth, double happyValue, double weight,int maxHappy,int maxWeight){
        this.name = name;
        this.health = (int)maxHealth;
        this.maxHealth = (int)maxHealth;
        this.happyValue = (int)happyValue;
        this.maxHappy = maxHappy;
        this.weight = (int)weight;
        this.maxWeight = maxWeight;
    }

    public double getHealth(){
        return this.health;
    }
    public double getHappy(){ return this.happyValue; }
    public double getWeight(){ return this.weight; }
    public String getName(){ return this.name; }

    public void eat(Berry berry){
        this.health += berry.getRestoreValue();
        this.weight += berry.getRestoreValue();
        if(this.weight > maxWeight)
            this.weight = (int)maxWeight;
        if(this.health > this.maxHealth)
            reducedHealth(berry.getRestoreValue());
    }

    public void reducedHealth(double value){
        this.health -= value;
        if(this.health < 0)
            this.health = 0;
    }
    public void happy(ToyPokemon toyPokemon,int num){
        if(num == 0 && toyPokemon.getName().equals("Bone"))
            reducedHappy(11);
        if(num == 1 && toyPokemon.getName().equals("Bait"))
            reducedHappy(15);
        if(num == 2 && toyPokemon.getName().equals("Ball"))
            reducedHappy(13);
        this.happyValue += toyPokemon.getHappyValue();
        if(happyValue > maxHappy)
            this.happyValue = (int)maxHappy;

    }
    public void reducedHappy(int value){
        this.happyValue -= value;
        if(this.happyValue < 0)
            this.happyValue = 0;
    }

    //abstract public void move();

}
