package com.example.demo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
@Api(tags = {"EmployeeController 사용 설명서 v1"})
public class EmployeeController {
	private final EmployeeRepository repository;
	EmployeeController(EmployeeRepository repository) {
		this.repository = repository;
	}
	
	@ApiOperation(value="모든 employees 정보 출력",
			notes="<h3>실행 시 employees의 모든 정보 출력<br><br>"
					+ "<pre>출력 예시 <br><hr>"
					+ "[\r\n"
					+ "  {\r\n"
					+ "  \t\"id\": 0,\r\n"
					+ "  \"name\": \"string\",\r\n"
					+ "  \"role\": \"string\"\r\n"
					+ "  }<br>]</pre>")
	@GetMapping("/employees")
	List<Employee> all() {
		return repository.findAll();
	}
	
	@ApiOperation(value="employees의 정보 수정 및 추가",
			notes="<h3>id(int), name(String), role(String) 파라미터에 값 입력 후 실행 시 <br>"
					+ "id값이 기존에 있는 값일 경우 name과 role을 입력한 값으로 수정, <br>"
					+ "id값이 기존에 없는 값일 경우 새로운 데이터로 추가<br><br></h3>"
					+ "<pre>입력 예시 <br><hr>"
					+ "{\r\n"
					+ "  \"id\": 2,\r\n"
					+ "  \"name\": \"kdj name\",\r\n"
					+ "  \"role\": \"kdj role\"\r\n"
					+ "}</pre><br>")
	@PostMapping("/employees")
	Employee newEmployee(@RequestBody Employee newEmployee) {
		return repository.save(newEmployee);
	}
	@ApiOperation(value="employees table의 특정 정보 출력",
			notes="<h3>파라미터에 검색하고자 하는 id 입력 후 실행 시, employees의 해당 id값 정보가 출력<br><br></h3>"
					+ "<pre>출력 예시 <br><hr>"
					+ "{\r\n"
					+ "  \"id\": 2,\r\n"
					+ "  \"name\": \"Frodo\",\r\n"
					+ "  \"role\": \"thief\"\r\n"
					+ "}</pre><br><br>"
					+ "<h4>※ 없는 id값 입력시 Error 발생</h4>")
	@ApiResponses({
        @ApiResponse(code = 500, message = "EmployeeNotFoundException")
	})
	@GetMapping("/employees/{id}")
	Employee one(@ApiParam(value="아이디", required = true) @PathVariable Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException(id));
	}
	
	@ApiOperation(value="employees의 특정 정보 삭제",
			notes="<h3>파라미터에 삭제하고자 하는 id 입력 후 실행 시, employees의 해당 id값 정보가 삭제<br><br></h3>"
					+ "<h4>※ 없는 id값 입력시 Error 발생</h4>")
	@ApiResponses({
        @ApiResponse(code = 500, message = "EmployeeNotFoundException")
	})
	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@ApiParam(value="아이디", required = true) @PathVariable Long id) {
		repository.deleteById(id);
	}
}
