package com.fpt.moesh.interviewquest.data.repository;

import com.fpt.moesh.interviewquest.data.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}