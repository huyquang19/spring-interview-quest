package com.fpt.moesh.interviewquest.service;

import com.fpt.moesh.interviewquest.data.entity.Student;
import com.fpt.moesh.interviewquest.data.req.StudentCreateReq;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {

     Student createStudent(StudentCreateReq studentCreateReq);
     List<Student> fetchStudent(Pageable pageable);

     Boolean swap(Long s1, Long s2) ;
}
