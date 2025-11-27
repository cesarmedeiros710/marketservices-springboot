package dev.javaservice.marketservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.marketservices.service.PrestadorService;
import com.marketservices.service.AgendamentoService;

@Controller
public class DashboardController {

        @Autowired
        private PrestadorService prestadorService;

        @Autowired
        private AgendamentoService agendamentoService;

        @GetMapping("/dashboard")
        public String dashboard(Model model) {

            model.addAttribute("title", "Dashboard");

            model.addAttribute("totalPrestadores", prestadorService.contarPrestadores());
            model.addAttribute("prestadoresEmServico", prestadorService.contarPrestadoresEmServico());
            model.addAttribute("servicosAgendados", agendamentoService.contarAgendamentos());

            model.addAttribute("content", "dashboard");

            return "layout";
        }
}


