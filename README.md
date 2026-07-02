# Aplicación de los principios SOLID en un sistema de gestión de préstamos

Estás trabajando en un sistema de gestión de préstamos para un banco. El sistema debe permitir a los clientes solicitar préstamos, y el banco debe poder aprobar o rechazar las solicitudes. El sistema actual tiene problemas de mantenibilidad y escalabilidad debido a una estructura de código rígida y acoplada. Tu tarea es aplicar los principios SOLID para mejorar la estructura del sistema y hacerlo más mantenible y escalable.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | SOLID principles |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 10 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Identificación de problemas de diseño

**Objetivo:** Identificar las áreas del sistema que violan los principios SOLID y proponer mejoras.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Analiza el código existente y enumera las áreas que violan los principios SOLID.
- Propón mejoras para cada área identificada.

**Entregable:** Documento que enumera las áreas que violan los principios SOLID y las propuestas de mejora.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que el principio de responsabilidad única sugiere que una clase debe tener una sola razón para cambiar.
- El principio de abierto/cerrado sugiere que el software debe ser abierto para extensión pero cerrado para modificación.

</details>

### Fase 2: Aplicación del principio de responsabilidad única

**Objetivo:** Refactorizar el código para que cada clase tenga una sola responsabilidad.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Refactoriza el código para que cada clase tenga una sola responsabilidad.
- Documenta los cambios realizados y cómo han mejorado la estructura del sistema.

**Entregable:** Código refactorizado que sigue el principio de responsabilidad única y documento que describe los cambios realizados.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que el principio de responsabilidad única sugiere que una clase debe tener una sola razón para cambiar.

</details>

### Fase 3: Aplicación del principio de abierto/cerrado

**Objetivo:** Refactorizar el código para que sea abierto para extensión pero cerrado para modificación.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Refactoriza el código para que sea abierto para extensión pero cerrado para modificación.
- Documenta los cambios realizados y cómo han mejorado la estructura del sistema.

**Entregable:** Código refactorizado que sigue el principio de abierto/cerrado y documento que describe los cambios realizados.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que el principio de abierto/cerrado sugiere que el software debe ser abierto para extensión pero cerrado para modificación.

</details>

### Fase 4: Aplicación de los principios restantes

**Objetivo:** Refactorizar el código para que siga los principios de Liskov, Interface Segregation y Dependency Inversion.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Refactoriza el código para que siga los principios de Liskov, Interface Segregation y Dependency Inversion.
- Documenta los cambios realizados y cómo han mejorado la estructura del sistema.

**Entregable:** Código refactorizado que sigue los principios de Liskov, Interface Segregation y Dependency Inversion y documento que describe los cambios realizados.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que el principio de Liskov sugiere que las subclases deben ser sustituibles por sus clases base sin alterar las propiedades correctas del programa.
- El principio de Interface Segregation sugiere que ninguna clase debería ser forzada a implementar interfaces que no usa.
- El principio de Dependency Inversion sugiere que las dependencias deben estar en términos de abstracciones, no concretizaciones.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los principios SOLID y por qué son importantes?
- **paraQueSirve**: ¿Cómo pueden los principios SOLID mejorar la estructura de un sistema?
- **comoSeUsa**: ¿Cómo aplicaste los principios SOLID en el sistema de gestión de préstamos?
- **erroresComunes**: ¿Qué errores comunes se cometen al aplicar los principios SOLID?
- **queDecisionesImplica**: ¿Qué decisiones de diseño implica la aplicación de los principios SOLID?

## Criterios de Evaluacion

- Identificación correcta de las áreas que violan los principios SOLID.
- Refactorización correcta del código para seguir el principio de responsabilidad única.
- Refactorización correcta del código para seguir el principio de abierto/cerrado.
- Refactorización correcta del código para seguir los principios de Liskov, Interface Segregation y Dependency Inversion.
- Documentación clara y concisa de los cambios realizados.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
