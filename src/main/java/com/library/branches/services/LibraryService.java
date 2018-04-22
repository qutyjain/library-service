package com.library.branches.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.branches.model.Library;
import com.library.branches.repository.LibraryRepository;

@Service
public class LibraryService {
	@Autowired
	LibraryRepository libraryRepository;

	public String getRegionByLibraryId(String libraryId) {
		return libraryRepository.getRegionBylibraryId(libraryId);
	}

	public Library getLibraryByLibraryId(String libraryId) {
		return libraryRepository.getLibraryBylibraryId(libraryId);

	}
}
