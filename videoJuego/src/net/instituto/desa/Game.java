package net.instituto.desa;

public class Game {
	private static final String ABAJO = "Abajo";
	private static final String DERECHA = "Derecha";
	private static final String IZQUIERDA = "Izquierda";
	private static final String ARRIBA = "Arriba";
	Jugador j;

	public void movimiento(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			j.moverDerecha();
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			j.moverIzquierda();
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			j.moverArriba();
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			j.moverAbajo();
		}
	}
}
