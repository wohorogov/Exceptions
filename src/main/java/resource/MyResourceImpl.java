package resource;

import java.io.IOException;
    
public class MyResourceImpl implements MyResource {

    @Override
    public void open() throws IOException {
        System.out.println("open");
    }

    @Override
    public void close() throws IOException {
        System.out.println("close");
    }

    @Override
    public void write(byte[] b) throws IOException {

    }
}
