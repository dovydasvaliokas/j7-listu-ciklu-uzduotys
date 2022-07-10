import java.util.ArrayList;
import java.util.Scanner;

/*
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurti papildomą funkciją, kuri per parametrus gauna List<Double> listas ir suranda kiek list'e yra skaičių, didesnių už pirmą listo skaičių.
3. Patobulinkite programą, jog surastų kiek list'e yra skaičių didesnį už n-tajį skaičių. int n - funkcijos parametras, nurodantis už KELINTĄ skaičių didesnių skaičių ieškome. T.y., jeigu turime listą {3, 5, 12, 7, 6, 8} ir n = 1, tai ieškotume kiek skaičių yra didesnių už 5, o tai būtų 12 ir 7, tai galutinis rezultatas būtų 2 (nes KIEK)
 */
public class Uzduotis2 {
    public static void main(String[] args) {

    }

    /**
     * Nuskaito listą iš konsolės
     * @return listą
     */
    public static ArrayList<Double> nuskaitytiLista() {
        Scanner skait = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Įveskite kiek bus skaičių: ");
        int n = skait.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + "-ąjį skaičių:");
            list.add(skait.nextDouble());
        }
        return list;
    }
}
