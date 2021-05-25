package clase07;
public class Operacion extends Numeros {

    private int total;

    public int getNumero1() {
        return Numero1;
    }

    public void setNumero1(int Numero1) {
        this.Numero1 = Numero1;
    }

    public int getNumero2() {
        return Numero2;
    }

    public void setNumero2(int Numero2) {
        this.Numero2 = Numero2;
    }
    @Override
    public int Suma(){
       total=Numero1+Numero2;
       return total;
    }
    @Override
    public int Resta(){
        total=Numero1-Numero2;
        return total;
    }
    @Override
    public int Division(){
        total=Numero1/Numero2;
        return total;
    }
    @Override
    public int Multiplicacion(){
        total=Numero1*Numero2;
        return total;
    }
}
