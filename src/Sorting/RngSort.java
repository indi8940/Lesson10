package Sorting;

public class RngSort extends javax.swing.JFrame {
    public static double rng;
    public RngSort() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtoutput = new javax.swing.JTextArea();
        btnrandom = new javax.swing.JButton();
        btnbubble = new javax.swing.JButton();
        btnexchange = new javax.swing.JButton();
        btnInsertion = new javax.swing.JButton();
        btnquick = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtoutput.setColumns(20);
        txtoutput.setRows(5);
        jScrollPane1.setViewportView(txtoutput);

        btnrandom.setText("Generate Numbers");
        btnrandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrandomActionPerformed(evt);
            }
        });

        btnbubble.setText("Bubble Sort");
        btnbubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbubbleActionPerformed(evt);
            }
        });

        btnexchange.setText("exchange Sort");

        btnInsertion.setText("Insertion Sort");

        btnquick.setText("Quick Sort");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInsertion)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnexchange)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(btnbubble)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnrandom)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnquick)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnrandom)
                .addGap(18, 18, 18)
                .addComponent(btnbubble)
                .addGap(18, 18, 18)
                .addComponent(btnexchange)
                .addGap(18, 18, 18)
                .addComponent(btnInsertion)
                .addGap(18, 18, 18)
                .addComponent(btnquick)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrandomActionPerformed
        for (int i = 0; i < 50000; i++) {
            rng = Math.floor(Math.random() * 50000 + 1);
            txtoutput.append("\n" + rng);
        }
       
    }//GEN-LAST:event_btnrandomActionPerformed

    private void btnbubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubbleActionPerformed
        
    }//GEN-LAST:event_btnbubbleActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RngSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RngSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RngSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RngSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RngSort().setVisible(true);
            }
        });
    }

    public static void bubbleSort(int[] a){
   	int k = 0;
   	boolean exchangeMade = true;
	// Make up to n - 1 passes through array, exit 
	//early if no exchanges are made on previous pass
  
 	while ((k < a.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < a.length - k; j++) { 
         		if (a[j] > a[j + 1]){
            			swap(a, j, j + 1);		 
            			exchangeMade = true;
         		}//end if
		}//end for
	}//end while
}

//supporting swap method
public static void selectionSort(int[] a){
   for (int i = 0; i < a.length - 1; i++){
      int minIndex = findMinimum(a, i);
      if (minIndex != i)
	//if lowest is not already in place
         swap(a, i, minIndex);
   } //end for
}  


//supporting findMinimum method

public static int findMinimum(int[] a, int first){
   //first=where to start looking from
   //assume first is also the smallest for now
   int minIndex = first; 
   for (int i = first + 1; i < a.length; i++)
      if (a[i] < a[minIndex])
         minIndex = i;
   return minIndex;
}

public static void insertionSort(int a[]){
	int itemToInsert, j;
	boolean stillLooking;

	//on the kth pass, pass item k upwards in list
	//and insert it in its proper place amoung the
	//first k entries in an array

	for (int k=1; k<a.length; k++){
	//move backwards through list, looking for
	//the right place to insert a[k];
		itemToInsert = a[k];
		j=k-1;
		stillLooking=true;
		while(j >=0 && stillLooking){
			if (itemToInsert < a[j]){
				//move item higher
				a[j+1] = a[j];
				j--;
			}else{
				//we have found new home for a[k];
				stillLooking=false;
			}//end else// j+1 is where the item goes
			a[j+1]=itemToInsert;
		}//end while
  	}//end for
}//end method

//supporting swap method (same as bubble sort swap)
public static void swap(int[] a, int x, int y){
   int temp = a[x];
   a[x] = a[y];
   a[y] = temp;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertion;
    private javax.swing.JButton btnbubble;
    private javax.swing.JButton btnexchange;
    private javax.swing.JButton btnquick;
    private javax.swing.JButton btnrandom;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtoutput;
    // End of variables declaration//GEN-END:variables
}
