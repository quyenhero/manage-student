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
    @Query(nativeQuery = true,value = "select * from student s join class a on a.id = s.id_class where a.`name` = :class")
    List<Student> findByClass(@Param("class") String cls);
    @Query(nativeQuery = true,value = "SELECT *  FROM student s " +
            "LEFT OUTER JOIN student_subject ss " +
            "  ON s.id = ss.id_student " +
            "LEFT OUTER JOIN subject sj " +
            "  ON ss.id_subject = sj.id where sj.name = :subject")
    List<Student> findBySubject(@Param("subject") String subject);
    @Query(nativeQuery = true,value = "SELECT s.* FROM student s CROSS JOIN student_subject ss where s.id= ss.id_student and ss.point >8 group by s.id")
    List<Student> filterPoint();
}
