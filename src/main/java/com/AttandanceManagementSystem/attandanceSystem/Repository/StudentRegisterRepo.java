package com.AttandanceManagementSystem.attandanceSystem.Repository;

import com.AttandanceManagementSystem.attandanceSystem.Entity.StudentRegistration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentRegisterRepo extends MongoRepository<StudentRegistration , String> {

     List<StudentRegistration> findByCourse(String course);


}
