package com.spring.dao;

import com.spring.entities.Library;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryDao {

        void insert(Library library);
        void delete(Library library);
        void update(Library library);
        List<Library> selects();

}


