// �������� ������������ ���������  Skasat.
// ��� ������������ �4. ����� ������ ���� �������� ���������� ������. ��� ����� �� ���� � ����� ������� ����� ���� � ����, ��� � ��������� � 2. 
// ����� ����� ��������� ������ � ������ ��� ����� (�� �������-�������) �� Slova+. ������������� ����. 

package skasat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

import osobya.Perem;
import podumat.Prochedura_1;
import podumat.Prochedura_2;
import podumat.Prochedura_3;

public class Perezapis_p4 {
	//Podumat.predl
	//Prochedura_1.slova
	public static int [] slova_plus; //��� ����� ������ ��������� ������� slova_plus!
	
	public static void perezapis() {
		System.out.println("�������� ������� ������������� ����������. ������� � ������ ������ ��������! ");
		//Prochedura_1.slova
			for (int i = 0; i < Prochedura_1.slova.length; i++) {
		System.out.print("������������� ����������: \""+Prochedura_1.slova[i]+"\". ");
			
		//Prochedura_1.slova[i]=Prochedura_1.slova[i]+"T"+Perem.T;  // ����� ������� ������ ����� ����� ������ ����������������, ��� �������� ������� �����+... �� � ������ "�������" ��� �� �����.
				
		String path = "src//fails//Slovar"; // ��� �� ��������� � ���������. ���� ������� �������
		File file_slov = new File(path);
		String sear =Prochedura_1.slova[i];
	Scanner scanner_slov;
	try {
		scanner_slov = new Scanner(file_slov);
		boolean flag_slova=false;
		
        while (scanner_slov.hasNext()) {
            String search = scanner_slov.next();
            //System.out.println("��� �� ������, ��� �� ���������:"+search);

            if (search.equalsIgnoreCase(sear)) {
                System.out.println("������� ����������: " +search);
                
                scanner_slov = new Scanner(file_slov);
        		String line_slov = scanner_slov.nextLine();
        		//System.out.println("line_slov "+line_slov);
        		int poz_slova = line_slov.indexOf(" "+Prochedura_1.slova[i])+1;
        		System.out.println(Prochedura_1.slova[i]);
        		System.out.println("������� ����������: "+poz_slova);
        		int razmer = Prochedura_1.slova[i].length();
        		System.out.println("������ ����������: "+razmer);
        		int stopor=line_slov.indexOf("ST"+Prochedura_1.slova[i])+-1;
        		System.out.println("������� �������: "+stopor);
        		System.out.println("������� ������� �������: "+poz_slova+razmer+20);
        		String line_slova = line_slov.substring(poz_slova+razmer+1,stopor);
        		//System.out.println("liniya_slova");
        		//System.out.println(line_slova);
        		
        		int[] evolvo_plus = Arrays.stream(line_slova.split(",")).mapToInt(Integer::parseInt).toArray(); // ��� ����� ������ slova_plus!
        		String evolvo_do=Prochedura_1.slova[i]+" "+evolvo_plus[0]+","+evolvo_plus[1]+","+evolvo_plus[2]+","+evolvo_plus[3]+","+evolvo_plus[4]+","+evolvo_plus[5]+","+evolvo_plus[6]+","+evolvo_plus[7]+","+evolvo_plus[8]+","+evolvo_plus[9];
        		System.out.println("������ ��� ���������: "+evolvo_do);
    
        		evolvo_plus[Perem.W]=evolvo_plus[Perem.W]+1; // ��� ����� �����������!
        		System.out.print("������ ��� ����������: ");
        		String evolvo_posle=Prochedura_1.slova[i]+" "+evolvo_plus[0]+","+evolvo_plus[1]+","+evolvo_plus[2]+","+evolvo_plus[3]+","+evolvo_plus[4]+","+evolvo_plus[5]+","+evolvo_plus[6]+","+evolvo_plus[7]+","+evolvo_plus[8]+","+evolvo_plus[9];
        		System.out.println(evolvo_posle);
        		flag_slova=true;
        		
        		System.out.println("����������� ����� ��� ����������: "+line_slov);
        		System.out.println("����������� ������������� ����������!!!");
        		line_slov=line_slov.replaceAll(evolvo_do,evolvo_posle);
        		System.out.println("��� ��� ������ ���������� � ����: "+line_slov);
        		

        		try(FileWriter writer = new FileWriter("src//fails//Slovar", false)) {
        		// ������ ���� ������
        		String text = line_slov;
        		writer.write(text);
        		// ������ �� ��������
        		
        		writer.flush();
        		}
        		catch(IOException ex){
        			System.out.println(ex.getMessage());
        		} 
                
            } 
            else  {
                //System.out.println("������ ����� ��������� �� �����.");
            	  }  
        }

        if (flag_slova==true) {
        	System.out.println("���� ������, ������ � ��� �������");
        	flag_slova=false;
        }
        else { 
        	String text = " "+Prochedura_1.slova[i]+" "+"0,0,0,0,0,0,0,0,0,0"+" "+"ST"+Prochedura_1.slova[i];
        	System.out.println("���� ������, � ������ ������ ����� ��� � �������.");
        	System.out.println("�������� ����� � ����� �������.");
	   	 	try {
	   	 		Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
	   	 	}
	   	 	catch (IOException e) {
	   	 		System.out.println(e);
	   	 	}
        }
        scanner_slov.close();			 		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
			System.out.println(Arrays.toString(Prochedura_1.slova));
	}
	


}
