



	
	
	
------------------------------------------------------------------------------			
In concurrent programming, there are two basic units of execution:

==>"processes" and "threads"		

------------------------------------------------------------------------------
In the Java programming language, 
concurrent programming is mostly concerned with "threads".

------------------------------------------------------------------------------

At present computer systems to have multiple processors 
or processors with multiple execution cores.
This greatly enhances a system's capacity for concurrent execution
of processes and threads

 — but concurrency is possible even on simple systems,
   without multiple processors
   or execution cores through an OS feature called time-slicing.
------------------------------------------------------------------------------	



Processes  vs Threads
======================


  Process:
  
   ==> has a self-contained execution environment. 
   ==> has a complete, private set of basic run-time resources.
   ==> each process has its own memory space
   
   
   
   Java virtual machine run as a single process.
   
   
   
  Threads:
  
   ==> Threads are sometimes called lightweight processes
   ==> Both processes and threads provide an execution environment,
       but creating a new thread requires fewer resources than creating 
       a new process.
   ==> Threads exist within a process -- every process has at least one.
   ==> Threads share the process's resources, including memory and open files.
   
   
   
   Multi-threaded execution is an essential feature of the Java platform.
   
   Every application has at least one thread — or several
   
   
   ------------------------------------------------------------------------------
   
   
   How to create thread in java-programming ?

   ==> Each thread is associated with an instance of the class Thread.
   
       
   	    There are two basic strategies for using Thread objects to create 
   	    a concurrent application.
   	    
   	      
   	    1. To directly control thread creation and management, 
   	       simply instantiate Thread each time the application needs
   	       to initiate an asynchronous task.
   	       
   	    2. To abstract thread management from the rest of your application, 
           pass the application's tasks to an executor.
           
              
 ----------------------------------------------------------------------------  	    
	
    Defining and Starting a Thread
     
     
     way-1 : Provide a Runnable object to thread    ( recommended )
     
     			==> separates business-logic from thread management
     		
     way-2 : Subclass Thread.

				=> 

              
 ----------------------------------------------------------------------------  	    

    Basic demos
    
  ----------------------------------------------------------------------------- 







