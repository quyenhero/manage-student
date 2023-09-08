package com.devmaster.services.repository;

import com.devmaster.services.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query(value = "select s from Student s where s.firstName like %:name%")
    List<Student> findByName(String name);
}
