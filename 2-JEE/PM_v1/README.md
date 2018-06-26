


		PM ( Products management )
		--------------------------
		
		--------------------------------------------------
		Model ( Business data )
		
		
			- Product
			
				-id,name,price,makeDate,image,description
				
		--------------------------------------------------		 
		
		db design
				
		 => based on relational model on any RDBMS ( mysql/oracle )
		 
		 table(s) 
		 
		  => PRODUCTS
		 
		-------------------------------------------------
		
		db-schema:
		
		create database shop_db;
		use shop_db;
		
		create table shop_db.PRODUCTS(
			id int primary key auto_increment,
			name varchar(200),
			price double,
			makeDate date,
			image varchar(200),
			description varchar(256)
		);
		
		-------------------------------------------------
		
		
		application design
				
		 => using object model on any language ( like java )
		 
		 
		 Model
		 ----------
		 
		 	Product
		 
		
		--------------------------------------------------
		
		Layer(s)
		--------------------------------------------------
		
		-> dao/data/repository layer  ==> persisting logic
		
		   e.g  ProductRepository
		
		
		    impln : using data-accessing technologies
		    
		    for SQL based databases
		    
		    	 	a. JDBC API
		    	 	b. Hibernate
		    	 	c. Eclipselink
		    	 	d. Toplink
		    	 	e. iBatis
		    	 	
		    	 	f. JPA
		    	 	
		    	 	
		--------------------------------------------------			
		
		service-Layer
		
			=> processing logic
			
		--------------------------------------------------
		
		
		
		View-Layer
		------------
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		