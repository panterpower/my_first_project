package lesson3;

public class Age {
    private int animalAge;

    Age(int age) {
        this.animalAge = age;
    }

    String getAge() {
        return "Возраст " + this.animalAge;
    }

    void setAnimalAge(int newAge) {
        this.animalAge = newAge;
    }

    int getAnimalAge(){
        return this.animalAge;
    }
}
