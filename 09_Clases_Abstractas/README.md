# 09 - Clases abstractas

## Objetivo
Entender una clase que sirve como **base comun**, pero que esta incompleta a proposito y no debe convertirse directamente en un objeto.

## Idea simple
Todas las figuras tienen un nombre, un area y un perimetro. Sin embargo, una figura generica no sabe como calcularlos:

```text
                Figura (abstracta)
                /               \
           Cuadrado           Circulo
         lado * lado       PI * radio^2
```

Por eso podemos declarar:

```java
public abstract class Figura {
}
```

## Metodo abstracto

```java
public abstract double calcularArea();
```

Fijate que termina en `;` y no tiene `{ }`.

La clase abstracta esta diciendo:

> Toda clase concreta que herede de Figura debe saber calcular su area.

Entonces `Cuadrado` debe implementar:

```java
@Override
public double calcularArea() {
    return lado * lado;
}
```

## Tambien puede tener metodos normales
Una clase abstracta no significa "todo abstracto". `mostrarResumen()` ya tiene codigo y se hereda normalmente.

## No se puede instanciar
Esto da error:

```java
Figura figura = new Figura("Figura");
```

porque `Figura` esta incompleta.

Si podemos crear:

```java
Cuadrado cuadrado = new Cuadrado(4);
```

## Diferencia con herencia normal
En el proyecto anterior `Mascota` podia ser una clase normal y tener un comportamiento por defecto. Aqui `Figura` obliga a las hijas a completar operaciones que dependen del tipo concreto.

## Ejemplo practico
Un sistema de figuras necesita calcular areas. Todas las figuras comparten la idea de "calcular area", pero la formula de un cuadrado y la de un circulo son distintas. Una clase abstracta expresa exactamente esa situacion.

## Como se ejecuta
Ejecuta `Main.java`. Se crean un `Cuadrado` y un `Circulo` y ambos usan `mostrarResumen()` heredado.

## Prueba tu mismo
Crea `Rectangulo extends Figura` e implementa sus dos metodos abstractos.

## Error comun
Heredar de una clase abstracta y olvidar implementar uno de sus metodos abstractos. Si la clase hija quiere ser concreta, debe implementar todos.
