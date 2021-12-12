package Task4;

public class Dog extends Animal {
    private int loyalty;

    public Dog(String food, String location, int loyalty) {
        super(food, location);
        this.loyalty = loyalty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гавкает по собачьи ");
    }

    @Override
    public void eat() {
        System.out.println("Ест по собачьи ");
    }

    @Override
    public void sleep() {
        System.out.println("Спит по собачьи ");
    }
}
