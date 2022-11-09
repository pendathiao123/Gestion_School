package com.tdsi.school_gestion.services.dto;

import lombok.Data;

@Data
public class ProfesseurDTO {
    private String nom;
    private String prenom;
    private String login;
    private String password;
    private String tel;
    private String email;
}
