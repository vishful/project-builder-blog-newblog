package testing;

/* Uncomment the below code to test your application*/

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import model.Blog;

public class TestBlog {
	LocalDate ld = LocalDate.of(2005, 4, 9);
	Blog blog = new Blog("Java","ProgrammingLanguage",ld);
	
	 @Test
	 public void testSetterGetter() {
		 blog.setBlogDescription("ProgrammingLanguage");
		 blog.setBlogTitle("Java");
		 blog.setBlogPostedOn(ld);
		 assertEquals("ProgrammingLanguage",blog.getBlogDescription());
		 assertEquals("Java",blog.getBlogTitle());
		 assertEquals(ld,blog.getBlogPostedOn());
		 try {
			 blog.setBlogDescription(null);
			 blog.setBlogTitle(null);
			 blog.setBlogPostedOn(null);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
}
