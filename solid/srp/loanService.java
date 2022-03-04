package solid.srp;

public class loanService {
    public void getLoanIntrestInfo(String LoanType){
        if(LoanType.equals("home loan")){
            System.out.println("rate of intrest is 5%");
        }
        if(LoanType.equals("personalLoan")){
            System.out.println("rate of intrest is 7%");

        }
        if(LoanType.equals("gold loan")){
            System.out.println("rate of intrest is 5%");
        }
    }
}
