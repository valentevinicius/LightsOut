package games;
import java.util.Scanner;

public class Main {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        LightsOut game = new LightsOut(5);
        game.randomize();
        System.out.println(game);
        while(!game.isSolved()){
            System.out.println("X? ");
            int x = sc.nextInt();
            System.out.println("y? ");
            int y = sc.nextInt();
            try {
                game.toggle(x, y);
            } catch (ArrayIndexOutOfBoundsException aioobe){
                System.out.println("\nFora dos limites, tente novamente\n");
            }
        System.out.println(game);
    }
    
}
