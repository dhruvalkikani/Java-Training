public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    public Dog(){}

    public void play(){
        System.out.println(getName()+" Playing");
    }

    public void makeNoise(){
        System.out.println(getName()+" Bhow Bhow");
    }

}
