# 12 - Proyecto Integrador: Figuras

Este proyecto conserva y ordena la idea de tu tarea de figuras para mostrar varios conceptos juntos.

## Conceptos que se mezclan

```text
                 Figura (abstracta)
                /       |       \
          Cuadrado   Triangulo   Circunferencia
              \         |         /
                 implementan por herencia

Exportable (interface) <--- Figura
Exportable (interface) <--- Usuario
```

## Qué demuestra

- **Herencia:** las figuras concretas heredan de `Figura`.
- **Clase abstracta:** `Figura` no se instancia directamente.
- **Interface:** `Figura` y `Usuario` son `Exportable`.
- **Polimorfismo:** `List<Figura>` guarda distintas figuras.
- **Composición:** `Usuario` contiene varias figuras.

## Nota sobre `verificarSiCabe`

Se mantiene como pendiente porque comparar solamente áreas **no garantiza** que una figura quepa geométricamente dentro de otra. Hace falta una regla más precisa del enunciado.

## Ejercicio

Agrega `Rectangulo` y comprueba que se pueda añadir a `List<Figura>` sin cambiar el ciclo principal.
