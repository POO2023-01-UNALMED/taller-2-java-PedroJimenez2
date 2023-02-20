package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	int cantidadAsientos() {
		int cont = 0;
		for(int i=0;i<asientos.length;i++) {
			if(asientos[i] instanceof Asiento) {
				cont ++;
			}
		}
		return cont;
	}
	String verificarIntegridad() {
		if(registro != motor.registro) {
			return "Las piezas no son originales";
		}
		else{
		for(int i = 0;i<asientos.length;i++) {
				if(asientos[i].registro != registro) {
					return "Las piezas no son originales";
				}
				else {
					return "Auto original";
				}
			}
			return"Auto original";
			}
		}
	}
	

