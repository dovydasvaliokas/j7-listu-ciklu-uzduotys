import java.util.ArrayList;
import java.util.Scanner;

/*
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurti papildomą funkciją, kuri per parametrus gauna List<Boolean> loginiai ir tą boolean list'ą konvertuoja į dvejatainį skaičių. Atsiminkime, kad booleanai tai yra tiesiog true ir false arba dar kitaip tai tiesiog 1 ir 0. Tai galima eiti per visus list'o narius ir tikrinti ar jie true/false ir tada atitinkamai sumuoti vienetus ir nulius prie atsakymo String kintamojo. Pvz., jeigu turime list = {true, true, false, true, false, false, true, true}, tai dvejatainis skaičius būtų: 1101001, nes true = 1, o false = 0

 */
public class Uzduotis6 {
    public static void main(String[] args) {
        ArrayList<Boolean> loginiai = nuskaitytiLista();
        System.out.println("loginiai = " + loginiai);

    }

    /**
     * Nuskaito listą iš konsolės
     * @return listą
     */
    public static ArrayList<Boolean> nuskaitytiLista() {
        Scanner skait = new Scanner(System.in);
        ArrayList<Boolean> list = new ArrayList<>();
        System.out.println("Įveskite kiek bus loginių kintamųjų (true/false) arba (1/0): ");
        int n = skait.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + "-ąjį loginį kintamąjį:");
            list.add(skait.nextBoolean());
        }
        return list;
    }

}
