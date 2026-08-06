# 12 - Proyecto integrador: Figuras

## Objetivo
Ver juntos los conceptos mas importantes de los proyectos anteriores usando la estructura de tu tarea de figuras.

## Mapa general

```text
                      Exportable (interface)
                         /            \
                        /              \
                 Figura abstracta     Usuario
                /    |      |    \
          Cuadrado Triangulo Circunferencia Estrella
```

## 1. Herencia

```java
public class Cuadrado extends Figura
```

`Cuadrado`, `Triangulo`, `Circunferencia` y `Estrella` son tipos concretos de `Figura`.

## 2. Clase abstracta
`Figura` define lo que todas las figuras comparten:

- nombre;
- lista de puntos;
- exportacion;
- la obligacion de calcular area y perimetro.

```java
public abstract double calcularArea();
public abstract double calcularPerimetro();
```

Cada figura concreta completa esas formulas.

## 3. Interface

```java
public abstract class Figura implements Exportable
public class Usuario implements Exportable
```

`Figura` y `Usuario` son clases distintas, pero ambas tienen la capacidad `exportarTxt()`.

## 4. Polimorfismo
En `Main` usamos:

```java
List<Figura> figuras = new ArrayList<>();
```

Dentro guardamos objetos diferentes:

```java
figuras.add(cuadrado);
figuras.add(triangulo);
figuras.add(circulo);
figuras.add(estrella);
```

Luego un solo ciclo puede calcular todas:

```java
for (Figura figura : figuras) {
    calculadora.calcularArea(figura);
}
```

## 5. Composicion
`Usuario` contiene una lista de figuras:

```java
private List<Figura> figuras;
```

Se puede leer como:

> Un Usuario tiene Figuras.

Eso no es herencia; es una relacion de composicion/asociacion entre objetos.

## Clases
- `Exportable`: contrato de exportacion.
- `Figura`: clase abstracta base.
- `Cuadrado`, `Triangulo`, `Circunferencia`, `Estrella`: figuras concretas.
- `Puntos`: representa una coordenada.
- `Usuario`: contiene varias figuras.
- `Calculadora`: recibe una `Figura` y usa sus metodos.
- `Main`: ejemplo ejecutable.

## Sobre `verificarSiCabe()`
Se mantiene devolviendo `false` porque **comparar solamente areas no permite saber si una figura cabe geometricamente dentro de otra**. Para implementarlo correctamente hace falta una regla mas precisa del enunciado: dimensiones, posicion, rotacion, puntos, etc.

Es mejor dejar esa parte explicitamente pendiente que inventar una solucion incorrecta.

## Sobre `Estrella.calcularArea()`
Tambien se mantiene pendiente porque el area depende de como este definida geometricamente la estrella. El perimetro si puede calcularse con la informacion disponible en este ejemplo.

## Ejemplo practico
Piensa en una aplicacion de dibujo. El usuario puede tener muchas figuras. Cada figura sabe calcular su propia area, pero el resto del programa puede trabajar con todas simplemente como `Figura`.

## Como se ejecuta
Ejecuta `Main.java`. Mostrara areas y perimetros y creara un archivo `usuario_pedro.txt` en el directorio de ejecucion.

## Prueba tu mismo
Agrega `Rectangulo extends Figura`. Si esta bien implementado, deberias poder agregarlo a `List<Figura>` sin modificar la logica del ciclo principal.
