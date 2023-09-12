package com.devmaster.services.repository;

import com.devmaster.services.domain.Address;
import com.devmaster.services.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
    @Query(value = "select s from Student s where s.firstName like %:name%")
    List<Student> findByName(@Param("name") String name);
}
