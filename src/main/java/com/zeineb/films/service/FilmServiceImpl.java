package com.zeineb.films.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeineb.films.Repos.FilmRepository;
import com.zeineb.films.entities.Film;
import com.zeineb.films.entities.Genre;

@Service
public class FilmServiceImpl implements FilmService{
	
	@Autowired
	FilmRepository filmRepository;


	@Override
	public Film saveFilm(Film f) {
		return filmRepository.save(f);
	}

	@Override
	public Film updateFilm(Film f) {
		return filmRepository.save(f);
	}

	@Override
	public void deleteFilm(Film f) {
		filmRepository.delete(f);
	}

	@Override
	public void deleteFilmById(Long id) {
		filmRepository.deleteById(id);
	}

	@Override
	public Film getFilm(Long id) {
		return filmRepository.findById(id).get();
	}

	@Override
	public List<Film> getAllFilms() {
		return filmRepository.findAll();
	}

	@Override
	public List<Film> findByTitreFilm(String titre) {
		return filmRepository.findByTitreFilm(titre);
	}

	@Override
	public List<Film> findByTitreFilmContains(String titre) {
		return filmRepository.findByTitreFilmContains(titre);
	}

	@Override
	public List<Film> findByTitreRealisateur(String titre, String realis) {
		return filmRepository.findByTitreRealisateur(titre,realis);
	}

	@Override
	public List<Film> findByGenre(Genre genre) {
		return filmRepository.findByGenre(genre);
	}

	@Override
	public List<Film> findByGenreIdGenre(Long id) {
		return filmRepository.findByGenreIdGenre(id);
	}

	@Override
	public List<Film> findByOrderByTitreFilmAsc() {
		return filmRepository.findByOrderByTitreFilmAsc();
	}

	@Override
	public List<Film> findByOrderByTitreFilmDesc() {
		return filmRepository.findByOrderByTitreFilmDesc();
	}

}
