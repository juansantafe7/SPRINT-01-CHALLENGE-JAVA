package ConversorDeMoneda;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public void ConvertirCelsiusAFahrenheit(double valor){
		
		double CelsiusAFahrenheit = valor * 9/5;
		
		CelsiusAFahrenheit = (double) Math.round(CelsiusAFahrenheit + 32);
		
		JOptionPane.showMessageDialog(null, "Hay "+ CelsiusAFahrenheit + " Grados Fahrenheit");
		
	}
	
	public void ConvertirCelsiusAKelvin(double valor){
		
		double CelsiusAKelvin = valor;
		
		CelsiusAKelvin = (double) Math.round(CelsiusAKelvin + 273.15);
		
		JOptionPane.showMessageDialog(null, "Hay "+ CelsiusAKelvin + " Grados Kelvin");
		
	}
	
public void ConvertirCelsiusARankine(double valor){
		
		double CelsiusARankine = valor * 9/5;
		
		CelsiusARankine = (double) Math.round(CelsiusARankine + 491.67);
		
		JOptionPane.showMessageDialog(null, "Hay "+ CelsiusARankine + " Grados Rankine");
		
	}
	
	public void ConvertirFahrenheitACelsius(double valor){
		
		double FahrenheitACelsius = valor - 32;
		
		FahrenheitACelsius = (double) Math.round(FahrenheitACelsius * 5/9);
		
		JOptionPane.showMessageDialog(null, "Hay "+ FahrenheitACelsius + " Grados Celsius");
		
	}
	
	public void ConvertirKelvinACelsius(double valor){
		
		double KelvinACelsius = valor;
		
		KelvinACelsius = (double) Math.round(KelvinACelsius - 273.15);
		
		JOptionPane.showMessageDialog(null, "Hay "+ KelvinACelsius + " Grados Celsius");
		
	}
	
public void ConvertirRankineACelsius(double valor){
		
		double RankineACelsius = valor - 491.67;
		
		RankineACelsius = (double) Math.round(RankineACelsius * 5/9);
		
		JOptionPane.showMessageDialog(null, "Hay "+ RankineACelsius + " Grados Celsius");
		
	}
	
	
}
