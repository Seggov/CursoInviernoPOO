# 10 - Interfaces

## Idea simple

Una interface define una **capacidad o contrato**.

```java
public interface Exportable {
    void exportar();
}
```

Una clase que haga:

```java
implements Exportable
```

se compromete a tener `exportar()`.

## Cuándo sirve

Cuando clases que no necesariamente pertenecen a la misma familia necesitan compartir una capacidad.

Ejemplo: un `Informe` y una `Factura` son cosas distintas, pero ambas pueden ser `Exportable`.

## Diferencia rápida

- `extends`: "es un tipo de..."
- `implements`: "puede hacer..."

## Ejercicio

Crea una interface `Imprimible` y haz que `Informe` la implemente además de `Exportable`.
