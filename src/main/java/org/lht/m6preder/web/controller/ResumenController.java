package org.lht.m6preder.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.service.InspectionService;
import org.lht.m6preder.domain.service.PaymentService;
import org.lht.m6preder.domain.service.TrainingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/resumen")
@RequiredArgsConstructor
public class ResumenController {

  private final TrainingService trainingService;
  private final InspectionService inspectionService;
  private final PaymentService paymentService;

  @GetMapping("/cliente")
  public String getResumenCliente(Model model) {
    Long idUsuario = (Long) model.getAttribute("usuarioId");
    Long idCliente = (Long) model.getAttribute("idForRole");

    int capasSolicitadas = this.trainingService.findAllByUserId(idUsuario).size();
    int visitasAsociadas = this.inspectionService.findAllByCustomer(idCliente).size();
    int pagosAsociados = this.paymentService.findAllByCustomer(idCliente).size();

    model.addAttribute("capasSolicitadas", capasSolicitadas);
    model.addAttribute("visitasAsociadas", visitasAsociadas);
    model.addAttribute("pagosAsociados", pagosAsociados);
    return "views-cliente/resumen_cliente";
  }

  @GetMapping("/administrativo")
  public String getResumenAdmin(Model model) {

    return "views-administrativo/resumen_administrativo";
  }

  @GetMapping("/profesional")
  public String getResumenProfe(Model model) {

    return "views-profesional/resumen_profesional";
  }

}
