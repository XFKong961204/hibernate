package com.md;

import com.md.entity.Person;
import com.md.repository.PersonRepository;
import com.md.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Hibernate01ApplicationTests {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonService personService;
//    @Test
//    public void contextLoads() {
//        Person person = new Person(null,"孔祥飞","男",new Date());
//        personRepository.save(person);
//    }

    @Test
    public void insert(){
        Person person = new Person();
        person.setName("kxf");
        person.setSex("男");
        person.setDate(new Date());
        personService.insertPerson(person);
    }

    @Test
    public void select(){
        List<Person> people = personService.selectPerson();
        for (Person person : people) {
            System.out.println(people);
        }
    }

    @Test
    public void delete(){
        personService.deletePerson(5);

    }

    @Test
    public void update(){
        Person person = new Person();
        person.setId(4);
        person.setSex("男");
        person.setName("孔祥飞");
        person.setDate(new Date());
        personService.updatePerson(person);
    }

    @Test
    public void selectByName(){

        List<Person> personList = personService.selectPersonByName("孔祥飞");
        for (Person person : personList) {
            System.out.println(personList);
        }


    }

}
