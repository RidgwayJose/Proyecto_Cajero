package com.senati.eti.clase;

import java.util.ArrayList;

public class Suministros {
	
	private float Agua;
	private float Luz;
	private int SumAgua;
	private int SumLuz;
	private ArrayList<Suministros>Sum = new ArrayList<Suministros>();
	
	
	public float getAgua() {
		return Agua;
	}
	public void setAgua(float agua) {
		Agua = agua;
	}
	public float getLuz() {
		return Luz;
	}
	public void setLuz(float luz) {
		Luz = luz;
	}
	public int getSumAgua() {
		return SumAgua;
	}
	public void setSumAgua(int sumAgua) {
		SumAgua = sumAgua;
	}
	public int getSumLuz() {
		return SumLuz;
	}
	public void setSumLuz(int sumLuz) {
		SumLuz = sumLuz;
	}
	
	
	public Suministros() {
	}
	
	public Suministros(float agua, float luz, int sumAgua, int sumLuz) {
		Agua = agua;
		Luz = luz;
		SumAgua = sumAgua;
		SumLuz = sumLuz;
	}
	
	
	public int SumA() {
		return this.SumAgua;		
	}
	
	public int SumA(int sum, ArrayList<Suministros>Sum) {
		 int r = 0;
	        for(int f = 0; f < Sum.size(); f++) {
	            if(Sum.get(f).SumA() == (sum))
	            	r = Sum.get(f).SumA();
	        }
	        return r;
	}

	
	public float PagoAgua() {
		return this.Agua;
	}
	
	 public float PagoAgua (int sum, ArrayList<Suministros>Sum) {
		 
		 float r = 0;
		    
	        for(int f = 0; f < Sum.size(); f++) {
	            if(Sum.get(f).SumA() == (sum))
	            	r = Sum.get(f).PagoAgua();
	        }
	        return r;
		}

	public float Agua_actual() {
		return this.Agua;
	}
		 
	public float Agua_actual(int sum, ArrayList<Suministros>Sum ) {
		
		 float r = 0;
		    
	        for(int f = 0; f < Sum.size(); f++) {
	            if(Sum.get(f).SumA() == (sum)) {
	            Sum.get(f).setAgua(0);
	            
	            r = Sum.get(f).Agua_actual(); 
	            }
            }return r;
	}
	
	public int SumL() {
		return this.SumLuz;		
	}
	
	public int SumL(int sum, ArrayList<Suministros>Sum) {
		 int r = 0;
	        for(int f = 0; f < Sum.size(); f++) {
	            if(Sum.get(f).SumL() == (sum))
	            	r = Sum.get(f).SumL();
	        }
	        return r;
	}

	
	public float PagoLuz() {
		return this.Luz;
	}
	
	 public float PagoLuz (int sum, ArrayList<Suministros>Sum) {
		 
		 float r = 0;
		    
	        for(int f = 0; f < Sum.size(); f++) {
	            if(Sum.get(f).SumL() == (sum))
	            	r = Sum.get(f).PagoLuz();
	        }
	        return r;
		}

	public float Luz_actual() {
		return this.Luz;
	}
		 
	public float Luz_actual(int sum, ArrayList<Suministros>Sum ) {
		
		 float r = 0;
		    
	        for(int f = 0; f < Sum.size(); f++) {
	            if(Sum.get(f).SumL() == (sum)) {
	            Sum.get(f).setLuz(0);
	            
	            r = Sum.get(f).Luz_actual(); 
	            }
            }return r;
	}
}