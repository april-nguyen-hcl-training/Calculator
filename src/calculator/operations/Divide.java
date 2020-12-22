package calculator.operations;

public final class Divide extends Operation {
    public Divide(float a, float b) {
        this.numberA = a;
        this.numberB = b;
    }
    @Override
    public float result() {
        return numberA / numberB;
    }
}
