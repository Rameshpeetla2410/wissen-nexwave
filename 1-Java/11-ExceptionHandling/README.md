





				Exception Handling
				--------------------
				
				
				Excpetion :  ==> un-expected program flow disturb
				
				reasons for exceptions
				
				=> divide by zero
				=> Array index out of bound
				=> IO exception   e.g FileNotFoundException
				=> SQLException
				=> N/w exception
				...........................
				
				
				--------------------------------------------------
				
				what happen if exception happen ?
				by default , JRE will terminate current process
				
				soln :
				==> handle that exception using exception-handlers
				
				exception-handler(s)
					- try,catch,finally
					- throws
					- throw
			------------------------------------------------------
			  
			Advantages of Exceptions
			  
			Advantage 1: Separating Error-Handling Code from "Regular" Code		
		    Advantage 2: Propagating Errors Up the Call Stack
		    Advantage 3: Grouping and Differentiating Error Types
		    
		    ------------------------------------------------------------
		    
		    in java ,
		    
		    ==> every exception is an object created from Exception class which contains details ( what,where) of failure
		    
		    ==> if any illegal exception happened , JRE or you always throw exception using keyword 'throw'
		    
		    ==> handle that exception having 'try' monitor with 'catch' block	
		    	
		    ==> if u want propagate exception to up-method , use 'throws' 	
		   ------------------------------------------------------------- 
		   
		   
		   Exception
		   
		   	- Checked Exception
		   	- Un-CkedException	
		    	
		    	
		    	
				
				
				
				
				
				
				
				
				