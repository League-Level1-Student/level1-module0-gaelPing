int y=10;

int randomNumber = (int) random(width);
int score;
void setup(){
  
size(500,500);
}

void draw(){
if(y==500){
  y=10;
randomNumber = (int) random(width);
}
else{
y+=2;
}


background(100,100,100);
fill(50, 100, 200);
stroke(0, 0, 0);
ellipse(randomNumber, y, 30, 50);
 rect(mouseX, 400, 100, 75);
   fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
  
}

 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
