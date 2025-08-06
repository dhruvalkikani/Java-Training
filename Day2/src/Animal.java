public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat (){
        System.out.println( name + " My cat is eating");
    }

    public void makeNoise (){
        System.out.println( name + " My Dog is making noise");
    }

    public void sleep (){
        System.out.println( name + " My dog is sleeping");
    }

    public void roam (){
        System.out.println( name + " My Dog is roaming");
    }

}
