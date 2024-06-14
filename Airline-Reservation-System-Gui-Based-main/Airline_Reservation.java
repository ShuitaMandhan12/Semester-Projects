

package s2nd_project;




import com.sun.org.apache.bcel.internal.generic.F2D;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class Menu implements ActionListener{

   JPanel menu;
    ImageIcon menuimage;
    JLabel imglabel;
     
    
     JPanel pnl1,pnl2,pnl3,pnl4, p,p1,p2,p3,p4,p5,p10,p11,p12,p13,p14,p15,p16,p17,p18,p6,p7,p8,p9;
     JTextField from1txt,to1txt,from2txt,to2txt,txt1,txt2,txt3,txt4,txt5,txt6,txt7,nametxt,contacttxt;
     JTextArea oad,from1,to1,from2,to2;
     JMenu choose,choose2,choose3,choose4;
    JMenuBar list,list2,list3,list4;
     JMenuItem pakistan,singapure,london,america,india,china;
   Label l1,name1,contact1,lbl,t1 ,lc1,lc2,lc3,lc4,lc5,l4,l5,l6,l7,l8,name,contact,paymentLabel,l,schedeles,details;; 
   JLabel l3;
     JRadioButton select1,select2;
     JTable table1,table2;
     
     JFrame f1,f2,f3,f4,f5,f6;
   JRadioButton master,visa,pay;
    JButton reservation,exit,proceed,mschedules,eschedules,aschedules,btndone,show,seats,purchase;
 
  JTable table3,table4,table5,table,tbl1,tbl2,tbl3;
  
    public Menu(){
    

        f1=new JFrame();
    f1.setTitle("AIRLINE RESERVATION SYSTEM");
        f1.setSize(3000,3000);
        f1.setLocationRelativeTo(null);
        f1.setLayout(new BorderLayout());
   
        f1.setContentPane(new JLabel(new ImageIcon("C:\\Users\\SONY\\Desktop\\java final project\\s2nd_project\\src\\s2nd_project\\download.jpg")));
        f1.setLayout(new FlowLayout());
        l3=new JLabel();
       
        f1.setSize(2500,2500);
         f1.add(l3);
f1.setBackground(Color.gray);
        
        reservation=new JButton("Reservation");
      
        reservation.addActionListener(new method1());
      
        
        exit=new JButton("Exit program");
        exit.addActionListener(new method8());
        f1.add(reservation,BorderLayout.SOUTH);
        f1.add(exit);
    
        f1.setVisible(true);
       
       
         f2=new JFrame();
        f2.setSize(2000,2000);
        
        
       oad=new JTextArea();
       oad.setText( "    Select Origin And Destination ");
       oad.setPreferredSize(new Dimension(200,30));
       oad.setBackground(Color.yellow);
       oad.setTabSize(150);
        
       oad.setBackground(Color.RED);
        pnl2=new JPanel();
        pnl2.setPreferredSize(new Dimension(40,100));
        pnl2.setBackground(Color.blue);
       pnl2.add(oad);
       
               select1=new JRadioButton(" Internationnal airline ");
               select1.addActionListener(new method1());
      from1=new JTextArea();
      from1.setText(" FROM: ");
      from1.setBackground(Color.LIGHT_GRAY);
      from1.setPreferredSize(new Dimension(50,20));
      
      from1txt=new JTextField(20);
          

          choose=new JMenu("choose a country");
          
          list=new JMenuBar();
          list.add(choose);
          
          pakistan=new JMenuItem("Pakistan");
          choose.add(pakistan);
         pakistan.addActionListener(new method2());
          singapure=new JMenuItem("Singapure");
          choose.add(singapure);
          singapure.addActionListener(new method2());
          india=new JMenuItem("India");
          choose.add(india);
          india.addActionListener(new method2());
          london=new JMenuItem("London");
         choose.add(london);
         london.addActionListener(new method2());
          america=new JMenuItem("America");
         choose.add(america);
         america.addActionListener(new method2());
          china=new JMenuItem("China");
          choose.add(china);
          china.addActionListener(new method2());

          
          
          to1=new JTextArea();
      to1.setText(" TO:");
      to1.setBackground(Color.LIGHT_GRAY);
      to1.setPreferredSize(new Dimension(50,20));
      
      to1txt=new JTextField(20);
      
       choose2=new JMenu("choose a country");
          
          list2=new JMenuBar();
          list2.add(choose2);
          
         pakistan=new JMenuItem("Pakistan");
          choose2.add(pakistan);
         pakistan.addActionListener(new method1());
          singapure=new JMenuItem("Singapure");
          choose2.add(singapure);
          singapure.addActionListener(new method1());
          india=new JMenuItem("India");
          choose2.add(india);
          india.addActionListener(new method1());
          london=new JMenuItem("London");
         choose2.add(london);
         london.addActionListener(new method1());
          america=new JMenuItem("America");
         choose2.add(america);
         america.addActionListener(new method1());
          china=new JMenuItem("China");
          choose2.add(china);
          china.addActionListener(new method1());

      
      
         
       pnl3=new JPanel();
       pnl3.setLayout(new FlowLayout());
      pnl3.setPreferredSize(new Dimension(50,50));
      pnl3.setBackground(Color.blue);
       
       pnl3.add(select1);
       pnl3.add(from1);
       pnl3.add(from1txt);
       pnl3.add(list);
       pnl3.add(to1);
       pnl3.add(to1txt);
       pnl3.add(list2);



       pnl4=new JPanel();
       pnl4.setLayout(new FlowLayout());
       pnl4.setPreferredSize(new Dimension(100,500));
      pnl4.setBackground(Color.BLUE);
       
         select2=new JRadioButton(" Domestic airline ");
         select2.addActionListener(new method1());
      from2=new JTextArea();
      from2.setText(" FROM: ");
      from2.setBackground(Color.LIGHT_GRAY);
      from2.setPreferredSize(new Dimension(50,20));
      
      from2txt=new JTextField(20);
           
          choose3=new JMenu("choose a country");
          
          list3=new JMenuBar();
          list3.add(choose3);
          
          pakistan=new JMenuItem("Karachi");
          choose3.add(pakistan);
         pakistan.addActionListener(new method4());
          singapure=new JMenuItem("Multan");
          choose3.add(singapure);
          singapure.addActionListener(new method4());
          india=new JMenuItem("Hyderabad");
          choose3.add(india);
          india.addActionListener(new method4());
          london=new JMenuItem("Sukkur");
         choose3.add(london);
         london.addActionListener(new method4());
          america=new JMenuItem("Islamabad");
         choose3.add(america);
         america.addActionListener(new method4());
          china=new JMenuItem("Lahore");
          choose3.add(china);
          china.addActionListener(new method4());

          
          
          to2=new JTextArea();
      to2.setText(" TO:");
      to2.setBackground(Color.LIGHT_GRAY);
      to2.setPreferredSize(new Dimension(50,20));
      to2txt=new JTextField(20);
      
       choose4=new JMenu("choose a country");
          
          list4=new JMenuBar();
          list4.add(choose4);
          
         pakistan=new JMenuItem("Karachi");
          choose4.add(pakistan);
         pakistan.addActionListener(new method3());
          singapure=new JMenuItem("Multan");
          choose4.add(singapure);
          singapure.addActionListener(new method3());
          india=new JMenuItem("Lahore");
          choose4.add(india);
          india.addActionListener(new method3());
          london=new JMenuItem("Sukkur");
         choose4.add(london);
         london.addActionListener(new method3());
          america=new JMenuItem("Islamabad");
         choose4.add(america);
         america.addActionListener(new method3());
          china=new JMenuItem("Hyderabad");
          choose4.add(china);
          china.addActionListener(new method3());

   
          proceed=new JButton("Proceed");
          proceed.addActionListener(new method5());
          
             pnl4.add(select2);
       pnl4.add(from2);
       pnl4.add(from2txt);
     pnl4.add(list3);
      
    pnl4.add(to2);
       pnl4.add(to2txt);
     pnl4.add(list4);
   
     pnl4.add(proceed);
       f2.add(pnl2,BorderLayout.NORTH);
       f2.add(pnl3,BorderLayout.CENTER);
       f2.add(pnl4,BorderLayout.SOUTH);
       f2.setVisible(false);
              
    
         f3=new JFrame();
        f3.setSize(2000,2000);    
    
    
            p6=new JPanel();
        p6.setPreferredSize(new Dimension(300,100));
        p6.setBackground(Color.BLACK);
        
        p7=new JPanel();
        p7.setPreferredSize(new Dimension(200,50));
        p7.setLayout(new FlowLayout());
        p7.setBackground(Color.YELLOW);
        
        p8=new JPanel();
        p8.setPreferredSize(new Dimension(200,600));
        p8.setLayout(new FlowLayout());
        p8.setBackground(Color.YELLOW);
    
        t1=new Label();
        t1.setText("                         FLIGHT SCHEDULES FOR ");
        t1.setPreferredSize(new Dimension(320,50));
        t1.setBackground(Color.pink);
     
        l1=new Label();
         l1.setText("                           Airline");
      l1.setPreferredSize(new Dimension(200,40));
      l1.setBackground(Color.white);
        
        p6.add(t1);
         
        lbl=new Label("  TO  ");
         lbl.setPreferredSize(new Dimension(50,30));
         lbl.setBackground(Color.magenta);
         
        
        txt1=new JTextField(15);
        txt2=new JTextField(15);
    
         String []columnnames={"DATE","Departure TIME","Airliner","Terminal","Lowest seat price"};
         Object [][]data={{"8/12/22","8:30am","Cebu pacific Airline","Gate 2","21000"},
                            {"10/12/22","7:00am","Cebu pacific Airline","Gate 1","21000"},
                            {"6/9/22","11:00am","Cebu pacific Airline","Gate 2","21000"},
                          };
         
         
        table1=new JTable(data,columnnames);
        table1.setPreferredScrollableViewportSize(new Dimension(500,50));
        table1.setFillsViewportHeight(true);
        
    
        JScrollPane scrollPane=new JScrollPane(table1);
        
    ListSelectionModel model=table1.getSelectionModel();
    model.addListSelectionListener(new ListSelectionListener() {
       
        
        @Override
            public void valueChanged(ListSelectionEvent ae) {
                
            if(!model.isSelectionEmpty()){
            
                int selectedrow=model.getMinSelectionIndex();
                JOptionPane.showMessageDialog(null, "Selected row: "+selectedrow);
               f4.setVisible(true);
               
            }
            }
        });
    
    
 
        table1.setVisible(false);
        mschedules=new JButton("View Available Morning Schedules");
        mschedules.addActionListener(new method6());
             
           lc1=new Label("                                                      ");
             lc1.setPreferredSize(new Dimension(300,40));
      lc1.setBackground(Color.YELLOW);
      
           lc2=new Label("                                                       ");
             lc2.setPreferredSize(new Dimension(200,40));
      lc2.setBackground(Color.YELLOW);
      
      
       String []columnnames1={"Date","Departure TIME","Airliner","Terminal","Lowest seat price"};
         String [][]data1={{"3/8/22","4:30pm","Zest O Airline","Gate 1","20000"},
                            {"7/7/22","3:00pm","Zest O Airline","Gate 3","20000"},
                          };
        table=new JTable(data1,columnnames1);
        table.setPreferredScrollableViewportSize(new Dimension(500,50));
        table.setFillsViewportHeight(true);
       
        JScrollPane scrollPane1=new JScrollPane(table);
                      
        ListSelectionModel model2=table.getSelectionModel();
    model2.addListSelectionListener(new ListSelectionListener() {
       
      
        @Override
            public void valueChanged(ListSelectionEvent ae) {
                
            if(!model2.isSelectionEmpty()){
            
                int selectedrow2=model2.getMinSelectionIndex();
                JOptionPane.showMessageDialog(null, "Selected row: "+selectedrow2);
                f4.setVisible(true);
            }
            }
        });
    
    table.setVisible(false);
    
    aschedules=new JButton("View Available Afternoon Schedules");
        aschedules.addActionListener(new method6());
        
        lc3=new Label("                                                      ");
             lc3.setPreferredSize(new Dimension(300,40));
      lc3.setBackground(Color.YELLOW);
      
        lc4=new Label("                                                       ");
             lc4.setPreferredSize(new Dimension(200,40));
      lc4.setBackground(Color.YELLOW);
      
        String []columnnames2={"Date","Departure TIME","Airliner","Terminal","Lowest seat price"};
         String [][]data2={{"5/8/22","5:30pm","Phillipines Airline","Gate 5","25000"},
                            {"7/9/22","7:00pm","Phillipines Airline","Gate 3","25000"},
                          };
        table2=new JTable(data2,columnnames2);
        table2.setPreferredScrollableViewportSize(new Dimension(500,50));
        table2.setFillsViewportHeight(true);
        JScrollPane scrollPane2=new JScrollPane(table2);
                      
        ListSelectionModel model3=table2.getSelectionModel();
    model3.addListSelectionListener(new ListSelectionListener() {
       
        
        @Override
            public void valueChanged(ListSelectionEvent ae) {
                
            if(!model3.isSelectionEmpty()){
            
                int selectedrow2=model3.getMinSelectionIndex();
                JOptionPane.showMessageDialog(null, "Selected row: "+selectedrow2);
                f4.setVisible(true);
            }
            }
        });
 
        
   table2.setVisible(false);
        eschedules=new JButton("View Available Evening Schedules");
        eschedules.addActionListener(new method6());

        
         lc5=new Label("                                                      ");
             lc5.setPreferredSize(new Dimension(300,40));
      lc5.setBackground(Color.YELLOW);
      
     p7.add(txt1);
     p7.add(lbl);
     p7.add(txt2);
     
    
     p8.add(l1);
      p8.add(scrollPane);
      p8.add(mschedules);
      p8.add(lc1);
      p8.add(lc2);
            p8.add(scrollPane1);
       p8.add(aschedules);
       p8.add(lc3);
       p8.add(lc4);
       p8.add(scrollPane2);
       p8.add(eschedules);
       p8.add(lc5);
     f3.add(p6,BorderLayout.NORTH);
     f3.add(p8,BorderLayout.SOUTH);
     f3.add(p7,BorderLayout.CENTER);
     
     f3.setVisible(false);
    
     
     f4=new JFrame();
        f4.setSize(2000,2000);    
        f4.setVisible(false);
        
        p2=new JPanel();
        p2.setPreferredSize(new Dimension(200,100));
        p2.setBackground(Color.BLACK);
        p2.setLayout(new FlowLayout());
        
        
        l4=new Label("                                ECONOMY CLASS   ");
        l4.setPreferredSize(new Dimension(300,70));
        l4.setBackground(Color.YELLOW);
        
         l6=new Label("     ");
        l6.setPreferredSize(new Dimension(300,70));
        l6.setBackground(Color.DARK_GRAY);
        
         l5=new Label("                                   FIRST  CLASS   ");
        l5.setPreferredSize(new Dimension(300,70));
        l5.setBackground(Color.YELLOW);
        
        p2.add(l4);
        p2.add(l6);
        p2.add(l5);
       f4.add(p2,BorderLayout.NORTH);
        
        p3=new JPanel();
        p3.setPreferredSize(new Dimension(300,500));
        p3.setLayout(new FlowLayout());
        p3.setBackground(Color.BLACK);
        
        String []columnnames4={"Seat ","price in php"};
        Object data4[][]={{"E0","3000"},{"E1","3000"},{"E2","3000"},{"E3","3000"},{"E4","3000"},{"E5","3000"},{"E6","3000"}};
                table4=new JTable(data4,columnnames4);
        table4.setFillsViewportHeight(true);
     table4.setPreferredSize(new Dimension(200,200));
        
        JScrollPane scrollPane13=new JScrollPane(table4);
         
        ListSelectionModel model5=table4.getSelectionModel();
    model5.addListSelectionListener(new ListSelectionListener() {
       
        
        @Override
            public void valueChanged(ListSelectionEvent ae) {
                
            if(!model5.isSelectionEmpty()){
            
                int selectedrow2=model5.getMinSelectionIndex();
                f6.setVisible(true);
                txt6.setText("E"+selectedrow2);
               txt7.setText("3000");
            }
            }
        });
 
        table4.setVisible(false);
        
            String []columnnames3={"Seat ","price in php"};
        Object data3[][]={{"F0","8000"},{"F1","8000"},{"F2","8000"},{"F3","8000"},{"F4","8000"},{"F5","3000"},{"F6","8000"},{"F7","8000"},{"F8","8000"},{"F9","8000"},{"F10","8000"}};
                table5=new JTable(data3,columnnames3);
        //table5.setPreferredScrollableViewportSize(new Dimension(500,50));
        table5.setFillsViewportHeight(true);
      table5.setPreferredSize(new Dimension(200,200));
        
        JScrollPane scrollPane14=new JScrollPane(table5);
    
        ListSelectionModel model4=table5.getSelectionModel();
    model4.addListSelectionListener(new ListSelectionListener() {
       
        
        @Override
            public void valueChanged(ListSelectionEvent ae) {
                
            if(!model4.isSelectionEmpty()){
            
                int selectedrow2=model4.getMinSelectionIndex();
                f6.setVisible(true);
              
                 txt6.setText("F"+selectedrow2);
               txt7.setText("8000");
            }
            }
        });
        table5.setVisible(false);
        
        seats=new JButton("View   Avaiable   Seat");
        seats.setPreferredSize(new Dimension(500,100));
        seats.addActionListener(new method7());
                
        
        p3.add(scrollPane13);
        p3.add(scrollPane14);
        p3.add(seats);
        f4.add(p3,BorderLayout.CENTER);
  
      f6=new JFrame();
      f6.setSize(2000,2000);
      f6.setBackground(Color.darkGray);
      f6.setVisible(false);
       
      p10=new JPanel();
      p10.setPreferredSize(new Dimension(100,100));
    p10.setLayout(new FlowLayout());
    p10.setBackground(Color.BLACK);
    
      l7=new Label("  SEAT NO: ");
      l7.setBackground(Color.WHITE);
      l7.setPreferredSize(new Dimension(300,40));
      txt6=new JTextField();
      txt6.setBackground(Color.YELLOW);
      txt6.setPreferredSize(new Dimension(100,50));
      txt7=new JTextField();
      txt7.setBackground(Color.YELLOW);
      txt7.setPreferredSize(new Dimension(200,50));
              
      l8=new Label("  PRICE  ");
      l8.setBackground(Color.WHITE);
      l8.setPreferredSize(new Dimension(300,40));
      p10.add(l7);
      p10.add(txt6);
      p10.add(txt7);
      p10.add(l8);
      
      p11=new JPanel();
      p11.setPreferredSize(new Dimension(50,30));
      p11.setLayout(new GridLayout(3,2));
      p11.setBackground(Color.BLACK);
      
      
      name=new Label("                            \t\t\t     NAME:    ");
      name.setBackground(Color.PINK);
      
      
      nametxt=new JTextField();
      nametxt.setPreferredSize(new Dimension(50,10));
     
       contact=new Label("                        \t\t\t    CONTACT NO:    ");
      contact.setBackground(Color.PINK);
      
      contacttxt=new JTextField();
      contacttxt.setPreferredSize(new Dimension(50,10));
     
      p11.add(name);
      p11.add(nametxt);
      p11.add(contact);
      p11.add(contacttxt);
   
      paymentLabel=new Label("     Payment   Method     ");
    paymentLabel.setPreferredSize(new Dimension(150,60));
    paymentLabel.setBackground(Color.WHITE);
      
      
      p12=new JPanel();
      p12.setPreferredSize(new Dimension(200,550));
      p12.setBackground(Color.BLACK);
      p12.setLayout(new FlowLayout());
      
      pay=new JRadioButton("  Paypal Card");
      
        master=new JRadioButton("  Master Card ");
        
          visa=new JRadioButton("  Visa Card ");
      
          l=new Label("              ");
          l.setPreferredSize(new Dimension(900,10));
          
          
          purchase=new JButton(" Purchase ");
          purchase.setPreferredSize(new Dimension(200,70));
          purchase.addActionListener(new method8());
          
      p12.add(paymentLabel);       
          p12.add(pay);
          p12.add(master);
          p12.add(visa);
          p12.add(l);
          p12.add(purchase);
          
      f6.add(p10,BorderLayout.NORTH);
      f6.add(p12,BorderLayout.SOUTH);
      f6.add(p11,BorderLayout.CENTER);
    
              
      
    }
   
        
  
    
    
    public static void main(String[] args) {
        Menu m=new Menu();
                  
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class method1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
       String cmd=ae.getActionCommand();
       if(cmd=="Reservation"){
          
               f1.setVisible(false);
               f2.setVisible(true);
               f3.setVisible(false);
           
       }
       
       
       String cmd2=ae.getActionCommand();
       if(cmd2=="China"||cmd2=="Singapure"||cmd2=="India"||cmd2=="London"||cmd2=="America"||cmd2=="Pakistan"){
       
       to1txt.setText(cmd2);
       txt2.setText(cmd2);
       }
       if(cmd2== " Internationnal airline "){
          
           l1.setText("\t "+ "    INTERNATIONAL");
       }
       if(cmd==" Domestic airline "){
       l1.setText("\t"+"       DOMESTIC");
       
       }
           }
} 
   private class method2 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
       String cmd2=ae.getActionCommand();
    
    if(cmd2=="Pakistan"||cmd2=="Singapure"||cmd2=="India"||cmd2=="London"||cmd2=="America"||cmd2=="China"){
       from1txt.setText(cmd2);
     txt1.setText(cmd2);
     } 
    }}
