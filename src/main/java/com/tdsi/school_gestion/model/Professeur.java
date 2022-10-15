package com.tdsi.school_gestion.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;

@Data
@Entity
@Table(name = "professeur")
public class Professeur extends Personnel {

}