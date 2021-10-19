package com.qanyn.app.repository;

import com.qanyn.app.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,  Integer> {

    @Query (value = "select p from Post p where p.created_by = :username")
    List<Post> findAllBySubAdminLogin(@Param("username") String username);
}
