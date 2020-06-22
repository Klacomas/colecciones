package servicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import modelo.Persona;

public class ServiciosCSV {
	private static List<Persona> loadCSV() throws IOException {
		 BufferedReader br = new BufferedReader(new FileReader("datos.csv"));
		 return br.lines().map(line -> line.split(","))
		 .map(values -> new Persona(values[0], values[1], values[2],
		Integer.parseInt(values[3])))
		 .collect(Collectors.toList());
		}
	
	public void buscarPorNombre(String personaBuscar) throws IOException {
		List<Persona> personas = loadCSV(); 
		personas.stream().filter(person -> person.getNombre()
				.equals(personaBuscar))
				.forEach(p -> System.out.println(p.toString()));
	}
	
	public void buscarPorCorreo(String correoBuscar) throws IOException {
		List<Persona> personas = loadCSV(); 
		personas.stream().filter(person -> person.getCorreo()
				.equals(correoBuscar))
				.forEach(p -> System.out.println(p.toString()));
	}			

	public void contCiudadesUnicas() throws IOException {
		List<Persona> ciudades = loadCSV();
		List<String> ciudadesSinDuplicados = ciudades.stream()
				.map(item -> item.getCiudad())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(" " + ciudadesSinDuplicados.size());
	}
	
	public void buscarCorreoContiene(String correoBuscar) throws IOException {

		List<Persona> correos = loadCSV();
		
		List<Persona> correoContiene = new ArrayList<Persona>();
		for (Persona correo : correos) {
			if (correo.getCorreo().contains(correoBuscar)) {
				correoContiene.add(correo);
			}
		}
		System.out.println(" " + correoContiene.size());
	}

	public void multiplicarX3() throws IOException {
		List<Persona> montos = loadCSV();
		for (Persona monto : montos) {
			if (monto.getMonto()*3 > 29000) {
				System.out.println(" " + monto.getMonto()*3);				
			}
		}
	}

	public void promedio() throws IOException {
		List<Persona> montos = loadCSV();
		int sumatoria = 0;
		for (Persona monto : montos) {
			sumatoria = sumatoria + monto.getMonto();
		}
		System.out.println(" " + sumatoria/montos.size());
	}
	public void montoMenor() throws IOException {
		List<Persona> montos = loadCSV();
		List<Integer> montoMenor = montos.stream()
				.map(item -> item.getMonto())
				.sorted()
				.collect(Collectors.toList());
		montos.stream().filter(person -> person.getMonto() == montoMenor.get(0))
			.forEach(p -> System.out.println(p.toString()));
	}

	public void montoMayor() throws IOException {
		List<Persona> montos = loadCSV();
		List<Integer> montoMayor = montos.stream()
				.map(item -> item.getMonto())
				.sorted()
				.collect(Collectors.toList());
		montos.stream().filter(person -> person.getMonto() == montoMayor.get(montos.size()-1))
			.forEach(p -> System.out.println(p.toString()));
	}


	}

