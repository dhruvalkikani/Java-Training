public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public Cat(){}

    public void jump(){
        System.out.println(getName()+" Jumping");
    }

    public void makeNoise(){
        System.out.println(getName()+" meau meau");
    }

}
