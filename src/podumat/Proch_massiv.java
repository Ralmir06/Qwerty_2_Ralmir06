//������ ����� ������ ���� ���������� (��� ��� ����� ������� ����������?), ������� �������� � �������� Varianty[] � ����������� ���������� ����� �������� ������� 
//� ���������� ��������� ���������� W.

package podumat;

import osobya.Perem;

public class Proch_massiv {
	public static int max_index=0;
	public static void proch_massiv() {
	/*	System.out.println();
		System.out.println("������ � �������� ��������� ��������� ���������!");
		System.out.println();
	*/
		int max_element=Perem.varianty[0];
		int i=0;
		for(i=0;i<Perem.varianty.length;i++){
		//	System.out.println("�������� ���� for");
		//	System.out.println("������ � ���� ����������: "+Perem.varianty[i]+" � "+max_element);
            if(Perem.varianty[i]>=max_element){
            	max_element=Perem.varianty[i];
                Proch_massiv.max_index=i;
        //        System.out.println("������ ������������ ������� �������� ���:"+max_element);
                
            }
           
		}
		
	}
}
