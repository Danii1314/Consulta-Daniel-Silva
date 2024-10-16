package ClaseAbstracta;

// Guardar como: EquipoFutbol.java
import java.util.ArrayList;

public abstract class EquipoFutbol {
    // Atributos protegidos accesibles para las clases hijas
    protected String nombre;
    protected String ciudad;
    protected int titulos;
    protected ArrayList<String> plantilla;

    // Constructor
    public EquipoFutbol(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.titulos = 0;
        this.plantilla = new ArrayList<>();
    }

    // Método concreto que heredarán todos los equipos
    public void jugarEnCasa() {
        System.out.println("El " + nombre + " juega de local en " + ciudad);
    }

    // Método abstracto que cada equipo debe implementar
    protected abstract void establecerTactica();
}
