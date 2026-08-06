# 06 - LinkedList de Java

## Objetivo
Aprender a usar la clase `LinkedList` que Java ya trae implementada antes de construir nuestra propia lista enlazada con nodos.

## Idea simple
Una `LinkedList` guarda varios elementos y puede crecer o reducirse durante la ejecucion:

```java
LinkedList<String> nombres = new LinkedList<>();
```

A diferencia de un array, no tienes que decidir un tamano fijo al crearla.

## Operaciones principales

```java
nombres.add("Pedro");
nombres.addFirst("Juan");
nombres.addLast("Carlos");
nombres.remove("Ana");
```

Tambien podemos consultar:

```java
nombres.getFirst();
nombres.getLast();
nombres.size();
nombres.contains("Pedro");
```

## Que significa `<String>`
En:

```java
LinkedList<String>
```

indicamos que esta lista guarda objetos `String`.

Podriamos tener:

```java
LinkedList<Persona>
```

para guardar objetos `Persona`.

## Ejemplo practico
Una fila de reproduccion puede necesitar agregar canciones al inicio, al final o eliminar canciones. Una lista enlazada permite trabajar con ese tipo de cambios sin manejar manualmente un array fijo.

## Relacion con el siguiente proyecto
Aqui Java oculta los enlaces internos. En `07_Nodos_Lista_Doble` construiremos una version simplificada donde veremos explicitamente:

```text
Nodo anterior <-> Nodo actual <-> Nodo siguiente
```

## Como se ejecuta
Ejecuta `Main.java` como **Java Application**.

## Prueba tu mismo
Agrega tres nombres y recorre la lista usando un `for`.

## Error comun
Confundir `remove(1)` con `remove("1")`. Si se usa un entero, Java interpreta que quieres eliminar por indice; con un `String`, elimina ese objeto.
