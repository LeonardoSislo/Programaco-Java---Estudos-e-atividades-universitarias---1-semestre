
package vetor_exprova;

public class Principal {

   
    
    public static void main(String[] args) {

         int mtz[][] = new int[3][];
         
         mtz[0] = new int [2];
         mtz[1] = new int [5];
         mtz[2] = new int [3];
         
         mtz [0][0] = 1;
         mtz [0][1] = 2;
         
         mtz [1][0] = 3;
         mtz [1][1] = 4;
         mtz [1][2] = 5;
         mtz [1][3] = 6;
         mtz [1][4] = 7;
         
         mtz [2][0] = 8;
         mtz [2][1] = 9;
         mtz [2][2] = 10;
         
         int i, j;
            for (i = 0; i < mtz.length; i++){
                
                System.out.printf("%dª linha ", (i+1));
                
                    for (j = 0; j < mtz[i].length; j++){
                        
                        System.out.printf("%d ", mtz[i][j]);
                        
                    }
                        
                    System.out.println("");
                    
            }
         
         
        
        
           
    }
    
}
