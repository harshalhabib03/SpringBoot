import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class    CRUD {
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

        System.out.println("Choose Option: 1.Insert Data, 2.Read Data, 3.ReadAll Data, 4.Update Data, 5. Delete Data");
        int opt = Integer.parseInt(sc.nextLine());

        switch (opt){
            case 1:
                obj.insertData();
                break;
            case 2:
                obj.readData();
                break;
            case 3:
                obj.updateData();
                break;
            case 4:
                obj.deleteData();
                break;
            default:
                obj.chooseOption();
                break;
        }
    }

    public void insertData(){
        try {
            String sql_st = "insert into product values(?,?,?);";
            PreparedStatement st =con.prepareStatement(sql_st);
            System.out.println("Enter Product Id: ");
            st.setInt(1,Integer.parseInt(sc.nextLine()));
            System.out.println("Enter Product Name: ");
            st.setString(2,sc.nextLine());
            System.out.println("Enter Product Amount: ");
            st.setInt(3,Integer.parseInt(sc.nextLine()));

            int rows = st.executeUpdate();
            if (rows>0){
                System.out.println("Data Inserted");
            }
            else {
                System.out.println("Data Not Inserted");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readData(){

    }

    public void updateData(){

    }

    public void deleteData(){

    }

    public void chooseOption(){
    }
}