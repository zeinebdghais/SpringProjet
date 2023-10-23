package com.zeineb.films.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "titreFilm", types = { Film.class })
public interface FilmProjection {
	
	public String getTitreFilm();


}
