package clase04;
public class Cuadrado extends cCuadrilatero {
    protected int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    @Override
    public int getArea(){
        area=(lado*lado);
        return area;
    }
    @Override
    public int getPerimetro(){
       perimetro=(lado+lado)*2; 
       return perimetro;
    }
}
