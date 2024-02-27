package com.fpt.moesh.interviewquest.service.impl;

import com.fpt.moesh.interviewquest.data.entity.Classroom;
import com.fpt.moesh.interviewquest.data.repository.ClassroomRepository;
import com.fpt.moesh.interviewquest.data.req.ClassroomCreateReq;
import com.fpt.moesh.interviewquest.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassRoomServiceImpl implements ClassroomService {

    @Autowired
    ClassroomRepository classroomRepository;

    @Override
    public Classroom create(ClassroomCreateReq classroomCreateReq) {
        Classroom classroom = new Classroom();
        classroom.setName(classroomCreateReq.getName());
        return classroomRepository.save(classroom);
    }

    @Override
    public boolean delete(Long id) {
        classroomRepository.deleteById(id);
        return true;
    }
}
