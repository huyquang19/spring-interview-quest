package com.fpt.moesh.interviewquest.controller;

import com.fpt.moesh.interviewquest.data.entity.Classroom;
import com.fpt.moesh.interviewquest.data.req.ClassroomCreateReq;
import com.fpt.moesh.interviewquest.data.res.ClassroomInfoRes;
import com.fpt.moesh.interviewquest.mapper.ClassroomMapper;
import com.fpt.moesh.interviewquest.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("classroom")
public class ClassroomController {
    /**
     * TODO: Write APIs to:
     *
     * 1. create a new classroom
     * 2. delete a classroom with all students belong to it
     */

    @Autowired
    ClassroomService classroomService;

    @PostMapping()
    public ClassroomInfoRes create(@RequestBody ClassroomCreateReq classroomCreateReq) {
        var result = classroomService.create(classroomCreateReq);

        return ClassroomMapper.map(result);
    }


    @DeleteMapping()
    public Boolean delete(@RequestParam("id") Long id) {
        return  classroomService.delete(id);
    }
}
