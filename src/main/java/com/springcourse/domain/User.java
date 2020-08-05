package com.springcourse.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class User {
	private Long id;
	private String name;
	private String email;
	private String password;
	private List<Request> requests;
	private List<RequestStage> stages;
}
