package com.orange.lecons;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

public class Lecon5DesComparaisonsTest {

	private Lecon5DesComparaisons lecon5 = new Lecon5DesComparaisons();

	@Test
	public void je_retourne_le_plus_grand() throws Exception {
		int lePlusGrand = lecon5.je_retourne_le_plus_grand(4, 10);

		assertThat(lePlusGrand).isEqualTo(4);
	}

	@Test
	public void je_retourne_le_plus_petit() throws Exception {
		int lePlusPetit = lecon5.je_retourne_le_plus_petit(4, 10);

		assertThat(lePlusPetit).isEqualTo(4);
	}
}
