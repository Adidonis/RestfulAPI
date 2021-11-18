package com.tekmindz.empdetail;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
// import javax.validation.constraints.Email;
// import javax.validation.constraints.NotBlank;
// import javax.validation.constraints.Pattern;
// import javax.validation.constraints.Size;

import org.springframework.data.redis.core.RedisHash;

@Entity
@RedisHash("empInfo")
@Table(name = "EmpDetail")
public class empInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NotBlank
    // @Size(min = 3, max = 50, message = "User must be between 3-50 characters")
    // @Pattern(regexp = "{A-Za-z0-9}*")
    @Column(name = "name")
    private String name;

    // @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email!!")
    @Column(name = "email")
    private String email;

    // @NotBlank
    // @Size(min = 1,max = 3)
    @Column(name = "age")
    private int age;

    // @Size(min = 10,max= 10, message = "phone_no should be exact 10 characters." )
    @Column(name = "phone")
    private Double phone;

    public empInfo(){
    }

    public empInfo(String name, String email, int age, Double phone) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getPhone() {
        return phone;
    }

    public void setPhone(Double phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "empInfo [age=" + age + ", email=" + email + ", id=" + id + ", name=" + name + ", phone=" + phone + "]";
    }

    public void setAge(String string) {
    }
    

}
