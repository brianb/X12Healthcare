package com.xiaoerge.x12.message.control;

import com.xiaoerge.x12.message.MessageFormat;
import com.xiaoerge.x12.message.MessageLoop;
import com.xiaoerge.x12.message.segment.IEA;
import com.xiaoerge.x12.message.segment.ISA;
import com.xiaoerge.x12.util.StringQueue;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by xiaoerge on 5/23/16.
 */
public class InterchangeEnvelope extends MessageLoop {
    private ISA transactionSetHeader;
    private List<FunctionalGroup> functionalGroups;
    private IEA transactionSetTrailer;

    public InterchangeEnvelope(MessageFormat messageFormat) {
        transactionSetHeader = new ISA();
        functionalGroups = new ArrayList<FunctionalGroup>();
        transactionSetTrailer = new IEA();
        this.messageFormat = messageFormat;
    }
    public InterchangeEnvelope(String s, MessageFormat mf) {
        this.messageFormat = messageFormat;
        StringQueue stringQueue = new StringQueue(s, mf);
        functionalGroups = new ArrayList<FunctionalGroup>();

        StringBuilder builder = null;
        while (stringQueue.hasNext()) {
            String next = stringQueue.getNext();
            if (next.startsWith("ISA")) {
                transactionSetHeader = new ISA(next, mf);
            }
            else if (next.startsWith("IEA")) {
                transactionSetTrailer = new IEA(next, mf);
            }
            else if (next.startsWith("GS")) {
                builder = new StringBuilder();
                builder.append(next);
            }
            else if (next.startsWith("GE")) {
                if (builder != null) {
                    builder.append(next);
                    String groupContent = builder.toString();
                    FunctionalGroup group = new FunctionalGroup(groupContent, mf);
                    functionalGroups.add(group);
                }
            }
            else {
                if (builder != null) builder.append(next);
            }
        }
    }

    public ISA getTransactionSetHeader() { return transactionSetHeader; }
    public IEA getTransactionSetTrailer() { return transactionSetTrailer; }
    public List<FunctionalGroup> getFunctionalGroups() {
        return functionalGroups;
    }

    public void loadDefinition() {
        messagesDefinition.clear();
        messagesDefinition.add(transactionSetHeader);
        messagesDefinition.addAll(getFunctionalGroups());
        messagesDefinition.add(transactionSetTrailer);
    }
}
