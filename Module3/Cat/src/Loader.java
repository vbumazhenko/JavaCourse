public class Loader
{
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1
        Cat murka = new Cat();
        Cat toma = new Cat();

        System.out.println("Количество кошек: " + Cat.getCount());
        System.out.println(murka.getWeight());
        while (murka.getStatus() != "Dead") {
            murka.meow();
        }
        System.out.println(murka.getWeight());
        System.out.println(murka.getStatus());

        System.out.println("Количество кошек: " + Cat.getCount());

        // 2
        Cat vaska = new Cat();

        System.out.println(vaska.getWeight());

        vaska.feed(2000.0);
        System.out.println(vaska.getWeight());
        System.out.println(vaska.getStatus());
        System.out.println(vaska.getFeedAmount());

        vaska.goToilet();
        System.out.println(vaska.getWeight());

        vaska.drink(8000.0);
        System.out.println(vaska.getWeight());
        System.out.println(vaska.getStatus());

        vaska.feed(100.0);
        System.out.println("Количество кошек: " + Cat.getCount());

        // 6. Окрас
        Cat duska = new Cat(3500);
        System.out.println(duska.getWeight());

        duska.setColor(CatColors.GREEN);
        System.out.println(duska.getWeight());
        System.out.println(duska.getColor());

        // 7. Копирование кошки
//        Cat mashka = new Cat(duska);
//        System.out.println(duska.getWeight());
//        System.out.println(duska.getColor());

        try {
            Cat mashka = duska.clone();
            System.out.println(mashka.getWeight());
            System.out.println(mashka.getColor());
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Косячок, однако!");
        }

    }
}