import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StopWatchPro extends StopWatch implements ActionListener {
    private int elapsedTime;
    private boolean isRunning;
    private int hours;
    private int minutes;
    private int seconds;


    public StopWatchPro() {

        super();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        timeLabel.setBounds(60, 50, 300, 100);
        timeLabel.setFont(new Font("Arial Black", Font.BOLD, 35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setForeground(Color.GREEN);


        startButton.setBounds(50, 200, 100, 50);
        startButton.setFont(new Font("Arial Black", Font.BOLD, 15));
        startButton.setFocusable(false);
        startButton.addActionListener(this);


        stopButton.setBounds(160, 200, 100, 50);
        stopButton.setFont(new Font("Arial Black", Font.BOLD, 15));
        stopButton.setFocusable(false);
        stopButton.addActionListener(this);
        stopButton.setEnabled(false);


        resetButton.setBounds(270, 200, 100, 50);
        resetButton.setFont(new Font("Arial Black", Font.BOLD, 15));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        frame.add(timeLabel);
        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);


        //initializing data members
        elapsedTime = 0;
        isRunning = false;
        hours = 0;
        seconds = 0;
        minutes = 0;
        timeLabel.setText("00" + ":" + "00" + ":" + "00");

    }

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedTime = elapsedTime + 1000;
            hours = (elapsedTime / 3600000);
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            String seconds_string = String.format("%02d", seconds);
            String minutes_string = String.format("%02d", minutes);
            String hours_string = String.format("%02d", hours);
            timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
        }
    });


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            start();
        } else if (e.getSource() == stopButton) {
            stop();
        } else if (e.getSource() == resetButton) {
            reset();
        }
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            timer.start();
            startButton.setEnabled(false);
            stopButton.setEnabled(true);
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            timer.stop();
            startButton.setEnabled(true);
            stopButton.setEnabled(false);
        }
    }

    public void reset() {
        timer.stop();
        elapsedTime = 0;
        isRunning = false;
        timeLabel.setText("00" + ":" + "00" + ":" + "00");
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
    }
}