package com.orange.lecons;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Lecon2DesCaracteresTest {

	@Test
	public void a_je_suis_une_chaine_de_caracteres() throws Exception {
		String uneChaine = "Je suis une chaîne de caractères";

		assertThat(uneChaine).isEqualTo("Je suis une autre chaîne de caractères");
	}

	@Test
	public void b_je_peux_concatener_des_chaines() throws Exception {
		String unePremiereChaine = "Que la force";
		String uneSecondeChaine = "soit avec toi";

		assertThat(unePremiereChaine + uneSecondeChaine).isEqualTo("Que la force soit avec toi");
	}
}
