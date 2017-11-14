package edu.hm.cs.cnj.cnjbackend.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Veranstaltung {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Veranstaltung() {
		// JPA benoetigt Default-Konstruktor
	}

	public Long getId() {
		return id;
	}

	@Column(length = 140, unique = true)
	@Length(min = 8)
	@NotNull
	private String titel;
	@Column(length = 1000)
	@NotNull
	private String beschreibung;
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date beginn;

	public Veranstaltung(String titel, String beschreibung, Date beginn) {
		super();
		this.titel = titel;
		this.beschreibung = beschreibung;
		this.beginn = beginn;
	}
}