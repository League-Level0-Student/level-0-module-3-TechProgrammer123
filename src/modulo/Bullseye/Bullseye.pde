
    void setup(){
       size(600,600);

    }

    void draw(){
 int size =200;
      for (int i = 10; i > 0; i--){

        if(i %2 == 0){
            fill(#FC0008);
        }
        else{
        fill(#0000FF);
        }
        ellipse(300,300, size, size);
size -= 20;
    }
  }