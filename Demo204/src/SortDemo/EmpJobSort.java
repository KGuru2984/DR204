package SortDemo;

import java.util.Comparator;

public class EmpJobSort implements Comparator<Employees>
{

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return o1.empJobID.compareTo(o2.empJobID);
	}

}
