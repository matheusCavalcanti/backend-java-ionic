package com.ionic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ionic.model.Categoria;
import com.ionic.model.Pedido;
import com.ionic.model.Produto;
import com.ionic.repository.CategoriaRepository;
import com.ionic.repository.ProdutoRepository;
import com.ionic.service.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Produto find(Long id) {
		Optional<Produto> obj = repository.findById(id);
		obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id
				+ ", Tipo: " + Pedido.class.getName()));
		
		return obj.get();
	}
	
	public Page<Produto> search(String nome, List<Long> ids,Integer page, Integer linesPerPage, String orderBy, String direction) {
		Pageable pageable = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		List<Categoria> categorias = categoriaRepository.findAllById(ids);
		return repository.findDistinctByNomeContainingAndCategoriasIn(nome, categorias, pageable);
	}
}
