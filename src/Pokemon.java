 class Pokemon{
    public final double maxHealth;
    protected double health;
    protected double happyValue;
    protected double weight;
    protected String name;

    public Pokemon(String name, double maxHealth, double happyValue, double weight){
        this.name = name;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.happyValue = happyValue;
        this.weight = weight;
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
        if(this.weight > 100)
            this.weight = 100;
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
            reducedHappy(toyPokemon.getHappyValue());
        if(num == 1 && toyPokemon.getName().equals("Bait"))
            reducedHappy(toyPokemon.getHappyValue());
        if(num == 2 && toyPokemon.getName().equals("Ball"))
            reducedHappy(toyPokemon.getHappyValue());
        this.happyValue += toyPokemon.getHappyValue();

    }
    public void reducedHappy(double value){
        this.happyValue -= value;
        if(this.happyValue < 0)
            this.happyValue = 0;
    }

    //abstract public void move();

}
