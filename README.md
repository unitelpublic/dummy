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

### REESPONSE
|Attribute|Type|Required|Default|Description|
|---     |---       |---     |---    |---        |
|result|String|M|---    |SUCCESS/FAIL|
|display|Display|M|---    |UNITEL DEFINED TYPE|
|message|String|O|---    |failure message|

