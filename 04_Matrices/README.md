# 04 - Matrices

## Objetivo
Entender un array de dos dimensiones y aprender a recorrerlo usando un `for` para las filas y otro para las columnas.

## Idea simple
Una matriz puede imaginarse como una tabla:

```text
          columna
          0   1   2
fila 0   [5] [7] [2]
fila 1   [9] [1] [4]
```

Para acceder al `1` usamos:

```java
matriz[1][1]
```

Primero se indica la fila y despues la columna.

## Crear una matriz

```java
int[][] matriz = new int[2][3];
```

Esto crea 2 filas y 3 columnas.

## Recorrerla
Se necesitan dos ciclos porque hay dos dimensiones:

```java
for (int fila = 0; fila < matriz.length; fila++) {
    for (int columna = 0; columna < matriz[fila].length; columna++) {
        System.out.println(matriz[fila][columna]);
    }
}
```

- `matriz.length`: cantidad de filas.
- `matriz[fila].length`: cantidad de columnas de esa fila.

## Que hace este proyecto
Conserva la estructura que ya utilizabas:

```text
main()
   -> iniciar()
      -> ingresarDimensiones()
      -> crear matriz
      -> llenarMatriz()
      -> mostrarMatriz()
```

Se agrega `sumarMatriz()` como ejemplo de una operacion sobre todos los datos.

## Ejemplo practico
Una matriz puede representar las ventas de una tienda:

- cada fila = un dia;
- cada columna = un producto;
- cada celda = cantidad vendida.

## Como se ejecuta
Ejecuta `Main.java`. El programa te pedira filas y columnas por consola.

## Prueba tu mismo
Agrega un metodo `sumarFila(int fila)` que retorne solamente la suma de una fila.

## Error comun
Intercambiar filas y columnas. Recuerda: `matriz[fila][columna]`.
