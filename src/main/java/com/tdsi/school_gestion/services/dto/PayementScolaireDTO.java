package com.tdsi.school_gestion.services.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PayementScolaireDTO {
    private Double montant;
    private Date date;
    private String description;
}
