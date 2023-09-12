package resources;

import library.Location;

public class VideoDVD extends PhysicalMedia {
	private Language[] subtitles;
	private Language[] languages;
	private Actor[] cast;
	private int durationInMinutes;
	
	public VideoDVD(String title, Author author, PublishingCompany publishingCompany, int publishingYear, Genre genre,
			String description, int copies, ConservationState conservationState, Location location,
			Language[] subtitles, Language[] languages, Actor[] cast, int durationInMinutes) {
		super(title, author, publishingCompany, publishingYear, genre, description, copies, conservationState,
				location);
		this.subtitles = subtitles;
		this.languages = languages;
		this.cast = cast;
		this.durationInMinutes = durationInMinutes;
	}

	public Language[] getSubtitles() {
		return subtitles;
	}

	public Language[] getLanguages() {
		return languages;
	}

	public Actor[] getCast() {
		return cast;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}
	
	
}
