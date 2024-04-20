
class Animal {
    public void makeSound() {
        System.out.println("동물은 소리를 내죠");
    }
}

class Cat extends Animal {
    public void makeSound() {
        super.makeSound();
        System.out.println("야옹!");
    }
}


class Dog extends Animal {
    public void makeSound() {
        super.makeSound();
        System.out.println("멍멍!");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.makeSound();
        animal2.makeSound();
        }
    }
