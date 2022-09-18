package org.testing;

public class Residence1 implements Residence  {

	public void nellore1() {
<<<<<<< HEAD
		System.out.println("nellore7");
=======
		System.out.println("nellore3");
>>>>>>> 644cd58ffc6e546920067b61731345597505b904
		
	}
	public void nellore() {
		System.out.println("local");
	}

	public void chennai() {
		System.out.println("nonlocal");
	}
	
		public static void main(String[] args) {
			Residence1 r=new Residence1();
			r.chennai();
			r.nellore();
			r.nellore1();
		}
		
		
	
}
