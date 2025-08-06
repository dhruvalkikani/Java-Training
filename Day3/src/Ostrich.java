public class Ostrich extends  Bird{
    public Ostrich() {
    }

    public Ostrich(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+" Hello");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" Roaming");
    }


}
