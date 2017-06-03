int x = 250;
int y = 450;
double yvel = 0;
double gravity = 1;
int pipex = 350;
void setup(){
  size(500,900);
}

void draw(){
  background(43,215,242);
  fill(252,252,55);
  ellipse(x,y,20,20);
  fill(43,215,77);
  rect(x,350,90,900);
  yvel+=gravity;
  y+=yvel;
 
}

void mousePressed(){
  yvel = -10;
}