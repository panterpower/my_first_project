package lesson7;

public class Airplan implements Airfly {

    public int countPassengers;

    public Airplan(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public void Fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        }
        System.out.println("самолет летит");
    }
}
