package homeworkseven;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;

    }

    int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;
        this.satiety = 0;
    }

    void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}
