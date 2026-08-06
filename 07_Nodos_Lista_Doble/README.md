# 07 - Nodos y Lista Doblemente Enlazada

## Lo verdaderamente nuevo

Cada `Nodo` no solo guarda una `Persona`; también guarda **referencias a otros nodos**.

```text
null <- [Ana] <-> [Pedro] <-> [Carla] -> null
         prev/sig   prev/sig   prev/sig
```

Eso permite construir una estructura sin usar `LinkedList` de Java.

## Archivos

- `Persona`: dato guardado.
- `Nodo`: envuelve una Persona y conoce `sig` y `prev`.
- `ListaDobleNexo`: administra el primer nodo y las operaciones.
- `Main`: prueba las operaciones.

## Funcionalidades

- Insertar al inicio y al final.
- Obtener por índice.
- Buscar por RUT.
- Mostrar conexiones anterior/actual/siguiente.
- Ordenar.
- Invertir.
- Vaciar.

## Regla mental

Cuando cambias enlaces, dibuja primero los nodos. En listas enlazadas, una referencia mal cambiada puede "desconectar" media lista. Dramático, pero educativo.

## Ejercicio

Implementa `eliminarPorRut(String rut)` reparando correctamente los enlaces `prev` y `sig`.
