package com.AttandanceManagementSystem.attandanceSystem.Entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Document(collection = "StudentRegistration")
@NoArgsConstructor
@Data
public class StudentRegistration {
    @Id
   private String id ;
    @NonNull
   private String FullName ;
    @NonNull
   private String gmail ;

    @NonNull
    @Indexed(unique = true)
   private String EnrollmentNumber ;
    @NonNull
   private String course ;
    @NonNull
   private String StudyYear ;

   List<Integer> attandanceList = new ArrayList();
}
