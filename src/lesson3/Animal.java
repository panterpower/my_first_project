package lesson3;

public class Animal {
    String name;
    String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getInfo() {
        return this.name + " " + this.type;
    }

    // Сеттер не стал здесь делать

}
