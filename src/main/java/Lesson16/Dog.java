package Lesson16;

public class Dog {
    String zvet, poroda, pol;
    int ves, vozrast;

    @Override
    public String toString() {
        return "Dog{" +
                "zvet='" + zvet + '\'' +
                ", poroda='" + poroda + '\'' +
                ", pol='" + pol + '\'' +
                ", ves=" + ves +
                ", vozrast=" + vozrast +
                '}';
    }

    private String polChec(String pol1) {
        if (pol1.equals("m") || pol1.equals("w")) {
            return pol1;
        } else {
            return "m";
        }
    }

    private String zvetChec(String zvet1) {
        switch (zvet1) {
            case "krasnuy":
                return zvet1;
            case "orangeviy":
                return zvet1;

            case "goltuy":
                return zvet1;

            case "zelenuy":
                return zvet1;

            case "goluboy":
                return zvet1;

            case "siniy":
                return zvet1;

            case "violetoviy":
                return zvet1;

            default:
                return "beluy";
        }
    }

    public Dog(String zvet, String poroda, String pol) {
        this.zvet = zvetChec(zvet);
        this.poroda = poroda;
        this.pol = polChec(pol);
    }

    public Dog(String pol, int vozrast) {
        this.pol = polChec(pol);
        this.vozrast = vozrast;
        this.zvet = "beluy";
    }

    public Dog(String zvet, String poroda, String pol, int ves, int vozrast) {
        this.zvet = zvetChec(zvet);
        this.poroda = poroda;
        this.pol = polChec(pol);
        this.ves = ves;
        if (vozrast < 1 || vozrast > 20) {
            this.vozrast = 5;
        } else {
            this.vozrast = vozrast;
        }
    }
}