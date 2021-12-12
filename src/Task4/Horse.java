package Task4;

public class Horse extends Animal {
    private int horsePower;

    public Horse(String food, String location, int horsePower) {
        super(food, location);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public void makeNoise() {
        System.out.println("Ржот по конски ");
    }

    @Override
    public void eat() {
        System.out.println("Ест по конски ");
    }

    @Override
    public void sleep() {
        System.out.println("Спит стоя ");
    }
}
