package com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.ManySide;

import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.ManySide.entity.Post;
import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.ManySide.entity.User;
import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.ManySide.repository.PostRepository;
import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.ManySide.repository.UserRepository;

import java.util.List;

public class Runner {
	public static void main(String[] args) {
		UserRepository userRepository = new UserRepository();
		PostRepository postRepository = new PostRepository();

		User user1 = User.builder().username("Berlin").build();

		Post post1= Post.builder().title("Başlık 1").content("Content 1").user(user1).build();
		Post post2= Post.builder().title("Başlık 2").content("Content 2").user(user1).build();
//
		userRepository.save(user1);
		postRepository.save(post1);
		postRepository.save(post2);

		userRepository.findAll().forEach(System.out::println);
		postRepository.findAll().forEach(System.out::println);
		
	}
}