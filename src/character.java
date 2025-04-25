public class character {
   private String name;
   private int health;
   private int XP; 
   private String item;

   public character(String name, int health){
    this.name = name;
    this.health = health;
    this.XP = 0;
    this.item = "Cincin Pengikat Jiwa";
   }
   public void takeDamage(int damage) {
    this.health -= damage;
    if (this.health < 0) {
        this.health = 0;
    }
   }
   public void addXP(int additionalXP){
    this.XP += additionalXP; 
   }
   public String getName(){
    return name;
   }
   public int getHealth(){
    return health;
   }
   public int getXP(){
    return XP;
   }
   public String getItem(){
    return item;
   }
   // public void setItem(String item){
   //  this.item = item;
   // }
}
