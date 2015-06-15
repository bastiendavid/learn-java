package com.orange.lecons;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Lecon4DesMethodesTest {

	private Lecon4DesMethodes lecon4 = new Lecon4DesMethodes();

	@Test
	public void a_je_rajoute_2() throws Exception {
		int resultat = lecon4.je_rajoute_2_a(3);

		assertThat(resultat).isEqualTo(4);
	}

	@Test
	public void b_je_rajoute_4() throws Exception {
		int resultat = lecon4.je_rajoute_4_a(6);

		assertThat(resultat).isEqualTo(10);
	}

	@Test
	public void c_je_retourne_le_second_element_du_tableau() throws Exception {
		String[] tableau = { "premier", "second", "troisième", "quatrième", "cinquième", "sixième" };
		String element = lecon4.je_retourne_le_second_element_du_tableau(tableau);

		assertThat(element).isEqualTo("second");
	}
}
