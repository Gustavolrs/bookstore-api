package com.gustavo.bookstore.repostories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



import com.gustavo.bookstore.domain.Categoria;



@Repository

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {



}