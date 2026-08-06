# 11 - Polimorfismo

## Objetivo
Entender como objetos de clases diferentes pueden tratarse mediante un **tipo padre comun**, manteniendo el comportamiento especifico de cada objeto.

## La linea clave

```java
Mascota mascota = new Perro("Firulais");
```

La variable es de tipo `Mascota`, pero el objeto real creado con `new` es un `Perro`.

Esto es valido porque:

```text
Perro extends Mascota
```

## Que metodo se ejecuta
Si `Perro` sobrescribe `hablando()`:

```java
mascota.hablando();
```

Java mira el **objeto real** y ejecuta la version de `Perro`.

```text
referencia Mascota ---> objeto Perro ---> "Guau"
referencia Mascota ---> objeto Gato  ---> "Miau"
```

## Por que sirve
Podemos crear una sola lista:

```java
List<Mascota> mascotas = new ArrayList<>();
```

y guardar dentro perros y gatos:

```java
mascotas.add(new Perro("Firulais"));
mascotas.add(new Gato("Garfield"));
```

Luego un unico ciclo funciona para todos:

```java
for (int i = 0; i < mascotas.size(); i++) {
    Mascota mascota = mascotas.get(i);
    mascota.hablando();
}
```

No necesitamos preguntar:

```text
¿eres Perro?
¿eres Gato?
```

Cada objeto sabe que comportamiento debe ejecutar.

## Ejemplo practico
En la veterinaria puedes tener una lista general de `Mascota`. Al mostrar el sonido, cada especie responde con su propia implementacion.

## Relacion con herencia
La herencia crea la relacion comun. El polimorfismo **aprovecha esa relacion** para trabajar con distintos objetos mediante el tipo padre.

## Como se ejecuta
Ejecuta `Main.java`. Veras que el mismo llamado `mascota.hablando()` genera resultados diferentes.

## Prueba tu mismo
Crea `Vaca extends Mascota`, sobrescribe `hablando()` y agregala a la lista sin cambiar el ciclo.

## Error comun
Pensar que por declarar la variable como `Mascota` se pierde el comportamiento del `Perro`. Los metodos sobrescritos se resuelven segun el objeto real.
