package max;

import java.util.Random;

public class EmpBO {
public boolean getEmp(EmpBean e)
{
	String p=e.getPhone().length()==10?e.getPhone():"0000000";
	 String n = e.getName().substring(0, 1).toUpperCase()+e.getName().substring(1).toLowerCase();
	 String ad = e.getAdd().toLowerCase();
	 EmpDTO edto=new EmpDTO();
	 edto.setAdd(ad);
	 edto.setName(n);
	 edto.setPhone(p);
	String id = getID();
	 edto.setEid(id);
	
	 return new EmpDAO().save(edto);
	
}


private String getID()
{
	StringBuffer sb = new StringBuffer();
	 for(int i=0; i<=10;i++)
	 {
		 sb.append(new Random().nextInt(9));
	 }
	 return sb.toString();
}

}
