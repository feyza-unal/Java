package day28abstraction;

import java.io.*;
/*
interview  sorusu !!!
"throw" ile "throws" arasindaki farklar nelerdir ?


 */
public class ReadFileLineByLine {
    public static void main(String[] args) {
        readFileLineByLine();  // bunu yazmazsak calismaz
    }
    public static void readFileLineByLine(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/day27exceptions/File1.txt"));
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();  // satir satir okutuyoruz
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis yada dosya silinmis - "+ e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak karakter veya karakterler var -"+ e.getMessage());
        }

    }
}
