package StoffZsf.wann_static;

public class Essen {

    private String name,werbeText;

    public Essen(String name, String werbeText){
        this.name = name;
        this.werbeText = werbeText;
    }

    @Override
    public String toString() {
        return "Essen{" +
                "name='" + name + '\'' +
                ", werbeText='" + werbeText + '\'' +
                "} \n";
    }
}
