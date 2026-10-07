package sesion2b;

public class Empleado {
	
	public enum TipoEmpleado{Vendedor, Encargado};
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventaMes, float horasExtra) {
		float salario;
		if(tipo == TipoEmpleado.Vendedor) salario = 2000;
		else salario = 2500;
		
		if(ventaMes>=1500) 
			salario+=200;
		else if(ventaMes>=1000) 
			salario+=100;
		
		salario += horasExtra*30;
		
		return salario;
	}
	
	public float calculoNominaNeta(float nominaBruta) {
		float salario;		
		
		if(nominaBruta<=2100)
			salario= nominaBruta;
		else if(nominaBruta<2500)
			salario = nominaBruta * (1-0.15f);
		else 
			salario = nominaBruta * (1-0.18f);
		
		return salario;
	}
	
}
