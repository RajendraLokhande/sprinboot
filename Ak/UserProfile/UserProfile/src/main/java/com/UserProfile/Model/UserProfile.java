package com.UserProfile.Model;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="USER_PROFILE_MASTER")
public class UserProfile {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_PROFILE_ID")
	private Long id;
    
    @Column(name="USER_NAME")
	private String userName;
	
    @Column(name="USER_FIRST_NAME")
    private String firstName;
    
    @Column(name="USER_LAST_NAME")
	private String lastName;
    
    @Column(name="USER_EMAIL")
	private String email;
    
    @Column(name="CREATE_DATE")
	private Date createDate;
	
	@Column(name="UPADTE_DATE")
	private Date updateDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;
	

}
