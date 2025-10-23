public class main {
    public static void main(String[] args) {
        int examWeek = 3;
        String[][] matrix = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        for(int j = 0; j < matrix[j].length; j++){//selecting the cloumn
            int k = j - examWeek +1;
            for(int i = 0; i < matrix.length; i++){ //going through all the elements of the column
                
                String temp    = matrix[i][j];
                matrix[i][j] = matrix[k][j];
                matrix[k][j]   = temp;
                System.out.println(matrix[i][j] + " | ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < matrix.length; i++){
            for(int j =  0; j < matrix[i].length; j++){
                if("AA"== matrix[i][j]){
                    examWeek = j;
                }
            }
        }
        System.out.println(examWeek + "is the examweek");
    }
}
