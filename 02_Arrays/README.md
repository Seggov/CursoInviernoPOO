# 02 - Arrays

## Objetivo
Aprender a guardar varios datos del mismo tipo dentro de una sola variable y recorrerlos usando indices.

## Concepto simple
Un array es una fila de casillas de **tamano fijo**:

```text
indice:   0    1    2    3    4
         [17] [8] [31] [2] [50]
```

La primera posicion siempre es `0`.

## Crear un array

```java
int[] numeros = new int[5];
```

Esto crea cinco posiciones para enteros. Al comienzo todas contienen `0`.

Tambien podemos crear un array de texto:

```java
String[] nombres = new String[5];
```

Sus posiciones comienzan en `null` porque aun no apuntan a ningun `String`.

## Acceder a una posicion

```java
numeros[0] = 10;
System.out.println(numeros[0]);
```

## Recorrer un array
El `for` es especialmente util porque el indice `i` coincide con las posiciones del array:

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

`numeros.length` entrega la cantidad total de posiciones.

## Que hace este proyecto
Mantiene las funciones que ya estabas trabajando:

- `generarSecuenciaNumeros(int n)`
- `generarSecuenciaPalabras(int n)`
- `generarTextoAleatorio()`

Ademas agrega `sumar()` y `promedio()` como ejercicios sencillos de recorrido.

## Ejemplo practico
Supongamos que quieres guardar las notas de cinco pruebas:

```java
double[] notas = {4.5, 5.2, 6.1, 3.8, 5.5};
```

En vez de crear cinco variables distintas, puedes recorrer todas las notas con un solo `for`.

## Como se ejecuta
Ejecuta `Main.java` como **Java Application**.

## Prueba tu mismo
Crea:

```java
private int buscarMayor(int[] lista)
```

Debe recorrer el array y retornar el numero mas grande.

## Error comun
Intentar acceder a `lista[lista.length]`. La ultima posicion valida es `lista.length - 1`.
