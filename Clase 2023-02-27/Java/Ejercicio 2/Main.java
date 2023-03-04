package Clase28022023;

public class Main {

	public static int maximoProdVendido(ColaCircularP a, ColaSimpleV b) {
		int maximo = 0;
		int nroProd = a.nroelem();
		for (int i = 1; i <= nroProd; i++) {
			Producto x = a.eliminar();// Producto
			a.adicionar(x);
			int nroVent = b.nroelem();
			int cont = 0;
			for (int j = 1; j <= nroVent; j++) {
				Venta y = b.eliminar();// Venta
				b.adicionar(y);
				if (x.getIdProd() == y.getIdProd())
					cont = cont + y.getCantidad();
			}
			if (cont > maximo)
				maximo = cont;
		}
		return maximo;
	}

	public static void productosMasVendidos(ColaCircularP a, ColaSimpleV b) {
		int maximo = maximoProdVendido(a, b);
		int nroProd = a.nroelem();
		for (int i = 1; i <= nroProd; i++) {
			Producto x = a.eliminar();// Producto
			a.adicionar(x);
			int nroVent = b.nroelem();
			int cont = 0;
			for (int j = 1; j <= nroVent; j++) {
				Venta y = b.eliminar();// Venta
				b.adicionar(y);
				if (x.getIdProd() == y.getIdProd())
					cont = cont + y.getCantidad();
			}
			if (cont == maximo)
				x.mostrar();
		}
	}

	public static int gastoTotal(ColaCircularP a, ColaSimpleV b, String ci) {
		int nroVentas = b.nroelem();
		int costo = 0;
		for (int i = 1; i <= nroVentas; i++) {
			Venta x = b.eliminar();
			b.adicionar(x);
			if (x.getCi().equals(ci)) {
				int nroProductos = a.nroelem();
				for (int j = 1; j <= nroProductos; j++) {
					Producto y = a.eliminar();
					a.adicionar(y);
					if (y.getIdProd() == x.getIdProd())
						costo = costo + (y.getPrecio() * x.getCantidad());
				}
			}
		}
		return costo;
	}

	public static void ordenar(ColaCircularP a, ColaSimpleV b, PilaCl c) {
		PilaCl u = new PilaCl();
		PilaCl v = new PilaCl();
		while (!c.esvacia()) {
			Cliente elem = c.eliminar();
			while (!c.esvacia()) {
				Cliente x = c.eliminar();// Cliente
				if (gastoTotal(a, b, x.getCi()) > gastoTotal(a, b, elem.getCi())) {
					u.adicionar(elem);
					elem = x;
				} else {
					u.adicionar(x);
				}
			}
			c.vaciar(u);
			v.adicionar(elem);// aca esta el mayor
		}
		c.vaciar(v);
	}

	public static void main(String[] args) {
		ColaCircularP a = new ColaCircularP();
		ColaSimpleV b = new ColaSimpleV();
		PilaCl c = new PilaCl();
		a.llenar(1);
		b.llenar(4);
		c.llenar(4);
		a.mostrar();
		b.mostrar();
		c.mostrar();
		// Inciso 1
		productosMasVendidos(a, b);
		// Inciso 2
		ordenar(a, b, c);
		c.mostrar();
	}

}
