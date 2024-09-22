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
@Table(name = "tblgroup")
public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	@ManyToMany(fetch = FetchType.EAGER)
			@JoinTable(name = "tblgroup_user",joinColumns = @JoinColumn(name = "group_id"),inverseJoinColumns = @JoinColumn(name = "user_id"))
	List<User> user;	//ManyToMany>
	
	@Override
	public String toString() {
		return "Group{" + "id=" + getId() + ", name='" + getName() + '\'' + ", users=" + getData(user) + '}';
	}
	
	public String getData(List<User> users) {
		StringBuilder sb=new StringBuilder();
		for (User user : users) {
			sb.append("\n");
			sb.append(user.username);
			sb.append("\n");
		}
		return sb.toString();
	}

}