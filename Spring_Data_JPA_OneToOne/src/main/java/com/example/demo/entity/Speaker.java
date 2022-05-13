package com.example.demo.entity;

	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Entity
	@Table(name="harispeaker_one_To_one201")


	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class Speaker {
		
		@Id
		@Column(name="id")
		int id;
		@Column(name="firstName")
		String firstname;
		@Column(name="qualification")
		String qualification;

	}


