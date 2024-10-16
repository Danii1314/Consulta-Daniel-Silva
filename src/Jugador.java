import Interfaces.AccionesJugador;

public class Jugador implements AccionesJugador {
    private String nombre;
    private int numero;
    private String posicion;

    // Constructor
    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    // Implementación de los métodos de la interface AccionesJugador
    @Override
    public void entrenar() {
        System.out.println(nombre + " está entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println(nombre + " (#" + numero + ") sale al campo como " + posicion);
    }

    @Override
    public void descansar() {
        System.out.println(nombre + " está en período de recuperación");
    }
}
