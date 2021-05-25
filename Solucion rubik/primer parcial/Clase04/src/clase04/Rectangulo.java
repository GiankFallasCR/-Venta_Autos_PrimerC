package clase04;
public class Rectangulo extends cCuadrilatero {
    private int lado;
    private int altura;

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getLado() {
        return lado;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return Base;
    }
@Override
   public int getArea(){
       area=Base*altura;
       return area;
   }   
   @Override
   public int getPerimetro(){
    perimetro=(Base+lado)*2;   
    return perimetro;
   }
}
