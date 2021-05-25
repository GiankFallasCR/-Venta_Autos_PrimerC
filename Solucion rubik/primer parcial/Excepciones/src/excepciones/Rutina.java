package excepciones;
import java.io.IOException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Rutina {
   private int num;
   private int num2;
   private int arreglo[]={10,20,30,40,50};
   public void leerNumero()throws IOException{
       try{
       num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite uin número: "));
       
   }catch (Exception ex){//al inicio siempre sale con error, luego se corrige// en el catch se captura 
    JOptionPane.showMessageDialog(null,"Ingreso un valor nulo.");
    
            }
        }
   public void leerNumero2(){
    try {
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite otro número: "));
        }catch(NumberFormatException e){//captura error de formato
            JOptionPane.showMessageDialog(null, "Formato Incorrecto.");
        }
}
   public void Dividir (){
     try {
         num= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero: "));
         num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite otro numero: "));
         int divi=num/num2;
         JOptionPane.showMessageDialog(null,"Resultado: "+divi);
     }  catch(ArithmeticException e ){//el metodo es para eerores matematicos, ejemplo la division por cero
         JOptionPane.showMessageDialog(null,"La division por cero no existe.");
     }
   }
    public void imprimirPosicion(){
        try{
            int pos=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la posicion que desea ver: "));
            JOptionPane.showMessageDialog(null,"La posicion contiene: "+arreglo[pos]);
        }catch(ArrayIndexOutOfBoundsException e){//determina si trata de acceder a una posicion que no existe
            JOptionPane.showMessageDialog(null,"La posicion no existe");
        }catch (NumberFormatException ex){//el exception es general, el number es para numericos
            JOptionPane.showMessageDialog(null,"Error de ingreso de informacion");
        }catch (Exception ex){//el exception es general, el number es para numericos
            JOptionPane.showMessageDialog(null,"Error general");
        }
    }

}