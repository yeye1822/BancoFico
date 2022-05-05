# BancoFicohsa
<h2> Servicios Implementados</h2>

 <h4>GET {endPoint}/stats<h4>
 Servicio que informa la cantidad total de humanos, mutantes y la cantidad comparable de las variables en uso.
 
 <h4><b>POST {endPoint}/mutant</b><h4>
 Servicio que analiza el ADN según reglas estipuladas y determina si es humano o mutante. Esta información se almacena en una base de datos MySQL.
 
 El servicio responde codigos de estados teniendo en cuenta si es humano o mutante.
 - <b>200</b> Mutante
 - <b>403</b> Humano