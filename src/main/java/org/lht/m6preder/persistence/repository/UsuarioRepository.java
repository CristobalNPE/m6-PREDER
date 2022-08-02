package org.lht.m6preder.persistence.repository;

import org.lht.m6preder.persistence.crud.UsuarioCrudRepository;
import org.lht.m6preder.persistence.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository  {

  private final UsuarioCrudRepository crudRepository;

  public UsuarioRepository(UsuarioCrudRepository crudRepository) {
    this.crudRepository = crudRepository;
  }

  public List<Usuario> readAll() {
    return (List<Usuario>)this.crudRepository.findAll();
  }

}
