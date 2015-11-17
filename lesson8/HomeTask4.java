/*Написать монитор, которых хранит дату модификации файлов и выводит сообщения при изменении в файлах* . */

package lesson8;

public class HomeTask4 {
	public static class MyEvents implements IFileEventsMine{
		public void fileDateChanged(String path){
		System.out.println("File "+ path +" is modified");
		}
	}

	public static void main(String[] args) {
		MyMonitor m = new MyMonitor("c:\\folder1");
		m.setEvent(new MyEvents());
		m.start();
	}

}
