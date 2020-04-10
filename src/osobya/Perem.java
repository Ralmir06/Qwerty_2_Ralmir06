//В этом классе содержатся все основные переменные с которыми будет работать текстовый квест. В теории больше перемен не нужно... Ну... Наверное.
//Обращения к этому классу должны происходить каждый раз при переходе в новую "комнату". Обнуляя переменные. 
//Все более важные переменные будут либо сохраняться в файлах, либо в другом классе. Но и там ненадолго. 

// Переход меняет переменные в классе Perem и, таким образом осуществляет передвижения игрока между "комнатами" квеста.
// В случае отсутствия файла с этим индвидуальным номером вызываются события класса Sintez. 

package osobya;

public class Perem {
	public static int T=0;
	public static int [] varianty=new int[10]; 
	public static int V=0;
	public String V1;
	public String V2;
	public String V3;
	public String V4;
	public String V5;
	public String V6;
	public String V7;
	public String V8;
	public String V9;
		
	public static int W;
	public int Varianty[];
	
}
