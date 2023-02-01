package resource;

import java.io.IOException;

public interface MyResource {
    public void open() throws IOException;
    public void close() throws IOException;
    public void write(byte[] b) throws IOException;
}
