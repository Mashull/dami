package org.noear.dami.api;

/**
 * 方法主题监听器记录
 *
 * @author noear
 * @since 1.0
 */
public class MethodTopicListenerRecord {
    private String topic;
    private MethodTopicListener listener;

    public MethodTopicListenerRecord(String topic, MethodTopicListener listener) {
        this.topic = topic;
        this.listener = listener;
    }

    public String getTopic() {
        return topic;
    }

    public MethodTopicListener getListener() {
        return listener;
    }
}