package com.spring.services;


import java.util.List;
import com.spring.entities.Library;


public interface LibraryService {

    abstract void insert(Library library);
    abstract void delete(Library library);
    abstract void update(Library library);
	abstract List<Library> selects();
}

