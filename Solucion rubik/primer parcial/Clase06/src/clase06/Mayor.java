package clase06;
import javax.swing.JOptionPane;
public class Mayor extends Numeros {
    public Mayor(){
super();
    }
    public void setNumero1(int Numero1) {
        this.Numero1 = Numero1;
    }

    public void setNumero2(int Numero2) {
        this.Numero2 = Numero2;
    }

    public int getNumero1() {
        return Numero1;
    }

    public int getNumero2() {
        return Numero2;
    }
    
    public void Valoracion(){
        if(Numero1>Numero2){
            JOptionPane.showMessageDialog(null,"El Número 1 es mayor");
        }else{
            JOptionPane.showMessageDialog(null,"El Número 2 es mayor");
        }
    }
}
