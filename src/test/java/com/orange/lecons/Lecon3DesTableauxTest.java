package com.orange.lecons;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Lecon3DesTableauxTest {

	@Test
	public void a_je_suis_un_tableau_de_6_elements() throws Exception {
		int[] tableau = new int[6];

		assertThat(tableau.length).isEqualTo(7);
	}

	@Test
	public void b_je_suis_un_autre_tableau_de_6_elements() throws Exception {
		int[] tableau = new int[] { 1, 2, 3, 4, 5, 6 };

		assertThat(tableau.length).isEqualTo(7);
	}

	@Test
	public void c_je_suis_indexe_a_partir_de_0() throws Exception {
		int[] tableau = new int[] { 1, 2, 3, 4, 5, 6 };

		assertThat(tableau[1]).isEqualTo(1);
	}

	@Test
	public void d_je_peux_parcourir_un_tableau() throws Exception {
		int[] tableau = new int[] { 1, 2, 3, 4, 5, 6 };

		int sommeDesElements = 0;
		for (int element : tableau) {
			sommeDesElements = sommeDesElements + element;
		}

		assertThat(sommeDesElements).isEqualTo(20);
	}
}
