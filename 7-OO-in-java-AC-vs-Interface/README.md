

	   AbstrctClass  vs Interface
	   
	   
	   similar-points
	   
	   	-> on both types, we cant instantiate
	   	-> both types, can hold abstract methods
	   	
	   	syntax differences
	   	
	   		-> AC        : can hold mutable variables
	   		-> Interface : can hold only immutable variables
	   		
	   		-> AC        : can have constructors
	   		-> Interface : no constructor
	   		
	   		-> AC        : can have normal methods + abstract methods
	   		-> Interface : only abstract-methods 
	   		-> Interface : all members are public only
	   			
	   			from java-8 version
	   	    -> Interface : can have default & static methods		
	   							
	            from java-9 version
	            
	        -> can have private-methods also
	        
	     -------------------------------------------------------------        							
	   
	  
	 recommended type-hierarchy
	   	
	 module-1                   		
	           
	 Top-level    : complete-abstract (Interface)
	 Middle-Level : partial-implementation ( Abstract-class ) - optional
	 Bottom-level : Implementation(class)     
	 
	 
	 
	 module-2    
	 
	   
	 ---------------------------------------------------------------------   
	   
	   
	   
	   
	   
	   
	   