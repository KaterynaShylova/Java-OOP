package lesson8;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyMonitor {
	private String path;
	private IFileEventsMine event;
	private List<String> prevDate = new ArrayList<String>();
	private List<String> currDate = new ArrayList<String>();
	private SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
	
	public MyMonitor(String path){
		this.path = path;
		createDateList(prevDate);
	}

	public IFileEventsMine getEvent() {
		return event;
	}

	public void setEvent(IFileEventsMine event) {
		this.event = event;
	}
	
	public void changedDate(String path){
		if(event !=null)
			event.fileDateChanged(path);
	}
	
	public void start(){
		while(true){
			createDateList(currDate);
			compareDate(prevDate);
			prevDate.clear();
			prevDate.addAll(currDate);
			currDate.clear();
		
			System.out.println("Waiting...");
			
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				return;
			}
		}
	}
	
	public void createDateList(List<String> output){
		//try{
		File f = new File(path);
		File[] fileList = f.listFiles();
		
		output.clear();
		
		for(File temp: fileList)
			output.add(format.format(temp.lastModified()));
		//}catch(IOException e){
		//	e.printStackTrace();
		//}
	}
	
	public void compareDate(List<String> prev){
		Iterator<String> it = prev.iterator();
		String name = "";
		File f = new File(path);
		File[] fileList = f.listFiles();
		
		for(File fl: fileList){
			name = fl.getName();
			
			if(!prev.contains(format.format(fl.lastModified())))
				changedDate(name);
		}
		
	}

}
