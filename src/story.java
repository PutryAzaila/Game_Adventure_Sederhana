import java.util.Scanner;

public class story {
    private scene startScene;
    private character player;
    private Scanner scanner;

    public story(scene startScene, character player){
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }
    public void start(){
        System.out.println("Petualangan Pemindah Jiwa Alchemy of Souls " + player.getName());
        System.out.println("Game dimulai. Ketik A, B, C >> membuat pilihan dan INFO untuk melihat status");
        play();
    }
    public void play(){
        scene currentScene = startScene;

        while (currentScene != null && !currentScene.endScene() && player.getHealth() > 0){
            currentScene.displayScene();
            
            System.out.println("Terpilih: ");
            String choice = scanner.nextLine().trim();
           
            if (choice.equalsIgnoreCase("INFO")) {
                displayPlayerInfo();
                continue;
            }
            
            scene nextScene = currentScene.makeChoice(choice, player);
            
            if (nextScene == null) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                continue;
            }
            
            currentScene = nextScene;

            if (player.getHealth() <= 0) {
                System.out.println(player.getName() + " telah kehabisan nyawa!");
                System.out.println(" GAME OVER ");
                break;
            }
         }
         if (currentScene != null && currentScene.endScene()) {
            currentScene.displayScene();
            displayFinalStats();
        }
        
        scanner.close();
    }
    private void displayPlayerInfo() {
        System.out.println("STATUS " + player.getName());
        System.out.println("Health: " + player.getHealth());
        System.out.println("XP: " + player.getXP());
        System.out.println("Item: " + player.getItem());
    }
    
    private void displayFinalStats() {
        System.out.println("Hasil Akhir");
        System.out.println("Nama: " + player.getName());
        System.out.println("Health: " + player.getHealth());
        System.out.println("XP Total: " + player.getXP());
        System.out.println("Item: " + player.getItem());
    }
}