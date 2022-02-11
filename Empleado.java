
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
    
    public Empleado(String nom, String ap, double sal, int dia, int mes, int año) {
        nombre = new String(nom);
        apellido = new String(ap);
        numeroEmpleado = 100;
        ingreso = new Date(año, mes, dia);
        setSalario(sal);
    }
    
    public void setSalario(double nuevoSalario)
    {
        salario = (nuevoSalario > 0) ? nuevoSalario : 1.0;
    }
    
    
}
