import java.util.ArrayList;
import java.util.Scanner;

/*
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurti papildomą funkciją, kuri per parametrus gauna List<Integer> listas ir suranda kiek liste yra skaičių, didesnių už 10
3. Patobulinkite tą funkciją, jog rastų kiek liste yra skaičių, didesnių už x. int x - tai funkcijos parametras. (gauna per parametrus)
 */
public class Uzduotis1 {
    public static void main(String[] args) {


    }

    /**
     * Nuskaito listą iš konsolės
     * @return listą
     */
    public static ArrayList<Integer> nuskaitytiLista() {
        Scanner skait = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Įveskite kiek bus skaičių: ");
        int n = skait.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + "-ąjį skaičių:");
            list.add(skait.nextInt());
        }
        return list;
    }

    /**
     * Apsskaičiuoja kiek sąraše yra skaičių didesnių už tam tikrą nurodytą skaičių
     * @param list sąrašas
     * @param x nurodytas skaičius
     * @return kiekį, kiek didesnsių už x
     */
    public static int kiekDidesniu(ArrayList<Integer> list, int x) {
        int kiekis = 0;
        for (Integer sk : list) {
            if (sk > x) {
                kiekis++;
            }
        }
        return kiekis;
    }
}
