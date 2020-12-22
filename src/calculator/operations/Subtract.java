package calculator.operations;

public class Subtract extends Operation {
    public Subtract(float a, float b) {
        numberA = a;
        numberB = b;
    }
    @Override
    public float result() {
        return numberA - numberB;
    }
}
