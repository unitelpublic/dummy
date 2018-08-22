# Юнител API жагсаалт & тайлбар
1. Нэгж 
	* Нэгж нэмэх
	* Нэгж хасах
1. Negj nemdeg - add-unit
2. Negj hasdag - deduct-unit
3. Data erh nemdeg - add-data - by MB, GB, KB
4. Data erh hasdag - deduct-data
5. Yarianii erh/minut nemdeg - add-calltime - BY MIN, SEC
6. Yarianii erh/minut hasdag - deduct-calltime
5. SMS erh/minut nemdeg - add-smscount
6. SMS erh/minut hasdag - deduct-smscount
7. Hereglegch ruu SMS ilgeedeg - submit-sms
8. Tolbor nemdeg (in case of postpaid) - add-bill
9. Recharge cash

+ set nemeh


add-unit/deduct-unit
{
	phoneNo: 
	amount:
	description:
}


9. Recharge cash
{
	"phoneNo": "",
	"hiddenNumber": "",
	"channel": ""
}

channel:
	- WEB
	- ATM
	- CARD
	- APP
	- BANK
	- DEALER
	- OTHER
	
	
{ "result_desc": ERROR MESSAGE, "result_code": ERR, "result_reason": ERROR }
{ "result_reason": "SUCCESS", "result_code": 0 }
