package ftd_8_10;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class day3 {
	static File file;
	final static JFileChooser fc = new JFileChooser();
	public static void main(String[] args) throws Exception  {
		fc.showOpenDialog(null);
	try{
		file = fc.getSelectedFile();
	}
	catch(NullPointerException e){
		file= null;
		
	}
	System.out.println("here");	
	if(!(file==null)){
	
		if(!file.exists()){
			
			file.createNewFile();
			Student stu = new Student("stu","Tennesse","Memphis");
			BufferedWriter write = new BufferedWriter(new FileWriter(file));
			write.write(stu.toString());
			write.close();
			
		}
		else{
			Scanner sc= new Scanner(file);
			while(sc.hasNext()){
				Student stu =new Student(sc.next(),sc.next(),sc.next());
				System.out.println(stu.toString());
			}
			sc.close();
		}
			
		}
		
		}
	}


