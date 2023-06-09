package com.example.demo.repository;
/*
 * @author: Vo Huu Tuan
 * @since:  08/06/2023 22:13
 * @github:  https://github.com/hidenobi
 * @update:
 *
 * */


import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
}
