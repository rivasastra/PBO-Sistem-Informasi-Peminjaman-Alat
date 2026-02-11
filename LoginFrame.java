import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginFrame extends JFrame {

    JLabel lUser = new JLabel("Username");
    JLabel lPass = new JLabel("Password");

    JTextField txtUser = new JTextField();
    JPasswordField txtPass = new JPasswordField();

    JButton btnLogin = new JButton("Login");

    public LoginFrame() {
        setTitle("Login Sistem Peminjaman Alat");
        setSize(300,200);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(lUser);
        lUser.setBounds(30,30,80,25);

        add(txtUser);
        txtUser.setBounds(120,30,120,25);

        add(lPass);
        lPass.setBounds(30,70,80,25);

        add(txtPass);
        txtPass.setBounds(120,70,120,25);

        add(btnLogin);
        btnLogin.setBounds(100,110,100,30);

        btnLogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                login();
            }
        });

        setVisible(true);
    }

    private void login(){
        try{
            Connection conn = Koneksi.getConnection();

            String sql = "SELECT * FROM user WHERE username=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, txtUser.getText());
            ps.setString(2, txtPass.getText());

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                JOptionPane.showMessageDialog(this,
                        "Login berhasil sebagai " + rs.getString("role"));
            } else {
                JOptionPane.showMessageDialog(this,"Username atau password salah");
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
