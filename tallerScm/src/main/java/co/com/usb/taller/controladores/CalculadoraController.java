package co.com.usb.taller.controladores;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.component.inputtext.InputText;

import co.com.usb.taller.delegado.ICalculadoraDelegado;
import co.com.usb.taller.logica.ICalculadora;

@ViewScoped
@ManagedBean
public class CalculadoraController {

	
	
	@ManagedProperty(value="#{calculadoraDelegado}")
	ICalculadoraDelegado calculadoraDelegado;
	
	private InputText numero1;
	private InputText numero2;
	private InputText resultado;
	
	
	
	public void sumar(){
		Long num1 = Long.parseLong(numero1.getValue().toString().trim());
		Long num2 = Long.parseLong(numero2.getValue().toString().trim());
		
		resultado.setValue(""+calculadoraDelegado.sumar(num1, num2));
		
		
		
	}



	public InputText getNumero1() {
		return numero1;
	}



	public void setNumero1(InputText numero1) {
		this.numero1 = numero1;
	}



	public InputText getNumero2() {
		return numero2;
	}



	public void setNumero2(InputText numero2) {
		this.numero2 = numero2;
	}



	public InputText getResultado() {
		return resultado;
	}



	public void setResultado(InputText resultado) {
		this.resultado = resultado;
	}



	public ICalculadoraDelegado getCalculadoraDelegado() {
		return calculadoraDelegado;
	}



	public void setCalculadoraDelegado(ICalculadoraDelegado calculadoraDelegado) {
		this.calculadoraDelegado = calculadoraDelegado;
	}
	
	
	
	
	
}
