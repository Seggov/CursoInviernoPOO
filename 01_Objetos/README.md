# 01 - Objetos

## Idea simple

Una **clase** es el molde. Un **objeto** es una instancia creada usando ese molde.

```text
Clase Persona  -> describe qué tiene y qué puede hacer
persona1       -> objeto concreto creado desde Persona
```

## Lo nuevo

- Atributos: datos que guarda el objeto.
- Constructor: prepara el objeto al crearlo.
- `this`: significa "este objeto".
- Método: acción que puede realizar el objeto.
- Getter/Setter: permiten leer o modificar atributos privados de forma controlada.

## Flujo del ejemplo

`Main` crea dos personas -> cada Persona guarda nombre y edad -> `mostrarDatos()` imprime sus datos.

## Ejercicio

Agrega el atributo `carrera` a `Persona` y muéstralo en `mostrarDatos()`.
