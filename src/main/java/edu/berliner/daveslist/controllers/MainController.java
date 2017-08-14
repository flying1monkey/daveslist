package edu.berliner.daveslist.controllers;


import edu.berliner.daveslist.models.Ad;
import edu.berliner.daveslist.repositories.AdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController
{
    @Autowired
    AdRepo adRepo;

    @GetMapping("/")
    public String home()
    {
        return "index";
    }

    @GetMapping("/index")
    public String start()
    {
        return "index";
    }

    @GetMapping("/addrental")
    public String addRental(Model model)
    {
       model.addAttribute("newAd", new Ad());
       return "addrental";
    }

    @PostMapping("/addrental")
    public String submitRental(@Valid @ModelAttribute("rental") Ad ad, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "addrental";
        }
        adRepo.save(ad);
        return "index";
    }

    @GetMapping("/showrentals")
    public String showRentals(Model model)
    {
        Iterable<Ad> ads = adRepo.findAll();
        model.addAttribute("ads", ads);
        return "showrentals";
    }

    @GetMapping("/editrental")
    public String editRentals(@ModelAttribute("rental") Ad ad, Model model)
    {
        Iterable<Ad> ads = adRepo.findAll();
        model.addAttribute("ads", ads);
        return "editrental";
    }
}
