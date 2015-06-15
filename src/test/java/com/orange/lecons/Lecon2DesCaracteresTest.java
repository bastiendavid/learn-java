package com.orange.lecons;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

public class Lecon2DesCaracteresTest {

	@Test
	public void je_suis_une_chaine_de_caracteres() throws Exception {
		String uneChaine = "Je suis une chaîne de caractères";
		assertThat(uneChaine).isEqualTo("Je suis une autre chaîne de caractères");
	}

	@Test
	public void je_peux_concatener_des_chaines() throws Exception {
		String unePremiereChaine = "Que la force";
		String uneSecondeChaine = "soit avec toi";
		assertThat(unePremiereChaine + uneSecondeChaine).isEqualTo("Que la force soit avec toi");
	}
}
