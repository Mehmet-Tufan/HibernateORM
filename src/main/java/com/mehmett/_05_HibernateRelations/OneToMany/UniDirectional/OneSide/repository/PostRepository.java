package com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.OneSide.repository;

import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.OneSide.entity.Post;


public class PostRepository extends RepositoryManager<Post, Long> {
	
	public PostRepository() {
		super(Post.class);
	}
}