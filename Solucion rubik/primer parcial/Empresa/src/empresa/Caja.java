package empresa;
public class Caja extends Empleado {
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public double calculaSalario(){
        salario = salario+5000;
        return salario;
    }
    @Override
    public String digitaNombre(){
        nombre=nombre;
        return nombre;
    }
    
    
}
