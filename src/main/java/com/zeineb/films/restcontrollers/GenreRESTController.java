package com.zeineb.films.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zeineb.films.Repos.GenreRepository;
import com.zeineb.films.entities.Genre;

@RestController
@RequestMapping("/api/genre")
@CrossOrigin("*")
public class GenreRESTController {
	
	@Autowired
	GenreRepository genreRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Genre> getAllGenre(){
		return genreRepository.findAll();
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Genre getGenreById(@PathVariable("id") Long id) {
		return genreRepository.findById(id).get();

	}
}

