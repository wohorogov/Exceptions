package numbers;

public class ComplexNumberlmpl implements ComplexNumber{
    private double realPart;
    private double imaginaryPart;

    public ComplexNumberlmpl(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumberlmpl(double realPart) {
        this.realPart = realPart;
        this.imaginaryPart = 0;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public ComplexNumber add(ComplexNumber c) {
        this.realPart += c.getRealPart();
        this.imaginaryPart += c.getImaginaryPart();
        return this;
    }

    @Override
    public ComplexNumber minus(ComplexNumber c) {
        this.realPart -= c.getRealPart();
        this.imaginaryPart -= c.getImaginaryPart();
        return this;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber c) {
        this.realPart *= c.getRealPart();
        this.imaginaryPart *= c.getImaginaryPart();
        return this;
    }

    @Override
    public ComplexNumber divide(ComplexNumber c) throws ComplexOpException {
        if (c.getImaginaryPart() == 0 || c.getRealPart() == 0) {
            throw new ComplexOpException("На ноль делить нельзя!");
        }
        else {
            this.realPart /= c.getRealPart();
            this.imaginaryPart /= c.getImaginaryPart();
        }
        return this;
    }
}
