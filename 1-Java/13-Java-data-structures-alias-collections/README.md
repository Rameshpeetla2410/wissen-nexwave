






					data-structure
					--------------
					
					way of organizing the memory, to do CRUDSS operations
					
					
					types
					--------
					
						- primary  ==> holds single data-element
						- secondary ==> holds many data-elements
						
							a. linear
								- array
								- linkedlist
								- stack
								- queue
								- hashtable
								.........
							b. non-linear
							
								- tree
								- graph
								
					            ................ 			
              ------------------------------------------------------
              
              
              
              collection F.W ( java.util.* )
              
              	
              	=> defined data-structures by java community 
              	
              	
              	
              	advantages of collection F.W
              	
              	
              	=> Reduces programming effort
              	=> Increases program speed and quality
              	=> Allows interoperability among unrelated APIs
              	=> Reduces effort to learn and to use new APIs
              	=> Reduces effort to design new APIs
              	=> Fosters software reuse
              	
              	
             --------------------------------------------------------
             
             types of collections in .java-lang
             
             
             1. List
             
             	-> index based
             	-> can hold duplicates due to index-based
             	-> ordered o/p
             	
             
             2. Set
             
             	-> No Index
             	-> unique elements
             	-> ordered / un-ordered / natural-order
             	
            3. Map
            
            	==> user-identity ( key ) + value
            	
            --------------------------------------------------  	  	
              	
              
            collection / data-structure implementation(s)  in collection F.W
            
            
            1. List
            
                - Vector     => array  ( thread-safe )
            	- ArrayList  => array
            	- LinkedList => dll
            	- Stack extends Vector    
            	
            2. Set
            
            	- TreeSet   => tree             -> natural-ordered
            	- HashSet   => hashtable        -> unordered
            	- LinkedHashSet => dll + hashtable 	-> ordered
           
            3. Map
            
            	- TreeMap   => tree             -> natural-ordered
            	- HashMap   => hashtable        -> unordered
            	- LinkedHashMap => dll + hashtable 	-> ordered
                - Hashtable      => hashtable ( thread-safe ) 
                
            4. Queue
            
            	- LinkedList
            	- PriorityQueue
            	- Deque
           
             ------------------------------------------------------- 	    

              
              Collection F.W hierarchy
              
              
              top-Level    : Interfaces
              middle-level : Abstract classes
              bottom-level : concrete classes
              
              
                        			  -------------------------------------------------------  
              
              
              
                     
                     




	