package com.jse.grade;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.jse.member.MemberServiceImpl;

public class GradeView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
    private Container container; 
    private JLabel title,nameLabel,koreanLabel,englishLabel,
    				mathLabel,javaLabel; 
    private JTextField nameText, koreanText, englishText, mathText,
    					javaText; 
    private JTextArea resultText; 
    private JButton submitButton, listButton; 
	GradeService gradeService;

	public GradeView() {
		gradeService = new GradeServiceImpl(); // ????
	}

	public void open(){ 
    	setTitle("Swing Exercise"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        container = getContentPane(); 
        container.setLayout(null); 
  
        title = new JLabel("Swing Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        container.add(title); 
  
        nameLabel = new JLabel("Name"); 
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nameLabel.setSize(100, 20); 
        nameLabel.setLocation(100, 100);
        container.add(nameLabel); 
  
        nameText = new JTextField(); 
        nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        nameText.setSize(190, 20); 
        nameText.setLocation(200, 100); 
        container.add(nameText); 
  
        koreanLabel = new JLabel("KOREAN"); 
        koreanLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        koreanLabel.setSize(100, 20); 
        koreanLabel.setLocation(100, 150); 
        container.add(koreanLabel); 
  
        koreanText = new JTextField(); 
        koreanText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        koreanText.setSize(150, 20); 
        koreanText.setLocation(200, 150); 
        container.add(koreanText); 
  
        englishLabel = new JLabel("ENGLISH"); 
        englishLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        englishLabel.setSize(100, 20); 
        englishLabel.setLocation(100, 200); 
        container.add(englishLabel); 
        
        englishText = new JTextField(); 
        englishText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        englishText.setSize(150, 20); 
        englishText.setLocation(200, 200); 
        container.add(englishText);
  
        mathLabel = new JLabel("MATH"); 
        mathLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        mathLabel.setSize(100, 20); 
        mathLabel.setLocation(100, 250); 
        container.add(mathLabel); 
        
        mathText = new JTextField(); 
        mathText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        mathText.setSize(150, 20); 
        mathText.setLocation(200, 250); 
        container.add(mathText);
  
        javaLabel = new JLabel("JAVA"); 
        javaLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        javaLabel.setSize(100, 20); 
        javaLabel.setLocation(100, 300); 
        container.add(javaLabel); 
        
        javaText = new JTextField(); 
        javaText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        javaText.setSize(150, 20); 
        javaText.setLocation(200, 300); 
        container.add(javaText);
        
  
        submitButton = new JButton("Submit"); 
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submitButton.setSize(100, 20); 
        submitButton.setLocation(150, 450); 
        submitButton.addActionListener(this);
        container.add(submitButton); 
  
        listButton = new JButton("List"); 
        listButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        listButton.setSize(100, 20); 
        listButton.setLocation(270, 450); 
        listButton.addActionListener(this);
        container.add(listButton); 
  
        resultText = new JTextArea(); 
        resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15)); 
        resultText.setSize(300, 400); 
        resultText.setLocation(500, 100); 
        resultText.setLineWrap(true); 
        resultText.setEditable(false); 
        container.add(resultText); 
 
        setVisible(true); 
    } 

	public void actionPerformed(ActionEvent event) { // ???
		if (event.getSource() == submitButton) { // save버튼이 필드에 있어서 여기서 쓰는거 가능?
			nameText.setText("강강강,김김김,이이이,최최최,한한한");
			koreanText.setText("89,50,72,100,94");
			englishText.setText("46,82,100,54,87");
			mathText.setText("25,80,98,39,79");
			javaText.setText("100,78,97,59,100");
			String data = String.format("%s/%s/%s/%s/%s", nameText.getText(), koreanText.getText(),
					englishText.getText(), mathText.getText(), javaText.getText());
			String[] arr = data.split("/");
			String[] names = arr[0].split(",");
			String[] koreans = arr[1].split(",");
			String[] englishs = arr[2].split(",");
			String[] maths = arr[3].split(",");
			String[] javas = arr[4].split(",");

			Grade[] grades = new Grade[5]; // 이거 뭐여   빈 강의장 하나를 만든것
			for (int i = 0; i < 5; i++) {
				grades[i] = new Grade(); // 실체를 갖게하는 중 / 엘리먼트에 실체를 준다 / ( ) ?
				grades[i].setName(names[i]);
				grades[i].setKorean(Integer.parseInt(koreans[i]));
				grades[i].setEnglish(Integer.parseInt(englishs[i]));
				grades[i].setMath(Integer.parseInt(maths[i]));
				grades[i].setJava(Integer.parseInt(javas[i]));
				gradeService.add(grades[i]); // 엘리멘트를 서버로 보낸다
			}

		} else if (event.getSource() == listButton) {
			Grade[] grades = gradeService.getGrades(); //서버에서 가져온다
			String result = "";
			for (int i = 0; i < grades.length; i++) {
				result += grades[i] + "\n";
			}
			resultText.setText(result);
			javaText.setText(""); //string값을 null주는 것      (null) : 주소값이 null된다 
			mathText.setText("");
			englishText.setText("");
			koreanText.setText("");
			nameText.setText("");
		}
	}

}
