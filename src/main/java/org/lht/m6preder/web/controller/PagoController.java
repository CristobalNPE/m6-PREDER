package org.lht.m6preder.web.controller;


import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.dto.Payment;
import org.lht.m6preder.domain.service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/pago")
public class PagoController {

  private final PaymentService service;

  public PagoController(PaymentService service) {
    this.service = service;
  }

  @GetMapping("/nuevo")
  public String mostrarFormularioIngresoPago() {
    return "views-administrativo/formulario_pagos";
  }

  @PostMapping("/nuevo")
  public String addPago(Payment payment) {
    log.info("Pago ingresado: {}", payment);

    this.service.save(payment);
    return "redirect:/pago/listar";
  }

  @GetMapping("/listar")
  public String listar(Model model) {
    model.addAttribute("listaPago", this.service.findAll());
    return "views-administrativo/lista_pagos";
  }

  @ModelAttribute(name = "pago")
  public Payment pago() {
    return new Payment();
  }

}







