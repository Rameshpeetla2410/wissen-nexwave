
	
	OO concepts
	-------------------------------------------  
  
    - Abstraction / Interface
        why we need ?
            => easy to use/learn by dependent-object
            => loose-coupling b/w dependent & dependency

    - Encapsulation / Implementation
        why we need ?
            => real-functionality or Implementation
            => hiding complex Implementation thru Abstraction
  
  
    How to implement in java-lang-objects ?
    
    many ways
    
    1. using proper access-specifiers & packages
    2. using accessor methods ( set & get ) methods
    3. using class & interfaces
    4. using proper OO design patterns
    
    
    -------------------------------------------------------------
    
     1. using proper access-specifiers & packages
     
     
     e.g
     
     
     	proj
     	
     		- p1  
     			A.java 
     			B.java extends A.java
     			C.java 
     			
     		- p2   
     			D.java extends A.java 
     			E.java
	     			
	     -----------------------------------------------------------
	     		same-package               | other-packge         
	     -----------------------------------------------------------
	     same-type | sub-type | other-type | sub-type  other-type
	     -----------------------------------------------------------
private     Y           N           N           N          N
default     Y           Y           Y           N          N
protected   Y           Y           Y           Y          N
public      Y           Y           Y           Y          Y 
     
        -------------------------------------------------------------
     
    
    
    	 using class & interfaces
    	 
    	 2 types of objects
    	 
    	  -> dependent
    	  -> dependency
    	  
    	  
    	  e.g
    	  
    	  		-> car   : move()
    	  		-> Wheel : rotate()
    	  		
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    
    