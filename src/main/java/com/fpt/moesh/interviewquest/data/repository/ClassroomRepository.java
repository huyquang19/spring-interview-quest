package com.fpt.moesh.interviewquest.data.repository;

import com.fpt.moesh.interviewquest.data.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}