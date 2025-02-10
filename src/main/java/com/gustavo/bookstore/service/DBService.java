package com.gustavo.bookstore.service;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gustavo.bookstore.domain.Categoria;
import com.gustavo.bookstore.domain.Livro;
import com.gustavo.bookstore.repostories.CategoriaRepository;
import com.gustavo.bookstore.repostories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Ficção Científica", "Livros de ficção científica");
		Categoria cat3 = new Categoria(null, "Autoajuda", "Livros de desenvolvimento pessoal");

		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsum", cat1);
		Livro l2 = new Livro(null, "Código Limpo", "Robert Martin", "Descrição do livro", cat1);
		Livro l3 = new Livro(null, "O Hobbit", "J.R.R. Tolkien", "Descrição do livro", cat2);
		Livro l4 = new Livro(null, "1984", "George Orwell", "Descrição do livro", cat2);
		Livro l5 = new Livro(null, "O Poder do Hábito", "Charles Duhigg", "Descrição do livro", cat2);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}
}