package empresa;
    public abstract class Empleado {
        
    protected String nombre;
    protected double salario;

    public abstract void setNombre(String nombre);

    public abstract void setSalario(double salario);
    
    
    protected abstract double calculaSalario();    
    protected abstract String digitaNombre();
    
}
