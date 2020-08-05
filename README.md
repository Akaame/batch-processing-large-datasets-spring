# Spring Batch

This is a spring batch demo project. I retraced author's 
original implementation in her Medium Blog and applied 
some changes to the parts I found deprecated.

Changes:
* Spring-Boot version to 2.3.1
* H2 to PostgreSQL
* Added a dockerfile and a docker-compose.yml
* application.properties to application.yml 
* batch.initialize-schema is necessary
* JdbcTemplate in the Notification Listener was unnecessary 
(There is already a VoltageRepository instance in the context)
* IVoltageRepository to VoltageRepository (Former is C# convention)
* There is no need to use JdbcBatchItemWriter (which requires you to supply an sql)
JpaItemWriter is more suitable.

Original README.md

# batch-processing-large-datasets-spring
Batch Processing Large Data Sets with Spring Boot and Spring Batch
