# BancoFicohsa
<h2> Servicios Implementados</h2>

	La API REST se monton en el Cloud de Google, el endPoint del servicio es:
	
	**Endpoint**: https://springgcp-349404.rj.r.appspot.com

<h4>GET {endPoint}/stats<h4>
	
	Servicio que informa la cantidad total de humanos, mutantes y la cantidad comparable de las variables
	en uso.
 
<h4>POST {endPoint}/mutant<h4>
	
	Servicio que analiza el ADN según reglas estipuladas y determina si es humano o mutante. 
	
	Esta información se almacena en una base de datos MySQL.
 
 
	El servicio responde codigos de estados teniendo en cuenta si es humano o mutante.
	
		- 200 Mutante
		- 403 Humano

	JSON del servicio
 
	{
		"dna": [
			"CTGCTA", 
			"CGCTGC", 
			"TTCTGC", 
			"AGTGGA", 
			"CTGCTA", 
			"GCACTA"
		]
	}
	
<h3>Manual de instalación</h3>
<h4>Programas necesarios</h4>

	- Motor de base de datos MySQL
	- Maven
	- Java 1.8 o posterior
	- Postman o herramienta para el testing de API REST
	
<h4>Instrucciones</h4>

	- Crear la base de datos, asignarle el nombre **db_mutant_backend**
	- Configurar el usuario y clave en el archivo properties del proyecto. Ubicado en la carpeta 
	  de resource, las variables a configurar son:
		- spring.datasource.username
		- spring.datasource.password
	- Iniciar la aplicación en el servidor de **Spring Boot App**
	- Utilizar el Postman o herramienta para consumir los servicios indicados al inicio.
	
	
	
