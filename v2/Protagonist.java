public class Protagonist extends Character { //Not Tested
    public String name;
    
    public int initdefense;
    public double initattack;
    
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
