package testDemo;

public class TestDemo01 {

    public static void main(String[] args){
        int i = 1;
        while(i<5) {
            switch(i%2) {
                case 1:
                    System.out.println("1");
                case 0:
                    System.out.println("0");
                    i++;
            }
        }
    }
}


