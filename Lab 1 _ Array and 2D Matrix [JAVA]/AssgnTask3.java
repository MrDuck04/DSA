//Assignment Task 03: Game Arena
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
   public static void playGame( Integer[][] arena ){

        //For this task you don't need to create any new 2D array
        //just print the result inside the function
        
        //TO DO
        int points = 0;
        //int rows = arena.length;
        for (int r = 0; r < arena.length; r++) {
            
            //int cols = arena[r].length;
            for (int c = 0; c < arena[r].length; c++) {

                if (arena[r][c] != 0 && arena[r][c] % 50 == 0) {
                    
                    if (r - 1 >= 0 && c < arena[r-1].length && arena[r-1][c] == 2) {
                        points += 2;
                    }
                    
                    if (r + 1 < arena.length && c < arena[r+1].length && arena[r+1][c] == 2) {
                        points += 2;
                    }
                    
                    if (c - 1 >= 0 && arena[r][c-1] == 2) {
                        points += 2;
                    }
                    
                    if (c + 1 < arena[r].length && arena[r][c+1] == 2) {
                        points += 2;
                    }
                }
            }
        }

        if (points >= 10) {
            System.out.print("Points Gained: " + points + ". Your team has survived the game.\n");
        } else {
            System.out.print("Points Gained: " + points + ". Your team is out.\n");
        }
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}
