/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.command;

import java.nio.ByteBuffer;
import org.anarres.ipmi.protocol.packet.ipmi.session.IpmiContext;

/**
 *
 * @author shevek
 */
public abstract class AbstractIpmiResponse extends AbstractIpmiCommand implements IpmiResponse {

    private byte ipmiCompletionCode;

    public byte getIpmiCompletionCode() {
        return ipmiCompletionCode;
    }

    public void setIpmiCompletionCode(byte ipmiCompletionCode) {
        this.ipmiCompletionCode = ipmiCompletionCode;
    }

    protected void toWireCompletionCode(ByteBuffer buffer) {
        buffer.put(getIpmiCompletionCode());
    }

    protected void fromWireCompletionCode(ByteBuffer buffer) {
        setIpmiCompletionCode(buffer.get());
    }
}
