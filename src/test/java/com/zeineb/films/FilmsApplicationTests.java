package com.zeineb.films;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.zeineb.films.entities.Film;
import com.zeineb.films.entities.Genre;
import com.zeineb.films.Repos.FilmRepository;

@SpringBootTest
class FilmsApplicationTests {
	
	@Autowired
	private FilmRepository filmRepository;
	@Test
	public void testCreateFilm() {
		Film film = new Film("ABANDONED","Spencer Squire",new Date(122, 5, 18));
		filmRepository.save(film);
	}
	
	@Test
	public void testFindFilm()
	{
	Film f = filmRepository.findById(1L).get();
	System.out.println(f);
	}
	
	@Test
	public void testUpdateFilm()
	{
	Film f = filmRepository.findById(1L).get();
	f.setRealisateur("Yasujirô");
	filmRepository.save(f);
	}
	
	@Test
	public void testDeleteFilm()
	{
	filmRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousFilms(){
		List<Film> films = filmRepository.findAll();
		for (Film f : films){
			System.out.println(f);
		}
	}
	
	@Test
	public void testFindByNomFilm()
	{
	List<Film> films = filmRepository.findByTitreFilm("The swimmers");
	for (Film f : films)
	{
	System.out.println(f);
	}
	}
	
	@Test
	public void testFindByTitreFilmContains ()
	{
	List<Film> films=filmRepository.findByTitreFilmContains("The");
	for (Film f : films)
	{
	System.out.println(f);
	} }


	@Test
	public void testfindByTitreRealisateur()
	{
	List<Film> films = filmRepository.findByTitreRealisateur("The swimmers", "Sally El Hosaini");
	for (Film f : films)
	{
	System.out.println(f);
	}
	}
	
	@Test
	public void testfindByGenre()
	{
	Genre gen = new Genre();
	gen.setIdGenre(1L);
	List<Film> films = filmRepository.findByGenre(gen);
	for (Film f : films)
	{
	System.out.println(f);
	}
	}

	@Test
	public void findByGenreIdGenre()
	{
	List<Film> films = filmRepository.findByGenreIdGenre(1L);
	for (Film f : films)
	{
	System.out.println(f);
	}
	}
	
	@Test
	public void findByOrderByTitreFilmAsc()
	{
	List<Film> films = filmRepository.findByOrderByTitreFilmAsc();
	for (Film f : films)
	{
	System.out.println(f);
	}
	}
	
	@Test
	public void findByOrderByTitreFilmDesc()
	{
	List<Film> films = filmRepository.findByOrderByTitreFilmDesc();
	for (Film f : films)
	{
	System.out.println(f);
	}
	}
}