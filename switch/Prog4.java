public class Prog4 {
    public static void main(String args[]){

        System.out.println("Farm");
        String str="black soil";

        switch(str){

            case "black soil":{
                String str1 = "ranny";

                switch(str1){
                    case "sunny":{
                        System.out.println("jawar\nsunflower\ncitrus");
                        break;
                    }

                    case "ranny":{
                        System.out.println("sugarcane\n wheat\n rice");
                        break;
                    }
                      
                }
                break;
            }
            
            case "red soil":{
                String str1 = "sunny";

                switch(str1){
                    case "sunny":{
                        System.out.println("millet\n gram\n ");
                        break;
                    }

                    case "ranny":{
                        System.out.println("sugarcane\n wheat");
                        break;
                    }
                }
                break;
            }

            default: 
              System.out.println("invalid input");
        }
    }
}
