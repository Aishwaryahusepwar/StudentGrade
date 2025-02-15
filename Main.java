import java.util.*;
	class student {
		 String name;
		double average;
		char grade;
		public student(String name,double average,char grade){
			this.name=name;
			this.average=average;
			this.grade=grade;
		}
		public void display(){
			System.out.println("Name:"+name+" average:"+average+" grade:"+grade);
		}
	}
	class Main {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number of stundets:" );
			int n=sc.nextInt();
			student s[]=new student[n];
			System.out.println("enter number of subjects:" );
			int num_sub=sc.nextInt();
			for(int i=0;i<n;i++){
				System.out.println("student"+(i+1)+":");
				System.out.println("Name:"  );
				String name=sc.next();
				int sum=0;
				int marks[]=new int[num_sub];
				System.out.println(" enter marks");
				for(int j=0;j<num_sub;j++){
					System.out.println("subject"+(j+1)+":");
					marks[j]=sc.nextInt();
					sum=sum+marks[j];
				}
				double avg=sum/num_sub;
				int highest=marks[0];
				int lowest=marks[0];
				for(int j=0;j<num_sub;j++){
					if(lowest>marks[j]){
						lowest=marks[j];
					}
					if(highest<marks[j]){
						highest=marks[j];
					}
				}
				System.out.println("Highest:"+highest);
				System.out.println("lowest:" +lowest);
				char grade;
		   
				if(avg>=90)
				grade='A';
				else if(avg>=80 && avg<90)
				grade='B';
				else if(avg>=70 && avg<80)
				grade='C';
				else if(avg>=60 && avg<70)
				grade='D';
				else if(avg>=50 && avg<60)
				grade='E';
				else
				grade='F';
				
				s[i]=new student(name,avg, grade);
			}
			System.out.println("stundet details");
			for(int i=0;i<n;i++){
				s[i].display();
			}
		}
	}