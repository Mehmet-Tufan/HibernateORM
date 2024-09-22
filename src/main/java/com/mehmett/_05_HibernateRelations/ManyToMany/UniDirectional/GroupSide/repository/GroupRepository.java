package com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.GroupSide.repository;

import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.GroupSide.entity.Group;


public class GroupRepository extends RepositoryManager<Group, Long> {
	
	public GroupRepository() {
		super(Group.class);
	}
}