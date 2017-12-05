public class Protagonist extends Character {
    public String name;
    
    public int initdefense;
    public double initattack;
    
    public Protagonist (String input) {
        name = input;
        health = 125;
        strength = 100;
        defense = initdefense = 40;
        attack = initattack = 0.4;
    }
    
    public String getName(){ return name; }
    
    public int special = 5;
    public void specialize(){
        defense -= special;
        attack += special;
    }
    
    public void normalize(){
        defense = initdefense;
        attack = initattack;
    }
}