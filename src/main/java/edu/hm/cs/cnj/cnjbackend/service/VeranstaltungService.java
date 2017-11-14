package edu.hm.cs.cnj.cnjbackend.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hm.cs.cnj.cnjbackend.persistence.Veranstaltung;
import edu.hm.cs.cnj.cnjbackend.persistence.VeranstaltungRepository;

@Service
@Transactional
public class VeranstaltungService {

	@Autowired
	private VeranstaltungRepository repository;

	public Long erzeugeVeranstaltung(String titel, String beschreibung, Date beginn) {
		Veranstaltung veranstaltung = new Veranstaltung(titel, beschreibung, beginn);
		repository.save(veranstaltung);
		return veranstaltung.getId();
	}
}