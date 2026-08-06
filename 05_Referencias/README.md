# 05 - Referencias

## Idea esencial

Con objetos, una variable normalmente guarda una **referencia al objeto**, no una copia completa del objeto.

```text
Persona original ───────┐
                        ├──> [ objeto Persona ]
Persona mismaReferencia ┘
```

Por eso, si modificas el objeto usando una de las dos referencias, el cambio se observa desde la otra.

## Diferencia clave

```java
Persona b = a;
```

No crea otra Persona. `a` y `b` apuntan al mismo objeto.

Para crear un objeto independiente debes construir otro:

```java
Persona copia = new Persona(a.getNombre());
```

## Ejercicio

Agrega `edad` y prueba qué ocurre al modificarla mediante `mismaReferencia` y mediante `copiaReal`.
