import java.util.Arrays;
import java.util.Scanner;

public class AritmetickaSredina {
    int[] broevi;

    AritmetickaSredina(int[] broevi) {
        this.broevi = broevi;
    }

    void calculateAS() {
        Arrays.sort(broevi); // Se sortira zgolemuvackata niza

        double median;
        if (broevi.length % 2 == 0) {
            // Ako nizata e neparna se zema srednata vrednost
            int middleIndex = broevi.length / 2;
            median = (double) (broevi[middleIndex - 1] + broevi[middleIndex]) / 2;
        } else {
            // So celiot ovoj kog sme ja zemale srednata vrednost
            int middleIndex = broevi.length / 2;
            median = broevi[middleIndex];
        }

        System.out.println("Aritmetickata sredina e: " + median);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vnesi go vkupniot broj na broevi: ");
        int numBroevi = scanner.nextInt();
        scanner.nextLine(); // Ova e za da se vnesuvaat tocen broj na broevi

        int[] broevi = new int[numBroevi];
        for (int i = 0; i < numBroevi; i++) {
            System.out.print("Vnesi broj :" + (i + 1) + ": ");
            broevi[i] = scanner.nextInt();
            scanner.nextLine(); // So ova se vneseni tocniot broj na broevi
        }

        AritmetickaSredina arithmeticMedian = new AritmetickaSredina(broevi);
        arithmeticMedian.calculateAS();
    }
}
