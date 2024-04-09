package StoffZsf.FreieKlausurAufgaben;

import java.util.Arrays;

/**
 * Diese hier gezeigten Aufgaben kamen in der Klausur 2023/2024 EIP WiSe als offene Fragen dran (glaub ich auf jeden Fall noch)
 * Es war noch eine Rekursive Aufgabe aber die weiß ich nicht mehr.
 */
public class Schleifen {

    public static void main(String[] args) {
        double[] testArray = {0.1, 0.4, 0.3, 0.3};
        System.out.println(Arrays.toString(
                doubleArray(testArray)
        ));


        double[] testArray2 = {4,3,2,1};
        System.out.println(nonSortedPairs(testArray2));

    }
    // Aufgabe: Gegeben [0.1, 0.4, 0.3, 0.3] soll es [0.1, 0.1, 0.4, 0.4, 0.3, 0.3, 0.3, 0.3]
    public static double[] doubleArray(double[] array){
        if (array == null) { // nicht mehr sicher ob zu behandeln in der Klausur
            return null;
        }
        double[] result = new double[2 * array.length];
        for(int i = 0; i < array.length; i++) {
            result[2*i] = array[i];
            result[2*i + 1] = array[i];
        }
        return result;
    }


    // Aufgabe: Schreibe einen Algorithmus, welcher alle Paare zählt, die nicht in der richtigen Reihenfolge sind
    // Richtige reihenfolge ist hier das kleine Zahlen links und große Werte rechts stehen
    // Im Prinzip zählen wir an wie vielen Stellen das Array falsch sortiert ist
    // Gegeben: [1,3,2,4] soll es 1 ausgaben
    // Gegeben: [4,3,2,1] soll es 3 ausgeben

    public static double nonSortedPairs(double[] unsortedArray) {
        double result = 0;
        if( unsortedArray == null || unsortedArray.length == 0) {
            return 0; // Generell könnte man  "unsortedArray.length == 0" weglassen. Der Grund liegt in der Weise von der For-Schleife
        }

        for(int i = 0; i < unsortedArray.length - 1 ; i++) {
            if( unsortedArray[i+1] < unsortedArray[i]) {
                result += 1;
            }
        }
        return result;
    }





}
