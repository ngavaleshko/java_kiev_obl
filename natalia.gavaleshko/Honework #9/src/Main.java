import entity.Client;
import exception.WrongFieldException;
import exception.WrongSumException;
import service.TransactionService;

import java.util.Scanner;

import static util.Helper.accountIdChecker;
import static util.Helper.checkSum;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client client;
        String accountIdSender;
        String accountIdReceiver;
        double sum;
        boolean isValid = true;
        TransactionService transactionService = new TransactionService();
        do {
            System.out.println("Enter plz AccountId for sender");
            accountIdSender = scanner.next();

        } while (isAccountIdValid(accountIdSender));
        client = new Client(accountIdSender);

        do {
            System.out.println("Enter plz AccountId for receiver");
            accountIdReceiver = scanner.next();
        } while (isAccountIdValid(accountIdReceiver));


        System.out.println("Enter sum to transfer");
        while (isValid) {
            try {
                sum = Double.parseDouble(scanner.next());
                checkSum(sum);
                isValid = false;
                client.setSum(sum);
            } catch (WrongSumException | NumberFormatException e) {
                System.out.println("Enter valid sum again");
            }
        }
        transactionService.moneyTransfer(client, accountIdReceiver);
        System.out.println("Successful transaction!!!You sent " + client.getSum());
    }

    private static boolean isAccountIdValid(String accountId) {
            try {
                accountIdChecker(accountId);
                return false;
            } catch (WrongFieldException e) {
                System.out.println("Invalid accountId, lengths should be 10");
            }
        return true;
    }
}

