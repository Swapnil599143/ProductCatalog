package com.example.productcatalogservice.entity;

import java.time.LocalDateTime;

public abstract class BaseEntity {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private State deleteState;

    protected void setId(Long id){
        this.id = id;
    }

    protected Long getId(){
        return this.id;
    }

    protected void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    protected  LocalDateTime getCreatedAt(){
        return this.createdAt;
    }

    protected void setUpdatedAt(LocalDateTime updatedAt){
        this.updatedAt = updatedAt;
    }

    protected LocalDateTime getUpdatedAt(){
        return this.updatedAt;
    }

    protected void setState(State deleteState){this.deleteState = deleteState;}

    protected State getState(){return this.deleteState;}
}
