# Drools with Spring Boot

Simple drools rule engine. Usages spring boot and `rules.drl`. Checks if input map contains certain keys then apply rules which adds new entries to the same map.

How to use:

POST: `http://localhost:8080/applyRules`

REQUEST BODY
```json
{
	"bacnet:present-value":"18",
	"bacnet:unit":"c",
	"bacnet:max":"25"
}
```
OUTPUT
```json
{
    "bacnet:present-value": "18",
    "bacnet:unit": "c",
    "bacnet:max": "25",
    "temperature": "m:",
    "cmd": "m:"
}
```
###### TODO: decision table not working - returns false on condition check