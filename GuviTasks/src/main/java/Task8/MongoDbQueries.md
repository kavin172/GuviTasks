# MONGODB DAY 1 (MONGODB TASK)

## Product JSON: https://github.com/rvsp/database/blob/master/mongodb/product.json

The queries have been written the mongoshell and the output images are also taken from mongoshell.

### Questions and Queries:

#### 1. Find all the information about each products
* db.Product.find().toArray(); 
I have used .toArray() to avoid typing 'it' in the shell

#### 2. Find the product price which are between 400 to 800
* db.Product.find({product_price:{$gt:400, $lt:800}});

#### 3. Find the product price which are not between 400 to 600
* db.Product.find({product_price:{$not:{$gt:400, $lt:600}}}); <br>
Using $not negates the search result, giving us all the products that are not in the range of gt:400 and lt:600

#### 4. List the four product which are greater than 500 in price
* db.Product.find({product_price:{$gt:500}}).limit(4);

The above query only gives 3 products as only 3 products have price greater than 500.
However, 1 product is having price exactly equal to 500 and the below query inlcudes that as well, giving us 4 products that have price greater than or equal to 500:
* db.products.find({ price: { $gt: 500 } }).limit(4);

#### 5. Find the product name and product material of each products
* db.Product.aggregate(
	[
		{
			$project:{
				id:1,
				product_name:1,
				product_material:1
			}
		}
	]
).toArray();

Used .toArray() to avoid typing 'it' in the shell. Also have not removed the _id field and have included id field for identification.

#### 6. Find the product with a row id of 10
* db.Product.find({id:{$eq:"10"}});

#### 7. Find only the product name and product material
* db.Product.aggregate(
	[
		{
			$project:{
				_id:0,
				product_name:1,
				product_material:1
			}
		}
	]
).toArray(); 
Used .toArray() to avoid typing 'it' in the shell.
Here, have removed the _id field as well.

#### 8. Find all products which contain the value of soft in product material
* db.Product.find({product_material:"Soft"});

#### 9. Find products which contain product color indigo  and product price 492.00
* db.Product.find({$or:[{product_color:{$eq:"indigo"}}, {product_price:{$eq:492}}]}); <br>
Passes the products if they have indigo as their color or the price as 492.

#### 10. Delete the products which product price value are 28
* db.Product.deleteMany({product_price:{$eq:28}}); <br>
This query deletes all the products which have price equal to 28.

