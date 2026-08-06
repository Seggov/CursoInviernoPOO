# 09 - Clases Abstractas

## Idea simple

Una clase abstracta sirve como **base incompleta**. Define lo común, pero deja ciertas partes para que las clases hijas las completen.

```java
public abstract class Figura {
    public abstract double calcularArea();
}
```

No puedes hacer:

```java
new Figura(); // ERROR
```

Sí puedes crear una subclase concreta como `Cuadrado`.

## Diferencia con herencia normal

En Herencia, el padre puede ser completamente utilizable. En una clase abstracta, el padre está pensado principalmente para servir de base y puede exigir métodos abstractos.

## Ejercicio

Crea `Rectangulo extends Figura` e implementa `calcularArea()` y `calcularPerimetro()`.
