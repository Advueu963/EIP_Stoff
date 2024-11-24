package StoffZsf.wann_static;

import java.util.Arrays;

public class MCDonalds {

    private String owner;
    private int stuehle;

    private Essen[] lokalMenue;

    /*
    * Wir verwenden hier einen static, da jedes MCDonalds unabhängig von dem spezifischen Inhaber des Lokals
    *  immer ein gewisses Menü anbieten muss.
    * Aus unserer Informatiker Sicht ist jeder Franchisenehmer ein Objekt und die Klasse ist das Unternehmen selbst.
    * Somit ist es hier sinnvoll static zu verwenden.
    *
    * */
    private static Essen[] BaseMenue = {
            new Essen("BicMac","Brot,Fleisch,Brot,Fleisch,Brot. Alles was man braucht"),
            new Essen("BicTastyBacon","Ihr Gewissen möge leiden, aber Speck macht alles besser"),
            new Essen("Chicken Nuggets", "Das was alle wenn sie zu viel getrunken haben nehmen!")
    };

    public MCDonalds(String owner, int stuehle, Essen[] festMenue) {
        this.owner = owner;
        this.stuehle = stuehle;
        this.lokalMenue = Arrays.copyOf(BaseMenue,BaseMenue.length + festMenue.length + 10);
        for (int i = BaseMenue.length; i < BaseMenue.length + festMenue.length; i++) {
            lokalMenue[i] = festMenue[i - BaseMenue.length];
        }

    }

    @Override
    public String toString() {
        return "MCDonalds{" +
                "owner='" + owner + "'" +
                ", stuehle=" + stuehle +  "\n" +
                ", lokalMenue=" + Arrays.toString(lokalMenue) +
                '}';
    }
}
