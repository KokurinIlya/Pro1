public class Main
{
    public static void main(String[] args){
        Car c1 = new Car(0);
        Car c2 = new Car(0);
        Car c3 = new Car(0);

        c1.speedUp();
        c2.speedUp();
        c3.speedUp();

        c1.printSpeed();
        c2.printSpeed();
        c3.printSpeed();
    }
}
