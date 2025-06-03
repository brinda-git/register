package com.example.register_page.repository;

import com.example.register_page.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, String> {
}
