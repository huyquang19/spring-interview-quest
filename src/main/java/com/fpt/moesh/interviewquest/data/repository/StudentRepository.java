package com.fpt.moesh.interviewquest.data.repository;

import com.fpt.moesh.interviewquest.data.entity.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudents(Pageable pageable);
}