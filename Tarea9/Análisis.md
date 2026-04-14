## **Análisis**

#### Pregunta 1 

¿Cuál es la complejidad Big-O de insertarOrdenado que implementaste? Justifica tu respuesta.

Es lineal ya que tenemos el while que recorre todos los nodos siendo este el que mas complejidad tiene de
O(n), y los otros casos no afectan ya que son O(1)


Pregunta 2 
---

Para cada una de las siguientes operaciones, indica si sería más eficiente usar un Array o una Lista Enlazada y por qué:

\- Buscar al estudiante con el carnet 202300001

&#x09;Segun lo estudiado los dos tienen que recorrer cada elemento y tienen O(n), asi que no hay diferencia alguna.

\- Agregar 500 estudiantes nuevos al inicio del registro

&#x09;La lista enlazada, ya que aquí solo cambiamos el head, y en un array se mueven todos los datos.

\- Acceder directamente al 3er estudiante de la lista

&#x09;El array, ya que podemos acceder al elemento directamente, ejemplo estudiante\[2], aquí ya estamos en la 	posición 3, y en la lista enlazada hay que recorrer todos los nodos empezando por el head.

