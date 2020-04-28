package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int moverDerecha() {
		x = x+1;
		return x;
	}
	
	public int moverIzquierda() {
		x = x-1;
		return x;
	}
	
	public int moverArriba() {
		y = y-1;
		return y;
	}
	
	public int moverAbajo() {
		y = y+1;
		return y;
	}

}
