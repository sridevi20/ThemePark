package attraction;

public class Visitors implements ITicketed{
    private int age;
    private double height;
    private double money;

    public Visitors(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public double defaultPrice() {
        return this.money -= 10;
    }


    public double priceFor(String Visitor) {
        return this.money -= 20;
    }
}
