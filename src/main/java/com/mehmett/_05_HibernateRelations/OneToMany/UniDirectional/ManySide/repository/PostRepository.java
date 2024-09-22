package com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.ManySide.repository;

import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.ManySide.entity.Post;


public class PostRepository extends RepositoryManager<Post, Long> {
	
	public PostRepository() {
		super(Post.class);
	}
}