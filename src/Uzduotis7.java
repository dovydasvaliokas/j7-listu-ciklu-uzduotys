import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurti papildomą funkciją, kuri gauna int x ir grąžina List<Integer> skaitmenys, kur skaitmenys tai x išskaldyti skaitmenys. Kitaip sakant, jeigu yra x = 258, tai skaitmenys[0] = 2, skaitmenys[1] = 5, skaitmenys[2] = 8. Paskutinį skaitmenį galima gauti ieškant liekanos dalinant iš 10. Paskutinį skaičių "nukąsti" galima dalinant iš 10. Būtinai reikės naudoti while ciklą, nes su for per daug nepatogu užrašyti bus (realiai sakykime neįmanoma) ARBA galima su konvertavimu į String "apeiti" šitą užduotį kitokiu būdu. Kai konvertuojate skaičių į String galite kiekvieną "simbolį" konvertuoti į skaičių ir jį dėti į int listą
 */
public class Uzduotis7 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        int sk = skait.nextInt();
        ArrayList<Integer> skaitmenys = isskaidytiISkaitmenis(sk);
        System.out.println("skaitmenys = " + skaitmenys);
    }

    /**
     * Išskaido skaičių į skaitmenis
     * @param x skaičius
     * @return sąrašas skaitmenų
     */
    public static ArrayList<Integer> isskaidytiISkaitmenis(int x) {
        ArrayList<Integer> skaitmenys = new ArrayList<>();
        while (x > 0) {
            skaitmenys.add(x % 10);
            x /= 10;
        }
        Collections.reverse(skaitmenys);
        return skaitmenys;
    }
}
