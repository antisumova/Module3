package Hard;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int Xa = 0;
        int Ya = 6;
        int Xb = 4;
        int Yb = -2;
        int Xc = 2;
        int Yc = 18;
        double lengthAB = Math.sqrt((Math.pow((Xb - Xa), 2) + (Math.pow((Yb - Ya), 2))));
        double lengthAC = Math.sqrt((Math.pow((Xc - Xa), 2) + (Math.pow((Yc - Ya), 2))));
        double lengthBC = Math.sqrt((Math.pow((Xc - Xb), 2) + (Math.pow((Yc - Yb), 2))));
        double p = (lengthAB + lengthAC + lengthBC)/2;
        double S = Math.sqrt((p*(p-lengthAB)*(p-lengthAC)*(p-lengthBC)));
        System.out.println("Площадь треугольника = " + S);
    }
}
