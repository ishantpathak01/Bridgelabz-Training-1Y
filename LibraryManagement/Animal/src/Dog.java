public class Dog {
    public class Dog extends Animal {
        int length;
        Dog() {
            super();
        }
    }
    Dog() {
        super();
    }
    Dog(int length) {
        this.length = length;
    }
    Dog(int age, int weight, int length) {
        this.length = length;
    }
    public void barks() {
        System.out.println("Dog barks");
    }
    public void makeNoise() {
        barks();
    }
}
