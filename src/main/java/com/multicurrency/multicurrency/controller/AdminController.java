package com.multicurrency.multicurrency.controller;

import com.multicurrency.multicurrency.model.User;
import com.multicurrency.multicurrency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.Date;

@Controller
@RequestMapping("")
public class AdminController {

    @Autowired
    UserService userService;

    @RequestMapping("/admin-create")
    public String admin_create(Model model) {
        model.addAttribute("user", new User());
        return "admin_create";
    }
    @PostMapping("/prosesCreate")
    public String prosesData(Model model, @ModelAttribute("user") User user){
        user.setStatus("Active");
        user.setCreatedBy("sysadmin");
        user.setCreatedDate(convertToDateViaSqlDate(LocalDate.now()));
        user.setApprovedBy("sysadmin");
        user.setApprovedDate(convertToDateViaSqlDate(LocalDate.now()));
        userService.saveUser(user);
        return "redirect:/admin-create";
    }


    @GetMapping("/admin-search")
    public String admin_search() {
        return "admin_search";
    }

    @GetMapping("/admin-update")
    public String admin_update() {
        return "admin_update";
    }

    @GetMapping("/admin-delete")
    public String admin_delete() {
        return "admin_delete";
    }

    public Date convertToDateViaSqlDate(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }
}
