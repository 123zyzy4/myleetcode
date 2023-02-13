package day28;

import org.junit.jupiter.api.Test;

public class CodecTest {
    @Test
    public void test(){
        Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
        codec.deserialize("[1,2,3,null,null,4,5]");
    }
}
