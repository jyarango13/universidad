package clase;

/**
 */
public class Jefe {

    //atributos
    String nombres;
    String dni;
    String cargo;
    String area;
    int aniosant;

    //constructor
    public Jefe(String nombres, String dni, String cargo, String area, int aniosant) {
        this.nombres = nombres;
        this.dni = dni;
        this.cargo = cargo;
        this.area = area;
        this.aniosant = aniosant;
    }

    //metodos
    double CalcularSueldoBase() {
        if (cargo.equals("GERENTE") && area.equals("CONTABILIDAD")) {
            return 6000;
        }
        if (cargo.equals("GERENTE") && area.equals("PLANIFICACION")) {
            return 7000;
        }
        if (cargo.equals("SUBGERENTE") && area.equals("CONTABILIDAD")) {
            return 5000;
        }
        if (cargo.equals("SUBGERENTE") && area.equals("PLANIFICACION")) {
            return 6000;
        }
        return 0;
    }

    //método que calcula y retorna el monto de bonificacion en base a los años de antiguedad
    double CalcularBonificacion() {
        if (aniosant <= 7) {
            return 0.05 * CalcularSueldoBase();
        } else {
            return 0.04 * CalcularSueldoBase();
        }
    }
//** método que calcula y retorna el sueldo final 

    double CalcularSueldoFinal() {
        return (CalcularSueldoBase() + CalcularBonificacion());
    }
}
