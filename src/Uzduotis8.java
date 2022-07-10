import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurti papildomą funkciją, kuri gauna List<Integer> skaiciai  ir grąžina didžiausio elemento INDEKSĄ (ne reikšmę o vietą KELINTAS). T.y., jeigu turime skaiciai = {109, 205, 304, 104, 205} tai rezultatas būtų 2, kadangi 304 yra didžiausias skaičius, o jo indeksas yra 2. Tai yra panašu į mano rodytą pavyzdį, tačiau skiriasi. TAČIAU, galite vos ne mano pavyzdį persidaryti, tada surasti kokia to skaičiaus yra reikšmė ir naudojant paieškos funkcijas (savo arba javos) surasti to skaičiaus indeksą.
 */
public class Uzduotis8 {
    public static void main(String[] args) {
        ArrayList<Integer> skaiciai = nuskaitytiLista();
        int didziausias = maxIndeksas(skaiciai);
        System.out.println("Didžiausias skaičius yra " + didziausias + "-as skaičius");

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


    public static int maxIndeksas(List<Integer> list) {
        int maxInd = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(maxInd)) {
                maxInd = i;
            }
        }
        return maxInd;
    }
}
