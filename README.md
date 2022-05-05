# BancoFicohsa
<h2> Servicios Implementados</h2>

 <h4>GET {endPoint}/stats<h4>
 <p>Servicio que informa la cantidad total de humanos, mutantes y la cantidad comparable de las variables en uso.</p>
 
 <h4>POST {endPoint}/mutant<h4>
 Servicio que analiza el ADN según reglas estipuladas y determina si es humano o mutante. Esta información se almacena en una base de datos MySQL.
 
 <p>El servicio responde codigos de estados teniendo en cuenta si es humano o mutante.
 - <strong>200</strong> Mutante
 - <strong>403</strong> Humano</p>