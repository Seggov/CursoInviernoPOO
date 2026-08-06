# 08 - Herencia

## Objetivo
Entender como una clase puede **reutilizar atributos y metodos de otra clase** mediante `extends`.

## Ejemplo del proyecto

```text
             Mascota
            /       \
         Perro      Gato
```

`Mascota` contiene lo comun:

- nombre;
- especie;
- lista de atenciones;
- `calcularMonto()`.

`Perro` y `Gato` heredan todo eso y agregan o modifican comportamiento propio.

## `extends`

```java
public class Perro extends Mascota {
}
```

Se lee: **Perro es una Mascota**.

## `super(...)`
Cuando creamos un `Perro`, la parte que pertenece a `Mascota` tambien debe construirse:

```java
public Perro(String nombre, String especie) {
    super(nombre, especie);
}
```

`super(...)` llama al constructor de la clase padre.

## Sobrescribir un metodo
`Mascota` tiene:

```java
public void hablando() {
    System.out.println("La mascota hace un sonido");
}
```

El perro puede reemplazar ese comportamiento:

```java
@Override
public void hablando() {
    System.out.println("Ladrando en " + VETERINARIA);
}
```

`@Override` ayuda a comprobar que realmente estamos sobrescribiendo un metodo existente.

## `protected`

```java
protected static final String VETERINARIA = "Los UCNIN";
```

Permite que las clases hijas accedan a ese miembro. No significa que todos los atributos deban ser `protected`; normalmente se mantiene `private` lo que no necesita acceso directo desde las hijas.

## Ejemplo practico
En una veterinaria, perros y gatos comparten nombre, especie y atenciones. No tiene sentido copiar `calcularMonto()` en cada clase. Se escribe una sola vez en `Mascota` y las hijas lo reutilizan.

## Lo que conserva de tus apuntes
Se mantuvieron las ideas y nombres que ya estabas usando:

- `Mascota`
- `Perro`
- `Gato`
- `Atencion`
- `hablando()`
- `calcularMonto()`
- `VETERINARIA`
- `esNaranjo()`

## Como se ejecuta
Ejecuta `Main.java`. Se crean un perro y un gato, se agregan atenciones y se calcula el monto acumulado usando el metodo heredado.

## Prueba tu mismo
Crea:

```java
public class Ave extends Mascota
```

y sobrescribe `hablando()`.

## Error comun
Crear un constructor de la clase hija y olvidar que el constructor del padre necesita parametros. En ese caso debes usar `super(...)`.
