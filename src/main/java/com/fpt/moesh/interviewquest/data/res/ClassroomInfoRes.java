package com.fpt.moesh.interviewquest.data.res;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder
public class ClassroomInfoRes {
    private Long id;
    private String name;
    private List<StudentInfoRes> students;
}
