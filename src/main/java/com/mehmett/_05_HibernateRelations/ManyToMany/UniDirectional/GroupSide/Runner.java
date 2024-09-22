package com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.GroupSide;

import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.GroupSide.entity.Group;
import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.GroupSide.entity.User;
import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.GroupSide.repository.GroupRepository;
import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.GroupSide.repository.UserRepository;

import java.util.List;

public class Runner {
	public static void main(String[] args) {
		UserRepository userRepository=new UserRepository();
		GroupRepository groupRepository=new GroupRepository();
		
		
		
		User user1= User.builder().username("Reyhan").build();
		User user2= User.builder().username("Deniz").build();
		User user3= User.builder().username("Seyhan").build();
		
		Group group1= Group.builder().name("Grup1").user(List.of(user1,user2)).build();
		Group group2= Group.builder().name("Grup2").user(List.of(user3,user1)).build();
		
		userRepository.saveAll(List.of(user1,user2,user3));
		groupRepository.saveAll(List.of(group1,group2));
		
		
	groupRepository.findAll().forEach(System.out::println);
		userRepository.findAll().forEach(System.out::println);
	}
}