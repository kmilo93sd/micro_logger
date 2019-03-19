CREATE TABLE "logs" (
	"id" uuid NOT NULL,
	"service" varchar(25) NOT NULL,
	"service_id" uuid NOT NULL,
	"occurred_on" TIMESTAMP NOT NULL,
	"error" varchar(50) NOT NULL,
	"error_code" int NOT NULL,
	CONSTRAINT logs_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "trace" (
	"id" serial NOT NULL,
	"error" varchar(300) NOT NULL,
	"log_id" uuid NOT NULL,
	CONSTRAINT trace_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);




ALTER TABLE "trace" ADD CONSTRAINT "trace_fk0" FOREIGN KEY ("log_id") REFERENCES "logs"("id");

