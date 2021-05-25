package abstracta01;
public class Rectangulo extends Figura {
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        area=base*altura;
        return area;
    }
    @Override
    public double calcularPerim(){
        perim=(base*2)+(altura*2);
        return perim;
    }
}
