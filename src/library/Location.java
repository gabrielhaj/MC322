package library;

public class Location {
	private int bookcase;
	private int shelf;
	
	public Location(int bookcase, int shelf) {
		this.bookcase = bookcase;
		this.shelf = shelf;
	}

	public int getBookcase() {
		return bookcase;
	}

	public void setBookcase(int bookcase) {
		this.bookcase = bookcase;
	}

	public int getShelf() {
		return shelf;
	}

	public void setShelf(int shelf) {
		this.shelf = shelf;
	}
	
	
}
