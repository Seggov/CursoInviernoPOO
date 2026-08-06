# 03 - Lista construida con un Array

## Objetivo
Entender como se puede simular una lista dinamica utilizando un array de capacidad fija y una variable que indique cuantos datos son realmente validos.

## Idea principal
El array puede tener 12 espacios, pero no necesariamente estamos usando los 12:

```text
lista:     [3, 7, 25, 43, 56, 0, 0, 0, 0, 0, 0, 0]
indices:    0  1   2   3   4
cantidad: 5
```

`lista.length` vale 12, mientras que `cantidad` vale 5.

## Insertar
Si queremos insertar un dato en medio, primero hay que mover los elementos hacia la derecha:

```text
antes:    [10, 20, 30, 40]
insertar 25 en indice 2
mover:    [10, 20, 30, 30, 40]
guardar:  [10, 20, 25, 30, 40]
```

Por eso el movimiento se hace **desde la derecha hacia la izquierda**.

## Insertar ordenado
`insertarOrdenado()` busca primero la posicion donde corresponde el nuevo numero y despues reutiliza `insertar()`.

```java
while (posicion < cantidad && lista[posicion] < elemento) {
    posicion++;
}
```

## Eliminar
Al eliminar ocurre lo contrario: los elementos posteriores se desplazan una posicion a la izquierda.

## Busqueda binaria
`buscarBinaria()` descarta aproximadamente la mitad de los valores en cada vuelta.

```text
[3, 7, 25, 43, 56]
        ^ medio
```

Si buscamos `7`, como es menor que `25`, ya no necesitamos revisar la mitad derecha.

**Importante:** la busqueda binaria necesita que la parte valida de la lista este ordenada.

## Ejemplo practico
Imagina un ranking de puntajes que debe mantenerse ordenado. Cada vez que llega un puntaje nuevo, `insertarOrdenado()` lo coloca en su posicion correcta.

## Funciones estudiadas
- `insertar(int indice, int elemento)`
- `insertarOrdenado(int elemento)`
- `eliminar(int indice)`
- `buscarBinaria(int elemento)`

Se conservaron estas funciones porque son las mismas ideas que ya estabas trabajando.

## Como se ejecuta
Ejecuta `Main.java` como **Java Application**.

## Prueba tu mismo
Agrega `contiene(int elemento)` y haz que reutilice `buscarBinaria()`.

## Error comun
Usar las posiciones vacias del array como si fueran datos reales. Para recorrer los elementos validos debes llegar hasta `cantidad`, no hasta `lista.length`.
