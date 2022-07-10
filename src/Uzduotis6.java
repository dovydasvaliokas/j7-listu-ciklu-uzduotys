import java.util.ArrayList;
import java.util.Scanner;

/*
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurti papildomą funkciją, kuri per parametrus gauna List<Boolean> loginiai ir tą boolean list'ą konvertuoja į dvejatainį skaičių. Atsiminkime, kad booleanai tai yra tiesiog true ir false arba dar kitaip tai tiesiog 1 ir 0. Tai galima eiti per visus list'o narius ir tikrinti ar jie true/false ir tada atitinkamai sumuoti vienetus ir nulius prie atsakymo String kintamojo. Pvz., jeigu turime list = {true, true, false, true, false, false, true, true}, tai dvejatainis skaičius būtų: 1101001, nes true = 1, o false = 0

 */
public class Uzduotis6 {
    public static void main(String[] args) {
        ArrayList<Boolean> loginiai = nuskaitytiLista();
        String dvejatinisSk = dvejatainisSkaicius(loginiai);
        System.out.println("dvejatinisSk = " + dvejatinisSk);

    }

    /**
     * Nuskaito listą iš konsolės
     * @return listą
     */
    public static ArrayList<Boolean> nuskaitytiLista() {
        Scanner skait = new Scanner(System.in);
        ArrayList<Boolean> list = new ArrayList<>();
        System.out.println("Įveskite kiek bus loginių kintamųjų (true/false): ");
        int n = skait.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + "-ąjį loginį kintamąjį:");
            list.add(skait.nextBoolean());
        }
        return list;
    }

    /**
     * Konvertuoja loginių kintamųjų listą į dvejatainį skaičių.
     * Dvejatainį skaičių atvaizduoju kaip String kintamąjį, kadangi dvejatainiai gali būti labai ilgi skaičiai ir gana greitai gali išeiti už int ribų
     * Taip pat, sumuodamas numerius į tekstą naudoju StringBuilder objektą vietoj String kintamojo. Tai nėra būtina, tačiau tiesiog parašius paprastai su += operatoriumi ir paprastu String - IntellIj Idea metė, jog geriau cikle daryti su StringBuilder
     * Kiek atsimenu, tai naudojant += operatorių naujesnėse Javos versijose kompiliatoriuss automatiškai naudoja StringBuilder, tai jei jo nenaudosite - problemų neturėtų iškilti, tiesiog jei naudosite jį - papildomai "apsaugosite" programą.
     * @param loginiai loginių kintamųjų sąrašas
     * @return String pavidalu dvejatainis skaičius.
     */
    public static String dvejatainisSkaicius(ArrayList<Boolean> loginiai) {
        StringBuilder skaicius = new StringBuilder();
        for (Boolean loginis : loginiai) {
            if (loginis) {
                skaicius.append("1");
            }
            else {
                skaicius.append("0");
            }
        }
        return skaicius.toString();
    }

}
