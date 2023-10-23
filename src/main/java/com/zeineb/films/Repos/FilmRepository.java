package com.zeineb.films.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zeineb.films.entities.Film;
import com.zeineb.films.entities.Genre;

@RepositoryRestResource(path = "rest")
public interface FilmRepository extends JpaRepository<Film, Long> {
	List<Film> findByTitreFilm(String titre);
	List<Film> findByTitreFilmContains(String titre); 
	 
	/*@Query("select f from Film f where f.titreFilm like %?1 and f.realisateur like %?2")
	List<Film> findByTitreRealisateur (String titre, String realis);*/
	
	@Query("select f from Film f where f.titreFilm like %:titre and f.realisateur like %:realis")
	List<Film> findByTitreRealisateur (@Param("titre") String titre,@Param("realis") String realis);
	
	@Query("select f from Film f where f.genre = ?1")
	List<Film> findByGenre (Genre genre);
	
	List<Film> findByGenreIdGenre(Long id);
	
	List<Film> findByOrderByTitreFilmAsc();
	
	List<Film> findByOrderByTitreFilmDesc();

 


}
