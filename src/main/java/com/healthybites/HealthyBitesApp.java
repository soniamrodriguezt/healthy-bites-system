package com.healthybites;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HealthyBitesApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> productos = new ArrayList<>();
    private static final List<String> pedidos = new ArrayList<>();

    public static void main(String[] args) {

        productos.add("Ensalada Healthy - $85");
        productos.add("Sandwich integral - $70");
        productos.add("Bowl de frutas - $65");
        productos.add("Jugo verde - $45");

        int opcion;

        do {
            System.out.println("\n=================================");
            System.out.println("       HEALTHY BITES");
            System.out.println(" Sistema de Bocadillos Saludables");
            System.out.println("=================================");
            System.out.println("1. Ver productos");
            System.out.println("2. Registrar pedido");
            System.out.println("3. Ver pedidos");
            System.out.println("4. Consultar inventario");
            System.out.println("5. Generar reporte");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = leerNumero();

            switch (opcion) {
                case 1:
                    mostrarProductos();
                    break;
                case 2:
                    registrarPedido();
                    break;
                case 3:
                    mostrarPedidos();
                    break;
                case 4:
                    mostrarInventario();
                    break;
                case 5:
                    generarReporte();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar Healthy Bites.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);
    }

    private static void mostrarProductos() {
        System.out.println("\n--- PRODUCTOS DISPONIBLES ---");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i));
        }
    }

    private static void registrarPedido() {
        mostrarProductos();
        System.out.print("\nSeleccione el numero del producto: ");
        int producto = leerNumero();

        if (producto >= 1 && producto <= productos.size()) {
            pedidos.add(productos.get(producto - 1));
            System.out.println("Pedido registrado correctamente.");
        } else {
            System.out.println("Producto no valido.");
        }
    }

    private static void mostrarPedidos() {
        System.out.println("\n--- PEDIDOS REGISTRADOS ---");

        if (pedidos.isEmpty()) {
            System.out.println("No existen pedidos registrados.");
            return;
        }

        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println((i + 1) + ". " + pedidos.get(i));
        }
    }

    private static void mostrarInventario() {
        System.out.println("\n--- INVENTARIO ---");
        System.out.println("Ensalada Healthy: 15 unidades");
        System.out.println("Sandwich integral: 20 unidades");
        System.out.println("Bowl de frutas: 12 unidades");
        System.out.println("Jugo verde: 18 unidades");
    }

    private static void generarReporte() {
        System.out.println("\n--- REPORTE HEALTHY BITES ---");
        System.out.println("Productos registrados: " + productos.size());
        System.out.println("Pedidos realizados: " + pedidos.size());
        System.out.println("Estado del inventario: Disponible");
        System.out.println("Sistema: Operando correctamente");
    }

    private static int leerNumero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un numero valido.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
