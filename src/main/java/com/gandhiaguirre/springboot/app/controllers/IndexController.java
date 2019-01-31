package com.gandhiaguirre.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value = "IndexController")
public class IndexController {

	@Value("${application.controller.title}")
	private String title;

	@Value("${application.controller.subtitle}")
	private String subtitle;

	@ApiOperation("Redireccionamiento a la pagina index")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		return index(model);
	}

	@ApiOperation("Redirecciona a la vista index.jsp agregando el titulo y subtitulo al Modelo; estos son leidos desde application.properties")
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {// El objeto model, permite pasar objetos a la vista
		model.addAttribute("title", title);
		model.addAttribute("subtitle", subtitle);
		return "index"; // Se retorna el nombre del view
	}

}
