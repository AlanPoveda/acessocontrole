# acessocontrole
Controle de aceso, usando Java, Spring boot

#Tecnologias usadas 🐱‍💻
-Java
-Spring Boot
-Lombok
-Gradle


#Como usar 🐱‍💻
Clonar repositório
RunBoot
Acessar o Localhost:8081/h2
  usuario:sa
  senha:
  
Isso para acessar o banco, porém usando o POSTMAN, da para fazer CREATE, UPDATE, DELETE e SELECT


#Dependencias 🧭


	// https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-xml
	implementation group: 'com.fasterxml.jackson.dataformat', name: 'jackson-dataformat-xml', version: '2.12.4'


	// https://mvnrepository.com/artifact/mysql/mysql-connector-java
	implementation group: 'mysql', name: 'mysql-connector-java', version: '8.0.26'

	//runtimeOnly 'mysql:mysql-connector-java'

	// https://mvnrepository.com/artifact/org.projectlombok/lombok
	compileOnly group: 'org.projectlombok', name: 'lombok', version: '1.18.20'
	annotationProcessor 'org.projectlombok:lombok'

	// https://mvnrepository.com/artifact/io.springfox/springfox-swagger2
	implementation group: 'io.springfox', name: 'springfox-swagger2', version: '3.0.0'

	// https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui
	implementation group: 'io.springfox', name: 'springfox-swagger-ui', version: '3.0.0'

	// https://mvnrepository.com/artifact/io.springfox/springfox-bean-validators
	implementation group: 'io.springfox', name: 'springfox-bean-validators', version: '3.0.0'


	implementation group: 'org.hibernate', name: 'hibernate-validator', version: '6.1.5.Final'
	// https://mvnrepository.com/artifact/org.hibernate/hibernate-envers
	implementation group: 'org.hibernate', name: 'hibernate-envers', version: '5.5.3.Final'


	// https://mvnrepository.com/artifact/com.h2database/h2
	implementation 'com.h2database:h2'
  


