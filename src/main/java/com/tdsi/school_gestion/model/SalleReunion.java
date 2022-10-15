package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;

@Data
@Entity
@Table(name = "salle")
public class SalleReunion extends Salle {
}