private class method4 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
       String cmd2=ae.getActionCommand();
    
    if(cmd2=="Karachi"||cmd2=="Lahore"||cmd2=="Sukkur"||cmd2=="Hyderabad"||cmd2=="Multan"||cmd2=="Islamabad"){
       from2txt.setText(cmd2);
       txt1.setText(cmd2);
     }
    }
    }
private class method3 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
       String cmd2=ae.getActionCommand();
    
    if(cmd2=="Karachi"||cmd2=="Lahore"||cmd2=="Sukkur"||cmd2=="Hyderabad"||cmd2=="Multan"||cmd2=="Islamabad"){
       to2txt.setText(cmd2);
       txt2.setText(cmd2);
     }
   

}
}
   private class method5 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
       String cmd2=ae.getActionCommand();
       
       if(cmd2=="Proceed"){
            
           f1.setVisible(false);
           f2.setVisible(false);
           f3.setVisible(true);
      }
       
    }
  }
   private class method6 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
       String cmd2=ae.getActionCommand();
       
       if(cmd2=="View Available Morning Schedules"){
      
       table1.setVisible(true);
       }
        if(cmd2=="View Available Afternoon Schedules"){
       table.setVisible(true);
       }
       if(cmd2=="View Available Evening Schedules"){
       table2.setVisible(true);
       }
    } }
   private class method7 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
       String cmd2=ae.getActionCommand();
      if(cmd2=="View   Avaiable   Seat"){
      table4.setVisible(true);
      table5.setVisible(true);
      } 
    }}

             private class method8 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
       String cmd2=ae.getActionCommand();
      if(cmd2==" Purchase "){
      
          f1.setVisible(true);
           }
     
     if(cmd2=="Exit program"){
     
         
         f1.setVisible(false);
     f2.setVisible(false);
     f3.setVisible(false);
     f4.setVisible(false);
     
     f6.setVisible(false);
     
     }
}}
   
   
}