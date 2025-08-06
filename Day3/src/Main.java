//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Animal animal=new Animal("name....");
//
//        animal.makeNoise();
//
//        Cat an = new Cat();
//        an.makeNoise();
//
//        Animal a= new Cat();
//        a.makeNoise();
//
//        Cat c = (Cat)a;
//        c.jump();

        Dog d = new Dog("Tyson");
        Cat c = new Cat("Billi");
        Bat b = new Bat("Tom");
        Fish f = new Fish("Lilly");
        Ostrich o  = new Ostrich("Billy");
        Parrot p = new Parrot("Cilly");

        Animal[] animals = { d, c, b, f, o, p };

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
            animal.eat();
            animal.sleep();
            System.out.println();
        }

        AnimalUtils animalUtils = new AnimalUtils();
        animalUtils.addanimal(d);
        animalUtils.addanimal(c);
    }
}