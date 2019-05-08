package com.md.repository;

import com.md.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,String> {

    @Modifying
    @Query("delete from Person where id=:id")
    public void deleteById(@Param("id") int id);

    @Query("from Person p where p.name=name")
    public List<Person> queryAllByName(@Param("name") String name);


}
