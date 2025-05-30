import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class CRUD{
	
	static Connection con;
	static Scanner sc = new Scanner(System.in);
	static CRUD obj = new CRUD();
	
	public static void main(String[] args) {
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
		
		System.out.print("Choose Option: 1.Insert Data, 2.Read Data, 3.Read All Data, 4.Update Data, 5.Delete Data");
		int opt = Integer.parseInt(sc.nextLine());
		System.out.println(opt);
		
		String yn;
		do {
			switch (opt) {
			case 1:
				obj.insertData();
				break;
			case 2:
				obj.readData();
				break;
			case 3:
				obj.readAllData();
				break;
			case 4:
				obj.updateData();
				break;
			case 5:
				obj.deleteData();
				
			default:
				System.out.println("Invalid Option");
				break;
			}
			System.out.println("Do you want to continue press(y/Y) for Yes or press(n/N) for No");
			yn=sc.nextLine().trim();
		}	
		while(yn.equals("y")||yn.equals("Y"));
	}
	
	public void insertData() {
		
		try {
			String sql_st = "insert into product values(?,?,?);";
			PreparedStatement st = con.prepareStatement(sql_st);
			
			System.out.println("Enter product id: ");
			st.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter product name: ");
			st.setString(2, sc.nextLine());
			System.out.println("Enter product amount: ");
			st.setInt(3, Integer.parseInt(sc.nextLine()));
			
			int rows = st.executeUpdate();
			if (rows>0) {
				System.out.println("Data Inserted");
			} else {
				System.out.println("Data not Inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void readData() {
		try {
			System.out.println("Enter product Id: ");
			int pid = Integer.parseInt(sc.nextLine());
			String sql_st = "select * from product where pid="+pid; 
			Statement st = con.createStatement();
			ResultSet rs =st.executeQuery(sql_st);
			
			if (rs.next()) {
				String pname = rs.getString(2);
				double pamount = rs.getDouble(3);
				System.out.println("Product Name: "+pname+ ", "+"Product Amount: "+pamount);
				
			} else {
				System.out.println("Data not found");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void readAllData() {
		try {
		String sql_st = "select * from product"; 
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(sql_st);
		
		while (rs.next()) {
			int pid = rs.getInt(1);
			String pname = rs.getString(2);
			double pamount = rs.getDouble(3);
			System.out.println("Product Id: "+pid+", "+"Product Name: "+pname+ ", "+"Product Amount: "+pamount);
			
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	}
	
	public void updateData() {
		
		try {
			String sql_st = "update product set pname=? where pid=?";
			PreparedStatement st = con.prepareStatement(sql_st);
			System.out.println("Enter product name: ");
			String pname = sc.nextLine();
			st.setString(1, pname);
			System.out.println("Enter product id: ");
			st.setInt(2, Integer.parseInt(sc.nextLine()));
			
			int rows=st.executeUpdate();
			if (rows>0) {
				System.out.println("Data Updated");
			} else {
				System.out.println("Data not Updated");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteData() {
		try {
			System.out.println("Enter product id: ");
			int pid = Integer.parseInt(sc.nextLine());
			String sql_st = "delete from product where pid="+pid;
			Statement st = con.createStatement();
			
			int row = st.executeUpdate(sql_st);
			
			if (row>0) {
				System.out.println("Data Deleted");
			} else {
				System.out.println("Data not Deleted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}