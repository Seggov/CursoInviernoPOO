# 07 - Nodos y lista doblemente enlazada

## Objetivo
Entender de forma concreta las **referencias entre objetos** construyendo una lista sin usar `LinkedList` de Java.

## Lo nuevo
Un nodo guarda dos cosas principales:

1. el dato que queremos almacenar (`Persona`);
2. referencias hacia otros nodos.

```java
private Persona persona;
private Nodo sig;
private Nodo prev;
```

## Dibujo mental

```text
null <- [Ana] <-> [Pedro] <-> [Carla] -> null
         ^          ^           ^
        Nodo       Nodo        Nodo
```

Cada caja es un objeto `Nodo` distinto.

- `sig` apunta al nodo siguiente.
- `prev` apunta al nodo anterior.
- el primer nodo tiene `prev == null`.
- el ultimo nodo tiene `sig == null`.

## Por que son referencias
Mira esta linea:

```java
private Nodo sig;
```

Un objeto `Nodo` tiene una variable capaz de apuntar a **otro objeto Nodo**. Esa es la parte esencial que conecta este tema con el proyecto anterior de referencias.

## Insertar al final
Para conectar un nodo nuevo:

```text
antes:
[Pedro] -> null

despues:
[Pedro] <-> [Carla] -> null
```

Las dos conexiones importantes son:

```java
ultimo.setSig(nuevo);
nuevo.setPrev(ultimo);
```

Si olvidas una de las dos, la lista deja de ser correctamente doblemente enlazada.

## Eliminar un nodo
Si eliminamos el nodo del medio:

```text
[Ana] <-> [Pedro] <-> [Carla]
```

debemos volver a conectar sus vecinos:

```text
[Ana] <------------> [Carla]
```

Por eso `eliminarPorRut()` actualiza tanto `sig` como `prev`.

## Clases del proyecto
- `Persona`: dato guardado.
- `Nodo`: guarda una Persona y las referencias `sig` / `prev`.
- `ListaDobleNexo`: administra el primer nodo y las operaciones.
- `Main`: crea la lista y prueba cada operacion.

## Funciones incluidas
- `isEmpty()`
- `size()`
- `insertarInicio()`
- `insertarFinal()`
- `getI()`
- `buscarRut()`
- `sort()`
- `invertir()`
- `eliminarPorRut()`
- `vaciar()`

## Ejemplo practico
Una lista de reproduccion puede enlazar cada cancion con la anterior y la siguiente. Asi puedes avanzar o retroceder entre elementos.

## Como se ejecuta
Ejecuta `Main.java`. La salida muestra las conexiones de esta forma:

```text
null <- Ana -> Pedro
Ana <- Pedro -> Carla
Pedro <- Carla -> null
```

## Regla util
Antes de modificar enlaces, dibuja los nodos. En estructuras enlazadas, un `setSig()` mal puesto puede desconectar el resto de la lista.
