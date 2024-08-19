package tallerEstructuraDeDatos;
import java.util.Scanner;
import java.util.HashMap;

public class Taller {

	public static void main (String[] args) {
		HashMap<String, Integer> productosTienda = new HashMap<>();
		Scanner eleccion = new Scanner(System.in);
		
		int seleccion;
		
		do {
			
			System.out.println("\nMenú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto por nombre");
            System.out.println("3. Actualizar cantidad de producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            seleccion = eleccion.nextInt();
            eleccion.nextLine();
            switch(seleccion) {
            case 1:
            	System.out.print("Ingrese el nombre del producto:");
            	String nombreProducto= eleccion.nextLine();
            	
            	if(productosTienda.containsKey(nombreProducto)) {
            		System.out.println("Este nombre ya esta usado");
            	}else{
            		System.out.println("Ingrese la cantidad del producto:");
            		int cantidadProducto= eleccion.nextInt();
            		eleccion.nextLine();
            		productosTienda.put(nombreProducto, cantidadProducto);
            		System.out.println("El producto ha sido agregado");
            	};
            	break;
            	
            case 2:
            	System.out.println("Ingrese el nombre del producto que desea buscar: ");
            	 nombreProducto = eleccion.nextLine();
            	 
            	 if(productosTienda.containsKey(nombreProducto)) {
            		 int cantidadProducto = productosTienda.get(nombreProducto);
            		 System.out.println("El producto llamado: "+nombreProducto+" con una cantidad de "+cantidadProducto+" unidades en stock");
            	 }else {
            		 System.out.println("El producto no ha sido encontrado");
            	 }
            	
            	break;
            	
            case 3:
            	System.out.println("Ingrese el nombre del producto que desea encontrar: ");
            	nombreProducto = eleccion.nextLine();
            	if(productosTienda.containsKey(nombreProducto)) {
            		System.out.println("Ingrese la nueva cantidad de stock");
            		
            		int cantidadProducto = eleccion.nextInt();
            		
            		productosTienda.put(nombreProducto, cantidadProducto);
            		System.out.println("El producto "+nombreProducto+" ahora tiene una cantidad de "+cantidadProducto+" en el stock");
            	}else {
            		System.out.println("El producto no ha sido encontrado");
            	}
            	break;
            	
            case 4:
            	System.out.println("Ingrese el nombre del producto que desea eliminar:");
            	nombreProducto = eleccion.nextLine();
            	if(productosTienda.containsKey(nombreProducto)) {
            		
            		productosTienda.remove(nombreProducto);
            		
            		System.out.println("El producto "+nombreProducto+" ha sido eliminado");
            	}else {
            		System.out.println("El producto no ha sido encontrado");
            	}
            	break;
            case 5:
            	System.out.println("Inventario de productos:");
            	for(String clave : productosTienda.keySet()) {
            		System.out.println("Producto: "+clave+" - Cantidad en stock: "+ productosTienda.get(clave));
            	}
            	break;
            case 6:
            	System.out.println("Espero que haya disfrutado en la tienda");
            	break;
            default:
            	System.out.println("La opción que selecciono no esta disponible");
            	break;
            }
            
		}while(seleccion != 6);
		
		eleccion.close();
	}
}
