
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);

        int id;
        String nombre;
        String tipoDeProducto;
        float precio;
        int cantidadStock;
        String continuar = "S";

        ArrayList<Producto> stock = new ArrayList<>();
        while (continuar.equalsIgnoreCase("S")) {
            
            try {

            System.out.println("Por favor ingresa el Id de tu producto");
            id = objScanner.nextInt();
            objScanner.nextLine();
            
            System.out.println("Por favor ingrese el nombre del producto");
            nombre = objScanner.nextLine();
            
            System.out.println("Ingrese el tipo de producto");
            tipoDeProducto = objScanner.nextLine();
            
            System.out.println("Ingrese el precio del producto");
            precio = objScanner.nextFloat();
            
            System.out.println("Ingrese la cantidad de Stock del producto");
            cantidadStock = objScanner.nextInt();
            objScanner.nextLine();

            Producto objProducto = new Producto(id, nombre, tipoDeProducto, precio, cantidadStock);
            stock.add(objProducto);

            System.out.println("Producto registrado: - id: " + objProducto.getId() + " - Nombre: " + objProducto.getNombre() + " - Precio: $" + objProducto.getPrecio() + " Cantidad: " + objProducto.getCantidadStock());

            System.out.println("¿Deseas registra otro producto? (S/N)");
            continuar = objScanner.nextLine();
        }catch(Exception e){
        
                System.out.println("Error, la información que agregaste es incorrecta");
                objScanner.nextLine();
        }
        }

        System.out.println("Historial de productos agregados");
        for (Producto objProducto : stock) {
            System.out.println(objProducto);
            //System.out.println("- id: " + objProducto.getId() + " - Nombre: " + objProducto.getNombre() + " - Precio: $" + objProducto.getPrecio() + " Cantidad: " + objProducto.getCantidadStock());
        }

        System.out.println("Gracias por registra los nuevos productos de la tienda");

    }

}

/*
            Está sección es como funciona el uso de get y set y encapsulamiento 
            
        Producto objProducto = new Producto(123456, "SpiderMan", "Figura de Acción", 20000f, 10);

        System.out.println("Producto registrado: " + objProducto.getNombre() + " - Precio: $" + objProducto.getPrecio() + " Cantidad: " + objProducto.getCantidadStock());

        objProducto.setCantidadStock(9);
        objProducto.setPrecio(18000.0f);

        System.out.println("Producto registrado: " + objProducto.getNombre() + " - Precio: $" + objProducto.getPrecio() + " Cantidad: " + objProducto.getCantidadStock());*/
