/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Sofi
 */
public class Rectangle {
    
    private int base;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int base, int altura) {
        this.base = base;
        this.height = altura;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int altura) {
        this.height = altura;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "base=" + base + ", altura=" + height + '}';
    }
}