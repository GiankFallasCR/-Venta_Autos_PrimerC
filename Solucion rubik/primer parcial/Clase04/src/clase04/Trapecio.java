package clase04;
public class Trapecio extends cCuadrilatero{
    private int perimetro;
    private int area;
    private int altura;
    private int lado1;
    private int lado2;
    private int lado3;
    private int lado4;
    
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

    public int getLado4() {
        return lado4;
    }

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }

    public int getBase() {
        return Base;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }
    @Override
public int getArea(){
    area=((Base+baseMenor)/2)*altura;
    return area;
}
    @Override
public int getPerimetro(){
    perimetro=lado1+lado2+lado3+lado4;
    return perimetro;
    }
}