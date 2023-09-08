package com.opensource.ecommerce.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;


@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column
private String name;
@Column
private String email;
@Column
private String mobileNo;
@Column
private String password;
@Column
private Boolean isEmailVerified;
@Column
@CreationTimestamp
private Timestamp createdAt;
@Column
@UpdateTimestamp
private Timestamp updatedAt;
@Column
private LocalDate lastLoginTime;

    public User(int id, String name, String email, String mobileNo, String password, Boolean isEmailVerified) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.password = password;
        this.isEmailVerified = isEmailVerified;
    }

    public User(int id, String name, String email, String mobileNo, String password, Boolean isEmailVerified, LocalDate lastLoginTime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.password = password;
        this.isEmailVerified = isEmailVerified;
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", password='" + password + '\'' +
                ", isEmailVerified=" + isEmailVerified +
                ", lastLoginTime=" + lastLoginTime +
                '}';
    }
}
