package abstracta01;
public class Triangulo extends Figura {
public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        area=(base*altura)/2;
        return area;
    }
    @Override
    public double calcularPerim(){
        perim=(altura*2)+base;
        return perim;
    }
}
