# S01.01-InheritancePolymorphism_Level01_Ex02

---
# ENGLISH

---

# 📄 Description - Exercise Statement

##  🚗 Class `Car` - Java Exercise

## 🧩 Objective

Create a class called `Car` with the following attributes:
- `brand` → `static final`
- `model` → `static`
- `power` → `final`

> ✅ Demonstrate the difference between these three types of attributes.  
> 💡 Which one can be initialized in the constructor?

---

## 🔧 Methods to Implement

Add two methods to the `Car` class:
- A **static** method called `brake()`
    - Should print: `The vehicle is braking`
- A **non-static** method called `accelerate()`
    - Should print: `The vehicle is accelerating`

---

## 🚀 Demonstration in `main()`

Show how to invoke:
- the **static method** `brake()` directly from the class
- the **non-static method** `accelerate()` through an instance of the class

---

## 💡 Notes

- `static final` → A constant shared across all instances, initialized once and cannot be changed.
- `static` → Shared across all instances, but can be modified (if not final).
- `final` (non-static) → Specific to each object but cannot be changed once set.

---

# 💻 Technologies Used

- Java
- Java Standard Library
- Maven

---

# 📋 Requirements

To run this project, you need:

- Java Development Kit (JDK) 21 or higher
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or VS Code with Java and Maven support

---

# 🛠️ Installation

1. Ensure you have **JDK 21** or higher installed.
2. Clone this repository:
   ```sh
   git clone <https://github.com/DiegoBalaguer/S01.01-InheritancePolymorphism_Level01.git>
   ```
3. Open the project in your preferred IDE.
4. Compile the Java files.

---

# ▶️ Execution

1. Navigate to the folder containing the compiled files.
2. Run the application using:
   ```sh
   java Main
   ```
3. The output should display the respective messages when calling each method.

OR

1. In your preferred IDE, navigate to class **Main** and execute in IDE.

---

# 🌐 Deployment

Currently, the project is designed to run locally without the need for server deployment.


---
# CASTELLANO

---

# 📄 Descripción - Enunciado del Ejercicio

# 🚗 Clase `Coche` - Ejercicio en Java

## 🧩 Objetivo

Crea una clase llamada `Coche` con los siguientes atributos:
- `marca` → `static final`
- `modelo` → `static`
- `potencia` → `final`

> ✅ Demuestra la diferencia entre estos tres tipos de atributos.  
> 💡 ¿Cuál de ellos puede inicializarse en el constructor?

---

## 🔧 Métodos a implementar

Añade dos métodos a la clase `Coche`:
- Un método **estático** llamado `frenar()`
    - Debe mostrar: `El vehículo está frenando`
- Un método **no estático** llamado `acelerar()`
    - Debe mostrar: `El vehículo está acelerando`

---

## 🚀 Demostración en `main()`

Muestra cómo invocar:
- el método **estático** `frenar()` directamente desde la clase
- el método **no estático** `acelerar()` a través de una instancia de la clase

---

## 💡 Notas

- `static final` → Es una constante compartida por todas las instancias, se inicializa una sola vez y no puede cambiarse.
- `static` → Compartido por todas las instancias, pero se puede modificar (si no es final).
- `final` (no estático) → Específico de cada objeto pero no puede cambiarse una vez asignado.


---

# 💻 Tecnologías Utilizadas

- Java
- Biblioteca Estándar de Java
- Maven

---

# 📋 Requisitos

Para ejecutar este proyecto, necesitas:

- Java Development Kit (JDK) 21 o superior
- Un Entorno de Desarrollo Integrado (IDE) como IntelliJ IDEA, Eclipse o VS Code con soporte para Java y Maven

---

# 🛠️ Instalación

1. Asegúrate de tener instalado **JDK 21** o superior.
2. Clona este repositorio:
   ```sh
   git clone <https://github.com/DiegoBalaguer/S01.01-InheritancePolymorphism_Level01.git>
   ```
3. Open the project in your preferred IDE.
4. Compile the Java files.

---

# ▶️ Ejecución

1. Navega hasta la carpeta que contiene los archivos compilados.
2. Ejecuta la aplicación usando:
   ```sh
   java Main
   ```
3. La salida debería mostrar los mensajes correspondientes al llamar a cada método.

O BIEN

1. En tu IDE preferido, navega hasta la clase **Main** y ejecutala desde el entorno.

---

# 🌐 Despliegue

Actualmente, el proyecto está diseñado para ejecutarse en local sin necesidad de despliegue en servidor.

---