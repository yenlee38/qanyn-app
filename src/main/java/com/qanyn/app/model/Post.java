package com.qanyn.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String content;
    private int image_main;
    private Date created_at;
    private Date updated_at;
    private boolean is_hidden;
    private String created_by;
    private String status; //PENDDING, PUBLISHED, NOTPUBLISHED

    public Post() {
    }

    public Post(int id, String title, String content, int image_main, Date created_at, Date updated_at, boolean is_hidden) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.image_main = image_main;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.is_hidden = is_hidden;
    }

    public Post(int id, String title, String content, int image_main, Date created_at, Date updated_at, boolean is_hidden, String created_by) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.image_main = image_main;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.is_hidden = is_hidden;
        this.created_by = created_by;
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Post(String title, String content, String created_by) {
        this.title = title;
        this.content = content;
        this.created_by = created_by;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImage_main() {
        return image_main;
    }

    public void setImage_main(int image_main) {
        this.image_main = image_main;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
