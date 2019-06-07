# USSD REQUEST


###  Payload
```xml
<Payload>
    <msisdn>89110437</msisdn>
    <ussdCode>*1414*1*1#</ussdCode>
    <sessionId>111</sessionId>
</Payload>
```
|Attribute|Type|Required|Default|Description|
|---     |---       |---     |---    |---        |
|msisdn|String|M|---    |msisdn without country code|
|ussdCode|String|M|---    |ussd short code|
|sessionId|String|M|---    |current ussd session id|

### RESPONSE
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes" ?>
<response>
    <display id="*1414#" type="input">
        <options>
            <option order="1" key="0" text="0.Zuvhun tand" next="*1414*0#" />
            <option order="2" key="1" text="1.Taniltsuulga" next="*1414*1#" />
            <option order="3" key="2" text="2.HaMtDaa hutulbur" next="*1414*2#" />
            <option order="4" key="3" text="3.Dansnii uldegdel" next="*1414*3#" />
            <option order="5" key="4" text="4.Data bagts" next="*1414*4#" />
            <option order="6" key="5" text="5.Kartiin medeelel" next="*1414*5#" />
            <option order="7" key="6" text="6.Zeel" next="*1414*6#" />
            <option order="8" key="7" text="7.Zalga bi daaya" next="*1414*7#" />
            <option order="9" key="8" text="8.Nemelt uilchilgee" next="*1414*8#" />
            <option order="10" key="9" text="9.Roaming" next="*1414*9#" />
            <option order="11" key="10" text="10.Salbaruud" next="*1414*10#" />
        </options>
    </display>
    <result>SUCCESS</result>
</response>
```

|Attribute|Type|Required|Default|Description|
|---     |---       |---     |---    |---        |
|result|String|M|---    |SUCCESS/FAIL|
|display|Display|M|---    |UNITEL DEFINED TYPE|
|message|String|O|---    |failure message|


### Display Type

|Attribute|Type|Required|Default|Description|
|---     |---       |---     |---    |---        |
|id|String|M|---    |id of display object|
|type|String|M|---    |input/final|
|options|List of option |M|---    |unitel defined type|



### Option
 |Attribute|Type|Required|Default|Description|
|---     |---       |---     |---    |---        |
|order|String|M|---    |order of option|
|key|String|M|---    | user press key|
|text|String|M|---    |text of option|
|next|String|M|---    |next ussd code|

Display object has following 2 types   "input" and "final".If type is input then display text from options field 


if type is final , show texts from options and terminate session. for example 
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes" ?>
<response>
    <display id="*1414*3#" type="final">
        <options>
            <option order="1" key="ok" text="Tand 46570 TG, 384.10 MB data. " next="null" />
        </options>
    </display>
    <result>SUCCESS</result>
</response>
```

