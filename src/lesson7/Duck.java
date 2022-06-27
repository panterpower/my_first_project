package lesson7;

public class Duck implements Airfly {

    private int countPassengers;

    public Duck(int countPassengers) {
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
        System.out.println("Летит с помощью мотора. Пассажиров: " + countPassengers);
    }
}
