# Curso de Invierno POO - Apuntes por proyectos

Esta version esta preparada para Eclipse como **12 proyectos Java independientes**. Cada tema tiene su propio `src`, `bin`, `.project`, `.classpath`, `README.md` y un `Main.java` ejecutable.

## Orden recomendado

1. `01_Objetos`
2. `02_Arrays`
3. `03_Lista_Con_Array`
4. `04_Matrices`
5. `05_Referencias`
6. `06_LinkedList_Java`
7. `07_Nodos_Lista_Doble`
8. `08_Herencia`
9. `09_Clases_Abstractas`
10. `10_Interfaces`
11. `11_Polimorfismo`
12. `12_Proyecto_Integrador_Figuras`

## Importante para Eclipse
**No importes esta carpeta completa como un unico Java Project llamado `Invierno`.**

La carpeta principal es solamente un contenedor. Los proyectos reales son las 12 carpetas enumeradas arriba.

Sigue `COMO_IMPORTAR_EN_ECLIPSE.md` para importarlos correctamente.

## Estructura de cada proyecto

```text
10_Interfaces/
|-- .project
|-- .classpath
|-- README.md
|-- src/
|   `-- apuntes/
|       `-- interfaces/
|           |-- Main.java
|           |-- Exportable.java
|           |-- Informe.java
|           `-- Factura.java
`-- bin/
```

El `package` coincide exactamente con la ruta dentro de `src`. Por ejemplo:

```java
package apuntes.interfaces;
```

corresponde a:

```text
src/apuntes/interfaces/
```

## Verificacion realizada
Todos los proyectos fueron compilados por separado con Java 21 y todos los `Main` fueron ejecutados. Revisa `VERIFICACION.md` para ver el procedimiento.
