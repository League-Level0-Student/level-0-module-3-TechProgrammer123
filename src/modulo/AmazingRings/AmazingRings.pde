 float x1 = 650;
 float x2 = 150;
float move = .8;
 void setup(){
       size(800, 800);

    }

    void draw(){
background(#FFFFFC);
      int size =5;
      for (int i = 15; i > 0; i--){

        if(i %2 == 0){
            noFill();
        }
        else{
 noFill();
        }
        ellipse(x1,275, size, size);
size -= 20;
    }
     size = 5;
         for (int i = 15; i > 0; i--){

        if(i %2 == 0){
            noFill();
        }
        else{
 noFill();
        }
        ellipse(x2, 275, size, size);
size -= 20;
  }
if (x1 <= 0||x1 >= 800){
  move*=1;
}



x1 -= move;
x2 += move;
}