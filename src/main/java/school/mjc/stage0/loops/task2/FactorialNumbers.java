package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter=0;
        int i=1;
        int fact=1;
        while (counter<=printToInclusive){
            if(counter==0){
                System.out.println(1);
            }
            while(i<=counter){
                fact*=i;
                System.out.println(fact);
                i++;
            }
            counter++;
        }

    }
}
