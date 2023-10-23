package com.zeineb.films.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity 
public class Film {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFilm;
	private String titreFilm;
	private String realisateur;
	private Date dateSortie;
	
	@ManyToOne
	private Genre genre;
	
	
	public Film(String titreFilm, String realisateur, Date dateSortie) {
		super();
		this.titreFilm = titreFilm;
		this.realisateur = realisateur;
		this.dateSortie = dateSortie;
	}
	
	public Film() {
		super();
	}
	
	public long getIdFilm() {
		return idFilm;
	}
	
	public void setIdFilm(long idFilm) {
		this.idFilm = idFilm;
	}
	
	public String getTitreFilm() {
		return titreFilm;
	}
	
	public void setTitreFilm(String titreFilm) {
		this.titreFilm = titreFilm;
	}
	
	public String getRealisateur() {
		return realisateur;
	}
	
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	
	public Date getDateSortie() {
		return dateSortie;
	}
	
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", titreFilm=" + titreFilm + ", realisateur=" + realisateur + ", dateSortie="
				+ dateSortie + "]";
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

}
