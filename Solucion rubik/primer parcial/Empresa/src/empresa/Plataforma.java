package empresa;
public class Plataforma extends Empleado {
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
        salario=salario-(salario*0.1433);
        return salario;
    }
     @Override
    public String digitaNombre(){
        nombre=nombre;
        return nombre;
    }
}
