package martins.mattheus.javaoneforall.javacore.Kenum.domain;

public enum ClientType {
    NATURAL_PERSON(1, "Pessoa Física"),
    LEGAL_PERSON(2, "Pessoa Jurídica");

    public final int VALUE;
    public final String REPORT_VALUE;

    ClientType(int value, String reportValue) {
        this.VALUE = value;
        this.REPORT_VALUE = reportValue;
    }

    public static ClientType getByReportValue(String reportValue) {
        for (ClientType clientType: values()) {
            if (clientType.REPORT_VALUE.equals(reportValue)) {
                return clientType;
            }
        }
        return null;
    }
}
