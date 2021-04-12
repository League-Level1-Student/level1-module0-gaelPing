int x=100;
int y=100;
void setup(){

  size(700, 700);
  background(0,0,0);
 
}
 void draw(){  

 for ( int i = 300; i > 0; i-=2){
  ellipse(x,y,10,10);
  x+=10;
  y+=10;
}
 
 
 
 
 }
 
 
 
 
 
