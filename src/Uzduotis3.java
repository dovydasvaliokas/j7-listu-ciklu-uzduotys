import java.util.ArrayList;
import java.util.Scanner;

/*
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurti papildomą funkciją, kuri per parametrus gauna List<Integer> listas ir suranda visų listo neigiamų skaičių sumą.
3. Nusikopijuokite praeitą funkciją ir ją pamodifikuokite, jog funkcija apskaičiuotų visų teigiamų skaičių sumą.
 */
public class Uzduotis3 {
    public static void main(String[] args) {
        ArrayList<Integer> skaiciai = nuskaitytiLista();
        int minusSuma = neigiamuSuma(skaiciai);
        System.out.println("minusSuma = " + minusSuma);
        int pliusSuma = teigiamuSuma(skaiciai);
        System.out.println("pliusSuma = " + pliusSuma);

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
     * Patikrina ar skaičius neigiamas
     * @param x tikrinamas skaičius
     * @return true, jeigu neigiamas, false jeigu teigiamas
     */
    public static boolean arNeigiamas(int x) {
        return x < 0;
    }

    /**
     * Suskaičiuoja listo neigiamų skaičių sumą
     * @param list sąrašass
     * @return neigiamų suma
     */
    public static int neigiamuSuma(ArrayList<Integer> list) {
        int suma = 0;
        for (Integer sk : list) {
            if (arNeigiamas(sk)) {
                suma += sk;
            }
        }
        return suma;
    }

    /**
     * Suskaičiuoja listo teigiamų skaičių sumą
     * @param list sąrašass
     * @return teigiamų suma
     */
    public static int teigiamuSuma(ArrayList<Integer> list) {
        int suma = 0;
        for (Integer sk : list) {
            if (!arNeigiamas(sk)) {
                suma += sk;
            }
        }
        return suma;
    }
}
