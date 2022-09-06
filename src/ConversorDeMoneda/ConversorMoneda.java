package ConversorDeMoneda;

import javax.swing.JOptionPane;

public class ConversorMoneda {
	
	public void ConvertirPesosArgADolares(double valor){
		
		double monedaDolar = valor / 139.01;
		
		monedaDolar = (double) Math.round(monedaDolar *100d) / 100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaDolar + " Dólares");
		
	}
	
	public void ConvertirPesosArgAEuros(double valor){
		
		double monedaEuro = valor / 138.38;
		
		monedaEuro = (double) Math.round(monedaEuro *100d) / 100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaEuro + " Euros");
		
	}
	
public void ConvertirPesosArgALibrasEsterlinas(double valor){
		
		double monedaLibra = valor / 0.0062;
		
		monedaLibra = (double) Math.round(monedaLibra *100d) / 100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaLibra + " Libras Esterlinas");
		
	}

public void ConvertirPesosArgAYenJapones(double valor){
	
	double monedaYen = valor / 1.00;
	
	monedaYen = (double) Math.round(monedaYen *100d) / 100;
	
	JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaYen + " Yen Japonés");
	
}

public void ConvertirPesosArgAWonSulCoreano(double valor){
	
	double monedaWon = valor / 9.78;
	
	monedaWon = (double) Math.round(monedaWon *100d) / 100;
	
	JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaWon + " Won Sul-Coreanos");
	
}


public void ConvertirDolarAPesosArg(double valor){
	
	double monedaDolarPeso = valor / 0.0071;
	
	monedaDolarPeso = (double) Math.round(monedaDolarPeso *100d) / 100;
	
	JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaDolarPeso + " Pesos Argentinos");
	
}

public void ConvertirEuroAPesosArg(double valor){
	
	double monedaEuroPeso = valor / 0.0072;
	
	monedaEuroPeso = (double) Math.round(monedaEuroPeso *100d) / 100;
	
	JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaEuroPeso + " Pesos Argentinos");
	
}

public void ConvertirLibrasEsterlinasAPesosArg(double valor){
	
	double monedaLibraPeso = valor / 0.0062;
	
	monedaLibraPeso = (double) Math.round(monedaLibraPeso *100d) / 100;
	
	JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaLibraPeso + " Pesos Argentinos");
	
}

public void ConvertirYenJaponesAPesosArg(double valor){
	
	double monedaYenPeso = valor / 1.00;
	
	monedaYenPeso = (double) Math.round(monedaYenPeso *100d) / 100;
	
	JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaYenPeso + " Pesos Argentinos");
	
}

public void ConvertirWonSulCoreanoAPesosArg(double valor){
	
	double monedaWonPeso = valor / 0.10;
	
	monedaWonPeso = (double) Math.round(monedaWonPeso *100d) / 100;
	
	JOptionPane.showMessageDialog(null, "Tienes $ "+ monedaWonPeso + " Pesos Argentinos");
	
}



}
