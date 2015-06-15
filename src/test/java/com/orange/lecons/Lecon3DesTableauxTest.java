package com.orange.lecons;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

public class Lecon3DesTableauxTest {

	@Test
	public void je_suis_un_tableau_de_6_elements() throws Exception {
		int[] tableau = new int[6];
		assertThat(tableau.length).isEqualTo(7);
	}

	@Test
	public void je_suis_un_autre_tableau_de_6_elements() throws Exception {
		int[] tableau = new int[] { 1, 2, 3, 4, 5, 6 };
		assertThat(tableau.length).isEqualTo(7);
	}

	@Test
	public void je_suis_indexe_a_partir_de_0() throws Exception {
		int[] tableau = new int[] { 1, 2, 3, 4, 5, 6 };
		assertThat(tableau[1]).isEqualTo(1);
	}
}
