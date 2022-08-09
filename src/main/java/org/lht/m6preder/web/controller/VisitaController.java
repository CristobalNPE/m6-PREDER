package org.lht.m6preder.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.dto.Customer;
import org.lht.m6preder.domain.dto.Inspection;
import org.lht.m6preder.domain.dto.Payment;
import org.lht.m6preder.domain.dto.Professional;
import org.lht.m6preder.domain.service.CustomerService;
import org.lht.m6preder.domain.service.InspectionService;
import org.lht.m6preder.domain.service.ProfessionalService;
import org.lht.m6preder.persistence.entity.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/visita")
public class VisitaController {

  private final InspectionService service;
  private final ProfessionalService professionalService;
  private final CustomerService customerService;

  @GetMapping("/profesional/nuevo/{idCliente}")
  public String mostrarFormularioNuevaVisita(@PathVariable(name = "idCliente") Long idCliente, Model model) {

    Customer cliente = customerService.findById(idCliente).get();
    model.addAttribute("cliente", cliente);

    return "views-profesional/formulario_visita";
  }

  @PostMapping("/profesional/nuevo/{idCliente}")
  public String addVisita(@PathVariable(name = "idCliente") Long idCliente, Inspection inspection, Model model) {

    Long idUsuario = (Long) model.getAttribute("usuarioId");

    Professional professional = professionalService.findByUserId(idUsuario).get();
    Customer cliente = customerService.findById(idCliente).get();

    log.info("PROFESIONAL ENCONTRADO {}", professional);
    log.info("CLIENTE ENCONTRADO {}", cliente);

    inspection.setInspectorProfessional(professional);
    inspection.setInspectedCustomer(cliente);
    log.info("ID PROF AGERGADA BIEN? {}",inspection.getInspectorProfessional().getProfessionalId());
    log.info("ID CLIENT AGERGADA BIEN? {}",inspection.getInspectedCustomer().getCustomerId());


    this.service.save(inspection);
    return "redirect:/visita/profesional/listar";
  }


  @PostMapping("/profesional/nuevo")
  public String addVisita(Inspection inspection) {

    log.info("Visita creada; {}", inspection.toString());

    this.service.save(inspection);
    return "redirect:/visita/listar";
  }

  @GetMapping("/profesional/listar")
  public String listar(Model model) {

    Long idUsuario = (Long) model.getAttribute("usuarioId");

    model.addAttribute("listarVisitas", this.service.findAllByUserId(idUsuario));
    return "views-profesional/lista_visitas";
  }

  @GetMapping("/profesional/listarClientes")
  public String listarClientes(Model model) {
    model.addAttribute("listarClientes", customerService.findAll());
    return "views-profesional/listar_clientes_visita";

  }


  @ModelAttribute(name = "visita")
  public Inspection visita() {
    return new Inspection();
  }

}