package org.testing;

public class Residence1 implements Residence  {

	public void nellore1() {
		System.out.println("nellore7");
		
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
