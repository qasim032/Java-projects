import javax.swing.*;


class StopWatch {
    protected JFrame frame;
    protected JButton startButton;
    protected JButton stopButton;
    protected JButton resetButton;
    protected JLabel timeLabel;



    public StopWatch() {

        frame = new JFrame("Stop Watch");
        timeLabel = new JLabel();

        startButton = new JButton("START");
        stopButton = new JButton("STOP");
        resetButton = new JButton("RESET");


    }


}