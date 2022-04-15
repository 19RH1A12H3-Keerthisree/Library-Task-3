package com.spring.dao;

import com.spring.entities.Library;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LibraryDaoImpl implements LibraryDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void insert(Library library) {
        sessionFactory.getCurrentSession().save(library);
    }
    public void delete(Library library)
    {
    	sessionFactory.getCurrentSession().delete(library);
    }
    public void update(Library library)
    {
    	sessionFactory.getCurrentSession().update(library);
    }
    @SuppressWarnings("unchecked")
    public List<Library> selects(){
		List<Library> listUser = (List<Library>) sessionFactory.getCurrentSession()
                .createCriteria(Library.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return listUser; //criteria.list();
    }
    
}