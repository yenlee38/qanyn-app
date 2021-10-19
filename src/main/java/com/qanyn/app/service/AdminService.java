package com.qanyn.app.service;

import com.qanyn.app.model.Admin;
import com.qanyn.app.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public void save(Admin admin) {
        admin.setCreated_at(new Date());
        admin.setIs_hidden(false);
        admin.setRole("ROLE_SUBADMIN");
        admin.setUpdated_at(new Date());
        adminRepository.save(admin);
    }

    public void updateAdmin(Admin admin) {
        Admin newAdmin = adminRepository.findById(admin.getId()).get();
        newAdmin.setUpdated_at(new Date());
        newAdmin.setUsername(admin.getUsername());
        newAdmin.setPassword(admin.getPassword());
        newAdmin.setMatchingPassword(admin.getMatchingPassword());
        newAdmin.setIs_hidden(admin.isIs_hidden());
        adminRepository.save(newAdmin);
    }

    public Admin getById(int id) {
        return adminRepository.findById(id).get();
    }

    public void saveAdmin(Admin admin) {
        admin.setCreated_at(new Date());
        admin.setIs_hidden(false);
        admin.setRole("ROLE_ADMIN");
        admin.setUpdated_at(new Date());
        adminRepository.save(admin);
    }

    public void deleteAdminById(int id) {
        adminRepository.deleteById(id);
    }

    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    public List<Admin> searchByUsername(String username) {
        return adminRepository.searchByUsername(username);
    }

    public String getUsernameLoginCurrent() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            return ((UserDetails)principal).getUsername();
        } else {
            return principal.toString();
        }
    }
}
