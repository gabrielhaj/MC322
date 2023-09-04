package resources;

import library.Location;

public abstract class PhysicalMedia extends Multimedia {
	private ConservationState conservationState;
	private Location location;
	
	public PhysicalMedia(String title, Author author, PublishingCompany publishingCompany, int publishingYear,
			Genre genre, String description, int copies, ConservationState conservationState, Location location) {
		super(title, author, publishingCompany, publishingYear, genre, description, copies);
		this.conservationState = conservationState;
		this.location = location;
	}

	public ConservationState getConservationState() {
		return conservationState;
	}

	public void setConservationState(ConservationState conservationState) {
		this.conservationState = conservationState;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
}
