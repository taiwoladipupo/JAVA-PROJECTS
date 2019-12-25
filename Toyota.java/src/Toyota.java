							
							/* Toyota mini car lot has about 10 cars which comprises of 3 camry's, 3 corollas and 4 highlanders  */
							/* This software shows the use of object and classes, methods in making the user interact and make a good choice when buying a product*/
							//Creates a camry class and creates data in the class
							class Camry {
								String make;
								String price;
								String miles;
								boolean CarDetails;
								
								//creates a method for each camry's
								
								public void showCamry() {
									System.out.println(" Welcome to Toyota carlot!");
									
									
								}
								public void showCamry2() {
									System.out.println("Next camry loading .............");
									
								}
							
							}
							//creates a corolla class
							class Corolla {
							
								String make;
								String price;
								String miles;
								boolean CarDetails;
							
							}
							//creates a highlander class
							class Highlander {
								String make;
								String price;
								String miles;
								boolean CarDetails;
							
							}
							
							public class Toyota {
								//The main method where all methods and objects are invoked
							
								public static void main(String[] args) {
							
									Camry camry = new Camry();
									camry.make = " 2019 Black 4x4 ";
									camry.price = " $35,000 "; 
									camry.miles = " 2,000 ";
									
									camry.showCamry ();
									
									System.out.println(" The list of the camrys we have are: \n " + camry.make + " which costs " + camry.price + " and has"
											+ camry.miles + "mmiles");
									//creates objects and attached features to it.
	
									Camry camry2 = new Camry();
									camry2.make = " 2019 Red 4x4 ";
									camry2.price = " $42,000 ";
									camry2.miles = " 2,000 ";
							
									camry2.showCamry2();
									
									System.out.println("\n " + camry2.make + " which costs " + camry2.price + " and has"
											+ camry2.miles + "mmiles");
	
									
									Camry camry3 = new Camry();
									camry.make = " 2019 White 4x4 ";
									camry.price = " $38,000 ";
									camry.miles = " 2,000 ";
							
									Corolla corolla = new Corolla();
									corolla.make = " 2019 Black 4x4 ";
									corolla.price = " $25,000 ";
									corolla.miles = " 2,000 ";
							
									Corolla corolla2 = new Corolla();
									corolla2.make = " 2019 Red 4x4 ";
									corolla2.price = " $28,000 ";
									corolla.miles = " 2,000 ";
							
									Corolla corolla3 = new Corolla();
									corolla3.make = " 2019 White 4x4 ";
									corolla3.price = " $20,000 ";
									corolla3.miles = " 2,000 ";
							
									Highlander highlander = new Highlander();
									highlander.make = " 2019 Balck 4x4 ";
									highlander.price = " $45,000 ";
									highlander.miles = " 2,000 ";
							
									Highlander highlander2 = new Highlander();
									highlander2.make = " 2019 Red 4x4 ";
									highlander2.price = "$48,000 ";
									highlander2.miles = " 2,000 ";
							
									Highlander highlander3 = new Highlander();
									highlander3.make = " 2019 White 4x4 ";
									highlander3.price = "$47,000 ";
									highlander3.miles = " 2,000 ";
							
									Highlander highlander4 = new Highlander();
							
									highlander4.make = " 2019 Red 4x4 ";
									highlander4.price = "$48,000 ";
									highlander4.miles = " 2,000 ";
							
								}
							
							}
