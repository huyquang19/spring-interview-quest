package com.fpt.moesh.interviewquest.data.res;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
@Getter
@Setter
public class StudentInfoRes {
    private Long id;
    private String name;
    private Instant birthDate;
    private ClassroomInfoRes classroom;
}
