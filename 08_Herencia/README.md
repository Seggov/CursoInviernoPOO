# 08 - Herencia

## Idea simple

La herencia permite que una clase hija reutilice lo que ya existe en una clase padre.

```text
          Mascota
          /     \
       Perro    Gato
```

```java
public class Perro extends Mascota
```

## Qué debes mirar

- `extends`: indica de quién hereda.
- `super(...)`: llama al constructor de la clase padre.
- `protected`: visible para las subclases.
- `@Override`: reemplaza un comportamiento heredado.

## Ejemplo

`Perro` y `Gato` reciben `nombre` desde `Mascota`, pero cada uno redefine `hablar()`.

## Ejercicio

Crea `Ave extends Mascota` y redefine `hablar()`.
