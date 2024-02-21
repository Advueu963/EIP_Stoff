package StoffZsf;

//Source: ChatGPT
public class StatischVsNonStatisch {
    // Statische Variable
    static int statischeVariable = 10;

    // Instanzvariable
    int instanzVariable;

    public static void main(String[] args) {
        StatischVsNonStatisch b = new StatischVsNonStatisch(50);
        b.zugriffAufInstanzVariable();

    }

    // Konstruktor
    public StatischVsNonStatisch(int instanzVariable) {
        this.instanzVariable = instanzVariable;
    }

    // Methode, die auf die statische Variable zugreift
    public static void zugriffAufStatischeVariable() {
        // Korrekter Zugriff auf die statische Variable
        int wert = StatischVsNonStatisch.statischeVariable;

       // wert = this.statischeVariable;   // Nicht kompilierbar, da "this" nicht in einem statischen Kontext verwendet werden kann

        // Falscher Zugriff mit "this" auf eine statische Variable
    }

    // Methode, die auf die Instanzvariable zugreift
    public void zugriffAufInstanzVariable() {
        System.out.println("Instanzvariable: " + this.instanzVariable);
        System.out.println("Statische Variable: " + this.statischeVariable);

    }
}
