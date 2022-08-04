package org.lht.m6preder.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.dto.Customer;
import org.lht.m6preder.domain.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("cliente")
public class ClienteController {

  private final CustomerService service;

  public ClienteController(CustomerService service) {
    this.service = service;
  }

  @GetMapping("/nuevo")
  public String mostrarFormularioNuevoCliente() {
    return "views-administrativo/formulario_cliente";
  }

  @PostMapping("/nuevo")
  public String addCliente(Customer customer) {
    log.info("Cliente creado: {}", customer);

    this.service.save(customer);
    return "redirect:/usuario/listar";
  }

  @GetMapping("/editar")
  public String mostrarFormularioEditarCliente() {
    return "views-administrativo/formulario_editarCliente";
  }

  @ModelAttribute(name = "cliente")
  public Customer cliente() {
    return new Customer();
  }




}
