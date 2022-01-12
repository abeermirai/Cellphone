package cellphone;

public class Cellphone { //super class
    private int pin; //variables
    private String model;
    
    public Cellphone(int pin, String model){ //normal constructor 
        this.pin=pin;
        this.model=model;
    }
    
    public void setpin(int pin){ //accessors (set), always uses void
        this.pin=pin;
    }
    public void setmodel(String model){
        this.model=model;
    }
    
    
    public int getpin(){ //mutators (get), always use the same datatype of the variables, its always parameterless and we write inside it only "return ...;"
        return pin;
    }
    public String getmodel(){
        return model;
    }
    
    public String toString(){ //toString to print, when the question says "display.." 
        return("Pin: " + pin + "\n" + "Model: " + model + "\n");
    }
    
    public  static class Appstore extends  Cellphone{ //create a sub class "Appstore" for the super "cellphone"
        private String color;//variables
        private String app;
        
        public Appstore(int pin, String model, String color, String app){
            super(pin, model); //because we have already did intilized it in the super class
            this.color=color;
            this.app=app;
        }
       
        public void setcolor(String color){ //accessor (set)
            this.color=color;
        }
        public void setapp(String app){
            this.app=app;
        }
        
        public String getcolor(){ //mutators (get)
            return color;
        }
        public String getapp(){
            return app;
        }
        
        public String toString(){
            return(super.toString() + "Color is: " + color + "\n "+ "App is: " + app);
        }
        
    }
    public static void main(String[] args) {
        Cellphone a1=new Cellphone(998, "AI");
        System.out.println(a1.toString()); 
        Appstore a2=new Appstore(998, "AI", "Purple", "Nebula");
        System.out.println(a2.toString());
    }
    
}
