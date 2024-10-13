package com.AttandanceManagementSystem.attandanceSystem.Service;

import com.AttandanceManagementSystem.attandanceSystem.Entity.StudentRegistration;
import com.AttandanceManagementSystem.attandanceSystem.Repository.StudentRegisterRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentRegistrationService {

    @Autowired
    private StudentRegisterRepo studentRegisterRepo ;

     public StudentRegistration saveStudent(StudentRegistration NewStudent){
          try{
              studentRegisterRepo.save(NewStudent);
              return NewStudent ;
          }catch(Exception e){
            log.error("Invalid User or User Already Exists {}" ,NewStudent.getFullName(), e );
            return null ;
          }
     }

     public List<StudentRegistration> getall(){
         return studentRegisterRepo.findAll();
     }

     public StudentRegistration findById(String id){
         return studentRegisterRepo.findById(id).orElse(null);
     }

     public Boolean findByIdInBoolean(String id){
          if(studentRegisterRepo.findById(id).isPresent()){
               return true ;
          }
          return false ;
     }

     public List<StudentRegistration> findByCourse(String course){
          return studentRegisterRepo.findByCourse(course);
     }


}
