package calculator.operations;

public final class Subtract extends Operation {
    public Subtract(float a, float b) {
        this.numberA = a;
        this.numberB = b;
    }
    @Override
    public float result() {
        return numberA - numberB;
    }
}
