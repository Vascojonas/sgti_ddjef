package com.ddjef.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ddjef.entity.Buse;
import com.ddjef.enums.*;
import com.ddjef.service.BuseService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/buses")
public class BuseController {
   
    @Autowired
    private BuseService buseService;

    @GetMapping()
    public String index(){
        return "buses/list";
    }

    @GetMapping("/new")
    public String create(Buse buse){
        return "buses/create";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, RedirectAttributes attr, Model model){
        Buse buse= buseService.findById(id);
        if (buse==null) {
            attr.addFlashAttribute("error", "Viatura nao encontrada");
            return "redirect:/buses";
        }
        else{
            model.addAttribute("buse",buse);
            return "buses/create";
        }
        
    }

    @PostMapping("/save")
	public String salvar(@Valid Buse buse, BindingResult result, ModelMap model, RedirectAttributes attr) {
		if (result.hasErrors()) {// verifica se campos têm erros
			return "buses/create";
		}

        buseService.save(buse);
		
		attr.addFlashAttribute("success", "Viatura gravada com sucesso");
		return "redirect:/buses/new";
	}

    @ModelAttribute("models")
	public ModelBuse[] getModels(){
		return ModelBuse.values();
	}
    @ModelAttribute("types")
	public TypeBuse[] getTypes(){
		return TypeBuse.values();
	}
    @ModelAttribute("buses")
	public List<Buse> getBuses(){
		return buseService.findAll();
	}
    
    @DeleteMapping("/delete")
    public @ResponseBody  Map<String, Object> salvar(@RequestParam() Long id){
    	
    
    	buseService.delete(id);
    	
    	Map<String, Object> result = new HashMap<>();
    	result.put("status", 200);
		result.put("message", "Viatura deletada com sucesso!");
		
		return result;
    }
}
