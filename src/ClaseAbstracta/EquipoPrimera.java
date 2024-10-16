package ClaseAbstracta;
import Interfaces.GestionEquipo;

public abstract class EquipoPrimera extends EquipoFutbol implements GestionEquipo {
    private String entrenador;
    private double presupuesto;

    // Constructor
    public EquipoPrimera(String nombre, String ciudad, String entrenador, double presupuesto) {
        super(nombre, ciudad);  // Llamada al constructor de la clase padre
        this.entrenador = entrenador;
        this.presupuesto = presupuesto;
    }

    // Implementación de los métodos de la interface GestionEquipo
    @Override
    public void fichaje(String jugador) {
        plantilla.add(jugador);
        System.out.println("¡" + jugador + " ha fichado por " + nombre + "!");
    }

    @Override
    public void venta(String jugador) {
        if (plantilla.remove(jugador)) {
            System.out.println(jugador + " ha sido vendido por " + nombre);
        } else {
            System.out.println("El jugador no está en la plantilla");
        }
    }

    @Override
    public void mostrarPlantilla() {
        System.out.println("\nPlantilla de " + nombre + ":");
        for (String jugador : plantilla) {
            System.out.println("- " + jugador);
        }
    }

    // Implementación del método abstracto de EquipoFutbol
    @Override
    public void establecerTactica() {
        System.out.println(nombre + " juega con un 4-3-3 ofensivo");
    }

    // Métodos propios de EquipoPrimera
    public void cambiarEntrenador(String nuevoEntrenador) {
        System.out.println("El entrenador " + this.entrenador + " ha sido reemplazado por " + nuevoEntrenador);
        this.entrenador = nuevoEntrenador;
    }

    public void mostrarPresupuesto() {
        System.out.println("Presupuesto de " + nombre + ": " + presupuesto + " millones");
    }
}
