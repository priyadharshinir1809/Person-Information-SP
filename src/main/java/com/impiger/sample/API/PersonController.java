package com.impiger.sample.API;

import com.impiger.sample.Model.PersonInfo;
import com.impiger.sample.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/PersonInfo")
public class PersonController {

    @Autowired
    PersonService personService;


    @PostMapping(value = "/add")
    public PersonInfo addPerson(@RequestBody PersonInfo person){
        return personService.addPerson(person);
    }

    @PutMapping(value = "/updatePersonInfo/{personId}")
    public PersonInfo updatePerson(@PathVariable("personId") int id, @RequestBody PersonInfo person) {
        return personService.updatePersonInfo(id, person);
    }


    @GetMapping(value = "/getPersonList")
    public List<PersonInfo> getPersonList(){
        return personService.getPersonList();
    }


    @GetMapping(value = "/getPersonById/{personId}")
    public PersonInfo getPersonById(@PathVariable("personId") int id) {
        return personService.getPersonInfo(id);
    }


    @DeleteMapping(value = "/deletePersonDetail/{personId}")
    public void deletePersonDetail(@PathVariable("personId") int id) {
        personService.deletePerson(id);
    }
}
