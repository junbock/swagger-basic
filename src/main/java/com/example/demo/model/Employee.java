package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.swagger.annotations.ApiKeyAuthDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@NoArgsConstructor
@ApiModel(description = "회사원 정보")
public class Employee {
	@Id @GeneratedValue
	@ApiModelProperty(required = true, value = "아이디")
	private Long id;
	@ApiModelProperty(value = "이름", allowEmptyValue = true)
	private String name;
	@ApiModelProperty(value = "직무", allowEmptyValue = true)
	private String role;
	
	@Builder
	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}
	
}
