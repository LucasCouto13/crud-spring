package com.example.Crud.Spring.repository;

import com.example.Crud.Spring.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query(value = "SELECT * FROM cursos WHERE id =:id AND status= 'Ativo'", nativeQuery = true)
    public Optional<Course> findByIdAndStatus(Long id);

    @Query(value = "SELECT * FROM cursos WHERE status= 'Ativo'", nativeQuery = true)
    public List<Course> findAllCourses();

}
