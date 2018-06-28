package com.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chapter {

	@Id
	private int idx;
	private String title;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "isbn")
	private Book book;

}
