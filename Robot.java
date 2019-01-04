/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StepicTasks;
  
public class Robot {
    int x=0;
    int y=0;
    Direction direction = Direction.UP;
public Robot(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
}
    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        System.out.println("Поворот против часовой стрелки");
        if (direction == Direction.DOWN){
            this.direction = Direction.RIGHT;
            return;
        }
        
        if (direction == Direction.UP){
            this.direction = Direction.LEFT;
            return;
        }
        
        if (direction == Direction.LEFT){
            this.direction = Direction.DOWN;
            return;
        }
        
        if (direction == Direction.RIGHT){
            this.direction = Direction.UP;
            return;
        }
    }

    public void turnRight() {
        System.out.println("поворот по часовой стрелке");
        if (this.direction == Direction.DOWN){
            System.out.println("Вниз -> влево");
            this.direction = Direction.LEFT;
            return;
        }
        
        if (this.direction == Direction.UP){
            System.out.println("Вверх -> вправо");
            this.direction = Direction.RIGHT;
            return;
        }
        
        if (this.direction == Direction.LEFT){
            System.out.println("Влево -> вверх");
            this.direction = Direction.UP;
            return;
        }
        
        if (this.direction == Direction.RIGHT){
            System.out.println("Вправо -> вниз");
            this.direction = Direction.DOWN;
            return;
        }
    }

    public void stepForward() {
        System.out.println("движение");
        if (direction == Direction.DOWN){
            System.out.println("вниз");
            this.y--;
        }
        
        if (direction == Direction.UP){
            System.out.println("вверх");
            this.y++;
        }
        
        if (direction == Direction.LEFT){
            System.out.println("налево");
            this.x--;
        }
        
        if (direction == Direction.RIGHT){
            System.out.println("направо");
            this.x++;
        }
    
    }

      private enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
       public static void moveRobot(Robot robot, int toX, int toY) {
   System.out.println("Куда нада  "+toX + " "+toY);
    System.out.println("А щас "+robot.getX()+ " " + robot.getY());
    while (robot.getX()<toX) // Идем Направо
    {
        while(!(robot.getDirection()==Direction.RIGHT))
              {
                  robot.turnRight();
              }
              robot.stepForward();
    }
    
   while (robot.getX()>toX)   // Идем налево
    {
        while(!(robot.getDirection()==Direction.LEFT))
              {
                  robot.turnRight();
              }
              robot.stepForward();
    }
   while (robot.getY()<toY)   // Наверх
    {
        while(!(robot.getDirection()==Direction.UP))
              {
                  robot.turnRight();
              }
              robot.stepForward();
    }
   while (robot.getY()>toY)   // Вниз тоже можна схоить
    {
        while(!(robot.getDirection()==Direction.DOWN))
              {
                  robot.turnRight();
              }
              robot.stepForward();
    }
    System.out.println("Cтала: "+robot.getX()+" "+robot.getY());
   
}
}
    

