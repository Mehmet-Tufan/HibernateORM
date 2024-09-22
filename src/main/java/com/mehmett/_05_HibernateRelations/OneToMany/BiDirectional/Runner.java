package com.mehmett._05_HibernateRelations.OneToMany.BiDirectional;

import com.mehmett._05_HibernateRelations.OneToMany.BiDirectional.entity.Post;
import com.mehmett._05_HibernateRelations.OneToMany.BiDirectional.entity.User;
import com.mehmett._05_HibernateRelations.OneToMany.BiDirectional.repository.PostRepository;
import com.mehmett._05_HibernateRelations.OneToMany.BiDirectional.repository.UserRepository;

import java.util.List;

public class Runner {
	public static void main(String[] args) {
		UserRepository userRepository = new UserRepository();
		PostRepository postRepository = new PostRepository();

		User user1 = User.builder().username("Berlin").build();

		Post post1= Post.builder().title("Başlık 1").content("Content 1").user(user1).build();
		Post post2= Post.builder().title("Başlık 2").content("Content 2").user(user1).build();
		
		user1.setPosts(List.of(post1, post2));
//
		userRepository.save(user1);
//		postRepository.save(post1);
//		postRepository.save(post2);

		userRepository.findAll().forEach(System.out::println);
		postRepository.findAll().forEach(System.out::println);
		
	}
}