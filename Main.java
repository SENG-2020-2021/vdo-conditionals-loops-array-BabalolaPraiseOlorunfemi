class Main {
  public static void main(String[] args) {
        //kindly use appropriate data types for your declaration


        //declare an array variable and assign the days of the month debtor defaulted,
        byte[] defaultedDaysofMonth ={1,2,3,4,5,6,7,8,};


        // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
        float amountPerDay = 100f;
        float amountPaid = 500f;


        // declare all the variables needed for your calculations
        byte daysPaidFor=0;
        float totalToPay=0f;
        float mod;
        float extra;
        float leftToPay;
        byte amountOfDays=0;
        float tempo = amountPaid;


        // calculate and print total amount the debtor is to pay using for each loop
        for(byte x : defaultedDaysofMonth){
            totalToPay+=  amountPerDay;
            amountOfDays++;
        }
        System.out.println("The total amount to pay:"+totalToPay);


        // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day.
        for(int i=0; i<amountOfDays; i++){
            if(tempo >= amountPerDay){
                tempo-=amountPerDay;
                daysPaidFor++;
            }

            else if(tempo < amountPerDay){
                break;
            }

        }
        System.out.println("The amount of days you paid for:" +daysPaidFor+"\n");

        for(int i=0;i<daysPaidFor; i++){
            System.out.println("day "+ defaultedDaysofMonth[i]+" was paid for");
        }

        mod = amountPaid%amountPerDay;

        if(mod>0 && amountPaid < totalToPay){
            System.out.println("day "+ defaultedDaysofMonth[daysPaidFor]+" was not completely paid for and you have to pay " + (amountPerDay-mod) + " to complete it.");
        }




        // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
        if(amountPaid<totalToPay){
            leftToPay=totalToPay-amountPaid;
            System.out.println("The amount left to pay :"+leftToPay);
        }

        else if(amountPaid==totalToPay){
            System.out.println("You have paid the exact amount needed!!");
        }

        else {
            extra  = amountPaid-totalToPay;
            System.out.println("The amount that you have left:" +extra);
        }
  }
}