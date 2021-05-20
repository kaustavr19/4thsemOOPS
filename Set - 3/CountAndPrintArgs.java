public class CountAndPrintArgs {

	public static void main(String[] args) {
		 int i;
	        System.out.print(args.length + "\t");
	        for (i = 0; i < args.length; i++)
	            System.out.print(args[i].charAt(0));
	}

}
