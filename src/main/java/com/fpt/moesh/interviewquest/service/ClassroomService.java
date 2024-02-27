package com.fpt.moesh.interviewquest.service;

import com.fpt.moesh.interviewquest.data.entity.Classroom;
import com.fpt.moesh.interviewquest.data.req.ClassroomCreateReq;

public interface ClassroomService {

    public Classroom create(ClassroomCreateReq classroomCreateReq);

    boolean delete(Long id);
}
