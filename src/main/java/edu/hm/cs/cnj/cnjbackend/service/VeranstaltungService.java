package edu.hm.cs.cnj.cnjbackend.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hm.cs.cnj.backend.persistence.Veranstaltung;
import edu.hm.cs.cnj.backend.persistence.VeranstaltungRepository;

@Service
@Transactional
public class VeranstaltungService {
	
	@Autowired
	private VeranstaltungRepository repository;

	public Long erzeugeVeranstaltung() {
		Veranstaltung veranstaltung = new Veranstaltung();
		repository.save(veranstaltung);
		return veranstaltung.getId();
	}
}