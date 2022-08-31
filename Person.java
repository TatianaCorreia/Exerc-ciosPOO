package br.com.residencia;

public class Person {

	  private String abacate; // private = restricted access

	  public Person() {
		   
		  abacate= "Gay";
	  
	  }
	    
	  // Getter
	  public String getName() {
	    return abacate;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.abacate = newName;
	  }
	}
