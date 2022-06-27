package lesson7;

public class Airplan implements Airfly {


    private boolean isInjured;

    public Airplan(boolean isInjured) {
        this.isInjured = isInjured;
    }

    //    public Airplan(int countPassengers) {
//        System.out.println("Количество пассажиров: " + countPassengers);
//    }

    public void fly() {
        System.out.println("Летит, махая крыльями. Ранена: " + isInjured);
    }

}
