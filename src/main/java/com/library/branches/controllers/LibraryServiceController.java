package com.library.branches.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v/libraries/{libraryId}")
public class LibraryServiceController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String getLibraryAddress(@PathVariable("libraryId") String libraryId) {
		return libraryId;
	}

}
