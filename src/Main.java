public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Ферарри");
        Car c2 = new Car("Форд");
        System.out.println("Гонка выносливости Ле-Ман");
        System.out.println("участвует Форд против Феррари");
        for (int i = 3; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("CТАРТ!");

        while (true) {
            for (int i = 0; i < 100; i++) {
                c1.speedUp();
                c2.speedUp();
            }

            while (true) {
                c1.step();
                c2.step();
            }

        }

    }
}