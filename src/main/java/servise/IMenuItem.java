package servise;

import java.io.IOException;

public interface IMenuItem <T>{

    int getOrder();

    String getTitle();

    void execute() throws IOException;
}
