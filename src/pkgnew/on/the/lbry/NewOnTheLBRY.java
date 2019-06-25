package pkgnew.on.the.lbry;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Component;
import java.io.InputStreamReader;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.AWTException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author kodxana
 */
public class NewOnTheLBRY {

    /**
     *
     */
    public static String[] URLs=null;

    /**
     *
     */
    public static NewOnTheLBRY app = null;

    /**
     *
     */
    public static JScrollPane[] myScrollPane=null;

    /**
     *
     */
    public static JTextArea[] myDescription=null;

    /**
     *
     */
    public static LinkListener1 JbtLink1=null;

    /**
     *
     */
    public static LinkListener2 JbtLink2=null;

    /**
     *
     */
    public static LinkListener3 JbtLink3=null;

    /**
     *
     */
    public static LinkListener4 JbtLink4=null;

    /**
     *
     */
    public static LinkListener5 JbtLink5=null;

    /**
     *
     */
    public static LinkListener6 JbtLink6=null;

    /**
     *
     */
    public static LinkListener7 JbtLink7=null;

    /**
     *
     */
    public static LinkListener8 JbtLink8=null;

    /**
     *
     */
    public static LinkListener9 JbtLink9=null;

    /**
     *
     */
    public static LinkListener0 JbtLink0=null;

    /**
     *
     */
    public static JFrame frame = new JFrame("New On The LBRY");

    /**
     *
     */
    public static JLabel[] ChannelDescription=null;

    /**
     *
     */
    public static JLabel[] ChannelCreated=null;

    /**
     *
     */
    public static JLabel[] ChannelName=null;

    /**
     *
     */
    public static JLabel[] ChannelLink=null;

    /**
     *
     */
    public static JLabel[] ChannelPics=null;

    /**
     *
     */
    public static int counter=0;

    /**
     *
     */
    public static Dimension screenSize =null;

    /**
     *
     */
    public static JPanel myTopPanel=null;

    /**
     *
     */
    public static JPanel[] mySecondPanel=null;

    /**
     *
     */
    public static JPanel[] myThirdPanel=null;
   
    /**
     *
     */
    public static JButton[] URLLink=null;

    /**
     *
     */
    public static JLabel[] Name=null;

    /**
     *
     */
    public static JLabel[] Desc=null;

    /**
     *
     */
    public static JLabel[] Created=null;

    /**
     *
     */
    public static JLabel[] URL=null;

    /**
     *
     */
    public static GridLayout experimentTopLayout=null;

    /**
     *
     */
    public static GridLayout experimentSecondLayout=null;

    /**
     *
     */
    public static GridLayout experimentSecondLayout2=null;

    /**
     *
     */
    public static Border border=null;

    /**
     *
     */
    public static GridBagLayout gridbag = null;

    /**
     *
     */
    public static GridBagConstraints c = null;

    /**
     *
     */
    public static Image StartUpImage=null;

    private static final int BUFFER_SIZE = 4096;
    
