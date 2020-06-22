package main;

import java.io.IOException;

import servicios.ServiciosCSV;
public class Main {

	public static void main(String[] args) {
		ServiciosCSV CSV = new ServiciosCSV();
		System.out.println("Buscar por Nombre ");
		try {
			CSV.buscarPorNombre("Giselle Marshall");
			System.out.println("Buscar por Correo");
			CSV.buscarPorCorreo("imperdiet.non@enim.org"); 
			System.out.println("Cuidades sin repetirse");
			CSV.contCiudadesUnicas(); 
			System.out.println("Correos con 'elit'");
			CSV.buscarCorreoContiene("elit"); 
			System.out.println("Multiplicar x 3");
			CSV.multiplicarX3(); 
			System.out.println("Promedio");
			CSV.promedio(); 
			System.out.println("Monto Menor");
			CSV.montoMenor(); 
			System.out.println("Monto Mayor");
			CSV.montoMayor(); 	
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
