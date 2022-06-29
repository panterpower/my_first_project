package lesson7;

public class Airplan implements Airfly {

    private int countPassengers;

    public Airplan(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    //    public Duck(boolean isInjured) {
//        if (isInjured){
//            System.out.println("Ранен");
//        }else {
//            System.out.println("Здоров");
//        }
//    }
    public void fly() {
        System.out.println("Самолет Летит с помощью мотора. Пассажиров: " + countPassengers);
    }
}
