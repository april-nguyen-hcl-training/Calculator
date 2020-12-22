package calculator.operations;

public class Divide extends Operation {
    public Divide(float a, float b) {
        numberA = a;
        numberB = b;
    }
    @Override
    public float result() {
        return numberA / numberB;
    }
}
