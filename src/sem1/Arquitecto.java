package sem1;

//import javax.swing.JOptionPane;
/**
 */
public class Arquitecto {

    int codigo;
    String nombre;
    String condicionContrato;
    String especialidad;
    String tipoActividad;
    String tipoAfiliacion;

    public Arquitecto(int codigo, String nombre, String condicionContrato, String especialidad, String tipoActividad, String tipoAfiliacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.condicionContrato = condicionContrato;
        this.especialidad = especialidad;
        this.tipoActividad = tipoActividad;
        this.tipoAfiliacion = tipoAfiliacion;
    }

    public double sueldoBase() {
        if (condicionContrato.equals("ESTABLE") && tipoActividad.equals("OBRAS")) {
            return 4000;
        }
        if (condicionContrato.equals("ESTABLE") && tipoActividad.equals("VIAS")) {
            return 6000;
        }
        if (condicionContrato.equals("CONTRATADO") && tipoActividad.equals("OBRAS")) {
            return 2000;
        }
        if (condicionContrato.equals("CONTRATADO") && tipoActividad.equals("VIAS")) {
            return 4500;
        }
        return 0;
    }

    double calcularBonificacion() {
        if (especialidad.equals("ESTRUCTURAS")) {
            return 0.16 * sueldoBase();
        }
        if (especialidad.equals("RECURSOS HIDRICOS")) {
            return 0.18 * sueldoBase();
        }
        return 0;
    }

    double calcularDescuento() {
        if (tipoAfiliacion.equals("AFP")) {
            return 0.15 * sueldoBase();
        }
        if (tipoAfiliacion.equals("SNP")) {
            return 0.08 * sueldoBase();
        }
        return 0;
    }
    double sueldoNeto(){
        return sueldoBase()+calcularBonificacion()-calcularDescuento();
    }
    double sueldoBruto(){
                return sueldoBase()+calcularBonificacion();

    }
}
