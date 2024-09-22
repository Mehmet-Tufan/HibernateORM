package com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.GroupSide.repository;

import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.GroupSide.entity.User;


public class UserRepository extends RepositoryManager<User, Long> {
	public UserRepository() {
		super(User.class);
	}
}