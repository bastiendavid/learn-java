package com.orange.lecons;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Lecon1DesChiffresTest {

	@Test
	public void a_je_fais_une_addition() throws Exception {
		int resultat = 2 + 2;

		assertThat(resultat).isEqualTo(6);
	}

	@Test
	public void b_je_fais_une_soustraction() throws Exception {
		int resultat = 4 - 2;

		assertThat(resultat).isEqualTo(6);
	}

	@Test
	public void c_je_fais_une_multiplication() throws Exception {
		int resultat = 4 * 2;

		assertThat(resultat).isEqualTo(6);
	}

	@Test
	public void d_je_fais_une_division() throws Exception {
		int resultat = 8 / 2;

		assertThat(resultat).isEqualTo(6);
	}

	@Test
	public void e_je_fais_une_division_entiere() throws Exception {
		int resultat = 8 / 3;

		assertThat(resultat).isEqualTo(6);
	}
}
