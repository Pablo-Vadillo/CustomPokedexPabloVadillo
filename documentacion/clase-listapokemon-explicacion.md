<h1>ListaPokemon explicacion</h1>
La clase ListaPokemon se encarga de gestionar una lista de pokémon y tiene los siguientes atributos:

<br>pokemones: lista de objetos de la clase Pokemon.
<br>La clase tiene los siguientes métodos:


<br>añadir_pokemon(self, pokemon): añade un objeto de la clase Pokemon a la lista de pokémon.
<br>eliminar_pokemon(self, nombre): elimina de la lista de pokémon el objeto cuyo atributo nombre coincida con el parámetro nombre.
<br>mostrar_avistados(self): muestra por pantalla la información de todos los pokémon en la lista de avistados.
<br>mostrar_capturados(self): muestra por pantalla la información de todos los pokémon en la lista de capturados.
<br>obtener_pokemon_por_nombre(self, nombre): devuelve el objeto de la clase Pokemon cuyo atributo nombre coincida con el parámetro nombre. Si no se encuentra ningún objeto, devuelve None.