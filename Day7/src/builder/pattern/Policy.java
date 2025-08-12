package builder.pattern;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Policy {
    private final String policyId;
    private final double premium;
    private final int termYears;
    private final String holderName;
    private final List<String> riders; // optional
    private final LocalDate startDate;

    private Policy(Builder b) {
        this.policyId = b.policyId;
        this.premium = b.premium;
        this.termYears = b.termYears;
        this.holderName = b.holderName;
        this.riders = List.copyOf(b.riders);
        this.startDate = b.startDate;
    }

    public static class Builder {
        private final String policyId;
        private final double premium;
        private final int termYears;
        private String holderName = "Unknown";
        private List<String> riders = new ArrayList<>();
        private LocalDate startDate = LocalDate.now();

        public Builder(String policyId, double premium, int termYears) {
            this.policyId = policyId;
            this.premium = premium;
            this.termYears = termYears;
        }

        public Builder holderName(String n) { this.holderName = n; return this; }
        public Builder addRider(String rider) { this.riders.add(rider); return this; }
        public Builder startDate(LocalDate d) { this.startDate = d; return this; }

        public Policy build() {
            if (premium <= 0) throw new IllegalStateException("Premium must be > 0");
            return new Policy(this);
        }
    }

    public double calculateMaturity() {
        // simple illustrative formula
        return premium * termYears * 1.05;
    }

    @Override
    public String toString() {
        return String.format("builder.pattern.Policy[%s, holder=%s, premium=%.2f, term=%d years, riders=%s]",
                policyId, holderName, premium, termYears, riders);
    }

    // demo
    public static void main(String[] args) {
        Policy policy = new Policy.Builder("POL001", 10000, 10)
                .holderName("Ravi Sharma")
                .addRider("Critical Illness")
                .addRider("Accidental Cover")
                .startDate(LocalDate.of(2025, 8, 1))
                .build();

        System.out.println(policy);
        System.out.println("Maturity: " + policy.calculateMaturity());
    }
}
