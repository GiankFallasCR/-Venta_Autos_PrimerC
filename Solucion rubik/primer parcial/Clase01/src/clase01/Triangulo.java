package clase01;
public class Triangulo extends Figura {
    private int base;
    private int altura;
    private int lado1;
    private int lado2;
    private int lado3;
    public Triangulo(){
        super ();
        this.altura=0;
        this.base=0;
        this.lado1=0;
        this.lado2=0;
        this.lado3=0;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getPerimetro() {
        perimetro=lado1+lado2+lado3;
        return perimetro;
    }

    public int getArea() {
        area=(base*altura)/2;
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
