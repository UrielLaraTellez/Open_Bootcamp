package com.example.Ejercicios_Sesiones456.Repositories;

import com.example.Ejercicios_Sesiones456.Entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
