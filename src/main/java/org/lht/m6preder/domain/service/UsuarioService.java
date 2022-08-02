package org.lht.m6preder.domain.service;

import org.lht.m6preder.persistence.entity.Usuario;
import org.lht.m6preder.persistence.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

  private final UsuarioRepository repository;

  public UsuarioService(UsuarioRepository repository) {
    this.repository = repository;
  }

  public List<Usuario> getAll(){
    return this.repository.readAll();
  }


}
