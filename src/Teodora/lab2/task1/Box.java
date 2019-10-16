package Teodora.lab2.task1;

public class Box {
    public float height;
    public float width;
    public float depth;

    public Box(){
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    public Box(float parameter){
        this.height = this.width = this.depth = parameter;
    }

    public Box( float parameter1, float parameter2, float parameter3){
        this.height = parameter1;
        this.width = parameter2;
        this.depth = parameter3;
    }
    public float calculationArea(float height, float width, float depth){
        float Aria = 2 * (height*width + height*depth + width*depth);
        return Aria;
    }

    public float calculationVolume(float height, float width, float depth) {
        float Volume = height * width * depth;
        return Volume;
    }
}
