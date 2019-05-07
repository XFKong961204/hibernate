package com.md.service;

import com.md.entity.Person;

import java.util.List;

public interface PersonService {

    public void insertPerson(Person person);

    public void updatePerson(Person person);

    public List<Person> selectPerson();

    public List<Person> selectPersonByName(String name);

    public void deletePerson(int id);

}
