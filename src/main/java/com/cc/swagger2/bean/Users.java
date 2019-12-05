package com.cc.swagger2.bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.management.ValueExp;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class Users {

    @NotBlank(message = "用户名不能为空")
    @Length(min = 2, max = 6, message = "最大长度为六位，最小长度为两位")
    private String name;

    @NotBlank(message = "密码不能为空")
    private String password;

    @Min(value = 0, message = "最小年龄不能小于0岁")
    @Max(value = 150, message = "最大年龄不能大于150岁")
    private Integer age;

    @Email
    private String email;
}
