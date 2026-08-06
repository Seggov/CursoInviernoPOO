# 11 - Polimorfismo

## Idea simple

Polimorfismo significa poder tratar objetos diferentes mediante un **tipo común**.

```java
Mascota m1 = new Perro();
Mascota m2 = new Gato();
```

Aunque la variable sea `Mascota`, Java ejecuta el método sobrescrito del objeto real.

```text
Mascota -> Perro -> hablar() = Guau
Mascota -> Gato  -> hablar() = Miau
```

## Por qué sirve

Evita escribir lógica separada para cada tipo. Puedes recorrer una sola lista de `Mascota` y pedirle a cada una `hablar()`.

## Ejercicio

Agrega `Vaca` y métela en la misma lista sin modificar el `for`.
