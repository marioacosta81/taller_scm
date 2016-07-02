package co.com.usb.taller.delegado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import co.com.usb.taller.logica.ICalculadora;

@Scope("singleton")
@Component("calculadoraDelegado")
public class CalculadoraDelegado implements ICalculadoraDelegado{
	
	@Autowired
	ICalculadora calculadora;
	
	@Override
	public Long sumar(Long num1, Long num2) {
		return calculadora.sumar(num1, num2);
	}
	
	
	
}
