package com.fpt.moesh.interviewquest.data.res;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ClassroomInfoRes {
    private Long id;
    private String name;
    private List<StudentInfoRes> students;
}
