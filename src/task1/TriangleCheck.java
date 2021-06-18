package task1;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        System.out.println("Enter sides of triangle please");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        TriangleCheck triangleCheck = new TriangleCheck();
        try {

            triangleCheck.triangle(a, b, c);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    public void triangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Sides of triangle: a  = " + a + ", b  =  " + b + ", c = " + c);
        } else {
            System.out.println(a + " ," + b + ", " + c + " cannot form a triangle");
            throw new IllegalArgumentException();
        }
    }
}
