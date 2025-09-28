package martins.mattheus.javaoneforall.javacore.Kenum.test;

import martins.mattheus.javaoneforall.javacore.Kenum.domain.Client;
import martins.mattheus.javaoneforall.javacore.Kenum.domain.PaymentType;
import martins.mattheus.javaoneforall.javacore.Kenum.domain.ClientType;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Pedro", ClientType.LEGAL_PERSON, PaymentType.CREDIT);
        Client client2 = new Client("Tiago", ClientType.NATURAL_PERSON, PaymentType.DEBIT);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));
        System.out.println(PaymentType.DEBIT.calculateDiscount(100));

        ClientType clientType = ClientType.getByReportValue("Pessoa Jurídica");
        System.out.println(clientType);
    }
}
