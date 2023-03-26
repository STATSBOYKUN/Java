public class Main {
    public static void main(String[] args) {
        //contoh 1
        MathOperations math = new MathOperations();

        System.out.println(math.add(1, 2));
        System.out.println(math.add(1, 2, 3));
        System.out.println(math.add(1.5, 2.5));

        //contoh 2
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();
    }
}