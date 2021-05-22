package com.umanizales.apibatallanaval.repository;

import com.umanizales.apibatallanaval.model.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository  extends CrudRepository<Usuario,Integer> {
}
