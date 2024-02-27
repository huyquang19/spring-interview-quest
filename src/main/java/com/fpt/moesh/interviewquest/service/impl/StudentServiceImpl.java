package com.fpt.moesh.interviewquest.service.impl;

import com.fpt.moesh.interviewquest.data.entity.Student;
import com.fpt.moesh.interviewquest.data.repository.ClassroomRepository;
import com.fpt.moesh.interviewquest.data.repository.StudentRepository;
import com.fpt.moesh.interviewquest.data.req.StudentCreateReq;
import com.fpt.moesh.interviewquest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ClassroomRepository classroomRepository;

    public Student createStudent(StudentCreateReq studentCreateReq) {
        Student student = new Student();
        student.setBirthDate(studentCreateReq.getBirthDate());
        student.setName(studentCreateReq.getName());

        var classroom = classroomRepository.findById(studentCreateReq.getClassroomId());
        if(classroom.isEmpty()) {
            throw new IllegalArgumentException("class not found");
        } else {
            student.setClassroom(classroom.get());
        }

        return studentRepository.save(student);
    }



    public List<Student> fetchStudent(Pageable pageable) {
        return studentRepository.findAll(pageable).stream().toList();
    }

    @Override
    public Boolean swap(Long s1, Long s2) {
        return null;
    }

}
