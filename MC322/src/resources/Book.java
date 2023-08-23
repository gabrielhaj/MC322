package resources;



public class Book {
	// Atributos da classe
	private String title;
	private Author author;
	private int id;
	private String genre;
	
	public Book(String title, Author author, int id, String genre) {
		this.title = title;
		this.author = author;
		this.id = id;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
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

