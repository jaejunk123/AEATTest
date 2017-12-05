/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2012440027;

import javax.xml.datatype.XMLGregorianCalendar;
import tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1.AEATType;
import tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1.HeaderType;
import tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1.LangType;
import tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1.TypeType;

/**
 *
 * @author jaejunk
 */
public class EventPanel extends javax.swing.JPanel {

    /**
     * Creates new form EventPanel
     */
    public EventPanel() {
        initComponents();
    }

    //함수명 : setEvent
    //입력 : 없음
    //출력 : HeaderType
    //HeaderType의 event 데이터 저장
    public HeaderType setEvent() {
        HeaderType header = new HeaderType(); //HeaderType 객체 생성
        TypeType eventType = new TypeType(); //eventType 입력을 위해 TypeType 객체 생성
        LangType lang = new LangType(); //eventDesc 입력을 위해 LangType 객체 생성
        
        eventType.setType(eventTypeTextField.getText()); //eventType 저장
        eventType.setValue(eventCodeTextField.getText()); //eventCode 저장
        lang.setLang(eventLangTextField.getText()); //eventDesc의 lang 저장
        lang.setValue(eventDescTextField.getText()); //eventDesc 저장
        
        header.setEventCode(eventType); //header에 event 데이터 저장
        header.getEventDesc().add(lang); //header에 eventDesc 데이터 저장
        
        return header;
    }
    
    //함수명 : loadAEAT
    //입력 : AEATType
    //출력 : 없음
    //GUI에 event 데이터 출력
    public void loadAEAT(AEATType aeat) {
        eventCodeTextField.setText(aeat.getAEA().get(0).getHeader().getEventCode().getValue()); //eventCode 출력
        eventTypeTextField.setText(aeat.getAEA().get(0).getHeader().getEventCode().getType()); //eventType 출력
        eventDescTextField.setText(aeat.getAEA().get(0).getHeader().getEventDesc().get(0).getValue()); //eventDesc 출력
        eventLangTextField.setText(aeat.getAEA().get(0).getHeader().getEventDesc().get(0).getLang()); //eventDesc의 Lang 출력
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eventTypeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eventLangTextField = new javax.swing.JTextField();
        eventCodeTextField = new javax.swing.JTextField();
        eventDescTextField = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));

        jLabel1.setText("Event");

        jLabel2.setText("EventCode");

        jLabel3.setText("type");

        jLabel4.setText("EventDesc");

        jLabel5.setText("lang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addComponent(eventLangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(eventTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eventCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eventDescTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eventCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(eventTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(eventDescTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(eventLangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eventCodeTextField;
    private javax.swing.JTextField eventDescTextField;
    private javax.swing.JTextField eventLangTextField;
    private javax.swing.JTextField eventTypeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
