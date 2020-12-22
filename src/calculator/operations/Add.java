package calculator.operations;

public final class Add extends Operation{
    public Add(float a, float b) {
        this.numberA = a;
        this.numberB = b;
    }
    @Override
    public float result() {
        return numberA + numberB;
    }
}
