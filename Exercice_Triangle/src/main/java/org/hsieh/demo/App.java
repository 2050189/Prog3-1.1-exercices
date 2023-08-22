package org.hsieh.demo;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Integer height = Integer.parseInt(args[0]);
        String star = "*";


        for(int i = 0; i<height; i++){
            System.out.println(star);
            for(int j = 0; j<i+1; j++){
                System.out.print(star);
            }

    }
    }


}
