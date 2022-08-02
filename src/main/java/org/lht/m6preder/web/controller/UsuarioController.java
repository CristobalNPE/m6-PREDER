package org.lht.m6preder.web.controller;

import org.lht.m6preder.domain.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

  private final UsuarioService service;

  public UsuarioController(UsuarioService service) {
    this.service = service;
  }

  @GetMapping("/mostrar")
  public String mostrarUsuarios(Model model){

    model.addAttribute("listaUsuarios", this.service.getAll());

    return "lista_usuarios";

  }
}
