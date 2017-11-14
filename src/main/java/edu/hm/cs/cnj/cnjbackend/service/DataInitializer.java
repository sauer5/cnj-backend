package edu.hm.cs.cnj.cnjbackend.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

	@Autowired
	private VeranstaltungService veranstaltungen;

	@PostConstruct
	public void erstelleDaten() {
		veranstaltungen.erzeugeVeranstaltung();
		veranstaltungen.erzeugeVeranstaltung();
		veranstaltungen.erzeugeVeranstaltung();
	}
}
