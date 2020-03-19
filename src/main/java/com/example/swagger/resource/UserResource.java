package com.example.swagger.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
@Api(value = "User Resources")
public class UserResource {

  @ApiOperation(value = "get 2 users")
  @GetMapping
  public List<User> getUser() {
    return Arrays.asList(new User("jack", 200L), new User("tom", 300L));
  }

  @ApiOperation(value = "get the targeted user")
  @GetMapping("/{userName}")
  public User getUser(@PathVariable("userName") final String userName) {
  	return new User(userName, 1000L);
  }


  private class User {

    @ApiModelProperty(notes = "name of user")
    private String userName;

    @ApiModelProperty(notes = "salary of user")
    private Long salary;

    public User(String userName, Long salary) {
      this.userName = userName;
      this.salary = salary;
    }

    public String getUserName() {
      return userName;
    }

    public void setUserName(String userName) {
      userName = userName;
    }

    public Long getSalary() {
      return salary;
    }

    public void setSalary(Long salary) {
      this.salary = salary;
    }
  }
}
