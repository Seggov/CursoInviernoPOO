# 01 - Objetos y clases

## Objetivo
Entender la idea mas importante de POO: **una clase es un molde y un objeto es una instancia creada desde ese molde**.

## Concepto simple
Piensa en `Persona` como una plantilla:

```text
Clase Persona
   |-- nombre
   |-- edad
   |-- mostrarDatos()
          |
          +--> persona1 = Persona("Pedro", 21)
          +--> persona2 = Persona("Ana", 20)
```

`persona1` y `persona2` son objetos distintos. Ambos siguen el mismo molde, pero guardan datos diferentes.

## Sintaxis importante

```java
Persona persona1 = new Persona("Pedro", 21);
```

- `Persona`: tipo de la variable.
- `persona1`: nombre de la referencia.
- `new`: crea un objeto nuevo.
- `Persona(...)`: llama al constructor.

El constructor recibe los datos iniciales:

```java
public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
}
```

`this.nombre` significa **el atributo nombre de este objeto**.

## Encapsulamiento basico
Los atributos son `private` para evitar que cualquier parte del programa los cambie directamente. Para consultar datos usamos getters:

```java
public int getEdad() {
    return edad;
}
```

## Ejemplo practico
Imagina un sistema de alumnos. Cada alumno puede ser un objeto con nombre, edad y carrera. La clase define que datos tiene cualquier alumno y cada objeto representa a una persona concreta.

## Como se ejecuta
Ejecuta `Main.java` como **Java Application**. El flujo es:

```text
main() -> crear Main -> iniciar() -> crear Personas -> usar sus metodos
```

## Archivos
- `Main.java`: ejemplo ejecutable.
- `Persona.java`: clase que representa el objeto estudiado.

## Prueba tu mismo
Agrega el atributo `carrera` a `Persona`, recibelo en el constructor y muestralo en `mostrarDatos()`.

## Error comun
Confundir la clase con el objeto. `Persona` es el molde; `persona1` es uno de los objetos creados con ese molde.
