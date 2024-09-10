import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateInfoFiles {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        try {
            // Genera archivos de prueba
            createSalesMenFile(5, "Juan Pérez", 123456);
            createProductsFile(10);
            createSalesManInfoFile(5);
            System.out.println("Archivos de prueba generados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al generar archivos de prueba: " + e.getMessage());
        }
    }

    /*
     *  randomSalesCount Cantidad de ventas a generar.
     *  name Nombre del vendedor.
     *  id ID del vendedor.
     */
    public static void createSalesMenFile(int randomSalesCount, String name, long id) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name + "_" + id + ".txt"))) {
            writer.write("DNI;" + id + "\n");
            for (int i = 0; i < randomSalesCount; i++) {
                writer.write("P" + (RANDOM.nextInt(10) + 1) + ";" + (RANDOM.nextInt(10) + 1) + ";\n");
            }
        }
    }

    /**
     * 
     * productsCount = Cantidad de productos a generar.
     */
    public static void createProductsFile(int productsCount) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("products.txt"))) {
            for (int i = 1; i <= productsCount; i++) {
                writer.write("P" + i + ";Producto" + i + ";" + (RANDOM.nextInt(100) + 1) + "\n");
            }
        }
    }

    /**
     *  salesmanCount Cantidad de vendedores a generar.
     */
    public static void createSalesManInfoFile(int salesmanCount) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salesmen.txt"))) {
            for (int i = 0; i < salesmanCount; i++) {
                writer.write("DNI;" + (100000 + i) + ";Nombre" + i + ";Apellido" + i + "\n");
            }
        }
    }
}