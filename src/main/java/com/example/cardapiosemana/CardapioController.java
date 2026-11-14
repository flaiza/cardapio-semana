package com.example.cardapiosemana;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CardapioController {

    private List<Prato> pratos = new ArrayList<>();

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/pratos/novo")
    public String novoPrato() {
        return "formulario";
    }

    @GetMapping("/pratos")
    public String listarPratos(Model model) {
        List<Prato> pratosPlanejados = new ArrayList<>();

        for (Prato prato : pratos) {
            if (!prato.isRealizado()) {
                pratosPlanejados.add(prato);
            }
        }

        model.addAttribute("pratos", pratosPlanejados);
        return "lista";
    }

    @GetMapping("/feitos")
    public String listarFeitos(Model model) {
        List<Prato> pratosFeitos = new ArrayList<>();

        for (Prato prato : pratos) {
            if (prato.isRealizado()) {
                pratosFeitos.add(prato);
            }
        }

        model.addAttribute("pratos", pratosFeitos);
        return "feitos";
    }

    @PostMapping("/pratos/novo")

    public String salvarPrato(

            String nome,

            String tipo,

            String categoria,

            int porcoes,

            java.time.LocalDate dataPlanejada,

            String observacao) {

        Prato prato = new Prato(nome, tipo, categoria, porcoes, dataPlanejada, observacao);

        pratos.add(prato);

        return "redirect:/pratos";

    }

    @PostMapping("/pratos/realizar")

    public String realizarPrato(String nome) {

        for (Prato prato : pratos) {

            if (prato.getNome().equals(nome)) {

                prato.setRealizado(true);

            }

        }

        return "redirect:/pratos";
    }
}