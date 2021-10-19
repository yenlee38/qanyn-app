package com.qanyn.app.controller;

import com.qanyn.app.model.Admin;
import com.qanyn.app.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping( "/qanyn")
public class AdminController {

    @Autowired
    public AdminService adminService;

    @RequestMapping(value = "/login")
    public String loginForm() {
        return "login";
    }

    @RequestMapping(value = "/admin-home")
    public String adminHome(Model model) {
        List<Admin> lAdmin = adminService.findAll();
        model.addAttribute("lAdmin", lAdmin);
        return "admin-home";
    }

    @RequestMapping(value = "/admin/register", method = RequestMethod.POST)
    public String registerSubAdmin(@Valid String username, @Valid String password, @Valid String matchingPassword, Model model) {
        adminService.save(new Admin(username,password, matchingPassword, "ROLE_SUBADMIN"));
        return "redirect:/qanyn/admin-home";
    }

    @RequestMapping(value = "/admin/delete", method = RequestMethod.POST)
    public String deteleAdminById(@Valid int id, Model model) {
        adminService.deleteAdminById(id);
        return "redirect:/qanyn/admin-home";
    }

    @RequestMapping(value = "/admin/update", method = RequestMethod.POST)
    public String updateAccount(@Valid int id, @Valid String username, @Valid String password, @Valid String matchingPassword,@Valid boolean is_hidden, Model model) {
        adminService.updateAdmin(new Admin(id, username, password, matchingPassword, is_hidden));
        System.out.printf("hidden: " + is_hidden);
        return "redirect:/qanyn/admin-home";
    }

    @RequestMapping(value = "/admin/search-account", method = RequestMethod.GET)
    public String searchAccount(@Valid String search, Model model) {
        model.addAttribute("lAdmin", adminService.searchByUsername(search));
        return "admin-home";
    }
}
