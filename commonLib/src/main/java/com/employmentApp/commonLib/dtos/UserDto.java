package com.employmentApp.commonLib.dtos;

import com.employmentApp.commonLib.enums.Role;

public class UserDto
{
	/*
	 * @author Mohamed Rafick
	 */
    private String userName;  
    private String firstName;
    private String lastName;
    private String email;       
    private Role role;         

    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
}
