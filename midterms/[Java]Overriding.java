

class Parent {

    void printNumbers() {
        System.out.println("Parent Class: ");
        for(int i=1; i<=5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Child {

    void printNumbers() {
        System.out.println("Child Class: ");
        for(int i=5; i>=1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.printNumbers();

        Child child = new Child();
        child.printNumbers();

        }
    }
