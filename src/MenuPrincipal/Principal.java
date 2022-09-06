package MenuPrincipal;

import javax.swing.*;

import ConversorDeMoneda.OpcionesConversion;


public class Principal {
	
	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		
		while(true){
			
			String opciones = JOptionPane.showInputDialog(null,
					"Seleccione una opción de conversión",
					"Menú", JOptionPane.PLAIN_MESSAGE, null,
					new Object[]{"Conversor de moneda",
					"Conversor de temperatura"},
					"Elegir").toString();
		
			switch(opciones){
			
			case "Conversor de moneda":
				
				String input = JOptionPane.showInputDialog(null,"Ingrese un valor");
				
				double valorRecibido = Double.parseDouble(input);
				
				conversion.ConvertirMonedas(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
				
				if(JOptionPane.OK_OPTION == respuesta){
					
					System.out.println("Selecciona opción afirmativa");
					
				}else{
					
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					
				}
				break;	
			
			
			case "Conversor de temperatura":
				
				String ingrese = JOptionPane.showInputDialog(null,"Ingrese un valor");
				
				double gradoRecibido = Double.parseDouble(ingrese);
				
				conversion.ConvertirTemperatura(gradoRecibido);
				
				int respuestagrado = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
				
				if(JOptionPane.OK_OPTION == respuestagrado){
					
					System.out.println("Selecciona opción afirmativa");
					
				}else{
					
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					
				}
				break;	
			
			}
				
			
			
			
		}

	}				
	
}

