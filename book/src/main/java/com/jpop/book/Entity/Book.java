package com.jpop.book.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
public class Book {

	
	@Id
	@GeneratedValue

	private int id;
	@Column
	private String name;
	@Column
	private String author;
	@Column
	private String Category;
	@Column
	private String description;
}
