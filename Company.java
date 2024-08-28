package com.debugiandoideas.companies_crud.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id;
    private String  name;
    private String  founder;
    private String  logo;

    @JsonFormat(shape = JsonFormat.STRING,pattern="dd/MM/yyyy")
    private String  foundationDate;
	
	public setId(Long id){
		this.id = id
	}

	public setName(String name){
		this.name = name;

    public Long getId(){
		return this.id;

}
