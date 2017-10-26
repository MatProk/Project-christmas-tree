package christmassTree;
import java.util.Scanner;
public class Choinka {
			public static void main(String[] args) {
					int i,j,k,h;
					String direction;
					Scanner scan = new Scanner(System.in);
					System.out.println("Welcome. Write height of your tree:");
					h = scan.nextInt();
					System.out.println("Now write direction(up or down or left or right):");
					direction = scan.next();
					
					switch(direction) {
						case ("up"):
							for(i = 0; i<h;i++) {
								for(j=0;j<h - i;j++) {
									System.out.print(" ");
								}
								for(k=0;k<=i*2;k++) {                                //UP
									System.out.print("*");
								}
								System.out.println();
							}
						break;
						case "down":
							for(i = 0; i<h;i++) {
								for(j=0;j<i	;j++) {
									System.out.print(" ");
								}                                                  //DOWN
								for(k=h*2-1;k>i*2;k--) {
									System.out.print("*");
								}						
								System.out.println();
							}
							break;
						case "right":
							for(i = 0; i<h;i++) {
								for(k=0;k<=i;k++) {									
									System.out.print("*");									
									}
								System.out.println();
							}
							for(i = 0; i<h-1;i++) {                                //RIGHT
								for(k=h-1;k>i;k--) {									
									System.out.print("*");									
									}
								System.out.println();
							}
							break;
						case "left":                  
							for(i = 0; i<h;i++) {								
								for(j=h-1;j>i;j--)
									System.out.print(" ");								
								for(k=0;k<=i;k++) {            
									System.out.print("*");									
								}                                                //LEFT
								System.out.println();
							}							
							for(i = 0; i<h-1;i++) {   
								for(j=0;j<=i;j++)
									System.out.print(" ");								
								for(k=h-1;k>i;k--) {									
									System.out.print("*");									
									}
								System.out.println();
							}
							break;
						default:
							System.out.println("Niepoprawna komenda.");
							break;							
					}
			}
	}

