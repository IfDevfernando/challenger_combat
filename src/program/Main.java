package program;

import java.util.Locale;
import java.util.Scanner;

import program.entities.Champion;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========Arena===========");
		System.out.println();
		System.out.println("Enter the data of the first champion:");
		System.out.print("Name: ");
		String name1 = sc.next();
		System.out.print("Initial life: ");
		int life1 = sc.nextInt();
		System.out.print("Attack: ");
		int attack1 = sc.nextInt();
		System.out.print("Armor: ");
		int armor1 = sc.nextInt();
		
		Champion champ1 = new Champion(name1, life1, attack1, armor1);
		
		System.out.println("Enter the data of the second champion:");
		System.out.print("Name: ");
		String name2 = sc.next();
		System.out.print("Initial life: ");
		int life2 = sc.nextInt();
		System.out.print("Attack: ");
		int attack2 = sc.nextInt();
		System.out.print("Armor: ");
		int armor2 = sc.nextInt();
		
		Champion champ2 = new Champion(name2, life2, attack2, armor2);
		
		Champion sta = new Champion();
		
		System.out.println();
		System.out.println("How many shifts do you want to run? ");
		int turns = sc.nextInt();
		
		
		
			for(int x =0; x < turns; x ++) {
				System.out.println("Result turns "+(x+1));
				
			
				if(champ1.getLife() > 0) {
					
					champ1.takeDamage(champ2);
					
				}if(champ2.getLife() <= 0) {
					System.out.println(champ2.getName()+" ( Dead )");
					System.out.println(champ1.getName()+champ1.getLife()+" Life");
					break;
				}
				
				if (champ2.getLife() > 0) {

					champ2.takeDamage(champ1);
					
				}
				if (champ1.getLife() <= 0) {
					System.out.println(champ1.getName()+" : "+champ1.getLife()+" ( Dead )");
					System.out.println(champ2.getName()+" : "+champ2.getLife()+" Life");
					break;
				}
				System.out.println(sta.status(champ1));
				System.out.println(sta.status(champ2));
			}
		
		System.out.println("end combat");
		sc.close();
	}

}
