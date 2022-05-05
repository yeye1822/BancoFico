# BancoFicohsa
<h2> Servicios Implementados</h2>

 <h4>GET {endPoint}/stats<h4>
	Servicio que informa la cantidad total de humanos, mutantes y la cantidad comparable de las variables en uso.
 
 <h4>POST {endPoint}/mutant<h4>
	Servicio que analiza el ADN según reglas estipuladas y determina si es humano o mutante. Esta información se almacena en una base de datos MySQL.
 
 
	El servicio responde codigos de estados teniendo en cuenta si es humano o mutante.
	
		- 200 Mutante
		- 403 Humano

	JSON de petición de ejemplo
 
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
 
