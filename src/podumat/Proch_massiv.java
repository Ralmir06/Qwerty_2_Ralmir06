//Данный класс должен быть процедурой (или это здесь функция называется?), которая работает с массивом Varianty[] и присваивает порядковый номер элемента массива 
//с наибольшим значением переменной W.

package podumat;

import osobya.Perem;

public class Proch_massiv {
	public static int max_index=0;
	public static void proch_massiv() {
	/*	System.out.println();
		System.out.println("Сейчас я выполняю процедуру выявления максимума!");
		System.out.println();
	*/
		int max_element=Perem.varianty[0];
		int i=0;
		for(i=0;i<Perem.varianty.length;i++){
		//	System.out.println("Запускаю цикл for");
		//	System.out.println("Сейчас я буду СРАВНИВАТЬ: "+Perem.varianty[i]+" и "+max_element);
            if(Perem.varianty[i]>=max_element){
            	max_element=Perem.varianty[i];
                Proch_massiv.max_index=i;
        //        System.out.println("Сейчас маскимальный элемент выглядит так:"+max_element);
                
            }
           
		}
		
	}
}
