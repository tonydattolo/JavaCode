package LabsMaven.Lab7;

import static java.lang.Math.*;

public class StandardComplex {

    private double realPart;
    private double imaginaryPart;


    public StandardComplex() {
        // this.realPart
        // this.imaginaryPart
    }

    public StandardComplex(double real, double imag) {
        this.realPart = real;
        this.imaginaryPart = imag;
    }

    @Override
    public String toString() {
        return realPart + "+" + imaginaryPart + "i";
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public boolean isEqual(Object obj) {
        if (obj instanceof StandardComplex) {
            StandardComplex objSC = (StandardComplex) obj;
            if ((abs(this.getRealPart() - objSC.getRealPart()) < .001)
                    && (abs(this.getImaginaryPart() - objSC.getImaginaryPart()) < .001)) {
                return true;
            } else {
                return false;
            }
        } else {
            PolarComplex objPC = this.getPolarComplex();
            if ((abs(this.getRealPart() - objPC.getAmplitude()) < .001)
                    && (abs(this.getImaginaryPart() - objPC.getAngle()) < .001)) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Conjugate current complex number. (a + bi) conjugated = (a - bi)
     * 
     * @return Conjugated complex number (a - bi)
     */
    public StandardComplex getConjugate() {
        StandardComplex conjugatedSC = new StandardComplex();
        conjugatedSC.setRealPart(this.getRealPart());
        conjugatedSC.setImaginaryPart(this.getImaginaryPart() * -1);
        return conjugatedSC;
    }

    /**
     * Deep copy of current StandardComplex class. Retains same values at a different reference.
     * 
     * @return deepCopySC is a new instance of the existing StandardComplex class
     */
    public StandardComplex getStandardComplex() {
        StandardComplex deepCopySC = new StandardComplex();
        deepCopySC.setRealPart(this.getRealPart());
        deepCopySC.setImaginaryPart(this.getImaginaryPart());
        return deepCopySC;
    }

    /**
     * Convert complex number in standard form to polar form. let 0 denote theta z = x + iy z =
     * r(cos0 + isin0) r = |z| = sqrt(x**2 + y**2) cos0 = x / |z| sin0 = y / |z| 0 = tan**-1(b/a)
     * Polar Form: r cos0 + (r sin0)i
     * 
     * @return Current complex number in polar form
     */
    public PolarComplex getPolarComplex() {
        PolarComplex converted = new PolarComplex();
        double a = this.getRealPart();
        double b = this.getImaginaryPart();
        double r = sqrt(pow(a, 2) + pow(b, 2));
        double theta;
        if (a > 0 && b > 0) {
            theta = atan(b / a);
        } else if (a > 0 && b < 0) {
            theta = atan(b / a) + (2*PI);
        } else {
            theta = atan(b/a) + PI;
        }
        converted.setAmplitude(r * cos(theta));
        converted.setAngle(r * sin(theta));

        return converted;
    }


    public StandardComplex add(Object other) {
        if (other instanceof StandardComplex) {
            StandardComplex addedSC = new StandardComplex();
            StandardComplex otherSC = (StandardComplex) other;

            addedSC.setRealPart(this.getRealPart() + otherSC.getRealPart());
            addedSC.setImaginaryPart(this.getImaginaryPart() + otherSC.getImaginaryPart());
            return addedSC;
        } else {
            StandardComplex addedSC = new StandardComplex();
            PolarComplex otherPC = (PolarComplex) other;
            StandardComplex otherSC = otherPC.getStandardComplex();
            addedSC.setRealPart(this.getRealPart() + otherSC.getRealPart());
            addedSC.setImaginaryPart(this.getImaginaryPart() + otherSC.getImaginaryPart());
            return addedSC;
        }

    }

    public StandardComplex subtract(Object other) {
        if (other instanceof StandardComplex) {
            StandardComplex subtractedSC = new StandardComplex();
            StandardComplex otherSC = (StandardComplex) other;
            subtractedSC.setRealPart(this.getRealPart() - otherSC.getRealPart());
            subtractedSC.setImaginaryPart(this.getImaginaryPart() - otherSC.getImaginaryPart());
            return subtractedSC;    
        } else {
            StandardComplex subtractedSC = new StandardComplex();
            PolarComplex otherPC = (PolarComplex) other;
            StandardComplex otherSC = otherPC.getStandardComplex();
            subtractedSC.setRealPart(this.getRealPart() - otherSC.getRealPart());
            subtractedSC.setImaginaryPart(this.getImaginaryPart() - otherSC.getImaginaryPart());
            return subtractedSC;    
        }
    }

    public StandardComplex multiply(Object other) {
        if (other instanceof StandardComplex) {
            StandardComplex multipliedSC = new StandardComplex();
            StandardComplex otherSC = (StandardComplex) other;
            multipliedSC.setRealPart((this.getRealPart() * otherSC.getRealPart())
                    - (this.getImaginaryPart() * otherSC.getImaginaryPart()));
            multipliedSC.setImaginaryPart((this.getRealPart() * otherSC.getImaginaryPart())
                    + (this.getImaginaryPart() * otherSC.getRealPart()));
            return multipliedSC;            
        } else {
            StandardComplex multipliedSC = new StandardComplex();
            PolarComplex otherPC = (PolarComplex) other;
            StandardComplex otherSC = otherPC.getStandardComplex();
            multipliedSC.setRealPart((this.getRealPart() * otherSC.getRealPart())
                    - (this.getImaginaryPart() * otherSC.getImaginaryPart()));
            multipliedSC.setImaginaryPart((this.getRealPart() * otherSC.getImaginaryPart())
                    + (this.getImaginaryPart() * otherSC.getRealPart()));
            return multipliedSC;            
        }

    }

    public StandardComplex divide(Object other) {
        if (other instanceof StandardComplex) {
            StandardComplex dividedSC = new StandardComplex();
            StandardComplex otherSC = (StandardComplex) other;
            try {
                dividedSC.setRealPart(((this.getRealPart() * otherSC.getRealPart())
                        + (this.getImaginaryPart() * otherSC.getImaginaryPart()))
                        / (pow(otherSC.getRealPart(), 2) + pow(otherSC.getImaginaryPart(), 2)));

                dividedSC.setImaginaryPart(((this.getImaginaryPart() * otherSC.getRealPart())
                        - (this.getRealPart() * otherSC.getImaginaryPart()))
                        / (pow(otherSC.getRealPart(), 2) + pow(otherSC.getImaginaryPart(), 2)));
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by Zero, try again");
            }
            return dividedSC;    
        } else {
            StandardComplex dividedSC = new StandardComplex();
            PolarComplex otherPC = (PolarComplex) other;
            StandardComplex otherSC = otherPC.getStandardComplex();
            try {
                dividedSC.setRealPart(((this.getRealPart() * otherSC.getRealPart())
                        + (this.getImaginaryPart() * otherSC.getImaginaryPart()))
                        / (pow(otherSC.getRealPart(), 2) + pow(otherSC.getImaginaryPart(), 2)));

                dividedSC.setImaginaryPart(((this.getImaginaryPart() * otherSC.getRealPart())
                        - (this.getRealPart() * otherSC.getImaginaryPart()))
                        / (pow(otherSC.getRealPart(), 2) + pow(otherSC.getImaginaryPart(), 2)));
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by Zero, try again");
            }
            return dividedSC;
        }
    }

}
