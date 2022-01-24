package Lec_CollectionFramework_Queue;

import java.util.Comparator;

public class CompareStudents implements Comparator<EnthrallOctBatch> {

	@Override
	public int compare(EnthrallOctBatch st1, EnthrallOctBatch st2) {
		if(st1.age<st2.age) {
			return -1;  
		}else if(st1.age>st2.age) {
			return 1;//swaping
		}
		return 0;
	}

}


