# PracticaPSP_Tuberias

Proyecto listo para abrir en IntelliJ IDEA.

## Estructura
```
PracticaPSP_Tuberias/
  └─ src/
     └─ actividad/
        ├─ GeneradorNumeros.java
        ├─ OrdenadorNumeros.java
        └─ CalculaMedia.java
  README.md
  EJEMPLOS.txt
```

## Descripción breve (resumen de la práctica)
Tarea individual para practicar entrada/salida estándar, generación de números aleatorios,
ordenación y cálculo de media, y uso del operador tubería (`|`) para encadenar procesos.

## Cómo abrir en IntelliJ
1. Descarga y descomprime el ZIP del proyecto.
2. En IntelliJ: `File -> Open` y selecciona la carpeta `PracticaPSP_Tuberias`.
3. IntelliJ detectará automáticamente las fuentes Java en `src`.
4. Para ejecutar desde IntelliJ, crea una Run Configuration para cada clase:
   - Main class: `actividad.GeneradorNumeros` (Working directory: el directorio raíz del proyecto)
   - Main class: `actividad.OrdenadorNumeros`
   - Main class: `actividad.CalculaMedia`

## Compilar desde terminal (opcional)
En la carpeta raíz del proyecto:
```
javac -d out src/actividad/*.java
```

Ejecutar:
```
java -cp out actividad.GeneradorNumeros 10 100 | java -cp out actividad.OrdenadorNumeros | java -cp out actividad.CalculaMedia
```
(El primer programa genera 10 números aleatorios entre 1 y 100).

## Criterios para conseguir un 10 (incorporados en este proyecto)
Para alcanzar la máxima nota, asegúrate de que tu entrega contiene:

1. **Correcta separación de responsabilidades**: tres programas independientes (generador, ordenador, calculadora de media). ✔️
2. **Entrada/salida estándar**: los programas leen/escriben por stdin/stdout y funcionan encadenados con `|`. ✔️
3. **Generación automática de datos**: `GeneradorNumeros` acepta parámetros y genera números aleatorios. ✔️
4. **Documentación Javadoc y comentarios**: cada clase tiene Javadoc explicativo y comentarios en puntos clave. ✔️
5. **Robustez**: manejo de entradas no numéricas, argumentos inválidos y EOF. ✔️
6. **Manual de pruebas**: incluye `EJEMPLOS.txt` con comandos de prueba y salidas esperadas para pegar en tu documento. ✔️
7. **Capturas**: en tu entrega final agrega capturas reales de IntelliJ mostrando compilación, ejecución individual y ejecución con tubería. (Este repositorio incluye instrucciones y marcadores para esas capturas). ✔️

## Recomendaciones para el manual que acompaña la entrega
- Incluir capturas nombradas como: `01_proyecto.png`, `02_generador.png`, `03_ordenador.png`, `04_media.png`, `05_pipeline.png`.
- Documentar paso a paso la ejecución y explicar las salidas.
- Adjuntar los comandos usados y la versión del JDK (ej. OpenJDK 17).

## Ejemplos rápidos
Ver `EJEMPLOS.txt` para comandos listos a copiar.

---
Autores: Alejandro Rolón (proyecto preparado para entrega).
