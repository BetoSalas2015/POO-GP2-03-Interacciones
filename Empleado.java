
/**
 * Write a description of class Emplaedo here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
import java.util.Date;

public class Empleado
{
    private String nombre;
    private String apellido;
    private int numeroEmpleado;
    private Date ingreso;
    private double salario;
    private static int idEmpleado = 100;
    
    public Empleado(String nom, String ap, double sal, int dia, int mes, int año) {
        nombre = new String(nom);
        apellido = new String(ap);
        numeroEmpleado = idEmpleado++;
        ingreso = new Date(año, mes, dia);
        setSalario(sal);
    }
    
    public void setSalario(double nuevoSalario)
    {
        salario = (nuevoSalario > 0) ? nuevoSalario : 1.0;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public String getNombre() {
        return new String(nombre);
    }
    
    public String getApellido() {
        return new String(apellido);  // Enfoque 2
    }
    
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }
    
    public Date getIngreso() {
        return new Date();
    }
    
    public String toString() {
        return "Empleado: " + nombre + " " + apellido + ", ID: " + 
                Integer.toString(numeroEmpleado) + 
                " Ingreso: " + ingreso.toString() + ", Salario: " + 
                Double.toString(salario);
    }

    public static void main(String arrgs[]) {
        Empleado empleado1 = new Empleado("Roberto", "Salazar", 800.00, 1, 1, 2000);
        System.out.println( empleado1.toString() );
    }
}












