package com.mehmett._05_HibernateRelations.ManyToMany.BiDirectional.repository;

import com.mehmett._05_HibernateRelations.ManyToMany.BiDirectional.entity.User;


public class UserRepository extends RepositoryManager<User, Long> {
	public UserRepository() {
		super(User.class);
	}
}