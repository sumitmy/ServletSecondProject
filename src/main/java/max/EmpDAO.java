package max;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

	public boolean save( EmpDTO edto)
	{
		try {
			Connection con = ConnectionUtility.getConnn();
PreparedStatement ps = con.prepareStatement("insert into sproject values(?,?,?,?)");
		 ps.setString(1, edto.getEid());
		 ps.setString(2, edto.getName());
		 ps.setString(3, edto.getAdd());
		 ps.setString(4, edto.getPhone());
		int i = ps.executeUpdate();
		  if(i>0)
			  return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
	public List<EmpDTO> vieww()
	{
		List<EmpDTO> l=new ArrayList<EmpDTO>();
		try {
			Connection con = ConnectionUtility.getConnn();
			 PreparedStatement ps = con.prepareStatement("select * from sproject");
		  ResultSet rs = ps.executeQuery();
		    while(rs.next())
		    {
		    	EmpDTO empDTO=new EmpDTO();
		    	String eid = rs.getString(1);
		    	empDTO.setEid(eid);
		    	empDTO.setName(rs.getString(2));
		    	empDTO.setAdd(rs.getString("add"));
		    	empDTO.setPhone(rs.getString(4));
		    	l.add(empDTO);
		    	
		    }
		  
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
}
