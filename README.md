**little demo for request body**
```
git clone https://github.com/afspear/RequestBodyDemo
cd RequestBodyDemo
mvn spring-boot:run
```
Run
```
curl -X POST \
    http://localhost:8080/working/test \
    -H 'Cache-Control: no-cache' \
    -H 'Content-Type: application/json' \
    -H 'Postman-Token: e6ba5cfb-81ad-ac2f-3151-ee17b3de01ae' \
    -d '{"key":"value"}'

```
and
```
* curl -X POST \
    http://localhost:8080/anotherWorking/test \
    -H 'Cache-Control: no-cache' \
    -H 'Content-Type: application/json' \
    -H 'Postman-Token: 00d9f2d9-28dd-3c41-1ec1-63bbbba2fde7' \
    -d '{"key":"value"}'
```
both should return 
```
{
 "key": "value"
}
```