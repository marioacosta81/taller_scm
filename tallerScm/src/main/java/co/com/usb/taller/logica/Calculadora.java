package co.com.usb.taller.logica;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class Calculadora implements ICalculadora {
	
	@Override
	public Long sumar(Long num1, Long num2) {
		
		return num1 + num2;
	}

}
