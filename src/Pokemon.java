abstract class Pokemon{
    public final double maxHealth;
    protected double health;
    protected String name;

    public Pokemon(String name, double maxHealth){
        this.name = name;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
    }

    public double getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }

    public void eat(Berry berry){
        this.health += berry.getRestoreValue();
        if(this.health > this.maxHealth)
            this.health = this.maxHealth;
    }





    public void reducedHealth(double value){
        this.health -= value;
        if(this.health < 0)
            this.health = 0;
    }

    abstract public void move();

}
