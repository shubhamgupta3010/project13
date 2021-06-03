package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Release1")
public class Release {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String releaseDate;
	private String description;
	
	public Release() {
		
	}

	public Release(long id, String releaseDate, String description) {
		super();
		this.id = id;
		this.releaseDate = releaseDate;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Release [id=" + id + ", releaseDate=" + releaseDate + ", description=" + description + "]";
	}
	
	

}
