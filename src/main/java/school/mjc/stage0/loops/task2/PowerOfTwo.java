package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter=0;
        int i=1;
        int fact=1;
        while (counter<=power){
            if(counter==0){
                System.out.println(1);
            }
            while(i<=counter){
                fact*=2;
                System.out.println(fact);
                i++;
            }
            counter++;
        }
        if(power<0){
            System.out.println("too much power");
        }

    }
}
