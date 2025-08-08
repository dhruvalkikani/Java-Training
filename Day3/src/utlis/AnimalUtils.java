public class AnimalUtils {
    public void addanimal(Animal animal){
        System.out.println("Animal added: "+animal.getName());
        animal.makeNoise();

        if(animal instanceof Cat){
            Cat c = (Cat) animal;
            c.jump();
        } else if (animal instanceof Dog) {
            Dog d=(Dog) animal;
            d.play();
        }
    }
}
