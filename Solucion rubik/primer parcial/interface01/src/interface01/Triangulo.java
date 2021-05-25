package interface01;
public class Triangulo implements Area,Perimetro{//implements es solom para interfaces, las interfaces son como herencia multiple
    protected double Base;
    protected double Altura;

    public double getBase() {
        return Base;
    }

    public void setBase(double setBase) {
        this.Base = setBase;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double setAltura) {
        this.Altura = setAltura;
    }
    @Override
public double calcularArea(){//este metodo retorna automaticamente
    return (Base*Altura)/2;
    
}    
@Override
    public double calcularPerim(){
        return Base+Altura*2;
    }
}
