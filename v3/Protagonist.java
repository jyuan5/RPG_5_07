public abstract class Protagonist extends Character { 
    public String name;
    
    public int initdefense;
    public double initattack;

/*    public Protagonist (String input) {
        name = input;
        health = 125;
        strength = 100;
        defense = initdefense = 40;
        attackRate = initattack = 0.4;
    }*/
    
    public abstract String toString ();
    
    public String getName(){ return name; }
    
    public int special = 5;
    public void specialize(){
        defense -= special;
        attackRate += special;
    }
    
    public void normalize(){
        defense = initdefense;
        attackRate = initattack;
    }
}

//.\Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist

// Tested with instantiation:
// TesterClass.java:3: error: Protagonist is abstract; cannot be instantiated

// If we attempt to compile a subclass without a toString():
// Warrior.java:1: error: Warrior is not abstract and does not override abstract method toString() in Protagonist