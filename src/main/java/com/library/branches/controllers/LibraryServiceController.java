package com.library.branches.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.library.branches.model.Library;
import com.library.branches.services.LibraryService;

@RestController
@RequestMapping(value = "/v/libraries/{libraryId}")
public class LibraryServiceController {

	@Autowired
	LibraryService libraryService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String getLibraryAddress(@PathVariable("libraryId") String libraryId) {
		return libraryId;
	}

	@RequestMapping(value = "/library", method = RequestMethod.GET)
	Library getLibrary(@PathVariable("libraryId") String libraryId) {
		return libraryService.getLibraryByLibraryId(libraryId);
	}
}
