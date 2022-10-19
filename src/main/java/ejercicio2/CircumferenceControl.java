
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class CircumferenceControl {
    

public Circumference createCircumference() {
    
    Scanner read = new Scanner(System.in);
    double radio;
    
    System.out.println("Ingrese el radio de la circunferencia a calcular:");
    radio = read.nextDouble();
    
    return new Circumference(radio);
}

public void calculateArea(double radio) {
    
    double area = Math.PI * Math.pow(radio, 2);
    System.out.println("El area de la circunferencia es:" + area);
}

public void calculatePerimetro(double radio) {
    double perimetro = (2 * Math.PI * radio);
    System.out.println("El perimetro de la circunferencia es:" + perimetro);
}

}
