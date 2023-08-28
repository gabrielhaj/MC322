package resources;



public class Book {
	// Atributos da classe
	private String title;
	private Author author;
	private String genre;
	
	public Book(String title, Author author, String genre) {
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}
}

