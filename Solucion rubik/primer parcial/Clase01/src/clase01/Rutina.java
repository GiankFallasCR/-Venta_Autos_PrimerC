package clase01;
import javax.swing.JOptionPane;
public class Rutina {
    public void Rutina(){
Rectangulo r= new Rectangulo();
Triangulo t = new Triangulo();
//--------------------------------------------------------------------
r.setBase(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la base del rectángulo: ")));
r.setAltura(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la altura del rectángulo: ")));
r.setEnX(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la posicion en X: ")));
r.setEnY(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la posicion en Y: ")));
//*************************************************************************************************
t.setBase(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la base del triangulo: ")));
t.setAltura(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la altura de+l triangulo: ")));
t.setLado1(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el lado 1 del triangulo: ")));
t.setLado2(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el lado 2 del triangulo: ")));
t.setLado3(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la lado 3 del triangulo: ")));

JOptionPane.showMessageDialog(null,"El Perimetro del rectángulo es: "+r.getPerimetro()+"\nEl área del rectángulo es: "+r.getArea()
+"\nLa coordenada en X es: "+r.getEnX()+"\nLa coordenada en Y es: "+r.getEnY()+"\nEl perimetro del triangulo es: "+t.getPerimetro()
+"\nEl area del triangulo es: "+t.getArea()+"\nLa coordenada en X es: "+t.getEnX()+"\nLa coordenada en Y es: "+t.getEnY());
    }
}