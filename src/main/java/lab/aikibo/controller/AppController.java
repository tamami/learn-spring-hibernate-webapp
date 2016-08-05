package lab.aikibo.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lab.aikibo.model.Sppt;
import lab.aikibo.service.SpptService;

@Controller
@RequestMapping("/")
public class AppController {
  @Autowired
  SpptService service;

  @Autowired
  MessageSource messageSource;

  @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
  public String listSppt(ModelMap model) {
    List<Sppt> daftarSppt = service.getAllSppt();
    model.addAttribute("daftarSppt", daftarSppt);
    return "allsppt";
  }

  @RequestMapping(value = {"/terpilih"}, method = RequestMethod.GET)
  public String listSpptTerpilih(ModelMap model) {
    List<Sppt> daftarSppt = service.getSpptTerpilih();
    model.addAttribute("daftarSppt", daftarSppt);
    return "allsppt";
  }
}
