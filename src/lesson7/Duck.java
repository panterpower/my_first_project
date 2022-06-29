package lesson7;

public class Duck implements Airfly {


    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    //    public Airplan(int countPassengers) {
//        System.out.println("Количество пассажиров: " + countPassengers);
//    }

    public void fly() {
        System.out.println("Утка Летит, махая крыльями. Ранена: " + isInjured);
    }

}
