/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2012440027;

import tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1.AEATType;
import tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1.AEAType;
import tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1.AEAtypeType;
import tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1.AudienceType;

/**
 *
 * @author jaejunk
 */
public class AEAPanel extends javax.swing.JPanel {

    /**
     * Creates new form AEAPanel
     */
    public AEAPanel() {
        initComponents();
    }
    
    //함수명 : saveAEA
    //입력 : 없음
    //출력 : AEAType
    //GUI의 AEA Panel 데이터를 AEAType으로 저장
    public AEAType saveAEA() { 
        AEAType aea = new AEAType(); //AEAType 객체 생성
        aea.setAeaId(aeaIdTextField.getText()); //aeaId 저장
        //aea.setAeaType(AEAtypeType.fromValue(aeaTypeTextField.getText())); //aeaType 저장
        if (jRadioButton6.isSelected()) { //audience의 라디오버튼이 눌린 것에 따라 값을 저장
            aea.setAeaType(AEAtypeType.fromValue("update"));
        }
        else if (jRadioButton7.isSelected()) {
            aea.setAeaType(AEAtypeType.fromValue("alert"));
        }
        else if (jRadioButton8.isSelected()) {
            aea.setAeaType(AEAtypeType.fromValue("cancel"));
        }
        
        //aea.setAudience(AudienceType.fromValue(audienceTextField.getText())); //audience 저장
        if (jRadioButton3.isSelected()) { //audience의 라디오버튼이 눌린 것에 따라 값을 저장
            aea.setAudience(AudienceType.fromValue("public"));
        }
        else if (jRadioButton4.isSelected()) {
            aea.setAudience(AudienceType.fromValue("restricted"));
        }
        else if (jRadioButton5.isSelected()) {
            aea.setAudience(AudienceType.fromValue("private"));
        }
        
        aea.setIssuer(issuerTextField.getText()); //issuer 저장
        aea.setRefAEAId(refAEAIdTextField.getText()); //refAEAId 저장
        String priString = (String) jComboBox2.getSelectedItem();
        //aea.setPriority(Short.valueOf((String) jComboBox2.getSelectedItem())); //priority 저장
        switch (priString) {
            case "매우낮음":
                aea.setPriority(Short.valueOf("0"));
                break;
            case "낮음":
                aea.setPriority(Short.valueOf("1"));
                break;
            case "보통":
                aea.setPriority(Short.valueOf("2"));
                break;
            case "높음":
                aea.setPriority(Short.valueOf("3"));
                break;
            case "매우높음":
                aea.setPriority(Short.valueOf("4"));
                break;
            default:
                break;
        }
        //aea.setWakeup(Boolean.valueOf(wakeupTextField.getText())); //wakeUp 저장
        if (jRadioButton1.isSelected()) { //audience의 라디오버튼이 눌린 것에 따라 값을 저장
            aea.setWakeup(Boolean.valueOf("true"));
        }
        else if (jRadioButton2.isSelected()) {
            aea.setWakeup(Boolean.valueOf("false"));
        }
        
        return aea; //AEAType 반환
    }
    
    //함수명 : loadAEAT
    //입력 : AEATType
    //출력 : 없음
    //GUI에 AEA Panel 데이터 입력
    public void loadAEAT(AEATType aeat) { 
        aeaIdTextField.setText(aeat.getAEA().get(0).getAeaId()); //aeaId 입력
        issuerTextField.setText(aeat.getAEA().get(0).getIssuer()); //issuer 입력
        //audienceTextField.setText(aeat.getAEA().get(0).getAudience().value()); //audience 입력
        String audience = aeat.getAEA().get(0).getAudience().value();
        if (audience.equals("public")) {
            jRadioButton3.setSelected(true);
        }
        else if (audience.equals("restricted")) {
            jRadioButton4.setSelected(true);
        }
        else if (audience.equals("private")) {
            jRadioButton5.setSelected(true);
        }
        //aeaTypeTextField.setText(aeat.getAEA().get(0).getAeaType().value()); //aeaType 입력
        String aeaType = aeat.getAEA().get(0).getAeaType().value();
        if (aeaType.equals("update")) {
            jRadioButton6.setSelected(true);
        }
        else if (aeaType.equals("alert")) {
            jRadioButton7.setSelected(true);
        }
        else if (aeaType.equals("cancel")) {
            jRadioButton8.setSelected(true);
        }
        
        refAEAIdTextField.setText(aeat.getAEA().get(0).getRefAEAId()); //refAEAId 입력
        //priorityTextField.setText(aeat.getAEA().get(0).getPriority().toString()); //priority 입력
        Short priority = aeat.getAEA().get(0).getPriority();
        jComboBox2.setSelectedIndex(priority);
        //wakeupTextField.setText(String.valueOf(aeat.getAEA().get(0).isWakeup())); //wakeUp 입력
        String wakeUp = String.valueOf(aeat.getAEA().get(0).isWakeup());
        if (wakeUp.equals("true")) {
            jRadioButton1.setSelected(true);
        }
        else if (wakeUp.equals("false")) {
            jRadioButton2.setSelected(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        aeaIdTextField = new javax.swing.JTextField();
        issuerTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        refAEAIdTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel1.setText("aeaId");

        jLabel2.setText("issuer");

        jLabel3.setText("audience");

        jLabel4.setText("aeaType");

        jLabel5.setText("refAEAId");

        jLabel6.setText("priority");

        jLabel7.setText("wakeup");

        jLabel8.setText("AEA");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("true");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("false");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("public");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("restricted");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("private");

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setText("update");

        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setText("alert");

        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setText("cancel");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "매우낮음", "낮음", "보통", "높음", "매우높음" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(refAEAIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jRadioButton3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton6)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton8))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(issuerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(29, 29, 29)
                                            .addComponent(aeaIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(aeaIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(issuerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(refAEAIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aeaIdTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField issuerTextField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField refAEAIdTextField;
    // End of variables declaration//GEN-END:variables
    private pkg2012440027.HeaderPanel headerPanel;
    private pkg2012440027.LiveMediaPanel liveMediaPanel;
    private pkg2012440027.MediaPanel mediaPanel;
    private pkg2012440027.AEATextPanel aeaTextPanel;
}
