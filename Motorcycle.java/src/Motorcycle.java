							
							/*creates a motorcycle class */
							/*create a java application that creates a new instances of the motorcycle class and shows the instances variables */
							/*This is a Motorcycle application for students to understands how object and classes works */
							class Motorcycle {
								// Created the needed strings
							
								String make;
								String color;
								boolean engineState;
							
							// The main method
								public static void main(String[] args) {
									// This is the compiler code
									Motorcycle m = new Motorcycle();
									m.make = "Yamaha RZ350";
									m.color = "Yellow";
									System.out.println("Calling showAtts....");
									m.showAtts();
									System.out.println("-----");
									System.out.println("starting Engine.......");
									m.startEngine();
									System.out.println("------");
									System.out.println("Calling showAtts.....");
									m.showAtts();
									System.out.println("------");
									System.out.println("starting Engine");
									m.startEngine();
							
								}
							
							//Creates a void method startEngine which can be found in the main method above
							
								private void startEngine() {
									// attach a condition in this method
									if (engineState == true)
										System.out.println("The engine is alreaddy on.");
									else {
										engineState = true;
										System.out.println("The engine is now on.");
							
									}
							
								}
							
							//creates a void method showAtts which can be found in the main method
								private void showAtts() {
									// attach condition in this method.
							
									System.out.println("The motorcycle is a " + color + " " + make);
							
									if (engineState == true)
										System.out.println("The engine is on");
									else
										System.out.println("The engine is off.");
							
								}
							
							}
