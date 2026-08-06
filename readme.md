CORRECCIONES REALIZADAS EN EL PROYECTO

1. Eclipse / Build Path
- El archivo .classpath no tenia la carpeta src declarada como source folder.
- Se agrego: <classpathentry kind="src" path="src"/>

2. Figura
- Se corrigio List/Punto vs Puntos.
- Se agregaron los imports necesarios.
- Figura queda abstracta y define calcularArea() y calcularPerimetro().
- Implementa Exportable y comparte exportarTxt() con sus subclases.

3. Usuario
- Ya no es abstracta, porque Main necesita instanciar usuarios.
- Un Usuario ahora guarda varias figuras con List<Figura>, tal como pide el enunciado.
- Implementa exportarTxt().

4. Subclases
- Cuadrado, Circunferencia, Triangulo y Estrella heredan correctamente de Figura.
- Ya no tienen @Override de metodos que no existen.
- Se agregaron constructores que llaman a super(...).

5. Calculadora
- Recibe Figura y delega area/perimetro usando polimorfismo.
- verificarSiCabe(...) queda como TODO porque determinar si una figura realmente cabe dentro de otra requiere una regla geometrica concreta; comparar solo areas no es suficiente.

6. Main
- Se crean figuras concretas, usuarios y una lista de Figura.
- Se muestra el uso del polimorfismo en un for.

VERIFICACION
- Todo el codigo dentro de src compila correctamente con javac.
- Tareas.Main se ejecuto correctamente.

PENDIENTE DE LA TAREA
- Definir la formula/representacion geometrica exacta de Estrella.
- Implementar correctamente verificarSiCabe(...) segun la regla que indique el profesor.
