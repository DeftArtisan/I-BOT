import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.text.JTextComponent;


 
@SuppressWarnings("serial")


public class AutomativeVisualized extends JFrame implements Serializable{
 
	private static final long serialVersionUID = 4252748354398549966L;
   JTextField tField, FormattedField, ClonePublication;
   JPasswordField pwField;
   JTextArea tArea;
 
   public AutomativeVisualized() {
      JPanel tfPanel = new JPanel(new GridLayout(5, 2, 10, 2));
      tfPanel.setBorder(BorderFactory.createTitledBorder("Credentials "));

      tfPanel.add(new JLabel(" Enter an ema"
      		+ "il/username"));
      tField = new JTextField(10);
      tfPanel.add(tField);
      
      tfPanel.add(new JLabel(" Enter the password"));
      pwField = new JPasswordField(10);
      tfPanel.add(pwField);
      
      tfPanel.add(new JLabel(" Account(s) subject to cloning"));
      FormattedField = new JTextField();
      tfPanel.add(FormattedField);
      FormattedField.addKeyListener(new KeyAdapter() {
    	  @Override public void keyPressed(KeyEvent e) {
    		  if(e.getKeyCode() == KeyEvent.VK_SPACE)
    			  if(!FormattedField.getText().isBlank() && !(FormattedField.getText().toCharArray()[FormattedField.getText().length() - 1] == ','))
    				  //FormattedField.getText().replace(" ", "");
    				  JOptionPane.showConfirmDialog(tfPanel, "If you intend to clone multiple accounts, please separate them by a comma.");  	
    	  }
       });
      
      
      //restrict to numerics
      tfPanel.add(new JLabel(" Publications per account(s) for cloning"));
      ClonePublication = new JTextField(10);
      tfPanel.add(ClonePublication);
      ClonePublication.addKeyListener(new KeyAdapter() {
    	  @Override public void keyPressed(KeyEvent e) {
    		  if(!(ClonePublication.getText().toCharArray()[ClonePublication.toString().length() - 1] == ',') && e.getKeyCode() == KeyEvent.VK_SPACE)
    			  JOptionPane.showConfirmDialog(tfPanel, "If you intend to specify custom post count(from each account set for publication) please separate them by a comma.");
    	  }
      });
      new ArrayList<JTextComponent>(
         Arrays.asList(tField, FormattedField, pwField, ClonePublication) 		  
      ).forEach(act -> AutomativeVisualized.synchonization().accept(act));
      
      tfPanel.add(new JButton("initialize"));
      JProgressBar br = new JProgressBar();
      tfPanel.add(br);
      
      ((JButton) extraction(JButton.class, "initialize", Commandants.BUTTON).apply(tfPanel)).addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
			     try {
			    	 if(Automative.Utils.Validative._EMAIL_.getValidative().isBlank() || Automative.Utils.Validative._PASS_.getValidative().isBlank())
				    		throw new AWTException("act");
			     Automative.finalization();
				} catch (FileNotFoundException | AWTException excep) {
					JOptionPane.showMessageDialog(tfPanel, "An error has occurred during the initialization phase.".concat(" Please ensure you've entered valid/existent credentials."));
				}
			}
		});
      
      // Setup the content-pane of JFrame in BorderLayout
      Container cp = this.getContentPane();
      cp.setLayout(new BorderLayout(5, 5));
      cp.add(tfPanel, BorderLayout.NORTH);
 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Automative-Cloning");
      setSize(600, 250);
      setIconImage(Toolkit.getDefaultToolkit().getImage("Automation\\src\\red.png"));
      setLocationRelativeTo(null);//centering
      setResizable(false);
      setVisible(true);
   }
 
   
   private static void loader(JProgressBar br) {
	   br.setValue(0);
	   br.setBounds(40, 40, 160, 30);
	   br.setStringPainted(true);
	   br.setVisible(true);
	   iterate(br);
   }
   
   public static void iterate(JProgressBar jb){    
	   int i = 0;
	   while(i<=2000){    
	     jb.setValue(i);    
	     i += 20;    
	     try{Thread.sleep(150);}catch(Exception e){}    
	   }    
   }

   
   @SuppressWarnings("unused")
private static void puts(final String defici) { System.out.println(defici);}
   
   private static <T_IN extends JTextComponent> Consumer<T_IN> synchonization(){
	   return  entry -> {
		    entry.addKeyListener(new KeyAdapter() {
		    	StringBuilder appender = new StringBuilder();
				@Override public void keyPressed(KeyEvent e) {
					if(Character.isAlphabetic(e.getKeyChar()) || Character.isDigit(e.getKeyChar()) || e.getKeyChar() == ',') {
//						if(e.getKeyCode() == 32 && !(((JTextComponent)entry).getText()
//									.toCharArray()[((JTextComponent)entry).getText().lastIndexOf(' ') - 2] == ' ')) {
//							
//						}
						appender.append(e.getKeyChar());
						
						//((JTextComponent)entry).setText(String.valueOf(e.getKeyChar()));
					}
				}
				@Override public void keyReleased(KeyEvent e) {
					if(activity().test(e, appender))
							 appender.deleteCharAt(appender.length() - 1);
					
					if(entry instanceof JPasswordField)
						if(((JPasswordField)entry).getPassword().length == 0) {
							appender.delete(0, appender.length());
							Automative.Utils.Validative._PASS_.setter("");
						} else {
							Automative.Utils.Validative._PASS_.setter(appender.toString().strip());
							System.out.println(Automative.Utils.Validative._PASS_.getValidative());
						}
					else
						if(((JTextField)entry).getText().length() == 0) {
							appender.delete(0, appender.length());
							Automative.Utils.Validative._EMAIL_.setter("");
						} else {
							Automative.Utils.Validative._EMAIL_.setter(appender.toString().strip());
							System.out.println(Automative.Utils.Validative._EMAIL_.getValidative());
						}
					((JTextComponent)entry).setText(appender.toString());
				}
				
		    });  
	   };
   }
   
	private enum Commandants{
		TEXT(), 
		BUTTON();
	}
	
	private static BiPredicate<? super KeyEvent, StringBuilder> activity() { return (entry, entry2)-> { return entry.getKeyCode() == 8 && !(entry2.isEmpty()); }; }
	
	private static <T_R extends JPanel> Automative.Utils.Consumeristic<File, AudioInputStream> background(T_R win){
		return (entry, entry2) -> {
			try {
				AudioInputStream ent = AudioSystem.getAudioInputStream(entry);
				AudioSystem.getClip().open(ent);
				AudioSystem.getClip().start();
				AudioSystem.getClip().loop(Clip.LOOP_CONTINUOUSLY);
				if(!win.isDisplayable())
					AudioSystem.getClip().stop();
			} catch(Exception extor) {
				extor.printStackTrace();
				JOptionPane.showMessageDialog(win, "Inaccessible");
			}
		};
	}
   
	@SuppressWarnings("unchecked")
	private static <T_R extends Component, T_NIL extends JButton, T_NILL extends JTextComponent> Function<JPanel , T_R> extraction(Class<?> clazz, final String denotation, Commandants decorate) {
		return entry  -> {
			return decorate == Commandants.TEXT ? (T_R) Stream.of(entry.getComponents()).filter(act -> act.getClass().equals(clazz) && ((T_NILL) act).getText().equals(denotation)).findFirst().get()
					: (T_R) Stream.of(entry.getComponents()).filter(act -> act.getClass().equals(clazz) && ((T_NIL) act).getText().equals(denotation)).findFirst().get();
		};
	}
   
   public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new AutomativeVisualized());
   }
}
