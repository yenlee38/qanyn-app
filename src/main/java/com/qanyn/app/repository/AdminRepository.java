package com.qanyn.app.repository;

import com.qanyn.app.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Admin findByUsername(String username);

    @Query(value = "select a from Admin a where a.username = :username and a.is_hidden = false")
    Admin findByUsernameAndAndIs_hidden(@Param("username") String username);

    List<Admin> findAll();

    @Query(value = "select a from Admin a where a.username like %:username%")
    public List<Admin> searchByUsername(@Param("username") String username);
}
