package lesson3;

public class Main {
	public static void main(String[] args) {
		Developer[] list = {
				new JuniorDeveloper("Mike", 500, 0),
				new JuniorDeveloper("Dima", 500, 1),
				new JuniorDeveloper("Vova", 500, 2),
				new MiddleDeveloper("Anya", 500, 2),
				new SeniorDeveloper("Jack", 500, 5),
				new TeamLeadDeveloper("Robby", 500, 7)
		};
		StringBuilder sb;
		
		for (Developer d : list) {
			sb = new StringBuilder() // !!!
				.append(d.getName())
				.append(": ")
				.append(d.getBasicSalary())
				.append(" -> ")
				.append(d.getSalary());
			
			System.out.println(sb.toString());
		}
		
		//Создать список разработчиков и заполнить его случайным образом.
		System.out.println("-----------");
		Developer[] devList = new Developer[10];
		
		for(int i=0; i<devList.length;i++){
			int n =(int) (4*Math.random());
			int expirience = (int) (8*Math.random());
			switch(n){
			case (0): devList[i]= new JuniorDeveloper("Mike"+i, 500,  expirience);break;
			case (1): devList[i]= new MiddleDeveloper("Dima"+i, 500,  expirience);break;
			case (2): devList[i]= new SeniorDeveloper("Jack"+i, 500,  expirience);break;
			default: devList[i]= new TeamLeadDeveloper("Robby"+i, 500,  expirience);break;
			}
		}
		StringBuilder output;
		
		for (Developer p : devList) {
			output = new StringBuilder()
				.append(p.getName())
				.append(": ")
				.append(p.getBasicSalary())
				.append(" -> ")
				.append(p.getSalary());
			
			System.out.println(output.toString());
		}
		
		//Вывести на экран только Senior developer-ов с	зарплатой больше 1500 у.е.
		System.out.println("-----------");
		StringBuilder listSenior;
		
		for (int i=0; i<devList.length;i++) {
			if(devList[i] instanceof SeniorDeveloper && devList[i].getSalary()>1500.0){
			listSenior = new StringBuilder() 
				.append(devList[i].getName())
				.append(": ")
				.append(devList[i].getBasicSalary())
				.append(" -> ")
				.append(devList[i].getSalary());
			
			System.out.println(listSenior.toString());
			}
		}
		
		//разделить список объектов Developer на 3 отдельных списка для Juniors, Seniors и Team Leads
		int countJun = 0;
		int countSenior = 0;
		int countTeamLead = 0;
		for (int i=0; i<devList.length;i++) {
			if(devList[i] instanceof JuniorDeveloper) countJun++;
			if(devList[i] instanceof SeniorDeveloper) countSenior++;
			if(devList[i] instanceof TeamLeadDeveloper) countTeamLead++;
		}
		Developer[] listJun = new JuniorDeveloper[countJun];
		Developer[] listSen = new SeniorDeveloper[countSenior];
		Developer[] listTeamLead = new TeamLeadDeveloper[countTeamLead];
		
		int indJun = 0;
		int indSenior = 0;
		int indTeamLead = 0;
		for (int i=0; i<devList.length;i++) {
			if(devList[i] instanceof JuniorDeveloper){
				listJun[indJun] = devList[i];
				indJun++;
			}
			if(devList[i] instanceof SeniorDeveloper) {
				listSen[indSenior] = devList[i];
				indSenior++;
			}
			if(devList[i] instanceof TeamLeadDeveloper) {
				listTeamLead[indTeamLead] = devList[i];
				indTeamLead++;
			}
		}
		
		if(countJun>0) {
			System.out.println("-----List of Junior Developers------");
			for (int i=0; i<listJun.length;i++) {
				System.out.println(listJun[i].getName());
			}
		}
		
		if(countSenior>0) {
			System.out.println("-----List of Senior Developers------");
			for (int i=0; i<listSen.length;i++) {
				System.out.println(listSen[i].getName());
			}
		}
		
		if(countTeamLead>0) {
			System.out.println("-----List of TeamLead Developers------");
			for (int i=0; i<listTeamLead.length;i++) {
				System.out.println(listTeamLead[i].getName());
			}
		}
	}
}
