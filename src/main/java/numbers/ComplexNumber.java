package numbers;

public interface ComplexNumber {
    public ComplexNumber add(ComplexNumber c);
    public ComplexNumber minus(ComplexNumber c);
    public ComplexNumber multiply(ComplexNumber c);
    public ComplexNumber divide(ComplexNumber c) throws ComplexOpException;

    double getRealPart();

    double getImaginaryPart();

}
