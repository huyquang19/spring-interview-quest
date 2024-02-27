package com.fpt.moesh.interviewquest.data.repository;

import com.fpt.moesh.interviewquest.data.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}