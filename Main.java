public class Main {

    public static void main(String[] args) {
    	CCuenta operativa;
		operativa = new CCuenta("Antonio L�pez","1000-2365-85-1230456789",2500,0);
		try {
			operativa.operativa_cuenta("Antonio L�pez","1000-2365-85-1230456789",2500,0);
		} catch (Exception e) {
            System.out.print("Fallo al operar");
        }
    }
}
