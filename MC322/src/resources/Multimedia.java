package resources;

public abstract class Multimedia {
	private String title;
	private Author author;
	private PublishingCompany publishingCompany;
	private int publishingYear;
	private Genre genre;
	private String description;
	private int copies;
	private int copiesAvailable;
	
	public Multimedia(String title, Author author, PublishingCompany publishingCompany, int publishingYear, Genre genre,
			String description, int copies) {
		this.title = title;
		this.author = author;
		this.publishingCompany = publishingCompany;
		this.publishingYear = publishingYear;
		this.genre = genre;
		this.description = description;
		this.copies = copies;
		this.copiesAvailable = copies;
	}

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	public PublishingCompany getPublishingCompany() {
		return publishingCompany;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public Genre getGenre() {
		return genre;
	}

	public String getDescription() {
		return description;
	}

	public int getCopies() {
		return copies;
	}

	public int getCopiesAvailable() {
		return copiesAvailable;
	}
	
	public void addCopy(int newCopies) {
		if(newCopies >= 1) {
			this.copies += 1;
			this.copiesAvailable += 1;
		} else {
			/** @TODO error handling */
		}
	}
	
	public void removeCopy(int copiesToRemove) {
		if(copiesToRemove >= 1 && copiesToRemove <= this.copiesAvailable) {
			this.copies -= 1;
			this.copiesAvailable -= 1;
		} else {
			/** @TODO error handling */
		}
	}
	
	public void loanSingleCopy() {
		if(this.copiesAvailable < 1) {
			/** @TODO error handling */	
		} else {			
			this.copiesAvailable--;
		}
	}
	
	public void returnSingleCopy() {
		if(this.copies == this.copiesAvailable) {
			/** @TODO error handling */
		} else {			
			this.copiesAvailable++;
		}
	}
	
	
}

