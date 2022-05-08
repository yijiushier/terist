import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class changePage {
    public static void ChangePage(JButton button,JFrame nowPage,JFrame aimPage){
        button.addActionListener(new ActionListener() {
            @Override
            
            //删除了这个改变
            public void actionPerformed(ActionEvent e) {
                nowPage.dispose();
                aimPage.setVisible(true);
            }
        });
    }
}
