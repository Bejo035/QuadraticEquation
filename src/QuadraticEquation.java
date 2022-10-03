import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.ServerError;


public class QuadraticEquation {
    private double A;
    private double B;
    private double C;
    private double D;

    QuadraticEquation(double A, double B, double C) {
        set(A);
        this.B = B;
        this.C = C;
        this.D = B * B - 4 * A * C;
    }

    void set(double A) {
        if (A == 0) throw new Error("A must not be 0!!");
        this.A = A;
    }

    double getA(){return this.A;}

    double getB(){return this.B;}

    double getC(){return this.C;}

    double getRl(){
        return -B / (2 * A);
    }
    double getIm(){
        return Math.sqrt(Math.abs(D)) / (2 * A);
    }
    double getD(){
        return this.D;
    }

    @Override
    public String toString() {
        String tmp;
        tmp = "A = " + A + "\tB = " + B + "\tC = " + C + "\tRl = " + getRl() + "\tIm = " + getIm() + "\n";
        if (D >= 0) {
            double X1 = getRl() + getIm();
            double X2 = getRl() - getIm();
            tmp += "X1 = " + X1 + "\nX2 = " + X2 + "\n";
        } else {
            tmp += "X1 = " + getRl() + " + " + getIm() + " * i " + "\nX2 = " + getRl() + " - " + getIm() + " * i\n";
        }
        return tmp;
    }
}