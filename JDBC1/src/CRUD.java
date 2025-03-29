import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class CRUD {
    static Connection con;
    static Scanner sc = new Scanner(System.in);
    static CRUD obj=new CRUD();

    public static void main(String[] args) throws SQLException {

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "root");
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        System.out.print("Choose Option 1.Insert Data 2.Read Data 3.ReadAllEmp 4.Update Data 5.Delete Data");
        int opt = Integer.parseInt(sc.nextLine());
        System.out.println(opt);
        //String yn;  //yes or no for continue
        //do{
            switch (opt) {
                case 1:
                    obj.insertData();
                    break;
                case 2:
                    obj.readData();
                    break;
                case 3:
                    obj.readAllEmp();
                    break;
                case 4:
                    obj.updateData();
                    break;
                case 5:
                    obj.deleteData();
                    break;
                default:
                    obj.chooseOption();
            }
            //System.out.println("Do You want to continue press(y or Y) for Yes & press(n or N) for No");
            //yn= sc.next();
        //}
        //while(yn.equals("y") || (yn.equals("Y")));

    }

    public void insertData() {
        try {
            String sql_st = "insert into employee values(?,?,?);";  //? is placeholder to get data
            PreparedStatement st = con.prepareStatement(sql_st);
            System.out.println("Enter Employee Id: ");
            st.setInt(1,Integer.parseInt(sc.nextLine()));
            System.out.println("Enter Employee Name: ");
            st.setString(2,sc.nextLine());
            System.out.println("Enter Employee Salary: ");
            st.setInt(3,Integer.parseInt(sc.nextLine()));

            int rows = st.executeUpdate();
            if (rows>0){
                System.out.println("Data Inserted");
            }
            else {
                System.out.println("Data Not Inserted");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void readData() {
        try{
            System.out.println("Enter Employee Id: ");
            int empId = Integer.parseInt(sc.nextLine());
            String sql_st = "select * from employee where eid="+empId;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql_st);

            if (rs.next()){
                String ename = rs.getString(2);
                int esal = rs.getInt(3);
                System.out.println("Employee Name: "+ename+" , "+"Employee Salary: "+esal);
            }
            else {
                System.out.println("Data Not Found");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void readAllEmp(){
        try{
//            System.out.println("Enter Employee Id: ");
//            int empId = Integer.parseInt(sc.nextLine());
            String sql_st = "select * from employee";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql_st);
                            //executeQuery is used to fetch the data from database
            while (rs.next()){
                int eid = rs.getInt(1);
                String ename = rs.getString(2);
                int esal = rs.getInt(3);
                System.out.println("Employee Id: "+eid+" , "+"Employee Name: "+ename+" , "+"Employee Salary: "+esal);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void updateData() {
        try{
            String sql_st = "Update employee set ename=? where eid=?";
            PreparedStatement st = con.prepareStatement(sql_st);
            System.out.println("Enter Employee Name: ");
            String ename = sc.nextLine();
            st.setString(1,ename);
            System.out.println("Enter Employee Id: ");
            st.setInt(2,Integer.parseInt(sc.nextLine()));

            int rows = st.executeUpdate();
            if (rows>0){
                System.out.println("Data Updated");
            }
            else {
                System.out.println("Data Not Updated");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void deleteData() throws SQLException {
        System.out.println("Enter Employee Id: ");
        int empId = Integer.parseInt(sc.nextLine());
        String sql_st = "delete from employee where eid="+empId;
        Statement st = con.createStatement();
        int row = st.executeUpdate(sql_st);

        if (row>0){
            System.out.println("Deleted Data");
        }
        else {
            System.out.println("Not Deleted");
        }
    }
    public void chooseOption(){}
}