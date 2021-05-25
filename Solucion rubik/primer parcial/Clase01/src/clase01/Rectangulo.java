package clase01;
public class Rectangulo extends Figura {
    private int altura;
    private int base;
    
    public Rectangulo(){
        super();
        this.altura=0;
        this.base=0;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getPerimetro() {
        perimetro=(base+altura)*2;
        return perimetro;
    }

    public int getArea() {
        area=base*altura;
        return area;
    }

    public int getEnY() {
        return enY;
    }

    public void setEnY(int enY) {
        this.enY = enY;
    }

    public int getEnX() {
        return enX;
    }

    public void setEnX(int enX) {
        this.enX = enX;
    }
    
    
}
