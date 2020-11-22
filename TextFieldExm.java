import java.awt.*;
class TextFieldExm{
	public static void main(String[] args) {
		Frame f=new Frame("This is the Frame");
		TextField t1,t2; 
		t1=new TextField("This is Label one");
		t1.setBounds(80,100,80,30);
	    t2=new TextField("This is Label one");
		t2.setBounds(80,150,80,30);
		f.add(t1);f.add(t2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}