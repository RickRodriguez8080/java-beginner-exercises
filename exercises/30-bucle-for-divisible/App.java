/* This is a simple Java program. */
class App
{
   
    public static void main(String[] args) {
        
        int num=1;
		 
        //Definimos el bucle, incluye el 100
         for (int num=1;num<=100;num++){
            if (num%5==0 || num%3==0){
                System.out.println(num);
            }
            //Incrementamos num
            num++;
        }
    }
    
}
