package edu.hm.cs.cnj.cnjbackend.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

	@Autowired
	private VeranstaltungService veranstaltungen;

	@PostConstruct
	public void erstelleDaten() {
		veranstaltungen.erzeugeVeranstaltung("100 Jahre Java",
											"Festmahl zu Ehren aller Java-Entwickler",
											new GregorianCalendar(2017, Calendar.JULY, 12, 20, 00, 00).getTime());
	
		veranstaltungen.erzeugeVeranstaltung("Workshop aufrechtes Sitzen",
											"Zertifizierungsworkshop f\u00FCr das Sitzen auf St\u00FChlen mit mindestens drei Beinen.",
											new GregorianCalendar(2018, Calendar.AUGUST, 2, 9, 30, 00).getTime());
	}
}
