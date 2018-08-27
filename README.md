# Юнител API жагсаалт & тайлбар
1. Нэгж   
   Хэрэглэгчийн дансан дахь нэгжийн хэмжээг  нэмэх ,хасах эсвэл шинээр утга олгоход ашиглана 
	* Нэгжийн хэмжээг нэмэх
	* Нэгжийн хэмжээг хасах
	* Нэгж хэмжээг тохируулах 
2. Дата  
   Хэрэглэгчийн дансан дахь датаны хэмжээг  нэмэх ,хасах эсвэл шинээр утга олгоход ашиглана 
	* Датаны хэмжээг нэмэх
	* Датаны хэмжээг хасах
	* Датаны хэмжээг тохируулах 
3. Яриа 
   Хэрэглэгчийн дансан дахь ярианы эрхийн  хэмжээг  нэмэх ,хасах эсвэл шинээр утга олгоход ашиглана 
	* Ярианы эрх нэмэх
	* Ярианы эрх хасах
	* Ярианы эрх тохируулах 
4. Мессеж  
   Хэрэглэгчийн дансан дахь мессеж эрхийн  хэмжээг  нэмэх ,хасах эсвэл шинээр утга олгоход ашиглана 
	* Мессеж эрх нэмэх
	* Мессеж эрх хасах
	* Мессеж эрх тохируулах 
	* Хэрэглэгчрүү мессеж илгээх
5. Төлбөр  
6. Цэнэглэлт  
	* Хэрэглэгчийн дансыг цэнэглэх 

# Нэгж
## Нэгжийн хэмжээг нэмэх
	URL: http//{domain}:{port}/unit/add
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
  	"description": "Test"
	}
## Нэгжийн хэмжээг хасах
	URL: http//{domain}:{port}/unit/deduct
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
  	"description": "Test"
	}
## Нэгжийн хэмжээг тохируулах
	URL: http//{domain}:{port}/unit/set
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
  	"description": "Test"
	}
# Дата
## Дата хэмжээг нэмэх
	URL: http//{domain}:{port}/data/add
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
	"type":"MB"
  	"description": "Test"
	}
## Дата хэмжээг хасах
	URL: http//{domain}:{port}/data/deduct
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
	"type":"MB"
  	"description": "Test"
	}
## Дата хэмжээг тохируулах
	URL: http//{domain}:{port}/data/set
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
	"type":"MB"
  	"description": "Test"
	}
# Яриа
## Ярианы эрх нэмэх
	URL: http//{domain}:{port}/call/add
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
	"type":"min"
  	"description": "Test"
	}
## Ярианы эрх  хасах
	URL: http//{domain}:{port}/call/add
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
	"type":"min"
  	"description": "Test"
	}
## Ярианы эрх  тохируулах
	URL: http//{domain}:{port}/call/add
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
	"type":"min"
  	"description": "Test"
	}
# Яриа
## Мессеж хэмжээг нэмэх
	URL: http//{domain}:{port}/sms/add
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
  	"description": "Test"
	}
## Мессеж хэмжээг хасах
	URL: http//{domain}:{port}/sms/deduct
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
  	"description": "Test"
	}
## Мессеж хэмжээг тохируулах
	URL: http//{domain}:{port}/sms/set
	method: POST
	body: {
 	"msisdn":"88123456",
  	"value":2000,
  	"description": "Test"
	}
