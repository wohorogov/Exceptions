package numbers;

import java.util.Comparator;

public class ComplexNumberlmpl implements ComplexNumber, Comparable<ComplexNumberlmpl>{
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
    public double getImaginaryPart() {
        return imaginaryPart;
    }
    @Override
    public double getRealPart() {
        return realPart;
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

    public boolean equals(ComplexNumber c) {
        return (this.realPart == c.getRealPart() && this.imaginaryPart == c.getImaginaryPart());
    }
    @Override
    public int compareTo(ComplexNumberlmpl o) {
        double thisModule = Math.sqrt(Math.pow(this.realPart, 2) + Math.pow(this.imaginaryPart, 2));
        double secondModule = Math.sqrt(Math.pow(o.getRealPart(), 2) +
                Math.pow(o.getImaginaryPart(), 2));
        if (thisModule > secondModule) {
            return 1;
        } else if (thisModule < secondModule) {
            return -1;
        }
        else return 0;
    }
}
