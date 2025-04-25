public class scene {
    private String description;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private scene nextSceneA;
    private scene nextSceneB;
    private scene nextSceneC;
    private int damageA;
    private int damageB;
    private int damageC;
    private int XPA;
    private int XPB;
    private int XPC;
    private boolean endScene;
    
    public scene (String description, String choiceA, scene nextSceneA, int damageA, int XPA, String choiceB, scene nextSceneB, int damageB, int XPB, String choiceC, scene nextSceneC, int damageC,int XPC){
        this.description = description;
        this.choiceA = choiceA;
        this.nextSceneA = nextSceneA;
        this.damageA = damageA;
        this.XPA = XPA;
        this.choiceB = choiceB;
        this.nextSceneB = nextSceneB;
        this.XPB = XPB;
        this.choiceC = choiceC;
        this.nextSceneC = nextSceneC;
        this.damageC = damageC;
        this.XPC = XPC;
        this.endScene = false;

    }
    public scene(String description){
        this.description = description;
        this.endScene = true;
    }
    public void displayScene(){
        System.out.println(description);
        if(!endScene){
            System.out.println("Pilihan :");
            System.out.println(" A " + choiceA);
            System.out.println(" B " + choiceB);
            System.out.println(" C " + choiceC);
            System.out.println("INFO >> Status Karakter ");
        } else {
            System.out.println("GAME OVER!!");
        }
    }
    public scene makeChoice(String choice, character player){
        choice = choice.toUpperCase();

        switch (choice){
            case "A":
                System.out.println(" Memilih: " + choiceA);
                player.takeDamage(damageA);
                player.addXP(XPA);
                if (damageA > 0){ 
                    System.out.println(" Berhasil menerima " + damageA + "damage!");
                }
                if (XPA > 0){
                    System.out.println(" Berhasil mendapatkan " + XPA + "XP");
                }
                return nextSceneA;
            case "B":
                System.out.println(" Memilih: " + choiceB);
                player.takeDamage(damageB);
                player.addXP(XPB);
                if (damageB > 0){ 
                    System.out.println(" Berhasil menerima " + damageB + "damage!");
                }
                if (XPB > 0){
                    System.out.println(" Berhasil mendapatkan " + XPB + "XP");
                }
                return nextSceneB;
            case "C":
                System.out.println("Memilih:" + choiceC);
                player.takeDamage(damageC);
                player.addXP(XPC);
                if (damageC > 0){ 
                    System.out.println(" Berhasil menerima " + damageC + "damage!");
                }
                if (XPC > 0){
                    System.out.println(" Berhasil mendapatkan " + XPA + "XP");
                }
                return nextSceneC;
            default:
            return null;
        }
    }
    public boolean endScene(){
        return endScene;
    }
}
