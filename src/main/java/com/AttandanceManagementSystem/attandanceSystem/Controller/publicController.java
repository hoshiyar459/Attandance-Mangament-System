package com.AttandanceManagementSystem.attandanceSystem.Controller;

import com.AttandanceManagementSystem.attandanceSystem.Entity.StudentRegistration;
import com.AttandanceManagementSystem.attandanceSystem.Service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public")
public class publicController {

    @Autowired
    private StudentRegistrationService studentRegistrationService ;

    @PostMapping("Create-Student")
     public ResponseEntity<StudentRegistration> CreateStduent(@RequestBody StudentRegistration NewStudent){
          try{
              StudentRegistration studentRegistration = studentRegistrationService.saveStudent(NewStudent);
              return new ResponseEntity<>(studentRegistration , HttpStatus.CREATED);
          }catch (Exception e ){
               return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
          }
     }

     @GetMapping
    public List<StudentRegistration> getAll(){
        return studentRegistrationService.getall();
     }

}
