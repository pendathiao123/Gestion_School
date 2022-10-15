package com.tdsi.school_gestion.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "prefet")
public class Prefet extends Eleve {

}