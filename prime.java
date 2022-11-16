/** W: 2/11/22 */
import javax.swing.JOptionPane;
class prime{
	public static void main(String args[]){
		String num = JOptionPane.showInputDialog("Enter the ending number : ");
		int end_num = Integer.parseInt(num);
		for(int i=2;i<=end_num;i++){
			int factors_count = 0;
			for(int j = 2;j < i;j++){
				if(i % j == 0){
					factors_count++;	
				}
				
			}
			if(factors_count == 0){
				/** JOptionPane.showMessageDialog(null,i+ " is a prime number"); */
				System.out.println(i+ " is a prime number");
			}
		}
	}
}

https://ctxt.io/2/AAAQFTHhEw