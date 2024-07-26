class MultiplicationTablee
 {
    void printTable() 
	{
       	 printTable(3);
   	 }
    void printTable(int number)
	 {
        	System.out.println("Multiplication table for " + number + ":");
        	for (int i = 1; i <= 10; i++) {
           	System.out.println(number + " x " + i + " = " + (number * i));
        }
                System.out.println(); 
    }

    public static void main(String[] args) 
	{
       		 MultiplicationTablee table = new MultiplicationTablee();
        	 table.printTable(3);  
        	 table.printTable(7);   
        	 table.printTable(9);  
        }
}
