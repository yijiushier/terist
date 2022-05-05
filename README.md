# terist
import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Home {
    public static void main(String[] args) {
        //创建游戏主页面
        JFrame homePage=new JFrame("HomePage");
        homePage.setSize(400,650);
        homePage.setLocationRelativeTo(null);
        homePage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //homePage 设置
        JPanel homePanel=new JPanel();
        homePage.setContentPane(homePanel);
        JButton play=new JButton("Play");
        homePanel.add(play);

        //下拉列表框选择难度
        JLabel Difficulty=new JLabel("Difficulty");
        homePanel.add(Difficulty);
        String[] difficulties=new String[]{"Level 1","Level 2","Level 3","Level 4"};
        final JComboBox<String> chooseDifficulty= new JComboBox<>(difficulties);
        chooseDifficulty.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==ItemEvent.SELECTED){
                    System.out.println("游戏难度设置为"+chooseDifficulty.getSelectedItem());
                }
            }
        });
        homePage.add(chooseDifficulty);

        //点击Ranking List按钮跳转到排行榜界面
        JButton RankingList=new JButton("Ranking List");
        homePage.add(RankingList);

        //开始游戏过渡界面
        JFrame ChooseGamePage=new JFrame("ChooseGame");
        ChooseGamePage.setSize(400,650);
        ChooseGamePage.setLocationRelativeTo(null);
        ChooseGamePage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //ChooseGame Page 设置
        JPanel chooseGame=new JPanel();
        ChooseGamePage.setContentPane(chooseGame);
        JButton NewGame=new JButton("New Game");
        chooseGame.add(NewGame);
        JButton GameSaves=new JButton("GameSaves");
        chooseGame.add(GameSaves);
        JButton BackToHomePageFromChooseGame=new JButton("Back");
        chooseGame.add(BackToHomePageFromChooseGame);
        changePage.ChangePage(BackToHomePageFromChooseGame,ChooseGamePage,homePage);

        //点击play按钮跳转到选择游戏界面
        changePage.ChangePage(play,homePage,ChooseGamePage);

        //点击New Game按钮开始新游戏
        JFrame GamePage=new JFrame("Game Running");
        JPanel GamePanel=new JPanel();
        GamePage.setSize(400,650);
        GamePage.setLocationRelativeTo(null);
        GamePage.setContentPane(GamePanel);
        GamePage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton Pause=new JButton("Pause");

        //Pause按钮、暂停界面设置
        GamePanel.add(Pause);
        JDesktopPane PauseDesktopPane=new JDesktopPane();
        JInternalFrame PauseInternalFrame=new JInternalFrame();
        PauseDesktopPane.add(PauseInternalFrame);





        //排行榜界面
        JFrame rankingLIstPage=new JFrame("Ranking List");
        rankingLIstPage.setSize(400,650);
        rankingLIstPage.setLocationRelativeTo(null);
        rankingLIstPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel rankingList=new JLabel("ranking");
        JPanel rankingLIstPanel=new JPanel();
        rankingLIstPage.setContentPane(rankingLIstPanel);
        rankingLIstPanel.add(rankingList);
        JButton BackToHomePageFromRankingListPage=new JButton("Back");
        rankingLIstPanel.add(BackToHomePageFromRankingListPage);
        changePage.ChangePage(BackToHomePageFromRankingListPage,rankingLIstPage,homePage);

        //RankingList按钮设置
        changePage.ChangePage(RankingList,homePage,rankingLIstPage);


        //显示窗口
        homePage.setVisible(true);


    }
}
