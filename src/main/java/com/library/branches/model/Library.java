package com.library.branches.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "library")
public class Library {

	@Id
	@Column(name = "library_id", nullable = false)
	private String libraryId;
	
	@Column(name = "library_contact", nullable = false)
	private String libraryContact;
	
	@Column(name = "library_region", nullable = false)
	private String region;

	public String getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryContact() {
		return libraryContact;
	}

	public void setLibraryName(String libraryContact) {
		this.libraryContact = libraryContact;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
