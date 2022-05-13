package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;
import java.sql.*;
import java.time.LocalDate;
public class MemberRepository implements CrudRepository<Member> {
   private Connection Con;
   
    

	public MemberRepository(Connection con) {
	super();
	Con = con;
}






	public List<Member> findAll() {
		String sql="select * from HARIMEMBER ";
		 List<Member>  memberList =new ArrayList <Member>();
		 try(PreparedStatement pstmt=Con.prepareStatement(sql)){
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()) {
					int memberId=rs.getInt("Member_Id");
					String memberName=rs.getString("Member_Name");
					String memberAddress=rs.getString("Member_Address");
				    Date accountOpenDate=rs.getDate("Acc_Open_Date");
				    LocalDate accDate = accountOpenDate.toLocalDate();
			        String memberShipType=rs.getString("Membership_Type");
					int feesPaid=rs.getInt("Fees_paid");
					int maxBooksAllowed=rs.getInt("Max_Books_Allowed");
				    double penaltyAmount=rs.getDouble("Penalty_Amount");
			
					
					Member prod = new Member( memberId,memberName,memberAddress,accDate,
					memberShipType,feesPaid,maxBooksAllowed,penaltyAmount);
					memberList.add(prod);
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			return memberList;
			
	}
	
		
		
	
	

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
    @Override
	public int add(Member obj) {
		int rowAdded=0;
		String sql="insert into HARIMEMBER values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement pstmt=Con.prepareStatement(sql)){
			pstmt.setInt(1,obj.getMemberId());
			pstmt.setString(2,obj.getMemberName());
			pstmt.setString(3,obj.getMemberAddress());
			pstmt.setDate(4,Date.valueOf(obj.getAccountOpenDate()));
			pstmt.setString(5,obj.getMembershipType());
			pstmt.setDouble(6,obj.getFeesPaid());
			pstmt.setInt(7,obj.getMaxBooksAllowed());
			pstmt.setDouble(8,obj.getPenaltyAmount());
			
			rowAdded=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
		
	}






	@Override
	public int update(int id, String obj) {
		// TODO Auto-generated method stub
		int rowsUpdated=0;
		String sql="update HARIMEMBER set Member_Id= ? where Member_Name = ?";
		try(PreparedStatement pstmt=Con.prepareStatement(sql)){
			
			pstmt.setString(2,obj);
			pstmt.setInt(1,id);
			rowsUpdated=pstmt.executeUpdate();
		}
		catch(SQLException e) {
		e.printStackTrace();
	}
		return rowsUpdated;
	
		
	}






	
	}

	


