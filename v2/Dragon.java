public class Dragon extends Monster {
    //constructor
    public Dragon() {
	health = 150;
	strength = (int) (Math.random() * 45 + 20);
	defense = 75;
	attackRate = 1;
    }
}
