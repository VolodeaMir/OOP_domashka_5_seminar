package task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newRealPart = this.realPart + other.realPart;
        double newImaginaryPart = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double newRealPart = this.realPart - other.realPart;
        double newImaginaryPart = this.imaginaryPart - other.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newRealPart = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double newImaginaryPart = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double divisor = other.realPart * other.realPart + other.imaginaryPart * other.imaginaryPart;
        double newRealPart = (this.realPart * other.realPart + this.imaginaryPart * other.imaginaryPart) / divisor;
        double newImaginaryPart = (this.imaginaryPart * other.realPart - this.realPart * other.imaginaryPart) / divisor;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    @Override
    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + "+" + imaginaryPart + "i";
        } else {
            return realPart + "" + imaginaryPart + "i";
        }
    }

    public static ComplexNumber parseComplexNumber(String input) {
        Pattern pattern = Pattern.compile("([-+]?\\d*\\.?\\d+)([-+])(\\d*\\.?\\d+)i");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            double realPart = Double.parseDouble(matcher.group(1));
            double imaginaryPart = Double.parseDouble(matcher.group(3));
            if (matcher.group(2).equals("-")) {
                imaginaryPart = -imaginaryPart;
            }
            return new ComplexNumber(realPart, imaginaryPart);
        } else {
            throw new IllegalArgumentException("Invalid complex number format.");
        }
    }
}
