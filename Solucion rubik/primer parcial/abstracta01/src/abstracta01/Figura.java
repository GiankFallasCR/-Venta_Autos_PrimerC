package abstracta01;
public abstract class Figura {
protected double base;
protected double altura;
protected double area;
protected double perim; 
// aqui solo va lo que tienen en comun
protected abstract double calcularArea();//el punto gris significa que la clase abstracta fue bien diseñada
protected abstract double calcularPerim();
}
