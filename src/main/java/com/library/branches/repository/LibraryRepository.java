package com.library.branches.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.branches.model.Library;

@Repository
public interface LibraryRepository extends CrudRepository<Library, String> {
	public String getRegionBylibraryId(String libraryId);
}
