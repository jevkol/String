class ArrayChar{
 public static void main(String[] args){
  
  String stroka = "('a', 'b', 'c', 'd', '1', '2', '3', ''')";
  char[] stroka1 = stroka.toCharArray();
  StringBuffer stroka2 = new StringBuffer();
  System.out.println();
  System.out.println("Incoming line: " +stroka);
  
   for(int i=0; i<stroka1.length-2; i++){
      if((stroka1[i] == '\047') && (stroka1[i+2] == '\047'))
        stroka2=stroka2.append(stroka1[i+1]);


    }  
   System.out.println();  
   System.out.print("Line after transformation: " +stroka2);
   System.out.println();
 }


}