package com.AttandanceManagementSystem.attandanceSystem.Repository;

import com.AttandanceManagementSystem.attandanceSystem.Entity.StudentRegistration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRegisterRepo extends MongoRepository<StudentRegistration , String> {

}
