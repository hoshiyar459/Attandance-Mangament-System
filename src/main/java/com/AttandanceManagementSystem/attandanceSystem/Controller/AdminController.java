package com.AttandanceManagementSystem.attandanceSystem.Controller;

import com.AttandanceManagementSystem.attandanceSystem.Entity.StudentRegistration;
import com.AttandanceManagementSystem.attandanceSystem.Service.StudentRegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Admin/")
@Slf4j
public class AdminController {

    @Autowired
    private StudentRegistrationService studentRegistrationService ;

    @GetMapping("Get-All-Students")
    public ResponseEntity<List<StudentRegistration>> GellAllStudents(){
         try {
             List<StudentRegistration> getall = studentRegistrationService.getall();
             return new ResponseEntity<>(getall ,HttpStatus.FOUND);
         }catch(Exception e ){
             log.warn("No Student Found Or Invalid Request");
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
    }

    @GetMapping("Get-By-Course/{course}")
    public ResponseEntity<List<StudentRegistration>> GetAllStudentsByCourse(@PathVariable String course){
      try{
             return new ResponseEntity<>(studentRegistrationService.findByCourse(course) , HttpStatus.FOUND);
      }catch(Exception e ){
          log.error("Users Not Found" );
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }
}
