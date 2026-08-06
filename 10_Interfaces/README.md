# 10 - Interfaces

## Objetivo
Entender una interface como un **contrato de capacidades**: indica que metodos debe ofrecer una clase, sin decir necesariamente como estan implementados.

## Idea simple
En este proyecto tenemos objetos diferentes:

```text
Informe
Factura
```

No son de la misma familia, pero ambos pueden tener una capacidad en comun:

```text
           Exportable
            /      \
       Informe    Factura
```

## Declarar una interface

```java
public interface Exportable {
    void exportarTxt();
}
```

La interface dice: **si una clase afirma ser Exportable, debe tener `exportarTxt()`**.

## `implements`

```java
public class Informe implements Exportable {
}
```

Se puede leer como:

> Informe puede comportarse como algo Exportable.

Entonces debe implementar:

```java
@Override
public void exportarTxt() {
    ...
}
```

## Diferencia rapida: `extends` vs `implements`

```text
extends    -> relacion "es un tipo de"
implements -> relacion "tiene la capacidad de"
```

Ejemplos:

```text
Perro extends Mascota       -> un Perro ES una Mascota
Informe implements Exportable -> un Informe PUEDE exportarse
```

## Lo mas util de una interface
Podemos escribir un metodo que reciba cualquier objeto que cumpla el contrato:

```java
private void ejecutarExportacion(Exportable elemento) {
    elemento.exportarTxt();
}
```

Ese metodo funciona tanto con `Informe` como con `Factura` sin preguntar cual de los dos recibio.

## Ejemplo practico
En una aplicacion real podrias tener facturas, informes, usuarios o graficos. Son clases distintas, pero si todos implementan `Exportable`, una misma parte del programa puede exportarlos.

## Relacion con tu tarea
Se usa el nombre `exportarTxt()` porque ya aparecia en tu proyecto de figuras. En el proyecto integrador volveras a ver esta interface aplicada a `Figura` y `Usuario`.

## Como se ejecuta
Ejecuta `Main.java` como **Java Application**.

## Prueba tu mismo
Crea otra interface:

```java
public interface Imprimible {
    void imprimir();
}
```

y haz que `Informe` implemente `Exportable` e `Imprimible`.

## Error comun
Escribir `extends Exportable` en una clase normal. Para cumplir una interface se usa `implements`.
