package com.hs.user.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    private Integer id;
    transient private String password;
    private String name;
    private Integer role;
    private String idCard;
    private Company company;
    private Long tel;
    private String email;
    private Integer sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime birthday;
    private String img;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    transient private LocalDateTime lastLoginTime;

    transient private LocalDateTime createTime;
}
