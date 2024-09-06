/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamento;

import java.util.Collection;

/**
 *
 * @author Win10
 */
public class AttachmentList {

    public AttachmentList(Collection attachments) {
        this.attachments = attachments;
    }

    public boolean addAttachment(Attachment attachment) {
        attachments.add(attachment);
        return true;
    }
    
    public Collection getAttachments() {
        return attachments;
    }
    
    public boolean removeAttachment(long old) {
        attachments.remove(old);
        return true;
    }
    
    private final Collection attachments;
    
}
