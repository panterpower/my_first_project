package lesson7;

public class Duck implements Airfly {

    public boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public void Fly() throws FlyException {
        if (isInjured) {
            System.out.println("Ошибка: утка ранена");

        } else System.out.println("утка летит");
    }
}
