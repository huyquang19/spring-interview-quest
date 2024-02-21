package com.fpt.moesh.interviewquest.data.req;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
@Getter
@Setter
public class StudentCreateReq {
    private String name;
    private Instant birthDate;
    private Long classroomId;
}
