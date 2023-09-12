package com.devmaster.services.repository;

import com.devmaster.services.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query(value = "select s from Student s where s.firstName like %:name%")
    List<Student> findByName(@Param("name") String name);
    @Query(nativeQuery = true,value = "select * from student s join address a on a.id = s.id_address where a.city like %:city%")
    List<Student> findByAddress(@Param("city") String city);
}
