package com.mehmett._05_HibernateRelations.ManyToMany.BiDirectional.entity;

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
@Table(name = "tbluser")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String username;
	@ManyToMany(mappedBy = "user",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
	List<Group> group;	//ManyToMany>
	@Override
	public String toString() {
		return "User{" + "id=" + getId() + ", name='" + username + '\'' + ", groups=" +getData(group) + '}';
	}
	public String getData(List<Group> groups) {
		StringBuilder sb=new StringBuilder();
		for (Group group : groups) {
			sb.append("\n");
			sb.append(group.getName());
			sb.append("\n");
		}
		return sb.toString();
	}
}