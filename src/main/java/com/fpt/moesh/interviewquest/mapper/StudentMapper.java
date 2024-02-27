package com.fpt.moesh.interviewquest.mapper;

import com.fpt.moesh.interviewquest.data.entity.Student;
import com.fpt.moesh.interviewquest.data.res.StudentInfoRes;

public class StudentMapper {

    public static StudentInfoRes map(Student student) {
        return StudentInfoRes.builder()
                .id(student.getId())
                .name(student.getName())
                .classroom(ClassroomMapper.map(student.getClassroom()))
                .build();
    }


}
