package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sesion2b.Empleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaVentasMenor1000() {
	    Empleado empleado = new Empleado();

	    assertEquals(2000, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 999, 0));
	    assertEquals(2500, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 999, 0));
	}
	
	@Test
	void testCalculoNominaBrutaVentasMayorIgual1000() {
	    Empleado empleado = new Empleado();

	    assertEquals(2100, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1000, 0));
	    assertEquals(2600, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1000, 0));
	    
	    assertEquals(2100, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1001, 0));
	    assertEquals(2600, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1001, 0));
	}
	
	@Test
	void testCalculoNominaBrutaVentasMayorIgual1500() {
	    Empleado empleado = new Empleado();

	    assertEquals(2200, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1500, 0));
	    assertEquals(2700, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1500, 0));
	    
	    assertEquals(2200, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1501, 0));
	    assertEquals(2700, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1501, 0));
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtra() {
	    Empleado empleado = new Empleado();

	    assertEquals(2090, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 999, 3));
	    assertEquals(2590, empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 999, 3));
	}
	
	@Test
	void testCalculoNominaNetaMenorIgual2100() {
	    Empleado empleado = new Empleado();

	    assertEquals(2099, empleado.calculoNominaNeta(2099));
	    assertEquals(2100, empleado.calculoNominaNeta(2100));	    
	}
	
	@Test
	void testCalculoNominaNetaEntre2100y2500() {
	    Empleado empleado = new Empleado();

	    assertEquals(1793.5f, empleado.calculoNominaNeta(2110));
	    assertEquals(2116.5f, empleado.calculoNominaNeta(2490));	    
	}
	
	@Test
	void testCalculoNominaNetaMayorIgual2500() {
	    Empleado empleado = new Empleado();

	    assertEquals(2050.82f, empleado.calculoNominaNeta(2501));
	    assertEquals(2050, empleado.calculoNominaNeta(2500));	    
	}


}
