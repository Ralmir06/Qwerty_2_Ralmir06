//¬ этом классе содержатс€ все основные переменные с которыми будет работать текстовый квест. ¬ теории больше перемен не нужно... Ќу... Ќаверное.
//ќбращени€ к этому классу должны происходить каждый раз при переходе в новую "комнату". ќбнул€€ переменные. 
//¬се более важные переменные будут либо сохран€тьс€ в файлах, либо в другом классе. Ќо и там ненадолго. 

// ѕереход мен€ет переменные в классе Perem и, таким образом осуществл€ет передвижени€ игрока между "комнатами" квеста.
// ¬ случае отсутстви€ файла с этим индвидуальным номером вызываютс€ событи€ класса Sintez. 

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
