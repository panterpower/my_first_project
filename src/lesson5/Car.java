package lesson5;

public abstract class  Car extends CarFactory {

    public void move() {
        System.out.println("Машина начинает движение");
    }
    public void stop(){
        System.out.println("Машина останавливается");
    }
    public void turnOnLight(){
        System.out.println("Машина включает фары");
    }

}
