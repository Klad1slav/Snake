package test.clocks;
import test.actions.CollisionNew;
import test.game.Snake;

public class GameClock extends Thread{
    public static boolean running = true;

    public void run(){
        while(running){
            try{
                sleep(200);
                Snake.move();
                Snake.waitToMove = false;
                CollisionNew.collidePickUp();
                if (CollisionNew.collideSelf()){
                    Snake.tails.clear();
                    Snake.score = 0;
                }
                if (CollisionNew.collideWall()){
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    Snake.score = 0;

                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
