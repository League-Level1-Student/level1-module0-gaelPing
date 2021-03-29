PImage pictureOfRecord;  
int pi=3;//as member variable
 
        void setup(){
          
    image(pictureOfRecord, 0, 0);
  
  }
       
       
       void rotateImage(PImage pictureOfRecord, int pi) {
        translate(width/2, height/2);
        rotate(pi*TWO_PI/360);
        translate(-pictureOfRecord.width/2, -pictureOfRecord.height/2);
    }
        
