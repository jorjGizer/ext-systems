package edu.javacourse.student.dao;

import edu.javacourse.student.domain.Faculty;
import edu.javacourse.student.domain.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    @Query(name = "Faculty.findAllWithUniversity",
            value = "SELECT f FROM Faculty f " +
                    "LEFT JOIN FETCH f.university")
    List<Faculty> findFullList();
}
