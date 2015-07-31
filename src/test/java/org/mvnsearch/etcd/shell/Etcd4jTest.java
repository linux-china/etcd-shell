package org.mvnsearch.etcd.shell;

import mousio.etcd4j.EtcdClient;
import mousio.etcd4j.responses.EtcdKeysResponse;
import org.junit.Test;

import java.net.URI;

/**
 * Unit test for etcd4j
 *
 * @author linux_china
 */
public class Etcd4jTest {

    /**
     * minor update
     */
    @Test
    public void testApp() throws Exception {
        try (EtcdClient etcd = new EtcdClient(URI.create("http://192.168.59.103:4001"))) {
            EtcdKeysResponse value = etcd.get("foo").send().get();
            System.out.println(value.node.value);
        }
    }
}
