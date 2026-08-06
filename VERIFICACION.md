# Verificacion tecnica

La carpeta fue revisada con estas reglas:

1. Cada apunte es un proyecto Eclipse independiente.
2. Cada proyecto contiene `.project` y `.classpath`.
3. `src` esta declarado como Source Folder en `.classpath`.
4. Cada declaracion `package` coincide exactamente con su ruta bajo `src`.
5. Cada proyecto contiene un `Main.java` con `public static void main(String[] args)`.
6. Cada proyecto contiene un `README.md` propio.
7. Los proyectos se compilan de forma independiente.
8. Los `Main` se ejecutan de forma independiente.

Entorno usado para la comprobacion:

```text
javac 21.0.10
OpenJDK 21.0.10
```

El proyecto de matrices necesita dos numeros por consola. Para la prueba automatica se utilizaron 2 filas y 3 columnas.

El proyecto integrador crea `usuario_pedro.txt` al ejecutarse; esta es una salida esperada del ejemplo de interfaces/exportacion.
