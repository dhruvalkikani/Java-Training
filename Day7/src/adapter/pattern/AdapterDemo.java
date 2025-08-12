package adapter.pattern;

// Target
interface PaymentGateway {
    boolean pay(String fromAccount, String toAccount, double amount);
}

// Adaptee (legacy)
class LegacyPaymentProcessor {
    // older signature:
    public String makePayment(String srcAcct, String destAcct, double amt) {
        // returns transaction id or null if fail
        System.out.println("Legacy processing...");
        return "TXN123";
    }
}

// Adapter
class LegacyPaymentAdapter implements PaymentGateway {
    private final LegacyPaymentProcessor legacy;

    public LegacyPaymentAdapter(LegacyPaymentProcessor legacy) {
        this.legacy = legacy;
    }

    @Override
    public boolean pay(String fromAccount, String toAccount, double amount) {
        String txn = legacy.makePayment(fromAccount, toAccount, amount);
        return txn != null;
    }
}

// Demo
public class AdapterDemo {
    public static void main(String[] args) {
        LegacyPaymentProcessor legacy = new LegacyPaymentProcessor();
        PaymentGateway gateway = new LegacyPaymentAdapter(legacy);
        System.out.println("Payment success: " + gateway.pay("A", "B", 100.0));
    }
}
