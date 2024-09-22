package com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.GroupSide.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tblgroup")
public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	@ManyToMany(fetch = FetchType.EAGER)
	List<User> user;	//ManyToMany>

}