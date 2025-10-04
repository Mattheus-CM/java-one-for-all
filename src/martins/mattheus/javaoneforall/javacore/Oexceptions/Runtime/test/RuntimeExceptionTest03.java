package martins.mattheus.javaoneforall.javacore.Oexceptions.Runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }

    private static String openConnection() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
            return "Conexão Aberta";
        } catch (Exception e) {
            System.out.println("");
            e.printStackTrace();
        } finally {
            System.out.println("Fechando arquivo");
        }
        return null;
    }
}
