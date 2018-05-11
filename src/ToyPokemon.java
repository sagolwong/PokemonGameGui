public class ToyPokemon {
    private String name;
    private float happyValue;
    private int type;

    public ToyPokemon(int type){
        this.type = type;
        switch(type){
            case 0: this.name = "Ball";
                this.happyValue = 25;
                break;
            case 1: this.name = "Bait";
                this.happyValue = 15;
                break;
            case 2: this.name = "Bone";
                this.happyValue = 35;
                break;
        }

    }

    public String getName(){
        return this.name;
    }

    public float getHappyValue(){
        return this.happyValue;
    }
}
