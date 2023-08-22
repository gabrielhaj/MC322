package resources;

import flows.Loan;


public class Book {
	// Atributos da classe
	private String title;
	private Author[] authors;
	private int id;
	private String genre;
	
	public Book(String title, Author[] authors, int id, String genre) {
		this.title = title;
		this.authors = authors;
		this.id = id;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public int getId() {
		return id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}

