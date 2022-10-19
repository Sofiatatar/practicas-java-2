/*
  Crear una clase llamada Operacion que tenga como atributos privados el numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
16
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package ejercicio3;

/**
 *
 * @author Sofi
 */
public class main {
    public static void main(String[] args) {
        
        OperationControl control = new OperationControl();
        Operation operation1 = control.newOperation();
        
        int adittion = control.adittion(operation1.getNumber1(), operation1.getNumber2());
        int subtraction = control.subtraction(operation1.getNumber1(), operation1.getNumber2());
        int multiplication = control.multiplication(operation1.getNumber1(), operation1.getNumber2());
        int division = control.division(operation1.getNumber1(), operation1.getNumber2());
 
        System.out.println("El resultado de la suma de ambos numeros es: " + adittion);
        System.out.println("El resultado de la resta de ambos numeros es: " + subtraction);
        
        if(multiplication==0){
            System.out.println("Error en el procedimiento de multiplicacion: Uno de los valores ingresados es 0.");
        }else {
        System.out.println("El resultado de la multiplicacion de ambos numeros es: " + multiplication);   
        }
        
        if(division==0){
            System.out.println("Error en el procedimiento de division: Uno de "
                    + "los valores ingresados es 0 o el dividendo es menor que "
                    + "el divisor.");
        }else {
         System.out.println("El resultado de la division de ambos numeros es: " + division);
    }
}
}
 