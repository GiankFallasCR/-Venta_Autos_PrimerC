package abstracta01;

import javax.swing.JOptionPane;

public class Main {
        public static void main(String[] args) {
            Rectangulo r = new Rectangulo();//CONSTRUCTOR
            Triangulo t = new Triangulo();//CONSTRUCTOR TRIANGULO
            //AQUI EMPIEZA EL RECTANGULO
            r.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite la base del rectágulo: ")));
            r.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite la altura del rectángulo: ")));
            //AQUI EMPIEZA EL TRIANGULO
            t.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite la base del triángulo: ")));
            t.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite la altura del triángulo: ")));
            //ESTO ES UN MENSAJE
            JOptionPane.showMessageDialog(null, "CÁLCULOS \n\n"+"Área del rectángulo: "+r.calcularArea()+"\nPerímetro del rectángulo: "+r.calcularPerim()
            +"\n\nÁrea del Triángulo: "+t.calcularArea()+"\nPerímetro del Triángulo: "+t.calcularPerim());
        }
    
}
