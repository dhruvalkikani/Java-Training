package utlis;

import com.masai.entity.main.Animal;
import com.masai.entity.main.Cat;
import com.masai.entity.main.Dog;

public class AnimalUtils {
    public void addanimal(Animal animal){
        System.out.println("com.masai.entity.main.Animal added: "+animal.getName());
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
