package ConversorDeMoneda;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConversorMoneda monedas = new ConversorMoneda();

	public void ConvertirMonedas(double valor){
	String opcion = (JOptionPane.showInputDialog(null,
			"Elige la moneda a la que deseas convertir tu dinero",
			"Monedas", JOptionPane.PLAIN_MESSAGE, null,
			new Object[]{"De pesos Arg a Dólar", "De pesos Arg a Euro",
			"De pesos Arg a Libras Esterlinas", "De pesos Arg a Yen Japonés",
			"De pesos Arg a Won sul-coreano", "De Dólar a pesos Arg", 
			"De Euros a pesos Arg","De Libras Esterlinas a pesos Arg",
			"De Yen Japonés a pesos Arg","De Won Sul-coreano a pesos Arg"
			},"Seleccion")).toString();
	
	switch(opcion){
	
	case "De pesos Arg a Dólar":
		
		monedas.ConvertirPesosArgADolares(valor);
		
		break;
	
	
	case "De pesos Arg a Euro":
		
		monedas.ConvertirPesosArgAEuros(valor);
		
		break;
		
	case "De pesos Arg a Libras Esterlinas":
		
		monedas.ConvertirPesosArgALibrasEsterlinas(valor);
		
		break;
		
	case "De pesos Arg a Yen Japonés":
	
	monedas.ConvertirPesosArgAYenJapones(valor);
	
		break;
	
	case "De pesos Arg a Won sul-coreano":
	
	monedas.ConvertirPesosArgAWonSulCoreano(valor);
	
		break;
		
		
	case "De Dólar a pesos Arg":
		
		monedas.ConvertirDolarAPesosArg(valor);
		
		break;
	
	
	case "De Euros a pesos Arg":
		
		monedas.ConvertirEuroAPesosArg(valor);
		
		break;
		
	case "De Libras Esterlinas a pesos Arg":
		
		monedas.ConvertirLibrasEsterlinasAPesosArg(valor);
		
		break;
		
	case "De Yen Japonés a pesos Arg":
	
	monedas.ConvertirYenJaponesAPesosArg(valor);
	
		break;
	
	case "De Won Sul-coreano a pesos Arg":
	
	monedas.ConvertirWonSulCoreanoAPesosArg(valor);
	
		break;
	
	}
	
	}
	
	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	public void ConvertirTemperatura(double valor){
	String opcion = (JOptionPane.showInputDialog(null,
			"Elige el tipo de grado que deseas convertir",
			"Temperatura", JOptionPane.PLAIN_MESSAGE, null,
			new Object[]{ "De Celsius a Fahrenheit",
			"De Celsius a Kelvin",
			"De Celsius a Rankine",
			"De Fahrenheit a Celsius",
			"De Kelvin a Celsius",
			"De Rankine a Celsius"			
			},"Seleccion")).toString();
	
	switch(opcion){
	
	case "De Celsius a Fahrenheit":
		
		temperatura.ConvertirCelsiusAFahrenheit(valor);
		
		break;
		
	case "De Celsius a Kelvin":
		
		temperatura.ConvertirCelsiusAKelvin(valor);
		
		break;
		
	case "De Celsius a Rankine":
	
	temperatura.ConvertirCelsiusARankine(valor);
	
	break;
		
	case "De Fahrenheit a Celsius":
		
		temperatura.ConvertirFahrenheitACelsius(valor);
		
		break;
		
	case "De Kelvin a Celsius":
		
		temperatura.ConvertirKelvinACelsius(valor);
		
		break;
		
	case "De Rankine a Celsius":
		
		temperatura.ConvertirRankineACelsius(valor);
		
		break;
	
}
}

}
	
	
	
	
	
	
	

	