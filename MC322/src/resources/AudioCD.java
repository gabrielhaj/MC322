package resources;

import library.Location;

public class AudioCD extends PhysicalMedia {
	private String[] tracks;
	private int durationInSeconds;

	public AudioCD(String title, Author author, PublishingCompany publishingCompany, int publishingYear, Genre genre,
			String description, int copies, ConservationState conservationState, Location location, String[] tracks,
			int durationInSeconds) {
		super(title, author, publishingCompany, publishingYear, genre, description, copies, conservationState,
				location);
		this.tracks = tracks;
		this.durationInSeconds = durationInSeconds;
	}

	public String[] getTracks() {
		return tracks;
	}

	public int getDurationInSeconds() {
		return durationInSeconds;
	}
	
}
