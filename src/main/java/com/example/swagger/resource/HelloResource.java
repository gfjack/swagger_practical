package com.example.swagger.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "HelloWorld Resources")
public class HelloResource {

	@ApiOperation(value = "Returns hello world")
	@ApiResponses(
			value = {
					@ApiResponse(code = 100, message = "100 is message"),
					@ApiResponse(code = 200, message = "status 200")
			}
	)
	@GetMapping
	public String hello() {
		return "hello world";
	}

	@ApiOperation(value = "Returns new hello")
	@PostMapping("/add")
	public String helloAdd(@RequestBody final String hello) {
		return hello;
	}

	@ApiOperation(value = "put a new one")
	@PutMapping("/put")
	public String helloPut(@RequestBody final String hello) {
		return hello;
	}
}
