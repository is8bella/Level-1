int hop = 15;
int x = 200;
int y = 350;
int speed = 1;
Car car1 = new Car(200, 20, speed);
Car car2 = new Car(200, 80, speed++);
Car car3 = new Car(200, 140, speed+=2);
Car car4 = new Car(200, 200, speed--);
boolean intersects(Car car) {
if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize()))
          return true;
    else 
        return false;
}

void setup(){
  size(400,400);
}
void draw(){
  background(255,255,255);
  fill(153,355,51);
  ellipse(x,y,15,15);
  walls();
  car1.display();
  car1.moveleft();
  car2.display();
  car2.moveright();
  car3.display();
  car3.moveleft();
  car4.display();
  car4.moveright();
  intersects(car1);
  intersects(car2);
  intersects(car3);
  intersects(car4);
  if(intersects(car1)||intersects(car2)||intersects(car3)||intersects(car4))
  {
    x = 200;
    y = 350;
  }
  if(y<=20)
  {
    x = 200;
    y = 350;
    speed++;
    car1 = new Car(200, 20, speed--);
    car2 = new Car(200, 80, speed);
    car3 = new Car(200, 140, speed++);
    car4 = new Car(200, 200, speed);
  }
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
 int size = 50;
 Car(int x, int y, int speed)
 {
   this.x = x;
   this.y = y;
   this.speed = speed;
 }
  void display() 
  {
    fill(0,0,0);
    rect(x, y, 100, size);
  }
  void moveleft()
  {
    x-=speed;
    if(x<0){
      x = 400;
    }
  }
  void moveright()
  {
    x+=speed;
    if(x>400)
    {
      x = 0;
    }
  }
  int getX()
  {
    return x;
  }
  int getY()
  {
    return y;
  }
  int getSize()
  {
    return size;
  }
}



  