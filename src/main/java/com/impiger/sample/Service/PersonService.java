package com.impiger.sample.Service;

import com.impiger.sample.Exception.PersonDetailNotFoundException;
import com.impiger.sample.Model.PersonInfo;
import com.impiger.sample.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    private int personIdCount = 1;
    private List<PersonInfo> personList  = new CopyOnWriteArrayList<>();


    public PersonInfo addPerson(PersonInfo person){
//        person.setPersonId(personIdCount);
//        personList.add(person);
//        personIdCount++;
//        return  person;
        return personRepository.save(person);
    }

    public List<PersonInfo> getPersonList(){
      //  List<PersonInfo> personInfos = personRepository.findAll();
//        return  personInfos;
        List<PersonInfo> personInfo =  personRepository.getUsers();
        return personInfo;
    }

    public PersonInfo getPersonInfo(int id){
//        return  personList.stream().
//                filter(personInfo -> personInfo.getPersonId() == id)
//                .findFirst()
//                .get();
        Optional<PersonInfo> personInfo = personRepository.findById(id);
        System.out.println("PersonInfo Invoked.2........................."+personInfo);
        if(!personInfo.isPresent()){
            throw new PersonDetailNotFoundException("Record not Found");
        }
       // return  personRepository.findById(Integer.toString(id)).get();
        return  personInfo.get();
    }

    public PersonInfo updatePersonInfo(int id,PersonInfo personInfo){
        System.out.println("PersonInfo updated.........................."+id);
        personInfo.setPersonId(id);
        System.out.println("PersonInfo updated.........................."+id);
        return personRepository.save(personInfo);

//        List<PersonInfo> personInfos = personRepository.findAll();
//        personInfos.stream()
//                .forEach(
//                        p -> {
//                            if (p.getPersonId() == id) {
//                                p.setName(personInfo.getName());
//                                p.setEmail(personInfo.getEmail());
//                                personRepository.save(p);
//                            }
//                        }
//                );
//        return personInfos
//                .stream()
//                .filter(p -> p.getPersonId() == id)
//                .findFirst()
//                .get();
    }

    public void deletePerson(int id){
//        personList
//                .stream()
//                .forEach(p -> {
//                    if(p.getPersonId() == id){
//                        personList.remove(p);
//                    }
//                });
        personRepository.deleteById(id);
    }
 }
