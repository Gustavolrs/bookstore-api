package com.gustavo.bookstore.repostories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



import com.gustavo.bookstore.domain.Livro;



@Repository

public interface LivroRepository extends JpaRepository<Livro, Integer>{	

}

