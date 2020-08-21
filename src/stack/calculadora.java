package stack;

import javax.sound.midi.VoiceStatus;

public class calculadora 
{
	void gefCalculete (float numero1, float numero2, String operacion)
	{
		float respuesta = performOperation(numero1, numero2, operacion);
		displayResult(respuesta, numero1, numero2, operacion);
		
	}
	float performOperation (float numero1, float numero2, String operacion)
	{
		float result=0;
		if (operacion.equals("+"))
		{
			result = add(numero1, numero2);
		}
		else if (operacion.equals("-"))
		{
			result =  subtraer(numero1, numero2);
		}
		return result;
		
	}
	float add (float numero1, float numero2)
	{
		return numero1 + numero2;
	}
	
	float subtraer (float numero1, float numero2)
	{
		return numero1-numero2;
	}
	
	void displayResult(float result, float nuemro1, float numero2,  String operacion)
	{
		System.out.println(nuemro1 +" "+ operacion+ " " + numero2 + "=" + result);
	}

}
