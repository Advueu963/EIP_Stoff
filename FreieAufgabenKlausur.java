package StoffZsf;

import java.util.Arrays;

/**
 * Diese hier gezeigten Aufgaben kamen in der Klausur 2023/2024 EIP WiSe als offene Fragen dran (glaub ich auf jeden Fall noch)
 * Es war noch eine Rekursive Aufgabe aber die weiß ich nicht mehr.
 */
public class FreieAufgabenKlausur {

    public static void main(String[] args) {
        double[] testArray = {0.1, 0.4, 0.3, 0.3};
        System.out.println(Arrays.toString(
                doubleArray(testArray)
        ));

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

}
