package com.zeineb.films.service;

import java.util.List;

import com.zeineb.films.entities.Film;
import com.zeineb.films.entities.Genre;

public interface FilmService {
	Film saveFilm(Film f);
	Film updateFilm(Film f);
	void deleteFilm(Film f);
	void deleteFilmById(Long id);
	Film getFilm(Long id);
	List<Film> getAllFilms();
	List<Film> findByTitreFilm(String titre);
	List<Film> findByTitreFilmContains(String titre);
	List<Film> findByTitreRealisateur (String titre, String realis);
	List<Film> findByGenre (Genre genre);
	List<Film> findByGenreIdGenre(Long id);
	List<Film> findByOrderByTitreFilmAsc();
	List<Film> findByOrderByTitreFilmDesc();
	

}
