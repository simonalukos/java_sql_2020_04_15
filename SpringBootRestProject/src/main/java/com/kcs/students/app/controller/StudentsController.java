package com.kcs.students.app.controller;

import com.kcs.students.app.dto.Student;
import com.kcs.students.app.service.StudentService;
import com.sun.source.tree.BreakTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudents();

    }
    @GetMapping("/{id}/student")
    public Student getStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }
    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    @DeleteMapping("/{id}/student/delete")
    public void deleteStudent(@PathVariable("id") int id){
        studentService.deleteStudent(id);
    }
    @PutMapping("/{id}/student/update")
    public Student updateStudent(@PathVariable("id") int id, @RequestBody Student student){
        student.setId(id);
        return studentService.updateStudent(student);
    }

}
