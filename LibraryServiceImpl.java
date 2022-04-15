package com.spring.services;

import com.spring.dao.LibraryDao;

import com.spring.entities.Library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    public LibraryDao libraryDao;

    @Transactional
    public void insert(Library library) {
        libraryDao.insert(library);
       
    }
    @Transactional
    public void delete(Library library)
    {
    	 libraryDao.delete(library);
    }
    @Transactional
    public void update(Library library)
    {
    	 libraryDao.update(library);
    }
    @Transactional
	public List<Library> selects(){
		return libraryDao.selects();
    }
}


