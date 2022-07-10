import java.util.ArrayList;
import java.util.Scanner;

/*
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Nusikopijuokite funkciją iš 1 užduoties, kuri suranda kiek yra list'e skaičių, didesnių už x.
3. Sukurkite papildomą funkciją, kuri gauna List<String> zodziai,  ir grąžintų List<Integer> zodziuIlgiai. T.y., suskaičiuotų kiekvieno žodžio ilgį ir jį įdėtų į listą, kurį po to grąžina.
4. Naudojant 3. ir 4. užduotis suraskite kiek list'e yra žodžių, ilgesnių nei x raidžių skaičius. Tai pvz. jeigu x = 9, tai reikėtų rasti kiek liste yra žodžių, turinčių daugiau nei 9 raides/simbolius
 */
public class Uzduotis4 {
    public static void main(String[] args) {
        ArrayList<String> zodziai = nuskaitytiLista();
        int kiekIlgesniuZodziu = kiekDidesniu(rastiZodziuIlgius(zodziai), 9);
        System.out.println("kiekIlgesniuZodziu = " + kiekIlgesniuZodziu);
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

    /**
     * Nuskaito listą iš konsolės
     * @return listą
     */
    public static ArrayList<String> nuskaitytiLista() {
        Scanner skait = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Įveskite kiek bus žodžių: ");
        int n = skait.nextInt();
        skait.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + "-ąjį žodį:");
            list.add(skait.nextLine());
        }
        return list;
    }

    /**
     * Suranda žodžių sąrašo kiekvieno žodžio ilgį
     * @param zodziai sąrašass
     * @return skaičių sąrašą, kur nurodyta kiekvieno žodžio ilgiss
     */
    public static ArrayList<Integer> rastiZodziuIlgius(ArrayList<String> zodziai) {
        ArrayList<Integer> ilgiai = new ArrayList<>();
        for (String s : zodziai) {
            ilgiai.add(s.length());
        }
        return ilgiai;
    }
}
