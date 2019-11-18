package ckombat.hkfmz;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Scanner;

class Boss {
   
	public static void aski(String b) 
	{
        int width = 100;
        int height = 30;
 
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.ROMAN_BASELINE, 11));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        graphics.drawString(b, 10, 20);

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {

                sb.append(image.getRGB(x, y) == -16777216 ? " " : "#");

            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(sb);
        }
	}
	
	public static void slowPrint(String message, long mil) 
	{
		for(int i=0; i<message.length(); i++) 
		{
			System.out.print(message.charAt(i));
			
			try 
			{
				Thread.sleep(mil);
			} 
			catch (InterruptedException e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
	
	public static void msg(String d) {
		System.out.println("#########################################################################################"+d);
	}
	public static void main (String[] args) {
		Scanner cl=new Scanner(System.in); 
		
		final String signature="By Hegel Motokoua";
		
		aski("Console Kombat");
		
		 slowPrint("",30);
		 
		 msg(signature);
		
		 System.out.print("\n");
		 System.out.print("Saisir votre pseudo:");
		 String pseudo=cl.nextLine();
		 //System.out.println("                           Bienvenue "+pseudo+" dans CONSOLE KOMBAT !");
		 
		 String part2=" dans CONSOLE KOMBAT !\n\n Choississez votre adversaire\n\n -----------------------------";
		 String message="                           Bienvenue "+pseudo.toUpperCase()+part2;
		 
		 slowPrint(message, 30);
		 System.out.print("\n");
		 
		 
		 
		 System.out.println("          [1]-BRADE\n          [2]-COOLBLACK\n          [3]-SOUL");
		 System.out.print("          [4]-COLA SUCRE\n          [5]-KING-END\n          [6]-GEVA");
		 
		System.out.println("\n -----------------------------");
		System.out.print("\n                 Le numero[?]:");
		int J1=cl.nextInt();		
		
		while(J1 <1 || J1 >6) {
			System.out.println("Choisi entre [1] & [6]\n");
			System.out.println("-------------->");
			J1=cl.nextInt();
			
		}System.out.print("\n");System.out.print("\n");System.out.print("\n");
////////////////////////////////////////////////////////////////////////////////////
		
				        String nom1= null,message02=null;
				      
						
						switch(J1)
						{
						case 1: nom1 = "BRADE";
							break;
							
						case 2: nom1 = "COOLBLACK";
						              message02="    Petit ! tu ose me défier? \ntu veux dormir hospitaliser à Alima palace?";
							break;
							
						case 3: nom1 = "MIKE";
							break;
							
						case 4: nom1 = "COLA SUCRE";
						              message02="    Petit frère! tu veux voir la mort habiller en bleu-bleu?";
							break;
							
						case 5: nom1 = "KING-END";
							break;
							
						case 6: nom1 = "GEVA";
							break;
						
						}						
		
				        Player p1 = new Player();
				        Player p2 = new Player();
						p1.setName(pseudo.toUpperCase());
						p2.setName(nom1.toUpperCase());
        
///////////////////////////////////////////////////////////////////////////////////		

				System.out.println("          Vous combattez contre "+ p2.getName());
		
		////////////////////////////////////    //////////////////////////////////
		
		cl.nextLine();
		
System.out.println("\n-------------------------------------------------------------------------------");
System.out.println("Message de: "+nom1);
System.out.println("");
               

            // String message02="                Abruti ! Comment ose-tu me défier? je vais te faire comprendre la vie.\n\n";
             slowPrint(message02, 100);



					
		//Player p1 = new Player("         "+pseudo.toUpperCase());	
		//System.out.println("         "+" Vous combattez contre "+"");	
		//Player p2 = new Player("         "+"BRADE");
		
		System.out.println("\n");
		System.out.print("[1]Repondre où [2]continuer?:");
		int c=cl.nextInt();
		
		
		while(c<1 || c>2) {
			System.out.println("\n");
			System.out.print("[1]Repondre où [2]continuer?:");	 
		}
		
		
		if(c==1) {
			System.out.print(pseudo+":");
			String remessage=cl.nextLine();	
			System.out.println("\n");
			
			cl.nextLine();
			System.out.println("Message de: "+nom1);
			
			message02="    Tu ose me repondre? je vois que \ntu as besoin que je t'enseigne la vie";
		     slowPrint(message02, 100);
		}
		
		cl.nextLine();
		
		//System.out.println("[1]-"+p1.getName());
		//System.out.println("[2]-"+p2.getName());
		
		
		System.out.println("\n");
		
		//System.out.println("Quitter le programme [w]"); p e Try catch
		
		//System.out.println("choisi ton joueur:");
		/*int J1=cl.nextInt();
		
		while(J1 <1 || J1 >2) {
			System.out.println("Choisi entre [1] & [2]");
			System.out.println("-->");
			J1=cl.nextInt();
		}*/
		
	/*	String nom1;
		
		if(J1==1) {
			System.out.println("    Vous aviez choisi "+ p1.getName());
			nom1=p1.getName();
		}
		else {
			System.out.println("    Vous aviez choisi "+ p2.getName());
			nom1=p2.getName();
		}
		cl.nextLine();
		*/
		
		
		
		
		System.out.println("Les Reactions possible:");
		System.out.println("[1]- Frapper\n[2]- Defense");
		System.out.println();
		
		System.out.println("lorsque vous choisissez frapper, l'adversaire\n ou vous perdez 1 pt de vieLa defense vous permet d'amortire la frappe\n de l'adversaire en divisant les consequences par 2");
		
		System.out.println();
		System.out.println("Et le combat commence!");
		
		for(int i=5; i>0; i--) {
			System.out.print(i+" seconde -> ");
		}
		
		
		System.out.println("\n");
		
		if(nom1==p1.getName()) {
			nom1="Vous";
			
			System.out.print(nom1 + " contre "+ p2.getName());
		
		}else
		{
            nom1="Vous";
			
			System.out.print(nom1 + " contre "+ p1.getName());
		
		}
		System.out.println("\n");
		System.out.println("Commencez !");
///////////////////////////////////////////////////////////////////////////////////////		
		
		
		for(int i=5; i>0; i--) {
		
		
		System.out.println("\nChoisi une Reaction !");
		System.out.println("-->");
		int rea=cl.nextInt();
		int h=(int) (1 + Math.random()*2);
		
		
		switch(rea) {
		case 1:
			System.out.println("\n");
			if(h==1) {
				p1.atack(1);
				p2.reaction();
			}
			if(h!=1) {
				p2.atack(1);
				p1.reaction();
			}
				break;
		case 2: 
			System.out.println("\n");
			if(h==1) {
				p1.defense();
			System.out.println(p2.getName());
			}
			if(h!=1) {
				p2.defense();
				System.out.println(p1.getName());
			}}
		
	
		if(p1.getNumero()>p2.getNumero()) {
			
			
			System.out.println(p1.getName()+" gagne!");
		}
		
		
		if(p2.getNumero()>p1.getNumero()) {
			
			
			System.out.println(p2.getName()+" gagne!");
		}
		}
		
		
		/* {
		
		// frappage ;)
		
		case 1:
			  
			System.out.println("\n");
			
			choi=(int) (1 + Math.random()*2);
			if(choi==1) {
				
				p1.atack();
				p2.reaction();
			}else {
				p2.atack();
				p1.reaction();
			}
			
			
			break;
			
			// defense ;)
		case 2: 
			choi=(int) (1 + Math.random()*2);
               if(choi==1) {
				
				p1.defense();
				System.out.println(p2.getName());
			}else {
				p2.defense();
				System.out.println(p1.getName());
			}
			
			break;	
		}
		*/
	
		
		
		
			
		}	
	
}