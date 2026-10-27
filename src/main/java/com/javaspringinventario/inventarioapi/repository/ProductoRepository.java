package com.javaspringinventario.inventarioapi.repository;

import com.javaspringinventario.inventarioapi.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Hereda métodos automáticos como save(), findAll(), findById() y deleteById()
}