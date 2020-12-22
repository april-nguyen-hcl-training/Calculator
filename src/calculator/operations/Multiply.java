package calculator.operations;

public class Multiply extends Operation{
    public Multiply(float a, float b) {
        numberA = a;
        numberB = b;
    }
    @Override
    public float result() {
        return numberA * numberB;
    }
}
