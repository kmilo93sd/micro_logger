# Micro Logger

Microservicio para centralizar logs de sistemas distribuidos.

API RESTful para exponer el servicio de persistencia de logs.

Envía una petición ``` POST ``` al endpoint ``` /logs ``` para guardar un log:

``` POST to http://example.com/logs ```

```
{
    "id":"UUID",
    "service":"my_service",
    "serviceId":"UUID",
    "occurredOn":"2019-03-17 03:23:49",
    "error":"Something was happened",
    "errorCode":20100,
    "trace":[
        //error trace
    ]
}
```

Puedes enviar una petición ``` GET ``` al endpoint ``` /logs/service-id ``` para obtener todos
los logs de un servicio.

``` GET to http://example.com/logs/my_service_uuid ```

response:
```
"data": [
    {
        "id":"UUID",
        "service":"my_service1",
        "serviceId":"UUID",
        "occurredOn":"2019-03-17 03:23:51",
        "error":"Something was happened",
        "errorCode":20100,
        "trace":[
            //error trace
        ]
    },
    {
        "id":"UUID",
        "service":"my_service1",
        "serviceId":"UUID",
        "occurredOn":"2019-03-17 03:23:53",
        "error":"Something was happened",
        "errorCode":20100,
        "trace":[
            //error trace
        ]
    },
    {
        "id":"UUID",
        "service":"my_service1",
        "serviceId":"UUID",
        "occurredOn":"2019-03-17 03:23:54",
        "error":"Something was happened",
        "errorCode":20100,
        "trace":[
            //error trace
        ]
    }
],
```
Debes asegurarte que tus aplicaciones envíen los logs con ese formato,
o estos no serán guardados.
Puedes enviar el campo "trace" como un array vacío. 

Objetivos:

  - Reemplazar mongodb por postgresql.
  - Reemplazar la api por una cola de rabbit para consumir eventos.
  
  
Microservicio creado para GetColors, los cambios serán
aplicados según las necesidades del equipo, el ideal es mantener
el proyecto liviano, por lo que solo mantendrá lo básico para
funcionar de forma eficiente.