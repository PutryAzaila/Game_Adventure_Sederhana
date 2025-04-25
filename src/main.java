import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PETUALANGAN GAME PEMINDAH JIWA ");
        System.out.println("Selamat datang di game petualangan pemindah jiwa dengan teks");
        System.out.print("Masukkan nama karakter: ");
        String playerName = scanner.nextLine();
        
        character player = new character(playerName, 100);

        scene endingSuccess = new scene(
            "Dengan Cincin Pengikat Jiwa yang kamu temukan, kamu berhasil kembali ke tubuh aslimu." 
             +"SELAMAT, Kamu berhasil mengembalikan jiwa."
        );
        
        scene endingDeath = new scene(
            "Saat mencoba melawan tanpa kekuatan artefak, serangan sihir yang kuat langsung mengenaimu, kamu tidak sadarkan diri" +
            "Tidak ada yang tersisa kecuali bisikan roh dan energi yang perlahan-lahan menghilang dari dunia ini." +
            "GAME OVER: Jiwamu hilang untuk selamanya."
        );

        scene endingTengah = new scene(
            "Kamu tidak bisa kembali ke dalam tubuh aslimu."
        );
        scene scene10 = new scene(
            "Kamu memasuki ruang terlarang di puncak Istana Songrim. Energi dari Cincin Pengikat Jiwa mulai muncul.",
            "Gunakan Cincin Pengikat Jiwa untuk membuka portal pulang ke dalam tubuh", endingSuccess, 0, 100,
            "Serang penjaga ruang terlarang dengan sihir", endingDeath, 30, 60,
            "Lari keluar dari ruangan", endingTengah, 10, 20
        );
        scene scene9 = new scene(
            "Kamu tiba di ruangan tempat Cincin Pengikat Jiwa berada. Hati-hati terdapat jebakan.",
            "Ambil cincin langsung", scene10, 15, 50,
            "Tetap menggunakan sihir pelindung", scene10, 5, 40,
            "Amati sekitar dan menghilangkan jebakan", scene10, 10, 30
        );        
        scene scene8 = new scene(
            "Kamu berjalan melalui lorong gelap, semakin mendekati artefak, kekuatan semakin terasa.",
            "Gunakan insting untuk mengarahkan jalan", scene9, 15, 20,
            "Percaya pada sihir pelindung", scene9, 5, 30,
            "Berjalan perlahan mengikuti suara yang terdengar", scene9, 10, 25
        );
        scene scene7 = new scene(
            "Gerbang Istana Songrim dilindungi oleh mantra sihir yang kuat.",
            "Gunakan sihir", scene8, 10, 30,
            "Cari jalan masuk rahasia", scene8, 5, 20,
            "Menunjukkan batu sebelumnya", scene8, 0, 25
        );
        scene scene6 = new scene(
            "Kamu menemukan ukiran di batu yang menunjuk ke Istana Songrim, tempat artefak di simpan dan di tutup.",
            "Pergi langsung ke Songrim", scene7, 10, 30,
            "Kumpulkan lebih banyak informasi", scene7, 5, 20,
            "Gunakan sihir untuk melihat masa lalu batu", scene7, 0, 25
        );
        scene scene5 = new scene(
            "Di tengah perjalanan, kamu melihat cahaya biru misterius. Menurut cerita, artefak itu bisa merespon jiwa yang bersih.",
            "Ikuti cahaya biru", scene6, 10, 30,
            "Cari jalan alternatif", scene6, 5, 20,
            "Panggil roh ", scene6, 0, 25
        );
        scene scene4 = new scene(
            "Kamu tiba di persimpangan jalan antara Hutan Roh dan Gunung, dua tempat yang konon berkaitan dengan artefak.",
            "Pergi ke Hutan Roh", scene5, 5, 20,
            "Pergi ke gunung", scene5, 10, 15,
            "Kembali dan bertanya ke penduduk desa terdekat", scene5, 0, 10
        );
        scene scene3 = new scene(
            "Guru Jin menjelaskan bahwa satu-satunya cara untuk kembali adalah dengan menemukan artefak, yaitu Cincin Pengikat Jiwa.",
            "Cari tahu lebih banyak tentang cincin itu", scene4, 0, 25,
            "Pelajari lokasi artefak", scene4, 0, 20,
            "Tanya tentang bahaya yang mungkin dihadapi", scene4, 5, 30
        );
        scene scene2 = new scene(
            "Saat kamu masih memproses apa yang terjadi, pintu terbuka. Seorang pria tua dengan jubah hitam masuk, dia adalah Guru Jin.",
            "Tanyakan bagaimana dia bisa tahu tentang kondisimu", scene3, 0, 15,
            "Menanyakan penjelasan tentang tubuh aslimu", scene3, 5, 10,
            "Minta bantuan untuk kembali ke tubuh aslimu", scene3, 0, 20
        );
        scene startScene = new scene(
            "Kamu terbangun dengan kepala berdenyut. Saat membuka mata, kamu menyadari bahwa ada sesuatu yang salah. " +
            "Kamu bercermin dan melihat bahwa wajah yang ada di cermin tersebut bukan wajahmu melainkan wajah orang lain.",
            "Periksa tubuh barumu dengan hati-hati", scene2, 0, 10,
            "Coba gunakan sihir", scene2, 5, 15,
            "Mencari bantuan", scene2, 10, 5
        );
        story Story = new story(startScene, player);
        Story.start();
        
        scanner.close();
    }
}
