package decorator.pattern;

interface Insurable {
    double getPremium();
    String getDescription();
}

class BasePolicy implements Insurable {
    private final String id;
    private final double premium;
    public BasePolicy(String id, double premium) { this.id = id; this.premium = premium; }
    public double getPremium() { return premium; }
    public String getDescription() { return "BasePolicy:" + id; }
}

abstract class PolicyDecorator implements Insurable {
    protected final Insurable wrapped;
    public PolicyDecorator(Insurable wrapped) { this.wrapped = wrapped; }
    public double getPremium() { return wrapped.getPremium(); }
    public String getDescription() { return wrapped.getDescription(); }
}

class CriticalIllnessRider extends PolicyDecorator {
    public CriticalIllnessRider(Insurable wrapped) { super(wrapped); }
    @Override
    public double getPremium() { return super.getPremium() + 500; }
    @Override
    public String getDescription() { return super.getDescription() + " + CriticalIllness"; }
}

// demo
public class PolicyDecoratorDemo {
    public static void main(String[] args) {
        Insurable policy = new BasePolicy("POL1001", 5000);
        policy = new CriticalIllnessRider(policy);
        System.out.println(policy.getDescription() + " => premium= " + policy.getPremium());
    }
}
