import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Voulez-vous encrypter ou decrypter (e ou d) ? ");
        Scanner scan = new Scanner(System.in);
        char mode = scan.nextLine().charAt(0);
        System.out.print("Veuillez entrer une phrase : ");
        String chaine = scan.nextLine();
        System.out.print("Veuillez entrer le decalage : ");
        int decalage = Integer.parseInt(scan.nextLine());

            chaineCryptee chaine_modif = new chaineCryptee(chaine, decalage);
        if(mode == 'e') {
            String chaine2 = chaine_modif.deEnClair();
            System.out.println("Chaine cryptee : " + chaine2);
        } else if(mode == 'd') {
            String chaine2 = chaine_modif.deCrytpee();
            System.out.println("Chaine decryptee : " + chaine2);
        }

    }
}
