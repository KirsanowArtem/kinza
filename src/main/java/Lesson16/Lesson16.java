package Lesson16;

public class Lesson16 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("krasnuy","avtcharka","m");
        Dog dog2 = new Dog("m",13);
        Dog dog3 = new Dog("orangeviy","tacsa","m",2,16);
        Cat cat1 = new Cat("Vaschiliy", "ofangeviy", 12345, new Ese("krasniy",123,true,true));
        Cat cat2 = new Cat("Cacha", "krasniy", 1234, new Ese("geltiy",12,true,false));


        System.out.println("pol = " + dog1.pol + "\nzvet = " + dog1.zvet + "\nporoda =  " + dog1.poroda);
        System.out.println("\n");
        System.out.println("pol = " + dog2.pol + "\nzvet = " + dog2.zvet + "\nvozrast =  " + dog2.vozrast);
        System.out.println("\n");
        System.out.println("zvet = " + dog3.zvet + "\nporoda = " + dog3.poroda + "\npol = " + dog3.pol + "\nves = " + dog3.ves + "\nvozrast =  " + dog3.vozrast);
        System.out.println("\n");
        System.out.println(dog3);
        System.out.println("\n");
        System.out.println(cat1);
        System.out.println("\n");
        System.out.println(cat2);

    }
}
