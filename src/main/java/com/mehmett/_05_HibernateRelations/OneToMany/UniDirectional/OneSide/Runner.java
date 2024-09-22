package com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.OneSide;

import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.OneSide.entity.Post;
import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.OneSide.entity.User;
import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.OneSide.repository.PostRepository;
import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.OneSide.repository.UserRepository;

import java.util.List;

public class Runner {
	public static void main(String[] args) {
		PostRepository postRepository = new PostRepository();
		UserRepository userRepository = new UserRepository();
		Post post1 = Post.builder().title("Hibernate").content("Hibernate").build();
		Post post2 = Post.builder().title("Java15").content("Java15 hibernate relations").build();
		User user1 = User.builder().username("Mehmet").posts(List.of(post1,post2)).build();
		postRepository.save(post1);
		postRepository.save(post2);
		userRepository.save(user1);
		
//		postRepository.findAll().forEach(System.out::println);
		userRepository.findAll().forEach(System.out::println);
		
	}
}