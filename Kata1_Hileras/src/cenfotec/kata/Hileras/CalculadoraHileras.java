package cenfotec.kata.Hileras;

public class CalculadoraHileras {

	public Object add(String string) throws Exception {

		if (string.isEmpty()) {
			return 0;
		}
		
		String [] numeros = separacion(string);

		return sumarTodosLosValores(numeros);


	}

	private String[] separacion(String string) {
		String [] numeros = null;
		
		if(string.contains(",")) {
			
			numeros = string.split(",");
			
		}else if(string.contains(".")) {
			
			numeros = string.split(".");
			
		}
		
		return numeros;
	}

	private int sumarTodosLosValores(String[] numeros) {
		int acumulador = 0;

		for (String numero : numeros) {

			acumulador += Integer.parseInt(numero);

		}
		return acumulador;
	}

}
