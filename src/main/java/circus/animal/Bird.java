package circus.animal;

public class Bird extends Animal {
    @Override
    public int getValue() {
        return 30;
    }

    public void fly() {
        System.out.println("Whee ...");
    }
}
