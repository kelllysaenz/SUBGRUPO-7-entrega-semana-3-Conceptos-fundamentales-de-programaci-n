import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateInfoFiles {

    private static final Random RANDOM = new Random();
    private static final String[] FIRST_NAMES = {"Juan", "Pedro", "Luis", "Ana", "María"};
    private static final String[] LAST_NAMES = {"Pérez", "Gómez", "Rodríguez", "Sánchez", "Torres"};

    public static void main(String[] args) {
        
        try {
            createDirectory("Vendedores");
            createDirectory("Productos");
            createSalesManInfoFile(5);
            createProductsFile(10);
            System.out.println("Archivos de prueba generados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al generar archivos de prueba: " + e.getMessage());
        }
    }

    public static void createDirectory(String folderName) {
        File directory = new File(System.getProperty("user.home") + "\\Downloads\\" + folderName);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public static void createSalesMenFile(int randomSalesCount, String name, long id) throws IOException {
        String filePath = System.getProperty("user.home") + "\\Downloads\\Vendedores\\" + name + "_" + id + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("DNI;" + id + "\n");
            for (int i = 0; i < randomSalesCount; i++) {
                writer.write("P" + (RANDOM.nextInt(10) + 1) + ";" + (RANDOM.nextInt(10) + 1) + ";\n");
            }
        }
    }

    public static void createProductsFile(int productsCount) throws IOException {
        String filePath = System.getProperty("user.home") + "\\Downloads\\Productos\\products.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 1; i <= productsCount; i++) {
                writer.write("P" + i + ";Producto" + i + ";" + (RANDOM.nextInt(100) + 1) + "\n");
            }
        }
    }

    public static void createSalesManInfoFile(int salesmanCount) throws IOException {
        String filePath = System.getProperty("user.home") + "\\Downloads\\vendedores\\salesmen.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < salesmanCount; i++) {
                String firstName = FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)];
                String lastName = LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)];
                long id = 100000 + i;
                writer.write("DNI;" + id + ";" + firstName + ";" + lastName + "\n");

                createSalesMenFile(RANDOM.nextInt(10) + 1, firstName + " " + lastName, id);
            }
        }
    }
}
