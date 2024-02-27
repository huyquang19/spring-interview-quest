package com.fpt.moesh.interviewquest.mapper;

import com.fpt.moesh.interviewquest.data.entity.Classroom;
import com.fpt.moesh.interviewquest.data.res.ClassroomInfoRes;

public class ClassroomMapper {

    public static ClassroomInfoRes map(Classroom classroom) {
        return ClassroomInfoRes.builder()
                .id(classroom.getId())
                .name(classroom.getName())
                .build();
    }

}
