import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizCardBuilder {

	private JTextArea question;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private JFrame frame;

	public static void main (String[] args) {
		QuizCardBuilder builder = new QuizCardBuilder();
		builder.go();
	} //end main method


	public void go() {

		frame = new JFrame("Quiz Card Builder");
		JPanel mainPanel = new JPanel();
		Font bifFont = new Font("sanserif", Font.BOLD, 24);
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigFont);


	} //end go method



} //end class QuizCardBuilder