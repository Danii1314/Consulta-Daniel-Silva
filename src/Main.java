import ClaseAbstracta.EquipoPrimera;

public class Main {
    public static void main(String[] args) {
        // Crear un equipo
        EquipoPrimera barcelona = new EquipoPrimera("FC Barcelona", "Barcelona",
                "Xavi Hernández", 500.0);

        // Gestionar el equipo
        barcelona.fichaje("Lewandowski");
        barcelona.fichaje("Gavi");
        barcelona.fichaje("Pedri");

        // Mostrar información del equipo
        barcelona.jugarEnCasa();
        barcelona.establecerTactica();
        barcelona.mostrarPlantilla();
        barcelona.mostrarPresupuesto();

        // Crear y gestionar un jugador
        Jugador jugador = new Jugador("Lewandowski", 9, "Delantero");
        jugador.entrenar();
        jugador.jugarPartido();

        // Realizar cambios en el equipo
        barcelona.cambiarEntrenador("Nuevo Entrenador");
        barcelona.venta("Gavi");
        barcelona.mostrarPlantilla();
    }
}
