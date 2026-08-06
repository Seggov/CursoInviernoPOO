# 05 - Referencias entre objetos

## Objetivo
Entender que una variable de tipo objeto normalmente guarda una **referencia hacia el objeto**, no una copia completa del objeto.

## Idea visual

```text
Persona original -----------+
                            |
                            v
                     [ objeto Persona ]
                            ^
                            |
Persona mismaReferencia ----+
```

Las dos variables apuntan al mismo objeto.

## El caso importante

```java
Persona mismaReferencia = original;
```

Esta linea **no ejecuta `new`**, por lo tanto no aparece otra Persona en memoria.

Si hacemos:

```java
mismaReferencia.setEdad(22);
```

entonces `original.getEdad()` tambien entregara `22`, porque ambas referencias llegan al mismo objeto.

## Crear una copia independiente

```java
Persona copiaReal = new Persona(original.getNombre(), original.getEdad());
```

Ahora si aparece un segundo objeto:

```text
original ----> [Persona A]

copiaReal ---> [Persona B]
```

## Para que sirve entender esto
Este concepto es la base de los **nodos**, porque un nodo tiene referencias hacia otros nodos. Tambien explica por que modificar un objeto dentro de una lista puede modificar el mismo objeto que tienes guardado en otra variable.

## `==` con objetos
En este ejemplo usamos:

```java
original == mismaReferencia
```

para comprobar si ambas variables apuntan exactamente al mismo objeto.

No lo confundas con comparar el contenido de dos objetos; para eso normalmente se usa `equals()` cuando esta implementado.

## Ejemplo practico
Si una `Mascota` esta guardada en una lista y tambien en una variable `perro`, ambas referencias pueden apuntar a la misma mascota. Cambiar la mascota usando una referencia se ve desde la otra.

## Como se ejecuta
Ejecuta `Main.java` como **Java Application** y compara la salida antes y despues de crear `copiaReal`.

## Prueba tu mismo
Cambia el nombre usando `mismaReferencia` y observa que ocurre con `original`.

## Error comun
Pensar que `Persona b = a;` crea una copia. Para crear otro objeto debe aparecer `new`.
