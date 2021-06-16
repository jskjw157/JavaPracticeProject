package part3.ex4.UI코드분리하기;

import java.util.Scanner;

public class ExamConsole {
	
	// composition Has A 일체형
	private ExamList list;
	
	public ExamConsole() {
		list = new ExamList();
	}
	
	public void inputList() {
		Scanner scan = new Scanner(System.in);
    	
    	System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  입력         │");
        System.out.println("└───────────────────────────┘");
        System.out.println();
        
        int kor, eng, math;
        
        do {
        	System.out.printf("국어 : ");
        	kor = scan.nextInt();
        	
        	if(kor < 0 || 100 < kor)
        		System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
        	
        }while(kor < 0 || 100 < kor);
        
        do {
        	System.out.printf("영어 : ");
        	eng = scan.nextInt();
        	
        	if(eng < 0 || 100 < eng)
        		System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
        	
        }while(eng < 0 || 100 < eng);
        
        do {
        	System.out.printf("수학 : ");
        	math = scan.nextInt();
        	
        	if(math < 0 || 100 < math)
        		System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
        	
        }while(math < 0 || 100 < math);
        /*
        Exam exam = new Exam();
        exam.setKor(kor);//exam.kor = kor;
        exam.setEng(eng);//exam.eng = eng;
        exam.setMath(math);//exam.math = math;
        */
        
        Exam exam = new Exam(kor,eng,math);
        
        list.add(exam);
		
	}
	
	public void printList() {
		printList(list.size());
		
	}
	
	public void printList(int size) {
		
		System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  출력                   │");
        System.out.println("└───────────────────────────┘");
        System.out.println();		        
		
        //int size = list.current;
        
        
        for(int i=0; i<size; i++) {
	        Exam exam = list.get(i);//exams[i];
	        int kor = exam.getKor();//exam.kor;
	        int eng = exam.getEng();//exam.eng;
	        int math = exam.getMath();//exam.math;
	        
	        int total = exam.total(); // eng+kor+math;
	    	float avg = exam.avg(); // total/3.0f;
	    	
	    	System.out.printf("국어 : %d\n", kor);	
	    	System.out.printf("영어 : %d\n", eng);
	    	System.out.printf("수학 : %d\n", math);
	        
	        System.out.printf("총점 : %3d\n", total);
	        System.out.printf("평균 : %6.2f\n", avg);
	        System.out.println("─────────────────────────────");
        }
		
	}
	
}
