package lesson5;

public class Financial_record {

    int intIncomes;
    int outIncomes;

    public Financial_record(int incomes, int outcomes) {
        intIncomes = incomes;
        outIncomes = outcomes;
    }

    // Зачем-то сделал, пусть будет
    public String getComes() {
        return this.intIncomes + " " + this.outIncomes;
    }

    public int getIncomes() {
        return this.intIncomes;
    }
    public int getOutcomes() {
        return this.outIncomes;
    }
    // Сеттеры не используются. Сгенерировал.

    public void setIntIncomes(int intIncomes) {
        this.intIncomes = intIncomes;
    }

    public void setOutIncomes(int outIncomes) {
        this.outIncomes = outIncomes;
    }
}
