package model;

import java.time.LocalDate;

// Type your code
public class Blog {
	String title;
	String description;
	LocalDate postedOn;
	
	
	
	public String getBlogTitle() {
		return this.title;
	}
	
	public String getBlogDescription() {
		return this.description;
	}
	
	public LocalDate getBlogPostedOn() {
		return this.postedOn;
	}
	
	public void setBlogTitle(String title) {
		this.title=title;
	}
	
	public void setBlogDescription(String description) {
		this.description=description;
	}
	
	public void setBlogPostedOn(LocalDate postedOn) {
		this.postedOn=postedOn;
	}
	
	public Blog(String title, String description, LocalDate postedOn) {
		this.title=title;
		this.description=description;
		this.postedOn=postedOn;
	}
	
}