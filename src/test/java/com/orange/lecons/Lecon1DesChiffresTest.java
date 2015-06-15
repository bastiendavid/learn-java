package com.orange.lecons;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

public class Lecon1DesChiffresTest {

	@Test
	public void je_fais_une_addition() throws Exception {
		int resultat = 2 + 2;
		assertThat(resultat).isEqualTo(6);
	}

	@Test
	public void je_fais_une_soustraction() throws Exception {
		int resultat = 4 - 2;
		assertThat(resultat).isEqualTo(6);
	}

	@Test
	public void je_fais_une_multiplication() throws Exception {
		int resultat = 4 * 2;
		assertThat(resultat).isEqualTo(6);
	}

	@Test
	public void je_fais_une_division() throws Exception {
		int resultat = 8 / 2;
		assertThat(resultat).isEqualTo(6);
	}

	@Test
	public void je_fais_une_division_entiere() throws Exception {
		int resultat = 8 / 3;
		assertThat(resultat).isEqualTo(6);
	}
}
