package com.fpt.moesh.interviewquest.controller;

import com.fpt.moesh.interviewquest.data.req.StudentCreateReq;
import com.fpt.moesh.interviewquest.data.res.StudentInfoRes;
import com.fpt.moesh.interviewquest.mapper.StudentMapper;
import com.fpt.moesh.interviewquest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * TODO: Write APIs to:
     *
     * 1. create a new student
     * 2. fetch students list with pagination (default page size = 10, first page)
     * 3. search students by keyword (on all data fields)
     * 4. swap 2 students between 2 different classrooms
     */

    @Autowired
    StudentService studentService ;


    @PostMapping("")
    public StudentInfoRes createStudent(@RequestBody StudentCreateReq studentCreateReq) {
        var result = studentService.createStudent(studentCreateReq);
        return StudentMapper.map(result);
    }

    @GetMapping("")
    public List<StudentInfoRes> fetchStudents(@RequestParam("size") int size,
                                              @RequestParam("page") int page
                                              ) {
        Pageable pageable = PageRequest.of(page, size);
        var result = studentService.fetchStudent(pageable);
        return result.stream().map(StudentMapper::map).collect(Collectors.toList());
    }

//    @PostMapping("/swap")
//    public boolean swap(@RequestParam("firstStudenId") Long firstStudentId,
//                        @RequestParam("secondStudentId") Long secondStudentId
//                        ) {
//
//    }


}
