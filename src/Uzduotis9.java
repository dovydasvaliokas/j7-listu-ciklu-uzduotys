import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.

Kartais vidurkis nėra pats geriausias kriterijus. Pavyzdžiui, jeigu turime įmonės algas {1000, 1000, 1000, 5000} tai vidurkis šios įmonės gal ir atrodytų patraukliai (2000), tačiau realybė būtų tokia, jog visi gauna 1000, o tik vienintelis (direktorius) gauna 5000. Kad šią problemą (kai extreme point / outlier vertės per daug įtakoja vidurkį) yra "sukurta" mediana. Apie ją pasiskaityti daugiau galite internete: https://lt.wikipedia.org/wiki/Mediana Trumpai tariant, kai surikiuojame skaičius (algas) tai vidurinė alga būtų mediana. Jeigu yra dvi vidurinės tai tų dviejų vidurkis yra mediana. Tai šiuo atveju turime dvi vidurines algas (antrą ir trečią), jos abi yra 1000, tad jų bendras vidurkis irgi bus 1000. Tad mediana = 1000. Kitokiais žodžiais, jeigu mediana yra 1000, tai reiškia, jog pusė darbuotojų gauna arba lygiai 1000 arba dar mažesnį atlyginimą ir tai padeda susidaryti išsamesnę nuomonę apie įmonės atlyginimus.

2. Sukurkite papildomą funkciją, kuri  gauna ArrayList<Double> list ir suranda bei returnina double mediana. TUREKITE OMENYJE, kad prieš ieškant medianos, listą reikia SURIKIUOTI. (rikiavimą galite daryti tos papildomos funkcijos viduje)

 */
public class Uzduotis9 {
    public static void main(String[] args) {
        ArrayList<Double> algos = nuskaitytiLista();
        Collections.sort(algos);
        System.out.println("algos = " + algos);
        double alguMediana = mediana(algos);
        System.out.println("alguMediana = " + alguMediana);

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

    /**
     * Patikrina ar lyginis
     * @param x tikrinamas skaičius
     * @return true, jeigu lyginis, false jeigu ne
     */
    public static boolean arLyginis(int x) {
        return x % 2 == 0;
    }

    /**
     * Apskaičiuoja SURIKIUOTO sąrašo medianą
     * @param surikiuotasList SURIKIUOTAS sąrašass
     * @return medianą
     */
    public static double mediana(ArrayList<Double> surikiuotasList) {
        int vidurinioIndeksas = surikiuotasList.size() / 2;
        if (arLyginis(surikiuotasList.size())) {
            return (surikiuotasList.get(vidurinioIndeksas) + surikiuotasList.get(vidurinioIndeksas - 1)) / 2;
        }
        else {
            return surikiuotasList.get(vidurinioIndeksas);
        }
    }
}
