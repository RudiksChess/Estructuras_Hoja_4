import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebasJunit {
	Calculadora prueba = new Calculadora();
	VECTOR pila_1 =new VECTOR();
	ARRAYLIST pila_2=new ARRAYLIST();

	@Test
	void test() {
		
		String cadena = "53 2 + 8 * 10 /"; 
		double respuesta=prueba.resolver(cadena,1);
		assertEquals(44,respuesta);
		
	}
	@Test
	void test2() {
		String cadena = "53 2 + 8 * 10 /"; 
		double respuesta=prueba.resolver(cadena,2);
		assertEquals(44,respuesta);
		
	}
	@Test
	void test3() {
		String cadena = "53 2 + 8 * 10 /"; 
		double respuesta=prueba.resolver(cadena,3);
		assertEquals(44,respuesta);
		
	}
	@Test
	void stacks() {
		String cadena = "53 2 + 8 * 10 /"; 
		double respuesta=prueba.resolver(cadena,4);
		assertEquals(44,respuesta);
	}
	
	void stucks() {
		String cadena = "53 2 + 8 * 10 /"; 
		double respuesta=prueba.resolver(cadena,4);
		assertEquals(44,respuesta);
	}
	void sticks() {
		String cadena = "53 2 + 8 * 10 /"; 
		double respuesta=prueba.resolver(cadena,4);
		assertEquals(44,respuesta);
	}
	void nice() {
		String cadena = "53 2 + 8 * 10 /"; 
		double respuesta=prueba.resolver(cadena,4);
		assertEquals(44,respuesta);
	}

}
