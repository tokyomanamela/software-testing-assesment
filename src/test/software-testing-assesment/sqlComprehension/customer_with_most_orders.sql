

SELECT C.Company_name
From  customers C , oders O 
Having MAX(

		Select COUNT(DISTINCT customer_id)
		From orders 

)