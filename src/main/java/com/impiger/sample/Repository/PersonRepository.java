package com.impiger.sample.Repository;


import com.impiger.sample.Model.PersonInfo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<PersonInfo, Integer> {

    @Query(value = "SELECT * FROM user_info", nativeQuery = true)
    List<PersonInfo> getUsers();
}


