public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 11;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if(temp <= -1){
            forecast = "Prognoza jest ZAMRAŻAJĄCA! Zostań w domu!";
        }else if(temp <= 10){
            forecast = "Prognoza jest chłodna. Noś płaszcz!";
        }else{
            forecast = "Jest Ciepło. Wyjdź na zewnątrz!";
        }
        
        
        System.out.println(forecast);
    }
}
 