import java.util.Scanner;

public class Main {
    static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public String greet() {
            return name + " says hello";
        }
    }

    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public String greet() {
            return name + " says woof";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Dog dog = new Dog(name);
        System.out.println(dog.greet());
    }
}