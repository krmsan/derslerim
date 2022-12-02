package ders37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {
    public static void main(String[] args) {//throws FileNotFoundException             throws IOException
        String dosyayolu="src/ders36_checkedExceptions/deneme.txt";

        int k=0;

        try {
            FileInputStream fis=new FileInputStream(dosyayolu);
            while ((k=fis.read())!=-1){//throws IOException olustu. method signature dedik read in ustune gelip
                System.out.print((char) k);
            }// bunu ezberlemene gerek yok ihtiyacın olursa bakarsın

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e); bunu siliyoruz
            System.out.println("dosya yolu yanlıis veya arızalıl");

        }catch (IOException e){
            System.out.println("dosya okuma yazma ile ilgili bir sorun var");
        }


    }
}
