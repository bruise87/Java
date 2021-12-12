package Task4;

public class Cat extends Animal {
    private int iq;

    public Cat(String food, String location, int iq) {
        super(food, location);
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяукает по кошачьи ");
    }

    @Override
    public void eat() {
        System.out.println("Кушает по кошачьи ");
    }

    @Override
    public void sleep() {
        System.out.println("Клубочком ");
    }
}
