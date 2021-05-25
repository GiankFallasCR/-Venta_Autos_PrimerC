    package interface03;
        import javax.swing.JOptionPane;
            public class Calculo extends Dato implements Figura,Figura2 {//se puede extender e implementar al mismo tiempo 
public Calculo(){
    this.Dato=0;    
}
@Override
    public void setDato(int Dato) {
        this.Dato = Dato;
    }
    @Override
public int calcularArea(){
    return Dato*Dato;
}
public int calcularAreaC(){
    return (int)(Math.PI*(Math.pow(Dato,2)));//math . pow permite elevar a una potencia
}
public int calcularPeriC(){
    return (int)(2*Math.PI*Dato);
}
@Override
public int calcularPerim(){
    return Dato*4;
}
public void mostrarMensaje(){
    JOptionPane.showMessageDialog(null,"Se ha calcuDato el area y el perimetro de un cuadrado");
        }
    }
