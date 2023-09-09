/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BlogDavid.BlogDavid.Controlers;

import com.BlogDavid.BlogDavid.Dominio.PubDominio;
import com.BlogDavid.BlogDavid.service.PubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Control {

    @Autowired
    private PubService pubservice;

    // endpoint principal
    @GetMapping("/")
    public static String HomePage() {
        return "PageHome";
    }

    // Login
    @GetMapping("/Sesion")
    public String Sesion() {
        return "Sesion";
    }

    // endpoints de publciaciones
    @GetMapping("/Pubs/Java")
    public String PubsJava(PubDominio pub, Model model) {
        var pubs = pubservice.ListarPubs();
        model.addAttribute("pubs", pubs);
        return "/Publis/PageJava";
    }

    @GetMapping("/Pubs/Desweb")
    public String PubsDesWeb(PubDominio pub, Model model) {
        var pubs = pubservice.ListarPubs();
        model.addAttribute("pubs", pubs);
        return "/Publis/PageDesWeb";
    }

    @GetMapping("/Pubs/Sistemas")
    public String PubsSistemas(PubDominio pub, Model model) {
        var pubs = pubservice.ListarPubs();
        model.addAttribute("pubs", pubs);
        return "/Publis/PageSystems";
    }

    @GetMapping("/Pubs/Gits")
    public String PubsGits(PubDominio pub, Model model) {
        var pubs = pubservice.ListarPubs();
        model.addAttribute("pubs", pubs);
        return "/Publis/PageGit&Github";
    }

    @GetMapping("/Pubs/Robotica")
    public String PubsRobotica(PubDominio pub, Model model) {
        var pubs = pubservice.ListarPubs();
        model.addAttribute("pubs", pubs);
        return "/Publis/PageRobotics";
    }

    // endpoints de funciones
    @PostMapping("/guardar")
    public String Publicar(PubDominio pub, Model model) {
        pubservice.guardar(pub);
        model.addAttribute("pubs", pub);
        return "redirect:/Publicar";
    }

    // endpoint Formulario
    @GetMapping("/Publicar")
    public String PageFormulario(PubDominio pub, Model model) {
        model.addAttribute("pub", pub);

        return "PageFormulario";
    }

    @GetMapping("/editar/{id_publicacion}")
    public String EditarPub(PubDominio pub, Model model) {
        pub = pubservice.encontrarPub(pub);

        model.addAttribute("pubs", pub);
        return "";
    }

    @GetMapping("/eliminar/{id_publicacion}")
    public String Elimnar(PubDominio pub, Model model) {
        pubservice.eliminar(pub);
        return "redrect:/";
    }
}
