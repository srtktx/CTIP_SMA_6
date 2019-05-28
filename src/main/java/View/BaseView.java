package View;

import watch.Alarm;
import watch.Controller;
import watch.InstManager;

import javax.swing.*;

public class BaseView extends JFrame {
    private JPanel contentPane;
    public TimeKeepingView tkv=null;
    public TimerView tmv = null;
    public AlarmView alarmView = null;
    public StopWatchView stopWatchView =null;
    public DdayView ddayView = null;
    public FitnessView fitnessView = null;
    public SelectView selectView = null;

    public Controller controller = null;



    public void change_view(int num)
    {
        switch(num){
            case 0:
                setContentPane(tkv);
                revalidate();
                repaint();
                break;
            case 1:
                setContentPane(tmv);
                revalidate();
                repaint();
                break;
            case 2:
                setContentPane(alarmView);
                revalidate();
                repaint();
                break;
            case 3:
                setContentPane(stopWatchView);
                revalidate();
                repaint();
                break;
            case 4:
                setContentPane(ddayView);
                revalidate();
                repaint();
                break;
            case 5:
                setContentPane(fitnessView);
                revalidate();
                repaint();
                break;
            case 6:
                setContentPane(selectView);
                revalidate();
                repaint();
                break;

        }
    }

    public static void main(String[] args)
    {


        BaseView bv = new BaseView();
   
        bv.controller = new Controller(bv);
        bv.tkv = new TimeKeepingView(bv);
        bv.tmv = new TimerView(bv);
        bv.alarmView = new AlarmView(bv);
        bv.selectView = new SelectView(bv);
        bv.stopWatchView = new StopWatchView(bv);
        bv.fitnessView = new FitnessView(bv);
        bv.ddayView = new DdayView(bv);

        bv.setTitle("SMA_T6_CLOCK");
        bv.setContentPane(bv.tkv);
        bv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bv.setSize(500,500);
        bv.setVisible(true);


    }
}