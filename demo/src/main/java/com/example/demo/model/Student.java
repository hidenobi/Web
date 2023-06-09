package com.example.demo.model;
/*
 * @author: Vo Huu Tuan
 * @since:  08/06/2023 22:08
 * @github:  https://github.com/hidenobi
 * @update:
 *
 * */

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "approved", nullable = false)
    private int approved;
}
