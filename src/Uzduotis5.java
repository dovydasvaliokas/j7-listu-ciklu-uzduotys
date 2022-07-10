import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurti papildomą funkciją, kuri gauna int x ir patikrina ar x yra lyginis ar ne. Turėtų grąžinti true/false
3. Susikurti papildomą funkciją, kuri per parametrus gauna List<Integer> listas ir suranda ko liste yra daugiau, ar lyginių skaičių ar nelyginių. Funkcija grąžina 1, jeigu yra daugiau lyginių, grąžina -1 jeigu nelyginių ir grąžina 0, jeigu lyginių ir nelyginių kiekis vienodas.
4. Susikurkite dar vieną papildomą funkciją, kuri gauna per parametrus List<Integer> listas ir suranda kurių skaičių (lyginių ar nelyginių) suma yra didesnė. (tam tikriausiai reikės papildomų funkcijų, kurios randa listo lyginių sumą ir kitos funkcijos, kuri randa listo nelyginių sumą). Jeigu listo lyginių skaičių suma yra didesnė, grąžinti 1, jeigu nelyginių grąžinti -1, jeigu vienodos, tai grąžinti 0.
5. Susikurkite dar vieną papildomą funkciją, kuri būtų "rezultato išvedimo funkcija". Funkcija per parametrus gauna List<Integer> listas, o viduje (naudojant prieš tai sukurtas funkcijas) įvertina kurių skaičių daugiau ir kurių suma didesnė ir tai parašo žodžiais. Tai pvz., jeigu viduje panaudojus 3. punkto užduotį gaunama 1 ir 4. punkto užduotį gaunama -1, tai turėtų tekstu išvesti kažką panašaus į: Liste lyginių skaičių yra daugiau, tačiau nelyginių suma yra didesnė
 */
public class Uzduotis5 {
    public static void main(String[] args) {
        ArrayList<Integer> skaiciai = nuskaitytiLista();

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
     * Patikrina ar lyginis
     * @param x tikrinamas skaičius
     * @return true, jeigu lyginis, false jeigu ne
     */
    public static boolean arLyginis(int x) {
        return x % 2 == 0;
    }

    /**
     * Funkcija randa kiek sąraše yra lyginių
     * @param list sąrašass
     * @return kiekį
     */
    public static int kiekLyginiu(List<Integer> list) {
        int kiekLyginiu = 0;
        for (Integer sk : list) {
            if (arLyginis(sk)) {
                kiekLyginiu++;
            }
        }
        return kiekLyginiu;
    }

    /**
     * Kuriu daugiau ar lyginių ar nelyginių
     * @param list sąrašass
     * @return -1 jeigu nelyginių daugiau, 0 jeigu vienodai, 1 jeigu lyginių daugiau
     */
    public static int arLyginiuDaugiau(List<Integer> list) {
        return Integer.compare(kiekLyginiu(list), list.size() - kiekLyginiu(list));
    }

    /**
     * Randa lyginių skaičių sumą
     * @param list sąrašas
     * @return suma
     */
    public static int lyginiuSuma(List<Integer> list) {
        int suma = 0;
        for (Integer sk : list) {
            if (arLyginis(sk)) {
                suma += sk;
            }
        }
        return suma;
    }

    /**
     * Randa nelyginių skaičių sumą
     * @param list sąrašas
     * @return suma
     */
    public static int nelyginiuSuma(List<Integer> list) {
        int suma = 0;
        for (Integer sk : list) {
            if (!arLyginis(sk)) {
                suma += sk;
            }
        }
        return suma;
    }

    /**
     * Palygina kurių skaičių (lyginių ar nelyginių) suma yra didesnsė
     * @param list sąrašas
     * @return neigiamą reikšmę, jeigu nelyginių didessnė, 0 jeigu vienoda, teigiamą reikšmę jeigu lyginių didesnė
     */
    public static int arLyginiuSumaDidesne(List<Integer> list) {
        return lyginiuSuma(list) - nelyginiuSuma(list);
    }

}
