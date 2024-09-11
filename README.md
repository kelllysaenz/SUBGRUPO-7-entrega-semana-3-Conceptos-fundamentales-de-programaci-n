# SUBGRUPO-7-TRABAJO COLABORATIVO-3-Conceptos-fundamentales-de-programacion
Integrantes: KELLY JOHANA SAENZ BALLESTEROS, DANIEL STEVEN ACOSTA MARULANDA, ANDRES PULIDO TOQUICA, JAVIER DAVID BLANCOS ARCOS, NIREY PAOLA BARRAS ANILLO

Generador de datos de ventas
Generación de Archivos de Prueba en Java
Este repositorio contiene un programa Java diseñado para generar archivos de prueba que contienen información sobre vendedores, productos y ventas. El propósito es crear archivos de texto que simulen datos para propósitos de prueba o demostración.

Estructura del proyecto
El proyecto consta de una sola clase llamada Java GenerateInfoFiles. Esta clase incluye varios métodos para generar archivos de texto con datos simulados.

ClaseGenerateInfoFiles
La clase GenerateInfoFilesproporciona métodos estáticos para crear archivos de texto con datos simulados. La clase utiliza la biblioteca estándar de Java para manejar la escritura de archivos y la generación de números aleatorios.

Métodos
public static void main(String[] args)

Este es el método principal que se ejecuta cuando se inicia el programa. Llama a los métodos de generación de archivos para crear archivos de prueba:

createSalesMenFile(5, "Juan Pérez", 123456);
createProductsFile(10);
createSalesManInfoFile(5);
Muestra un mensaje de éxito o error en la consola.

public static void createSalesMenFile(int randomSalesCount, String name, long id) throws IOException

Genera un archivo de texto con ventas simuladas para un vendedor específico. El archivo se nombra usando el formato name_id.txt, donde namees el nombre del vendedor y ides su identificador único.

Parámetros:
randomSalesCount: Número de ventas aleatorias a generar.
name: Nombre del vendedor.
id:ID del vendedor.
El archivo contiene el ID del vendedor y una lista de ventas con productos y cantidades aleatorias.

public static void createProductsFile(int productsCount) throws IOException

Crea un archivo llamado products.txtque contiene una lista de productos simulados.

Parámetros:
productsCount: Número de productos a generar.
Cada línea del archivo contiene el identificador del producto, su nombre y un precio aleatorio.

public static void createSalesManInfoFile(int salesmanCount) throws IOException

Genera un archivo llamado salesmen.txtcon información simulada sobre los vendedores.

Parámetros:
salesmanCount: Número de vendedores a generar.
El archivo contiene líneas con el ID del vendedor, nombre y apellido simulados.

Dependencias
JDK 8 o superior.
