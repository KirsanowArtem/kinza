package Lessons.Lesson16;

public class Ese {
    private String zvet;
    private int diametr;
    private boolean notcnoeVidibe, tchreteVeco;

    @Override
    public String toString() {
        return "Ese{" +
                "zvet='" + zvet + '\'' +
                ", diametr=" + diametr +
                ", notcnoeVidibe=" + notcnoeVidibe +
                ", tchreteVeco=" + tchreteVeco +
                '}';
    }

    public String getZvet() {
        return zvet;
    }

    public int getDiametr() {
        return diametr;
    }

    public boolean isNotcnoeVidibe() {
        return notcnoeVidibe;
    }

    public boolean isTchreteVeco() {
        return tchreteVeco;
    }

    public Ese(String zvet, int diametr, boolean notcnoeVidibe, boolean tchreteVeco) {
        this.zvet = zvet;
        this.diametr = diametr;
        this.notcnoeVidibe = notcnoeVidibe;
        this.tchreteVeco = tchreteVeco;
    }
}
