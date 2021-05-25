package herencia01;
public class Trabajador extends Persona {// el extends permite traer lo de persona a trabajador
    private double salario;
        private double deduc;
            public Trabajador (){
                
        super();//el super invoca el constructor
        this.salario=0.00;
        this.deduc=0.00;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDeduc() {
        deduc=salario*0.0934;
        return deduc;
    }

    public void setDeduc(double deduc) {
        this.deduc = deduc;
    }

    public double getSalarioNeto() {
        salarioNeto=salario-deduc;
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
    @Override//sobrecargando el metodo
    public void mostrarMensaje(){
        super.mostrarMensaje();//llamando el metodo de la superclase
    }
            
}
