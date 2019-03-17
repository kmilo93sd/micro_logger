db.createCollection('logs', {
    autoIndexId:false,
    validator: {
        $jsonSchema: {
            bsonType: "object",
            required: [
                "id",
                "service",
                "serviceId",
                "ocurredOn",
                "error"
            ],
            properties: {
                id: {
                    bsonType: "string"
                },
                service: {
                    bsonType : "string"
                },
                serviceId: {
                    bsonType : "string"
                },
                ocurredOn: {
                    bsonType : "string"
                }
                error: {
                    bsonType : "string"
                }
            }
        }
    }
});