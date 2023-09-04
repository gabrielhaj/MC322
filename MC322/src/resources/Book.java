package resources;

import library.Location;

public class Book extends PhysicalMedia {
	private String isbn;
	private int edition;

	public Book(String title, Author author, PublishingCompany publishingCompany, int publishingYear, Genre genre,
			String description, int copies, ConservationState conservationState, Location location, String isbn,
			int edition) {
		super(title, author, publishingCompany, publishingYear, genre, description, copies, conservationState,
				location);
		this.isbn = isbn;
		this.edition = edition;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getEdition() {
		return edition;
	}
	
	

}
