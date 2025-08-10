# TallerNivelacionPII
Este repositorio fue creado meramente para realizar el taller de nivelación e PI a PII de la universidad

# Ejercicios de programación

Este archivo contendra algunos ejercicios de programación

## Contenido

- Caluladora básica
- Contador de vocales y consonantes
- Invertir una Cadena

# Preguntas teóricas

## GIT:
1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?
2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?
3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).
4. ¿Cómo se crea un commit y qué información almacena un objeto commit?
5. ¿Cuál es la diferencia entre git pull y git fetch?
6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?
7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?
8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?
9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?
10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?
11. ¿Cómo se utiliza git stash y en qué escenarios es útil?
12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?
13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?
14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?

## Programación:
15. ¿Cuáles son los tipos de datos primitivos en Java?
16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?
17. ¿Por qué es importante usar nombres significativos para variables y métodos?
18. ¿Qué es la Programación Orientada a Objetos (POO)?
19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?
20. ¿Qué es la herencia en POO y cómo se utiliza en Java?
21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?
22. ¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general?

# Desarrollo

## Git

1. Un respositorio en git se diferencia más que todo en su manejo de versiones, una carpeta o proyecto normal solo tiene archivos actuales, en cambio el repositorio maneja las versiones hechas a lo largo del proyecto
2. 
    - Working Directory: Donde editas archivos.

    - Staging Area / Index: Área intermedia donde se preparan los cambios que después irán en el próximo commit.

    - Repository: base de datos local donde Git almacena de forma permanente los commits confirmados.
3. 
    - Blob: Almacena contenido de un archivo.

    - Tree: Lista de blobs y subcarpetas.

    - Commit: Referencia a un árbol (tree) con su autor, fecha, etc.

    - Tag: nombre fijo que apunta a un commit.
4. 
    - Editas archivos en el working directory.

    - Añades los cambios al staging.

    - Confirmas con git commit.
    El commit puede guardar: autor, fecha, mensaje, hash único, tag, etc.
5. git fetch descarga cambios del remoto, mientras que el git pull, ademas de hacer el fetch, hace merge o rebase de manera automática
6. Es una rama que se crea para trabajar en ella y no afectar la principal y git gestiona los punteros moviendolos cada vez que se hace un commit en esa rama
7. Un git merge combina dos ramas, el fallo más común es cuando git no puede determinar de manera automática el como combinar cambios, esto se soluciona editando el archivo que hace conflicto, guardando, haciendo un git add y luego un git commit
8. Es donde guardamos cosas especifícas antes de hacer el commit, si nos saltamos este paso, solo se van a añadir cambios previamente añadidos al staging, más no los nuevos
9. El acrhivo .gitignore es un archivo que lista patrones de estos mismos y de carpetas que Git debe ignorar, útil para excluir temparales, claves, etc
10. El commit amend modifica el commit más reciente, en cuestión de contenido y/o mensaje, y un nuevo commit crea un registro adicional
11. Git stash guarda de manera temporal cambios no confirmados, es útil cuando necesito cambiar de rama sin perder avances
12. 
    - git reset: Mueve el HEAD y opcionalmente borra cambios.

    - git revert: Crea un commit inverso para deshacer uno anterior sin reescribir historial.

    - git checkout: Restaura archivos desde un commit o rama.
13. 
    - Ogigin: Es el nombre por defecto del repositorio remoto principal
    - Upstream: Es un remoto adicional, el más común al trabajar con forks
Para gestionar los forks, se hace un git remote add upstream <URL> y luego un git fecth upstream para traer los cambios
14. 
    - git lof: Lista los commits
    - gi diff: Muestra diferencias entre commits o entre cambios sin confirmar
    - git show: Detalla un commit específico

## JAVA

15. byte, short, int, long, float, double, char, boolean.
16. 
    - if/else: Se realizan si se cumple una condición o no
    - switch: Según el valor elegido en el proceso, hará una tarea u otra
    - Bucles: Repiten el bloque de código de acuerdo a una condición
17. Para evitar la confusión tanto nuestra como de otra persona que vea el código, dandole a las variables una fácil lectura y conprensión de que valor guardan
18. Es un paradigma basado en representar todas las entidades como objetos que continene atributos y métodos
19. 
    - Abstracción: representar lo esencial sin detalles innecesarios.

    - Encapsulamiento: ocultar datos internos y exponer solo lo necesario.

    - Herencia: reutilizar código de clases existentes.

    - Polimorfismo: un mismo método puede comportarse diferente según el objeto.
20. La herencia, es la forma en la que un objeto le hereda atributos y métodos a otro, permite reutilizar código y crear jerarquías
21. Los modificadores de acceso son los que dictaminan que tan restringida esta una variable para su uso en cualquier parte del código, y los más conocidos son:
    - public: Accesible desde cualquier lugar.

    - protected: Accesible desde el mismo paquete y subclases.

    - default (sin modificador): Accesible solo en el mismo paquete.

    - private: Accesible solo dentro de la clase.
22. las varibales de entorno son valores definidos fuera del código que afectan el comportamiento de programas. En Java, sirven para configurar rutas, credenciales, entornos (desarrollo, producción, etc.) sin modificar el código