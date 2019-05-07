package com.md.service;

import com.md.entity.Person;
import com.md.repository.PersonRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;
import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public SessionFactory getSessionFactory(){
        return entityManagerFactory.unwrap(SessionFactory.class);
    }

    @Override
    @Transactional
    public void insertPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    @Transactional
    public void updatePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public List<Person> selectPerson() {
        return personRepository.findAll();
    }

    @Override
    @Transactional
    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }
}