    /**
     *
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     * @throws AWTException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, AWTException {
         Robot robot=new Robot();
        while(true){
            File createLocation=new File(System.getProperty("user.dir")+"\\src\\Images\\");
            createLocation.mkdirs();
            for(int x=0;x<=9;x++){
               File imageFile=new File(System.getProperty("user.dir")+"\\src\\Images\\"+counter+".jpg");
               imageFile.delete();
            }
            System.out.println(System.getProperty("user.dir"));
            System.out.println(System.getProperty("java.class.path"));
            System.out.println(System.getProperty("user.home"));
            System.out.println(System.getProperty("user.name"));
            System.out.println(System.getProperty("java.library.path"));
frame.setVisible(false); 
URLs=null;
app = null;
myScrollPane=null;
myDescription=null;
 JbtLink1=null;
 JbtLink2=null;
 JbtLink3=null;
 JbtLink4=null;
 JbtLink5=null;
 JbtLink6=null;
 JbtLink7=null;
 JbtLink8=null;
 JbtLink9=null;
 JbtLink0=null;
frame = new JFrame("New On The LBRY");
// ChannelImages=null;
 ChannelDescription=null;
 ChannelCreated=null;
 ChannelName=null;
 ChannelLink=null;
 ChannelPics=null;
counter=0;
screenSize =null;
myTopPanel=null;
 mySecondPanel=null;
 myThirdPanel=null;

URLLink=null;
 Name=null;
 Desc=null;
 Created=null;
 URL=null;
 experimentTopLayout=null;
 experimentSecondLayout=null;
 experimentSecondLayout2=null;
border=null;
gridbag = null;
c = null;
       app=new NewOnTheLBRY();
       robot.delay(50000);
       robot.delay(50000);
       robot.delay(50000);
       robot.delay(50000);
       System.out.println("New");
               }
    }

    /**
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public NewOnTheLBRY() throws FileNotFoundException, IOException{
   gridbag = new GridBagLayout();
   c = new GridBagConstraints();
       JbtLink1=new LinkListener1();
       JbtLink2=new LinkListener2();
       JbtLink3=new LinkListener3();
       JbtLink4=new LinkListener4();
       JbtLink5=new LinkListener5();
       JbtLink6=new LinkListener6();
       JbtLink7=new LinkListener7();
       JbtLink8=new LinkListener8();
       JbtLink9=new LinkListener9();
       JbtLink0=new LinkListener0();
       
       System.setProperty("http.agent", "Chrome");
       border = new EmptyBorder(5, 5, 5, 5);
       frame = new JFrame("New On The LBRY");
   screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
  
   ChannelDescription=new JLabel[10];
   ChannelCreated=new JLabel[10];
   ChannelName=new JLabel[10];
   ChannelLink=new JLabel[10];
   ChannelPics=new JLabel[10];
   URLs=new String[10];
   myScrollPane=new JScrollPane[10];
   myDescription=new JTextArea[10];
   Name=new JLabel[10];
   Desc=new JLabel[10];
   Created=new JLabel[10];
   URL=new JLabel[10];
   URLLink=new JButton[10];
   for(int i=0;i<10;i++){
   Name[i]=new JLabel("Name:");
   Desc[i]=new JLabel("Description:");
   Created[i]=new JLabel("Created at:");
   URL[i]=new JLabel("Link:");
   URLLink[i]=new JButton("Setting...");
   URLs[i]="Setting";
   }
    experimentTopLayout = new GridLayout(0,1);
    experimentSecondLayout = new GridLayout(0,2);
    experimentSecondLayout2 = new GridLayout(0,4);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize((int)(screenSize.width*.85), (int)(screenSize.height*.85));
    frame.setLocationRelativeTo(null);
    frame.setIconImage(StartUpImage);
myTopPanel=new JPanel();
mySecondPanel=new JPanel[10];
myThirdPanel=new JPanel[10];

myTopPanel.setLayout(experimentTopLayout);
frame.setLayout(experimentTopLayout);
for(int x=0;x<=9;x++){
mySecondPanel[x]=new JPanel();
myThirdPanel[x]=new JPanel();  
mySecondPanel[x].setAlignmentX(Component.LEFT_ALIGNMENT);
mySecondPanel[x].setLayout(gridbag);
myThirdPanel[x].setLayout(gridbag);

}


    URL url = new URL("https://dev.chainquery.lbry.com/api/sql?query=SELECT%20name,%20description,%20thumbnail_url,%20modified_at%20FROM%20chainquery.claim%20WHERE%20claim_type%20=%202%20AND%20bid_state%20=%20%22Controlling%22%20ORDER%20BY%20modified_at%20DESC%20LIMIT%2010");


    URLConnection con = url.openConnection();
    InputStream is =con.getInputStream();

       try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
           String line = null;
           counter=0;
           while ((line = br.readLine()) != null) {
               line=line.trim();
               if(line.startsWith("\"desc")){
                   ChannelDescription[counter]=new JLabel(line.substring(16,line.length()-2));
                   myDescription[counter]=new JTextArea(ChannelDescription[counter].getText());
                   myScrollPane[counter]=new JScrollPane(myDescription[counter], JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                   myDescription[counter].setEditable(false);
                   myDescription[counter].setLineWrap(true);
                   myDescription[counter].setText(line.substring(16,line.length()-2));
                   
               }
               else if(line.startsWith("\"modi")){
                   ChannelCreated[counter]=new JLabel(line.substring(15,line.length()-2));
                   
               }
               else if(line.startsWith("\"name")){
                   ChannelName[counter]=new JLabel(line.substring(9,line.length()-2));
                   ChannelLink[counter]=new JLabel("https://open.lbry.com/"+line.substring(9,line.length()-2));
                   URLLink[counter]=new JButton("https://open.lbry.com/"+line.substring(9,line.length()-2));
                   URLs[counter]="https://open.lbry.com/"+line.substring(9,line.length()-2);
               }
               else if(line.startsWith("\"thumb")){
                   if(line.substring(18,line.length()-1).length()>=5){
String fileURL = line.substring(18,line.length()-1);
String saveDir = System.getProperty("user.dir")+"\\src\\Images\\"+counter+".jpg";

System.out.println(saveDir);
System.out.println(line.substring(18,line.length()-1));
System.out.println(counter);
try {
    downloadFile(fileURL, saveDir);
} catch (IOException ex) {
}

ThumbnailIcon icon=new ThumbnailIcon(System.getProperty("user.dir")+"\\src\\Images\\"+counter+".jpg");
icon.setImage(new ImageIcon(System.getProperty("user.dir")+"\\src\\Images\\"+counter+".jpg").getImage());
ChannelPics[counter] = new JLabel(icon, JLabel.CENTER);
                   }
                   else{

                       String fileURL ="https://i.imgur.com/ppmD1Q7.png";
                       String saveDir = System.getProperty("user.dir")+"\\src\\Images\\"+counter+".jpg";

                       try {
                           downloadFile(fileURL, saveDir);
                       } catch (IOException ex) {
                       }        
                       ThumbnailIcon icon=new ThumbnailIcon(System.getProperty("user.dir")+"\\src\\Images\\"+counter+".jpg");
                       ChannelPics[counter] = new JLabel(icon, JLabel.CENTER);

                   }

                   if(myDescription[counter].getText().length()<=4){
                       ChannelDescription[counter]=new JLabel("             ");

                       myDescription[counter]=new JTextArea(ChannelDescription[counter].getText());
                       myScrollPane[counter]=new JScrollPane(myDescription[counter], JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                       myDescription[counter].setEditable(false);
                       myDescription[counter].setLineWrap(false);

                       
                   }
                   counter++;
               }

           }      for(int r=0;r<=9;r++){
               c.fill = GridBagConstraints.BOTH;
               c.weightx = 1.0;
               c.gridwidth = 1;

               gridbag.setConstraints(Name[r], c);
               myThirdPanel[r].add(Name[r]);
               c.gridwidth = GridBagConstraints.REMAINDER;
               gridbag.setConstraints(ChannelName[r], c);
               myThirdPanel[r].add(ChannelName[r]);
               c.gridwidth = 1;
               c.fill = GridBagConstraints.BOTH;
               c.weightx = 1.0;
               gridbag.setConstraints(Created[r], c);
               myThirdPanel[r].add(Created[r]);
               c.gridwidth = GridBagConstraints.REMAINDER;
               gridbag.setConstraints(ChannelCreated[r], c);
               myThirdPanel[r].add(ChannelCreated[r]);
               c.gridwidth = 1;
               c.fill = GridBagConstraints.BOTH;
               c.weightx = 1.0;
               gridbag.setConstraints(URL[r], c);
               myThirdPanel[r].add(URL[r]);
               c.gridwidth = GridBagConstraints.REMAINDER;
               gridbag.setConstraints(URLLink[r], c);
               myThirdPanel[r].add(URLLink[r]);
               myThirdPanel[r].setBorder(border);
               myThirdPanel[r].setBackground(Color.white);
               
           }      for(int a=0;a<=9;a++){
               c.gridwidth = 1;
               c.fill = GridBagConstraints.BOTH;
               c.weightx = 0;
               c.anchor = GridBagConstraints.LINE_START;
               
               gridbag.setConstraints(ChannelPics[a], c);
               mySecondPanel[a].add(ChannelPics[a]);
               c.fill = GridBagConstraints.BOTH;
               c.gridwidth = 4;
               
               gridbag.setConstraints(myThirdPanel[a], c);
               mySecondPanel[a].add(myThirdPanel[a]);
               mySecondPanel[a].setBorder(border);
               mySecondPanel[a].setBackground(Color.white);
               c.fill = GridBagConstraints.BOTH;
               c.gridwidth = 1;
               c.weightx = 1.0;
               
               gridbag.setConstraints(Desc[a], c);
               c.fill = GridBagConstraints.BOTH;
               c.gridwidth = GridBagConstraints.REMAINDER;
               
               gridbag.setConstraints(myScrollPane[a], c);
               mySecondPanel[a].add(myScrollPane[a]);
               //       }

           }     for(int b=0;b<=9;b++){

               
               frame.add(mySecondPanel[b]);
           }
           URLLink[1].addActionListener(JbtLink1);
           URLLink[2].addActionListener(JbtLink2);
           URLLink[3].addActionListener(JbtLink3);
           URLLink[4].addActionListener(JbtLink4);
           URLLink[5].addActionListener(JbtLink5);
           URLLink[6].addActionListener(JbtLink6);
           URLLink[7].addActionListener(JbtLink7);
           URLLink[8].addActionListener(JbtLink8);
           URLLink[9].addActionListener(JbtLink9);
           URLLink[0].addActionListener(JbtLink0);
           frame.setVisible(true);  
       }
           
   } 

    /**
     *
     * @param fileURL
     * @param saveDir
     * @throws IOException
     */
    public static void downloadFile(String fileURL, String saveDir)
            throws IOException {
        URL url = new URL(fileURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        int responseCode = httpConn.getResponseCode();
 
        if (responseCode == HttpURLConnection.HTTP_OK) {
            String fileName = "";
            String disposition = httpConn.getHeaderField("Content-Disposition");
            String contentType = httpConn.getContentType();
            int contentLength = httpConn.getContentLength();
 
            if (disposition != null) {
                int index = disposition.indexOf("filename=");
                if (index > 0) {
                    fileName = disposition.substring(index + 10,
                            disposition.length() - 1);
                }
            } else {
                fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1,
                        fileURL.length());
            }
 

            try (
                    InputStream inputStream = httpConn.getInputStream()) {
                String saveFilePath = saveDir;
                try ( 
                        FileOutputStream outputStream = new FileOutputStream(saveFilePath)) {
                    int bytesRead = -1;
                    byte[] buffer = new byte[BUFFER_SIZE];
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }
                }
            }
        } else {
        }
        httpConn.disconnect();
    }
   
    /**
     *
     */
    public class LinkListener1  implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URLs[1]));
        } catch (IOException ex) {
            Logger.getLogger(NewOnTheLBRY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

    /**
     *
     */
    public class LinkListener2  implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URLs[2]));
        } catch (IOException ex) {
            Logger.getLogger(NewOnTheLBRY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

    /**
     *
     */
    public class LinkListener3  implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URLs[3]));
        } catch (IOException ex) {
            Logger.getLogger(NewOnTheLBRY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

    /**
     *
     */
    public class LinkListener4  implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URLs[4]));
        } catch (IOException ex) {
            Logger.getLogger(NewOnTheLBRY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

    /**
     *
     */
    public class LinkListener5  implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URLs[5]));
        } catch (IOException ex) {
            Logger.getLogger(NewOnTheLBRY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

    /**
     *
     */
    public class LinkListener6  implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URLs[6]));
        } catch (IOException ex) {
            Logger.getLogger(NewOnTheLBRY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

    /**
     *
     */
    public class LinkListener7  implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URLs[7]));
        } catch (IOException ex) {
            Logger.getLogger(NewOnTheLBRY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

    /**
     *
     */
    public class LinkListener8  implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URLs[8]));
        } catch (IOException ex) {
            Logger.getLogger(NewOnTheLBRY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

    /**
     *
     */
    public class LinkListener9  implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URLs[9]));
        } catch (IOException ex) {
            Logger.getLogger(NewOnTheLBRY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

    /**
     *
     */
    public class LinkListener0  implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URLs[0]));
        } catch (IOException ex) {
            Logger.getLogger(NewOnTheLBRY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}
      
       
}
