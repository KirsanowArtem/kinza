package Lessons.Lesson16;

public class Cat {
    private String imya, zvet;
    private int vozrast;

    @Override
    public String toString() {
        return "Cat{" +
                "imya='" + imya + '\'' +
                ", zvet='" + zvet + '\'' +
                ", vozrast=" + vozrast +
                ", ese=" + ese1 +
                '}';
    }

    Ese ese1 = new Ese("goluboy", 23, true, false);

    public Cat(String imya, String zvet, int vozrast, Ese ese1) {
        this.imya = imya;
        this.zvet = zvet;
        this.vozrast = vozrast;
        this.ese1 = ese1;
    }

    public Cat(String imya, String zvet, int vozrast,String eseZvet, int eseDiametr, boolean eseNotcnoeVidibe, boolean eseTchreteVeco) {
        this.imya = imya;
        this.zvet = zvet;
        this.vozrast = vozrast;
        String eseZvet1 = eseZvet;
        int eseDiametr1 = eseDiametr;
        boolean eseNotcnoeVidibe1 = eseNotcnoeVidibe;
        boolean eseTchreteVeco1 = eseTchreteVeco;


    }
}
