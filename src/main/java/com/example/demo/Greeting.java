/**
 * 
 */
package com.example.demo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author berina
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Greeting {

	private Date date;
	private String content;
	
	public Greeting(Date date, String content) {
        this.date = date;
        this.content = content;
    }
	
	public Greeting() {
		
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
