package com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.UserSide;

import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.UserSide.entity.Group;
import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.UserSide.entity.User;
import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.UserSide.repository.GroupRepository;
import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.UserSide.repository.UserRepository;

import java.util.List;

public class Runner {
	public static void main(String[] args) {
		UserRepository userRepository=new UserRepository();
		GroupRepository groupRepository=new GroupRepository();
		
		Group group1= Group.builder().name("Grup1").build();
		Group group2= Group.builder().name("Grup2").build();
		
		User user1= User.builder().username("Reyhan").group(List.of(group1,group2)).build();
		User user2= User.builder().username("Deniz").group(List.of(group1)).build();
		User user3= User.builder().username("Seyhan").group(List.of(group2)).build();
		
		groupRepository.saveAll(List.of(group1,group2));
		
		userRepository.saveAll(List.of(user1,user2,user3));




	groupRepository.findAll().forEach(System.out::println);
		userRepository.findAll().forEach(System.out::println);
	}
}