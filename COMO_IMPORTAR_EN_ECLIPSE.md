# Como importar correctamente en Eclipse

## Por que aparecia el error del `package`
En la captura, Eclipse muestra `10_Interfaces` **dentro del proyecto `Invierno`**. Eso significa que Eclipse esta tratando `10_Interfaces`, `09_Clases_Abstractas`, etc. como simples carpetas y no como proyectos Java independientes.

Por eso ignora el `.classpath` interno y `src` no queda reconocido correctamente como **Source Folder**. Entonces Eclipse espera un package distinto y aparece:

```text
The declared package "apuntes.interfaces" does not match the expected package ""
```

El codigo y la carpeta deben coincidir, pero tambien hay que importar cada carpeta como proyecto Eclipse.

## Importacion recomendada

1. Descomprime `CursoInviernoPOO_Eclipse_Corregido.zip` en una carpeta nueva.
2. En Eclipse ve a **File > Import...**.
3. Selecciona **General > Existing Projects into Workspace**.
4. En **Select root directory**, elige la carpeta `CursoInviernoPOO_Eclipse_Corregido`.
5. Eclipse deberia detectar los 12 proyectos (`01_Objetos`, `02_Arrays`, ..., `12_Proyecto_Integrador_Figuras`).
6. Marca los 12 y presiona **Finish**.

## Como debe verse
En `Package Explorer`, los proyectos deben aparecer al mismo nivel:

```text
01_Objetos
02_Arrays
03_Lista_Con_Array
...
10_Interfaces
11_Polimorfismo
12_Proyecto_Integrador_Figuras
```

**No** deberian aparecer todos dentro de un proyecto llamado `Invierno`.

Dentro de `10_Interfaces`, `src` debe reconocerse como carpeta de codigo fuente y dentro debe aparecer el package `apuntes.interfaces`.

## Si ya tienes el proyecto `Invierno` abierto
Si ese proyecto contiene la version anterior:

1. puedes cerrarlo o quitarlo del Workspace;
2. no necesitas borrar tus archivos del disco;
3. importa los 12 proyectos usando el procedimiento anterior.

## Ejecutar un ejemplo
En cualquiera de los proyectos:

1. abre `Main.java`;
2. clic derecho;
3. **Run As > Java Application**.

Todos los proyectos incluyen `Main.java`.

## Si Eclipse conserva errores antiguos
Prueba:

1. **Project > Clean...**
2. selecciona los proyectos;
3. limpia y vuelve a compilar.

Si `src` aparece como carpeta normal en vez de Source Folder, clic derecho en `src` > **Build Path > Use as Source Folder**. Con la importacion recomendada normalmente no hace falta.
