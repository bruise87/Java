package Task4;

public class Task4 {
    public static void Task4() {
        Cat tom = new Cat("fish", "london", 100500);
        Dog dog = new Dog("bones", "podolsk", 8);
        Horse straPony = new Horse("seno", "samara", 12);
        Animal[] animals = new Animal[]{tom, dog, straPony};
        Veterinar vasya = new Veterinar();
        for (Animal animal : animals) {
            vasya.treatAnimal(animal);
        }
    }
}

