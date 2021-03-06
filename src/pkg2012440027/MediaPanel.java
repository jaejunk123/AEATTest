/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2012440027;

import java.math.BigInteger;
import tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1.AEATType;
import tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1.MediaType;
import tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1.MediaTypeType;

/**
 *
 * @author jaejunk
 */
public class MediaPanel extends javax.swing.JPanel {

    /**
     * Creates new form MediaPanel
     */
    public MediaPanel() {
        initComponents();
    }

    //함수명 : setMedia
    //입력 : 없음
    //출력 : MediaType
    //media panel의 데이터를 MediaType으로 변환
    public MediaType setMedia() {
        MediaType media = new MediaType(); //meida 객체 생성
        
        media.setAlternateUrl(alternateUrlTextField.getText());
        media.setContentLength(BigInteger.valueOf(Long.valueOf(contentLengthTextField.getText())));
        media.setContentType(contentTypeTextField.getText());
        media.setLang(mediaLangTextField.getText());
        media.setMediaAssoc(mediaAssocTextField.getText());
        media.setMediaDesc(mediaDescTextField.getText());
        media.setUrl(urlTextField.getText());
        media.setMediaType(MediaTypeType.fromValue(mediaTypeTextField.getText()));
        
        return media;
    }
    
    //함수명 : loadAEAT
    //입력 : AEATType
    //출력 : 없음
    //media panel에 데이터 출력
    public void loadAEAT(AEATType aeat) {
        alternateUrlTextField.setText(aeat.getAEA().get(0).getMedia().get(0).getAlternateUrl());
        contentLengthTextField.setText(aeat.getAEA().get(0).getMedia().get(0).getContentLength().toString());
        contentTypeTextField.setText(aeat.getAEA().get(0).getMedia().get(0).getContentType());
        mediaAssocTextField.setText(aeat.getAEA().get(0).getMedia().get(0).getMediaAssoc());
        mediaDescTextField.setText(aeat.getAEA().get(0).getMedia().get(0).getMediaDesc());
        mediaLangTextField.setText(aeat.getAEA().get(0).getMedia().get(0).getLang());
        mediaTypeTextField.setText(aeat.getAEA().get(0).getMedia().get(0).getMediaType().value());
        urlTextField.setText(aeat.getAEA().get(0).getMedia().get(0).getUrl());
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
        mediaLangTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mediaDescTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mediaTypeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        urlTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        alternateUrlTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        contentTypeTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contentLengthTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mediaAssocTextField = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));

        jLabel1.setText("Media");

        jLabel2.setText("lang");

        jLabel3.setText("mediaDesc");

        jLabel4.setText("mediaType");

        jLabel5.setText("url");

        jLabel6.setText("alternateUrl");

        jLabel7.setText("contentType");

        jLabel8.setText("contentLength");

        jLabel9.setText("mediaAssoc");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(29, 29, 29)
                                .addComponent(mediaAssocTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(29, 29, 29)
                                .addComponent(contentLengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(29, 29, 29)
                                .addComponent(contentTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(29, 29, 29)
                                .addComponent(alternateUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(mediaTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(mediaDescTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(mediaLangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mediaLangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mediaDescTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mediaTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(alternateUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(contentTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(contentLengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(mediaAssocTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alternateUrlTextField;
    private javax.swing.JTextField contentLengthTextField;
    private javax.swing.JTextField contentTypeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mediaAssocTextField;
    private javax.swing.JTextField mediaDescTextField;
    private javax.swing.JTextField mediaLangTextField;
    private javax.swing.JTextField mediaTypeTextField;
    private javax.swing.JTextField urlTextField;
    // End of variables declaration//GEN-END:variables
}
