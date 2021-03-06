package dk.lundudvikling.springdemo.endpoints.person.repositories;

import dk.lundudvikling.springdemo.endpoints.person.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person getPersonById(long id);
    @Transactional
    void deletePersonById(long id);

}
