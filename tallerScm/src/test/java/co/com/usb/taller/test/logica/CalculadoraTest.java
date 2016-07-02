package co.com.usb.taller.test.logica;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.com.usb.taller.logica.ICalculadora;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class CalculadoraTest {
	
	
	@Autowired
	ICalculadora calculadora;
	
	
	@Test
	public void atest()throws Exception {
	
		assertTrue(calculadora.sumar(2L, 5L).equals(7L));
		
	}
	
	
	
	

}
