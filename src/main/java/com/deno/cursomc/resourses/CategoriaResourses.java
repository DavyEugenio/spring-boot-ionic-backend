package com.deno.cursomc.resourses;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deno.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResourses {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria cat1 = new  Categoria(1, "informática");
		Categoria cat2 = new  Categoria(1, "Escritório");
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		return lista;
	}
}
