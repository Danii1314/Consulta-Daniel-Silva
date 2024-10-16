import ClaseAbstracta.EquipoPrimera;

public class Main {
    public static void main(String[] args) {
        EquipoPrimera barcelona = new EquipoPrimera("FC Barcelona", "Barcelona",
                "Xavi Hernández", 500.0);

        barcelona.fichaje("Lewandowski");
        barcelona.fichaje("Gavi");
        barcelona.fichaje("Pedri");


        barcelona.jugarEnCasa();
        barcelona.establecerTactica();
        barcelona.mostrarPlantilla();
        barcelona.mostrarPresupuesto();


        Jugador jugador = new Jugador("Lewandowski", 9, "Delantero");
        jugador.entrenar();
        jugador.jugarPartido();


        barcelona.cambiarEntrenador("Nuevo Entrenador");
        barcelona.venta("Gavi");
        barcelona.mostrarPlantilla();
    }
}
