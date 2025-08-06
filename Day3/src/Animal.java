public class Animal {
    private String name;

    public Animal(){}

    public Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(name+"  cat is eating");
    }
    public void makeNoise(){
        System.out.println(name+"  is making noise");
    }
    public void sleep(){
        System.out.println(name+"  dog is sleeping");
    }
    public void roam(){
        System.out.println(name+"  cat is roaming");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
