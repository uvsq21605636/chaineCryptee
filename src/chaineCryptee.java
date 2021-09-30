/**
 * Décrivez votre classe ChaineCryptee ici.
 *
 * @author Quentin Gruchet
 * @version 09/2021
 */

public class chaineCryptee {

    private String chaine;
    private int decalage;

    public chaineCryptee(String chaine, int decalage) {
        this.chaine = chaine;
        this.decalage = decalage;
    }

    public String getChaine() {
        return chaine;
    }

    private static char crypteChar(char caractere, int decalage) {
        if(caractere > 'A' && caractere < 'Z') {
            return (char)(((caractere - 'A' + decalage) % 26) + 'A');
        } else if ((caractere > 'a' && caractere < 'z')) {
            return (char)(((caractere - 'a' + decalage) % 26) + 'a');
        } else {
            return caractere;
        }
    }

    private static char decrypteChar(char caractere, int decalage) {
        if(caractere >= 'A' && caractere <= 'Z') {
            return (char)(((caractere - 'A' - decalage) % 26) + 'A');
        } else if ((caractere >= 'a' && caractere <= 'z')) {
            return (char)(((caractere - 'a' - decalage) % 26) + 'a');
        } else {
            return caractere;
        }
    }

    public String deEnClair() {
        String chaine_cry = new String();
        if(chaine != null)  {
            for(int i = 0; i < chaine.length(); i++)  {
                char car_cryptee = crypteChar(chaine.charAt(i), decalage);
                chaine_cry = chaine_cry + car_cryptee;
            }
        } else {
            return chaine;
        }
        return chaine_cry;
    }

    public String deCrytpee() {
        String chaine_decry = new String();
        if(chaine != null)  {
            for(int i = 0; i < chaine.length(); i++)  {
                char car_cryptee = decrypteChar(chaine.charAt(i), decalage);
                chaine_decry = chaine_decry + car_cryptee;
            }
        } else {
            return chaine;
        }
        return chaine_decry;
    }
}
