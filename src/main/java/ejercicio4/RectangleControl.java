package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class RectangleControl {

    public Rectangle newRectangle() {

        Scanner read = new Scanner(System.in);
        int base;
        int height;

        System.out.println("Ingrese la medida de la base del rectangulo");
        base = read.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        height = read.nextInt();

        return new Rectangle(base, height);
    }

    public void calculateArea(int base, int height) {

        System.out.println("El area del rectangulo es: " + (base * height));
    }

    public void calculatePerimeter(int base, int height) {

        System.out.println("El perimetro del rectangulo es: " + ((base * height) * 2));
    }

    public void drawRectangle(int base, int height) {

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < base; j++) {

                if (i == 0 || i == (height - 1)) {
                    System.out.print("*");
                } else if (j == 0 || j == (base - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
