package LabsMaven.Lab7;

import static java.lang.Math.*;

public class PolarComplex {

    private double amplitude;
    private double angle;

    public PolarComplex(double amp, double ang) {
        this.amplitude = amp;
        this.angle = ang;
    }

    public PolarComplex() {
        this.amplitude = 0;
        this.angle = 0;
    }

    @Override
    public String toString() {
        return "(" + amplitude + "," + angle + ")";
    }

    public double getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(double amplitude) {
        this.amplitude = amplitude;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public boolean isEqual(Object obj) {
        if (obj instanceof PolarComplex) {
            PolarComplex objPC = (PolarComplex) obj;
            if ((abs(this.getAmplitude() - objPC.getAmplitude()) < .001)
                    && (abs(this.getAngle() - objPC.getAngle()) < .001)) {
                return true;
            } else {
                return false;
            }
        } else {
            StandardComplex objSC = this.getStandardComplex();
            if ((abs(this.getAmplitude() - objSC.getRealPart()) < .001) && (abs(this.getAngle() - objSC.getImaginaryPart()) < .001)) {
                return true;
            } else {
                return false;
            }
        }

    }

    public PolarComplex getConjugate() {
        PolarComplex conjugatedPC = new PolarComplex();
        conjugatedPC.setAmplitude(this.getAmplitude());
        conjugatedPC.setAngle(this.getAngle() * -1);
        return conjugatedPC;
    }

    public PolarComplex getPolarComplex() {
        PolarComplex deepCopyPC = new PolarComplex();
        deepCopyPC.setAmplitude(this.getAmplitude());
        deepCopyPC.setAngle(this.getAngle());
        return deepCopyPC;
    }
    /**
     * Convert complex number in Polar form to standard.
     * r = sqrt(x**2 + y**2)
     * @return
     */
    public StandardComplex getStandardComplex() {
        StandardComplex converted = new StandardComplex();
        double x = this.getAmplitude();
        double y = this.getAngle();
        double r = sqrt(pow(x, 2) + pow(y, 2));
        double theta;
        if (x > 0 && y > 0) {
            theta = atan(y/x);
        } else if (x > 0 && y < 0) {
            theta = atan(y/x) + (2*PI);
        } else {
            theta = atan(y/x) + PI;
        }
        converted.setRealPart(r * cos(theta));
        converted.setImaginaryPart(r * sin(theta));
        return converted;
    }


    public PolarComplex add(Object other) {
        if (other instanceof PolarComplex) {
            PolarComplex addedPC = new PolarComplex();
            PolarComplex otherSC = (PolarComplex) other;
            addedPC.setAmplitude(this.getAmplitude() + otherSC.getAmplitude());
            addedPC.setAngle(this.getAngle() + otherSC.getAngle());
            return addedPC;
        } else {
            PolarComplex addedPC = new PolarComplex();
            StandardComplex otherSC = (StandardComplex) other;
            PolarComplex otherPC = otherSC.getPolarComplex();
            addedPC.setAmplitude(this.getAmplitude() + otherPC.getAmplitude());
            addedPC.setAngle(this.getAngle() + otherPC.getAngle());
            return addedPC;
        }
    }

    public PolarComplex subtract(Object other) {
        if (other instanceof PolarComplex) {
            PolarComplex subtractedPC = new PolarComplex();
            PolarComplex otherSC = (PolarComplex) other;
            subtractedPC.setAmplitude(this.getAmplitude() - otherSC.getAmplitude());
            subtractedPC.setAngle(this.getAngle() - otherSC.getAngle());
            return subtractedPC;   
        } else {
            PolarComplex subtractedPC = new PolarComplex();
            StandardComplex otherSC = (StandardComplex) other;
            PolarComplex otherPC = otherSC.getPolarComplex();
            subtractedPC.setAmplitude(this.getAmplitude() - otherPC.getAmplitude());
            subtractedPC.setAngle(this.getAngle() - otherPC.getAngle());
            return subtractedPC;            
        }
    }

    public PolarComplex multiply(Object other) {
        if (other instanceof PolarComplex) {
            PolarComplex multipliedPC = new PolarComplex();
            PolarComplex otherPC = (PolarComplex) other;
            multipliedPC.setAmplitude((this.getAmplitude() * otherPC.getAmplitude())
                    - (this.getAmplitude() * otherPC.getAngle()));
            multipliedPC.setAngle((this.getAmplitude() * otherPC.getAngle())
                    + (this.getAngle() * otherPC.getAmplitude()));
            return multipliedPC;
        } else {
            PolarComplex multipliedPC = new PolarComplex();
            StandardComplex otherSC = (StandardComplex) other;
            PolarComplex otherPC = otherSC.getPolarComplex();
            multipliedPC.setAmplitude((this.getAmplitude() * otherPC.getAmplitude())
                    - (this.getAmplitude() * otherPC.getAngle()));
            multipliedPC.setAngle((this.getAmplitude() * otherPC.getAngle())
                    + (this.getAngle() * otherPC.getAmplitude()));
            return multipliedPC;
        }
    }

    public PolarComplex divide(Object other) {
        if (other instanceof PolarComplex) {
            PolarComplex dividedSC = new PolarComplex();
            PolarComplex otherPC = (PolarComplex) other;
            try {
                dividedSC.setAmplitude(((this.getAmplitude() * otherPC.getAmplitude())
                        + (this.getAngle() * otherPC.getAngle()))
                        / (pow(otherPC.getAmplitude(), 2) + pow(otherPC.getAngle(), 2)));
                dividedSC.setAngle(((this.getAngle() * otherPC.getAmplitude())
                        - (this.getAmplitude() * otherPC.getAngle()))
                        / (pow(otherPC.getAmplitude(), 2) + pow(otherPC.getAngle(), 2)));
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by Zero, try again");
            }
            return dividedSC;
        } else {
            PolarComplex dividedSC = new PolarComplex();
            StandardComplex otherSC = (StandardComplex) other;
            PolarComplex otherPC = otherSC.getPolarComplex();
            try {
                dividedSC.setAmplitude(((this.getAmplitude() * otherPC.getAmplitude())
                        + (this.getAngle() * otherPC.getAngle()))
                        / (pow(otherPC.getAmplitude(), 2) + pow(otherPC.getAngle(), 2)));
                dividedSC.setAngle(((this.getAngle() * otherPC.getAmplitude())
                        - (this.getAmplitude() * otherPC.getAngle()))
                        / (pow(otherPC.getAmplitude(), 2) + pow(otherPC.getAngle(), 2)));
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by Zero, try again");
            }
            return dividedSC;
        }
    }

}
