package games;


public class LightsOut {
    
    //Field
    private boolean [][] grid;
    
    //Construtor
    public LightsOut(int size){
        grid = new boolean [size][size];
        
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                grid[i][j] = false;
            }
        }
    }
    
    //Gerar instancias aleatorias
    public void randomize(){
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (Math.random() > 0.5)
                grid[i][j] = true;
            }
        }
    }
    
    public void toggle(int x, int y){
        grid[x][y] = !grid[x][y];
        
        
        if (x < grid.length - 1){
            grid[x + 1][y] = !grid[x + 1][y];
        }
        
        if (x > 0){
            grid[x - 1][y] = !grid[x - 1][y];
        }
        if (y < grid.length - 1){
            grid[x][y + 1] = !grid[x][y + 1];
        }
        if (y > 0){
            grid[x][y - 1] = !grid[x][y - 1];
        }
    }
    
    
    //Instancia resolvida
        public boolean isSolved(){
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j]){
                return false;
            }
        }
    }
        return true;
        }
    
    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j]){
                    s+= " 1 ";
                } else{
                    s+= " 0 ";
                }
            }
            s += "\n";
        }
        return s;
    } 

}
