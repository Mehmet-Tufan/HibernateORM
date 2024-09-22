package com.mehmett._05_HibernateRelations.OneToMany.BiDirectional.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tblpost")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String title;
	String content;
	@ManyToOne
			@JoinColumn(name = "userid")
	User user;
	
	@Override
	public String toString() {
		return "Post{" + "id=" + id + ", title='" + title + '\'' + ", content='" + content + '\'' + ", user=" + user.username + '}';
	}
}