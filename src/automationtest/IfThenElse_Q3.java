package automationtest;

public class IfThenElse_Q3 {
        public boolean isTeen(int age){
            if(age <=18){
                return true;
            }else {
                return false;
            }
    }

    public static void main(String[] args) {
        IfThenElse_Q3 t =new IfThenElse_Q3();
        System.out.println(t.isTeen(15));
        System.out.println(t.isTeen(25));

        }

    }



