package sem1;

//import javax.swing.JOptionPane;
/**
 */
public class Arquitecto {

    String codigo;
    String nombre;
    String condicionContrato;
    String especialidad;
    String tipoActividad;
    String tipoAfiliacion;

    public Arquitecto(String codigo, String nombre, String condicionContrato, String especialidad, String tipoActividad, String tipoAfiliacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.condicionContrato = condicionContrato;
        this.especialidad = especialidad;
        this.tipoActividad = tipoActividad;
        this.tipoAfiliacion = tipoAfiliacion;
    }

    public double sueldoBase() {
        if (condicionContrato.equals("ESTABLE") && tipoActividad.equals("SUPERVICION DE OBRAS")) {
            return 4000;
        }
        if (condicionContrato.equals("ESTABLE") && tipoActividad.equals("SUPERVICION DE VIAS")) {
            return 6000;
        }
        if (condicionContrato.equals("CONTRATADO") && tipoActividad.equals("SUPERVICION DE OBRAS")) {
            return 2000;
        }
        if (condicionContrato.equals("CONTRATADO") && tipoActividad.equals("SUPERVICION DE VIAS")) {
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
        return (sueldoBase()-calcularDescuento())+calcularBonificacion();
    }
    double sueldoBruto(){
                return sueldoBase()+calcularBonificacion();

    }
}
