package com.mehmett._05_HibernateRelations.ManyToMany.BiDirectional;

import com.mehmett._05_HibernateRelations.ManyToMany.BiDirectional.entity.Group;
import com.mehmett._05_HibernateRelations.ManyToMany.BiDirectional.entity.User;
import com.mehmett._05_HibernateRelations.ManyToMany.BiDirectional.repository.GroupRepository;
import com.mehmett._05_HibernateRelations.ManyToMany.BiDirectional.repository.UserRepository;

import java.util.List;

public class Runner {
	public static void main(String[] args) {
		UserRepository userRepository=new UserRepository();
		GroupRepository groupRepository=new GroupRepository();
		
		
		
		User user1= User.builder().username("Reyhan").build();
		User user2= User.builder().username("Deniz").build();
		User user3= User.builder().username("Seyhan").build();
		
		Group group1= Group.builder().name("Grup1").user(List.of(user1, user2)).build();
		Group group2= Group.builder().name("Grup2").user(List.of(user3, user1)).build();
		
		user1.setGroup(List.of(group1, group2));
		user2.setGroup(List.of(group1));
		
		userRepository.saveAll(List.of(user1, user2, user3));
		
	groupRepository.findAll().forEach(System.out::println);
		userRepository.findAll().forEach(System.out::println);
	}
}