import java.sql.SQLOutput;

public class Cat
{
    private double originWeight;
    private double weight;

    private static final int AYES_COUNT = 2;
    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;

    private double feedAmount = 0;
    private static int count = 0;
    private boolean isDead = false;

    public CatColors catColor;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public Cat(double weight) {
        this();
        this.weight = weight;
    }

    public Cat(Cat fromCat) {
        weight = fromCat.weight;
        originWeight = fromCat.originWeight;
        isDead = fromCat.isDead;
        catColor = fromCat.catColor;
    }

    public void meow()
    {
        if (!isDead) {
            weight = weight - 1;
            System.out.println("Meow");
            if(weight < MIN_WEIGHT) {
                isDead = true;
                count--;
            }
        }
        else {
            System.out.println("Кошка мертва!");
        }
    }

    public void feed(Double amount)
    {
        if (!isDead) {
            weight = weight + amount;
            feedAmount += amount;
            if(weight > MAX_WEIGHT) {
                isDead = true;
                count--;
            }
        }
        else {
            System.out.println("Кошка мертва!");
        }
    }

    public void drink(Double amount)
    {
        if (!isDead) {
            weight = weight + amount;
            if(weight > MAX_WEIGHT) {
                isDead = true;
                count--;
            }
        }
        else {
            System.out.println("Кошка мертва!");
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public Double getFeedAmount() {
        return feedAmount;
    }

    public void goToilet() {
        if (!isDead) {
            weight -= 10;
            System.out.println("Удачно сходил!");
            if(weight < MIN_WEIGHT) {
                isDead = true;
                count--;
            }
        }
        else {
            System.out.println("Кошка мертва!");
        }
    }

    public static int getCount() {
        return count;
    }

    public void setColor(CatColors catColor) {
        this.catColor = catColor;
    }

    public CatColors getColor() {
        return catColor;
    }

    public Cat clone() throws CloneNotSupportedException {
        return (Cat)super.clone();
    }

}