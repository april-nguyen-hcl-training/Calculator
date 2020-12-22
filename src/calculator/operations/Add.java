package calculator.operations;

public class Add extends Operation{
    public Add(float a, float b) {
        numberA = a;
        numberB = b;
    }
    @Override
    public float result() {
        return numberA + numberB;
    }
}
