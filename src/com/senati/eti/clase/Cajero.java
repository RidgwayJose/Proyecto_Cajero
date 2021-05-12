package com.senati.eti.clase;

import java.util.ArrayList;

public class Cajero {
	
	
	private String tarjetas;
	private int contraseñas;
	private String nombre;
	private float saldo;
	private float retiro;
	private float deposito;
	private ArrayList<Cajero>Cuentas = new ArrayList<Cajero>();
	
	
	public float getRetiro() {
		return retiro;
	}

	public void setRetiro(float retiro) {
		this.retiro = retiro;
	}

	public float getDeposito() {
		return deposito;
	}

	public void setDeposito(float deposito) {
		this.deposito = deposito;
	}

	public String getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(String tarjetas) {
		this.tarjetas = tarjetas;
	}

	public int getContraseñas() {
		return contraseñas;
	}

	public void setContraseñas(int contraseñas) {
		this.contraseñas = contraseñas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public Cajero() {
	}

	
	public Cajero(String tarjetas, int contraseñas, String nombre, float saldo, float retiro, float deposito) {
		this.tarjetas = tarjetas;
		this.contraseñas = contraseñas;
		this.nombre = nombre;
		this.saldo = saldo;
		this.retiro = retiro;
		this.deposito = deposito;
	}

	public String Tarjeta () {
		return this.tarjetas;
	}
	
	public String Codigo (String n_tarj, ArrayList<Cajero>Cuentas) {
        String r = "";
	    
        for(int f = 0; f < Cuentas.size(); f++) {
            if(Cuentas.get(f).Tarjeta().equals(n_tarj))
                r = Cuentas.get(f).Tarjeta();
        }
        return r;
	}
	
	public int Contraseña() {
		return this.contraseñas;
	}
	
	public int pass(String n_tarj, ArrayList<Cajero>Cuentas) {
        
		int r = 0;
	    
        for(int f = 0; f < Cuentas.size(); f++) {
            if(Cuentas.get(f).Tarjeta().equals(n_tarj))
            	r = Cuentas.get(f).Contraseña();
        }
        return r;
	}
	
	public int cambio_contra(String n_tarj,int new_pass, ArrayList<Cajero>Cuentas) {
        int r = 0;
	    
        for(int f = 0; f < Cuentas.size(); f++) {
            if(Cuentas.get(f).Tarjeta().equals(n_tarj)) {
            	Cuentas.get(f).setContraseñas(new_pass);
                r = Cuentas.get(f).Contraseña();
            }}
        return r;
        
	}
	public String Titular() {
		return this.nombre;
	}
	
	
	 public String nom (String n_tarj, ArrayList<Cajero>Cuentas ) {
	        
			String r = "";
		    
	        for(int f = 0; f < Cuentas.size(); f++) {
	            if(Cuentas.get(f).Tarjeta().equals(n_tarj))
	                r = Cuentas.get(f).Titular();
	        }
	        return r;
		}
	
	public float Saldo_actual() {
		return this.saldo;
	}
	 
	
	 public float saldo_actual(String n_tarj, ArrayList<Cajero>Cuentas) {
		 float r = 0;
		    
	        for(int f = 0; f < Cuentas.size(); f++) {
	            if(Cuentas.get(f).Tarjeta().equals(n_tarj))
	            r = Cuentas.get(f).Saldo_actual();
	             }
	        return r;
	}
	
	
	 public float retiro(String n_tarj, float descuento, ArrayList<Cajero>Cuentas) {
	        float r = 0;
	        for(int f = 0; f < Cuentas.size(); f++) {
	            if(Cuentas.get(f).Tarjeta().equals(n_tarj)) {
	            	Cuentas.get(f).setSaldo(Cuentas.get(f).Saldo_actual() - descuento);
	            	r = Cuentas.get(f).Saldo_actual();
	            }
	            
	        }
	        return r;
		}
	
	 public float deposito(String n_tarj, float aumento, ArrayList<Cajero>Cuentas) {
	        float r = 0;
	        for(int f = 0; f < Cuentas.size(); f++) {
	            if(Cuentas.get(f).Tarjeta().equals(n_tarj)) {
	            	Cuentas.get(f).setSaldo(Cuentas.get(f).Saldo_actual() + aumento);
	            	r = Cuentas.get(f).Saldo_actual();
	            }
	            
	        }
	        return r;
		}
	 
	 public float ret () {
		 return this.retiro;
	 }
	 
public float ret (String n_tarj, float descuento, ArrayList<Cajero>Cuentas) {
	 float r = 0;
     for(int f = 0; f < Cuentas.size(); f++) {
         if(Cuentas.get(f).Tarjeta().equals(n_tarj)) {
         	Cuentas.get(f).setRetiro(descuento);
         	r = Cuentas.get(f).ret();
         }
         
     }
     return r;
}

public float getret(String n_tarj, ArrayList<Cajero>Cuentas) {
	 
	float r = 0;
     for(int f = 0; f < Cuentas.size(); f++) {
         if(Cuentas.get(f).Tarjeta().equals(n_tarj)) {
         	r = Cuentas.get(f).ret();
         }
         
     }
     return r;
}

public float dep () {
	 return this.deposito;
}
public float dep (String n_tarj, float aumento, ArrayList<Cajero>Cuentas) {
float r = 0;
for(int f = 0; f < Cuentas.size(); f++) {
    if(Cuentas.get(f).Tarjeta().equals(n_tarj)) {
    	Cuentas.get(f).setDeposito(aumento);
    	r = Cuentas.get(f).dep();
    }
    
}
return r;
}

public float getdep(String n_tarj, ArrayList<Cajero>Cuentas) {
	 
	float r = 0;
     for(int f = 0; f < Cuentas.size(); f++) {
         if(Cuentas.get(f).Tarjeta().equals(n_tarj)) {
         	r = Cuentas.get(f).dep();
         }
         
     }
     return r;
}
}
	