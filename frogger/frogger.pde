int hop = 15;
int x = 200;
int y = 350;
void setup(){
  size(400,400);
}
void draw(){
  background(255,255,255);
  fill(153,355,51);
  ellipse(x,y,15,15);
  walls();
}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
        y-=hop;
      }
      else if(keyCode == DOWN)
      {
        y+=hop;
      }
      else if(keyCode == RIGHT)
      {
        x+=hop;
      }
      else if(keyCode == LEFT)
      {
        x-=hop;
      }
   }
}
void walls()
{
  if(x<10)
  {
    x = 10;
  }
  else if(x>390)
  {
    x = 390;
  }
  if(y>390)
  {
    y = 390;
  }
  else if(y<10)
  {
    y = 10;
  }
}
class Car
{
 int x;
 int y;
 int speed; 
 Car(int x, int y, int speed)
 {
   this.x = x;
   this.y = y;
   this.speed = speed;
 }
  void display() 
  {
    fill(0,255,0);
    rect(Position of X, Position of Y,  Size of your Car, 50);
  }
}



  