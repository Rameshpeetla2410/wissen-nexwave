package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {

	@Id
	private String isbn;
	private String title;
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Chapter> chapters;
	
	
}
