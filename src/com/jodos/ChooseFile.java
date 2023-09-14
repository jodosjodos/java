    package com.jodos;

    import javax.sound.sampled.UnsupportedAudioFileException;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.io.*;
    import java.util.ArrayList;

    public class ChooseFile extends MyFrame implements ActionListener {
    JButton button = new JButton("Select file");

    JLabel label = new JLabel();

    JTextArea textArea = new JTextArea(200,200);
    JScrollPane scrollPane = new JScrollPane(textArea);

        ChooseFile(){
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
       scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

            button.addActionListener(this);
             this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             this.setLayout(new FlowLayout());
             this.setSize(500,500);
             this.add(button);
             this.add(label);
             this.add(scrollPane);


             this.setVisible(true);
        }

        @Override
        public  void  actionPerformed(ActionEvent e){
         if (e.getSource()  == button){
             JFileChooser fileChooser = new JFileChooser();
           int response=   fileChooser.showOpenDialog(null);
           if (response ==JFileChooser.APPROVE_OPTION){
               File file  =new File(fileChooser.getSelectedFile().getAbsolutePath());
               try {
                   FileReader reader = new FileReader(file);

                   BufferedReader br = new BufferedReader(reader    );
                   StringBuilder fileContent = new StringBuilder();
                   String line ;
                   while ((line = br.readLine()) != null){
                       fileContent.append(line + "\n");
                   }
                   textArea.setText(textArea.getText()+ "\n"+ fileContent.toString());
               } catch (FileNotFoundException ex) {
                   System.out.println("file not found");
                   throw new RuntimeException(ex);
               } catch (IOException ee){
                   System.out.println(" some errors have occurred please try again");
                   System.out.println(ee);
               }

           }
         }
    }
}
