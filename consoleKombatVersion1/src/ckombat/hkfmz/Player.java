package ckombat.hkfmz;

public class Player {

	private String name;
	private int numero;
	private String avatar;
	
	public int atack(int one) {
	
			System.out.println("\t"+this.name + " Frappe! ");
			
			return this.numero-1;
		}
	public void defense() {
		System.out.println( "\t"+this.name + " se defend contre ");
	}
	public void reaction() {
		
		
		System.out.println( "\t"+this.name + " perd 1 pt ");
		
		
		
	}
		public Player() {
			
		}
	
	public Player(String nom) {
		
		//int t=(int) (1 + Math.random()*999);
		
		this.name=nom;
		
		//this.avatar=avatar="***";
		
		System.out.println(this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
}
