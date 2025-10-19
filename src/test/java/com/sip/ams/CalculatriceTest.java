package com.sip.ams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@Test
	void testSomme() {
		assertEquals(7, Calculatrice.somme(3, 4));
	}
	
	@Test
	void testProduit() {
		assertEquals(12, Calculatrice.produit(3, 4));
	}


}
