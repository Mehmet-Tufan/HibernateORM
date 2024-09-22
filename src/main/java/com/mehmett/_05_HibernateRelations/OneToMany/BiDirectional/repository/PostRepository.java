package com.mehmett._05_HibernateRelations.OneToMany.BiDirectional.repository;

import com.mehmett._05_HibernateRelations.OneToMany.BiDirectional.entity.Post;


public class PostRepository extends RepositoryManager<Post, Long> {
	
	public PostRepository() {
		super(Post.class);
	}
}