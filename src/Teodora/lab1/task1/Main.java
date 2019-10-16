package Teodora.lab1.task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        Monitor object1 = new Monitor();
        object1.color = "Red";
        object1.height = 20;
        object1.width = 14;
        object1.resolution1 = 640;
        object1.resolution2 = 480;

        Monitor object2 = new Monitor();
        object2.color = "Blue";
        object2.height = 56;
        object2.width = 120;
        object2.resolution1 = 2048;
        object2.resolution2 = 1536;

        object1.compareDimensions(object1,object2);
        object1.compareSolution(object1,object2);

    }


}
