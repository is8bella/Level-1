int x = 250;
int y = 450;
double yvel = 0;
double gravity = 1;
int pipex = 450;
int random = 350;
int pipel = 90;
int pipey = 0;
int text = 0;
boolean intersects(int x, int y, int pipex, int random, int pipel) {
if (y > random - 4 && x > pipex && x < pipex + pipel)
   return true;
else
  return false;
}
int newpip = 350;

void setup(){
  size(500,900);
}

void draw(){
  background(43,215,242);
  fill(252,252,55);
  ellipse(x,y,50,50);
  fill(43,215,77);
  rect(pipex,random,pipel,900);
  yvel+=gravity;
  y+=yvel;
  pipex-=2;
  if(pipex<=5){
  pipex = 450;
  random = (int) random(90, 890);
  newpip = random;
  text++;
  }
  fill(43,215,77);
  rect(pipex,pipey,pipel,newpip-200);
  fill(240,237,134);
  rect(900,890,500,10);
  if(intersects(x, y, pipex, random, pipel)){
  exit();
  }
  if(x > pipex && x < pipex + pipel && y < newpip-200 && y > 0){
    exit();
  }
  if(y>=900){
  exit();
  }
  fill(0,0,0);
  textSize(36);
  text(text, 250, 50);
}
void mousePressed(){
  yvel = -10;
}