# 03 - Lista implementada con un Array

## Idea simple

Aquí el array tiene capacidad fija, pero usamos `cantidad` para saber cuántos espacios realmente contienen datos válidos.

```text
array físico:    [3, 7, 25, 43, 56, 0, 0, 0, ...]
cantidad válida: 5
```

## Funcionalidades

- Insertar en una posición.
- Insertar manteniendo orden.
- Eliminar desplazando elementos.
- Buscar con búsqueda binaria.

## Punto importante

La **búsqueda binaria solo funciona correctamente si la parte válida está ordenada**.

## Ejercicio

Agrega un método `contiene(int elemento)` que use `buscarBinaria()`.
