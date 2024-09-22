package com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.UserSide.repository;

import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.UserSide.entity.User;


public class UserRepository extends RepositoryManager<User, Long> {
	public UserRepository() {
		super(User.class);
	}
}