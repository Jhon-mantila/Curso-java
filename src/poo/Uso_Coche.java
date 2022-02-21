package poo;

import javax.swing.JOptionPane;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancio la clase y creo un objeto: micoche
		Coche micoche = new Coche();
		
		micoche.set_color(JOptionPane.showInputDialog("Color del vehículo"));
		
		System.out.println(micoche.get_color());
		
		System.out.println(micoche.get_ruedas());
		
		System.out.println(micoche.get_datosGenerales());
		
		micoche.set_asientos(JOptionPane.showInputDialog("Tiene Asientos de cuero Si/No"));
		
		micoche.set_config_climatizador(JOptionPane.showInputDialog("Tiene Climatizador Si/No"));
		
		System.out.println(micoche.get_asientos_cuero());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("Precio total del coche:" + micoche.get_precio_coche());

	}

}
