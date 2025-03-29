import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRow {
    public static void main(String[] args) {
        try{
            //to create connection
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "root");
            System.out.println(con);

            //to create statement
            Statement st = con.createStatement();
            String sql_st = "insert into emp values(102, 'Sonia', 48000)";
            st.executeUpdate(sql_st);
            System.out.println("Data Inserted");
            con.close();    //release the resource after completion
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
